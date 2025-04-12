/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ApplicationExitInfo
 *  android.content.Context
 */
package com.google.firebase.crashlytics.internal.common;

import android.app.ApplicationExitInfo;
import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.AppData;
import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.FirebaseInstallationId;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.common.NativeSessionFile;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.metadata.EventMetadata;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$CustomAttribute;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$CustomAttribute$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Log;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Log$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutsState;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;

public class SessionReportingCoordinator {
    private static final int DEFAULT_BUFFER_SIZE = 8192;
    private static final int EVENT_THREAD_IMPORTANCE = 4;
    private static final String EVENT_TYPE_CRASH = "crash";
    private static final String EVENT_TYPE_LOGGED = "error";
    private static final int MAX_CHAINED_EXCEPTION_DEPTH = 8;
    private final CrashlyticsWorkers crashlyticsWorkers;
    private final CrashlyticsReportDataCapture dataCapture;
    private final IdManager idManager;
    private final LogFileManager logFileManager;
    private final UserMetadata reportMetadata;
    private final CrashlyticsReportPersistence reportPersistence;
    private final DataTransportCrashlyticsReportSender reportsSender;

    public SessionReportingCoordinator(CrashlyticsReportDataCapture crashlyticsReportDataCapture, CrashlyticsReportPersistence crashlyticsReportPersistence, DataTransportCrashlyticsReportSender dataTransportCrashlyticsReportSender, LogFileManager logFileManager, UserMetadata userMetadata, IdManager idManager, CrashlyticsWorkers crashlyticsWorkers) {
        this.dataCapture = crashlyticsReportDataCapture;
        this.reportPersistence = crashlyticsReportPersistence;
        this.reportsSender = dataTransportCrashlyticsReportSender;
        this.logFileManager = logFileManager;
        this.reportMetadata = userMetadata;
        this.idManager = idManager;
        this.crashlyticsWorkers = crashlyticsWorkers;
    }

    public static /* synthetic */ void a(SessionReportingCoordinator sessionReportingCoordinator, CrashlyticsReport$Session$Event crashlyticsReport$Session$Event, EventMetadata eventMetadata, boolean bl2) {
        sessionReportingCoordinator.lambda$persistEvent$0(crashlyticsReport$Session$Event, eventMetadata, bl2);
    }

    private CrashlyticsReport$Session$Event addLogsAndCustomKeysToEvent(CrashlyticsReport$Session$Event crashlyticsReport$Session$Event, LogFileManager logFileManager, UserMetadata userMetadata) {
        Map map2 = Collections.emptyMap();
        return this.addLogsCustomKeysAndEventKeysToEvent(crashlyticsReport$Session$Event, logFileManager, userMetadata, map2);
    }

    private CrashlyticsReport$Session$Event addLogsCustomKeysAndEventKeysToEvent(CrashlyticsReport$Session$Event object, LogFileManager object2, UserMetadata object3, Map map2) {
        CrashlyticsReport$Session$Event$Builder crashlyticsReport$Session$Event$Builder = ((CrashlyticsReport$Session$Event)object).toBuilder();
        if ((object2 = ((LogFileManager)object2).getLogString()) != null) {
            CrashlyticsReport$Session$Event$Log$Builder crashlyticsReport$Session$Event$Log$Builder = CrashlyticsReport$Session$Event$Log.builder();
            object2 = crashlyticsReport$Session$Event$Log$Builder.setContent((String)object2).build();
            crashlyticsReport$Session$Event$Builder.setLog((CrashlyticsReport$Session$Event$Log)object2);
        } else {
            object2 = Logger.getLogger();
            String string2 = "No log data to include with this event.";
            ((Logger)object2).v(string2);
        }
        object2 = SessionReportingCoordinator.getSortedCustomAttributes(((UserMetadata)object3).getCustomKeys(map2));
        object3 = SessionReportingCoordinator.getSortedCustomAttributes(((UserMetadata)object3).getInternalKeys());
        boolean bl2 = object2.isEmpty();
        if (!bl2 || !(bl2 = object3.isEmpty())) {
            object = ((CrashlyticsReport$Session$Event)object).getApp().toBuilder().setCustomAttributes((List)object2).setInternalKeys((List)object3).build();
            crashlyticsReport$Session$Event$Builder.setApp((CrashlyticsReport$Session$Event$Application)object);
        }
        return crashlyticsReport$Session$Event$Builder.build();
    }

    private CrashlyticsReport$Session$Event addMetaDataToEvent(CrashlyticsReport$Session$Event crashlyticsReport$Session$Event, Map object) {
        LogFileManager logFileManager = this.logFileManager;
        UserMetadata userMetadata = this.reportMetadata;
        crashlyticsReport$Session$Event = this.addLogsCustomKeysAndEventKeysToEvent(crashlyticsReport$Session$Event, logFileManager, userMetadata, (Map)object);
        object = this.reportMetadata;
        return this.addRolloutsStateToEvent(crashlyticsReport$Session$Event, (UserMetadata)object);
    }

    private CrashlyticsReport$Session$Event addRolloutsStateToEvent(CrashlyticsReport$Session$Event object, UserMetadata object2) {
        boolean bl2 = (object2 = ((UserMetadata)object2).getRolloutsState()).isEmpty();
        if (bl2) {
            return object;
        }
        object = ((CrashlyticsReport$Session$Event)object).toBuilder();
        object2 = CrashlyticsReport$Session$Event$RolloutsState.builder().setRolloutAssignments((List)object2).build();
        ((CrashlyticsReport$Session$Event$Builder)object).setRollouts((CrashlyticsReport$Session$Event$RolloutsState)object2);
        return ((CrashlyticsReport$Session$Event$Builder)object).build();
    }

    public static /* synthetic */ boolean b(SessionReportingCoordinator sessionReportingCoordinator, Task task2) {
        return sessionReportingCoordinator.onReportSendComplete(task2);
    }

    public static /* synthetic */ int c(CrashlyticsReport$CustomAttribute crashlyticsReport$CustomAttribute, CrashlyticsReport$CustomAttribute crashlyticsReport$CustomAttribute2) {
        return SessionReportingCoordinator.lambda$getSortedCustomAttributes$1(crashlyticsReport$CustomAttribute, crashlyticsReport$CustomAttribute2);
    }

    private static CrashlyticsReport$ApplicationExitInfo convertApplicationExitInfo(ApplicationExitInfo applicationExitInfo) {
        Object object;
        Object object2;
        String string2;
        block3: {
            string2 = null;
            object2 = A03.a(applicationExitInfo);
            if (object2 == null) break block3;
            try {
                string2 = SessionReportingCoordinator.convertInputStreamToString((InputStream)object2);
            }
            catch (IOException iOException) {
                object = Logger.getLogger();
                StringBuilder stringBuilder = new StringBuilder("Could not get input trace in application exit info: ");
                String string3 = B03.a(applicationExitInfo);
                stringBuilder.append(string3);
                string3 = " Error: ";
                stringBuilder.append(string3);
                stringBuilder.append(iOException);
                object2 = stringBuilder.toString();
                ((Logger)object).w((String)object2);
            }
        }
        object2 = CrashlyticsReport$ApplicationExitInfo.builder();
        int n3 = C03.a(applicationExitInfo);
        object2 = ((CrashlyticsReport$ApplicationExitInfo$Builder)object2).setImportance(n3);
        object = D03.a(applicationExitInfo);
        object2 = ((CrashlyticsReport$ApplicationExitInfo$Builder)object2).setProcessName((String)object);
        n3 = yv0_0.a(applicationExitInfo);
        object2 = ((CrashlyticsReport$ApplicationExitInfo$Builder)object2).setReasonCode(n3);
        long l2 = zv0_0.a(applicationExitInfo);
        object2 = ((CrashlyticsReport$ApplicationExitInfo$Builder)object2).setTimestamp(l2);
        n3 = E03.a(applicationExitInfo);
        object2 = ((CrashlyticsReport$ApplicationExitInfo$Builder)object2).setPid(n3);
        l2 = f03_0.a(applicationExitInfo);
        object2 = ((CrashlyticsReport$ApplicationExitInfo$Builder)object2).setPss(l2);
        l2 = G03.a(applicationExitInfo);
        return ((CrashlyticsReport$ApplicationExitInfo$Builder)object2).setRss(l2).setTraceFile(string2).build();
    }

    public static String convertInputStreamToString(InputStream object) {
        int n3;
        int n4;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int n7 = 8192;
        byte[] byArray = new byte[n7];
        while ((n4 = ((InputStream)object).read(byArray)) != (n3 = -1)) {
            n3 = 0;
            byteArrayOutputStream.write(byArray, 0, n4);
        }
        object = StandardCharsets.UTF_8.name();
        return byteArrayOutputStream.toString((String)object);
    }

    public static SessionReportingCoordinator create(Context context, IdManager idManager, FileStore fileStore, AppData appData, LogFileManager logFileManager, UserMetadata userMetadata, StackTraceTrimmingStrategy stackTraceTrimmingStrategy, SettingsProvider settingsProvider, OnDemandCounter onDemandCounter, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber, CrashlyticsWorkers crashlyticsWorkers) {
        Object object = context;
        Object object2 = idManager;
        Object object3 = appData;
        Object object4 = new CrashlyticsReportDataCapture(context, idManager, appData, stackTraceTrimmingStrategy, settingsProvider);
        object = crashlyticsAppQualitySessionsSubscriber;
        object2 = new CrashlyticsReportPersistence(fileStore, settingsProvider, crashlyticsAppQualitySessionsSubscriber);
        object = onDemandCounter;
        object3 = DataTransportCrashlyticsReportSender.create(context, settingsProvider, onDemandCounter);
        object = object4;
        object4 = crashlyticsWorkers;
        SessionReportingCoordinator sessionReportingCoordinator = new SessionReportingCoordinator((CrashlyticsReportDataCapture)object, (CrashlyticsReportPersistence)object2, (DataTransportCrashlyticsReportSender)object3, logFileManager, userMetadata, idManager, crashlyticsWorkers);
        return sessionReportingCoordinator;
    }

    private CrashlyticsReportWithSessionId ensureHasFid(CrashlyticsReportWithSessionId object) {
        Object object2 = ((CrashlyticsReportWithSessionId)object).getReport().getFirebaseInstallationId();
        if (object2 != null && (object2 = ((CrashlyticsReportWithSessionId)object).getReport().getFirebaseAuthenticationToken()) != null) {
            return object;
        }
        object2 = this.idManager.fetchTrueFid(true);
        Object object3 = ((CrashlyticsReportWithSessionId)object).getReport();
        String string2 = ((FirebaseInstallationId)object2).getFid();
        object3 = ((CrashlyticsReport)object3).withFirebaseInstallationId(string2);
        object2 = ((FirebaseInstallationId)object2).getAuthToken();
        object2 = ((CrashlyticsReport)object3).withFirebaseAuthenticationToken((String)object2);
        object3 = ((CrashlyticsReportWithSessionId)object).getSessionId();
        object = ((CrashlyticsReportWithSessionId)object).getReportFile();
        return CrashlyticsReportWithSessionId.create((CrashlyticsReport)object2, (String)object3, (File)object);
    }

    private ApplicationExitInfo findRelevantApplicationExitInfo(String object, List list) {
        block1: {
            int n3;
            int n4;
            CrashlyticsReportPersistence crashlyticsReportPersistence = this.reportPersistence;
            long l2 = crashlyticsReportPersistence.getStartTimestampMillis((String)object);
            object = list.iterator();
            do {
                boolean bl2 = object.hasNext();
                n4 = 0;
                if (!bl2) break block1;
                list = xV0.a(object.next());
                long l3 = zv0_0.a((ApplicationExitInfo)list);
                long l4 = l3 - l2;
                Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object2 >= 0) continue;
                return null;
            } while ((n4 = yv0_0.a((ApplicationExitInfo)list)) != (n3 = 6));
            return list;
        }
        return null;
    }

    private static List getSortedCustomAttributes(Map object) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        int n3 = object.size();
        arrayList.ensureCapacity(n3);
        object = object.entrySet().iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            Object object2 = (Map.Entry)object.next();
            CrashlyticsReport$CustomAttribute$Builder crashlyticsReport$CustomAttribute$Builder = CrashlyticsReport$CustomAttribute.builder();
            String string2 = (String)object2.getKey();
            crashlyticsReport$CustomAttribute$Builder = crashlyticsReport$CustomAttribute$Builder.setKey(string2);
            object2 = (String)object2.getValue();
            object2 = crashlyticsReport$CustomAttribute$Builder.setValue((String)object2).build();
            arrayList.add(object2);
        }
        object = new Object();
        Collections.sort(arrayList, object);
        return Collections.unmodifiableList(arrayList);
    }

    private static /* synthetic */ int lambda$getSortedCustomAttributes$1(CrashlyticsReport$CustomAttribute object, CrashlyticsReport$CustomAttribute object2) {
        object = ((CrashlyticsReport$CustomAttribute)object).getKey();
        object2 = ((CrashlyticsReport$CustomAttribute)object2).getKey();
        return ((String)object).compareTo((String)object2);
    }

    private /* synthetic */ void lambda$persistEvent$0(CrashlyticsReport$Session$Event crashlyticsReport$Session$Event, EventMetadata object, boolean bl2) {
        Logger.getLogger().d("disk worker: log non-fatal event to persistence");
        CrashlyticsReportPersistence crashlyticsReportPersistence = this.reportPersistence;
        object = ((EventMetadata)object).getSessionId();
        crashlyticsReportPersistence.persistEvent(crashlyticsReport$Session$Event, (String)object, bl2);
    }

    private boolean onReportSendComplete(Task object) {
        boolean bl2 = ((Task)object).isSuccessful();
        if (bl2) {
            object = (CrashlyticsReportWithSessionId)((Task)object).getResult();
            Logger logger = Logger.getLogger();
            CharSequence charSequence = new StringBuilder("Crashlytics report successfully enqueued to DataTransport: ");
            String string2 = ((CrashlyticsReportWithSessionId)object).getSessionId();
            ((StringBuilder)charSequence).append(string2);
            charSequence = ((StringBuilder)charSequence).toString();
            logger.d((String)charSequence);
            object = ((CrashlyticsReportWithSessionId)object).getReportFile();
            bl2 = ((File)object).delete();
            if (bl2) {
                logger = Logger.getLogger();
                string2 = "Deleted report file: ";
                charSequence = new StringBuilder(string2);
                object = ((File)object).getPath();
                ((StringBuilder)charSequence).append((String)object);
                object = ((StringBuilder)charSequence).toString();
                logger.d((String)object);
            } else {
                logger = Logger.getLogger();
                string2 = "Crashlytics could not delete report file: ";
                charSequence = new StringBuilder(string2);
                object = ((File)object).getPath();
                ((StringBuilder)charSequence).append((String)object);
                object = ((StringBuilder)charSequence).toString();
                logger.w((String)object);
            }
            return true;
        }
        Logger logger = Logger.getLogger();
        object = ((Task)object).getException();
        logger.w("Crashlytics report could not be enqueued to DataTransport", (Throwable)object);
        return false;
    }

    private void persistEvent(Throwable object, Thread object2, String object3, EventMetadata eventMetadata, boolean bl2) {
        String string2 = EVENT_TYPE_CRASH;
        boolean bl3 = ((String)object3).equals(string2);
        CrashlyticsReportDataCapture crashlyticsReportDataCapture = this.dataCapture;
        long l2 = eventMetadata.getTimestamp();
        int n3 = 4;
        int n4 = 8;
        object = crashlyticsReportDataCapture.captureEventData((Throwable)object, (Thread)object2, (String)object3, l2, n3, n4, bl2);
        object2 = eventMetadata.getAdditionalCustomKeys();
        object = this.addMetaDataToEvent((CrashlyticsReport$Session$Event)object, (Map)object2);
        if (!bl2) {
            object2 = this.crashlyticsWorkers.diskWrite;
            object3 = new H03(this, (CrashlyticsReport$Session$Event)object, eventMetadata, bl3);
            ((CrashlyticsWorker)object2).submit((Runnable)object3);
            return;
        }
        object2 = this.reportPersistence;
        object3 = eventMetadata.getSessionId();
        ((CrashlyticsReportPersistence)object2).persistEvent((CrashlyticsReport$Session$Event)object, (String)object3, bl3);
    }

    public void finalizeSessionWithNativeEvent(String string2, List object, CrashlyticsReport$ApplicationExitInfo crashlyticsReport$ApplicationExitInfo) {
        boolean bl2;
        Object object2 = Logger.getLogger();
        Object object3 = "SessionReportingCoordinator#finalizeSessionWithNativeEvent";
        ((Logger)object2).d((String)object3);
        object2 = new ArrayList();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            object3 = ((NativeSessionFile)object.next()).asFilePayload();
            if (object3 == null) continue;
            ((ArrayList)object2).add(object3);
        }
        object = this.reportPersistence;
        object3 = CrashlyticsReport$FilesPayload.builder();
        object2 = Collections.unmodifiableList(object2);
        object2 = ((CrashlyticsReport$FilesPayload$Builder)object3).setFiles((List)object2).build();
        ((CrashlyticsReportPersistence)object).finalizeSessionWithNativeEvent(string2, (CrashlyticsReport$FilesPayload)object2, crashlyticsReport$ApplicationExitInfo);
    }

    public void finalizeSessions(long l2, String string2) {
        this.reportPersistence.finalizeReports(string2, l2);
    }

    public boolean hasReportsToSend() {
        return this.reportPersistence.hasFinalizedReports();
    }

    public SortedSet listSortedOpenSessionIds() {
        return this.reportPersistence.getOpenSessionIds();
    }

    public void onBeginSession(String object, long l2) {
        object = this.dataCapture.captureReportData((String)object, l2);
        this.reportPersistence.persistReport((CrashlyticsReport)object);
    }

    public void persistFatalEvent(Throwable throwable, Thread thread2, String string2, long l2) {
        Logger logger = Logger.getLogger();
        CharSequence charSequence = new StringBuilder("Persisting fatal event for session ");
        charSequence.append(string2);
        charSequence = charSequence.toString();
        logger.v((String)charSequence);
        EventMetadata eventMetadata = new EventMetadata(string2, l2);
        this.persistEvent(throwable, thread2, EVENT_TYPE_CRASH, eventMetadata, true);
    }

    public void persistNonFatalEvent(Throwable throwable, Thread thread2, EventMetadata eventMetadata) {
        Logger logger = Logger.getLogger();
        CharSequence charSequence = new StringBuilder("Persisting non-fatal event for session ");
        Object object = eventMetadata.getSessionId();
        charSequence.append((String)object);
        charSequence = charSequence.toString();
        logger.v((String)charSequence);
        object = this;
        this.persistEvent(throwable, thread2, EVENT_TYPE_LOGGED, eventMetadata, false);
    }

    public void persistRelevantAppExitInfoEvent(String string2, List object, LogFileManager object2, UserMetadata userMetadata) {
        if ((object = this.findRelevantApplicationExitInfo(string2, (List)object)) == null) {
            object = Logger.getLogger();
            object2 = new StringBuilder("No relevant ApplicationExitInfo occurred during session: ");
            ((StringBuilder)object2).append(string2);
            string2 = ((StringBuilder)object2).toString();
            ((Logger)object).v(string2);
            return;
        }
        Object object3 = this.dataCapture;
        object = SessionReportingCoordinator.convertApplicationExitInfo((ApplicationExitInfo)object);
        object = ((CrashlyticsReportDataCapture)object3).captureAnrEventData((CrashlyticsReport$ApplicationExitInfo)object);
        object3 = Logger.getLogger();
        CharSequence charSequence = new StringBuilder("Persisting anr for session ");
        charSequence.append(string2);
        charSequence = charSequence.toString();
        ((Logger)object3).d((String)charSequence);
        object = this.addLogsAndCustomKeysToEvent((CrashlyticsReport$Session$Event)object, (LogFileManager)object2, userMetadata);
        object = this.addRolloutsStateToEvent((CrashlyticsReport$Session$Event)object, userMetadata);
        this.reportPersistence.persistEvent((CrashlyticsReport$Session$Event)object, string2, true);
    }

    public void removeAllReports() {
        this.reportPersistence.deleteAllReports();
    }

    public Task sendReports(Executor executor) {
        return this.sendReports(executor, null);
    }

    public Task sendReports(Executor executor, String string2) {
        boolean bl2;
        Object object = this.reportPersistence.loadFinalizedReports();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Object object2;
            boolean bl3;
            Object object3 = (CrashlyticsReportWithSessionId)object.next();
            if (string2 != null && !(bl3 = string2.equals(object2 = ((CrashlyticsReportWithSessionId)object3).getSessionId()))) continue;
            object2 = this.reportsSender;
            object3 = this.ensureHasFid((CrashlyticsReportWithSessionId)object3);
            boolean bl4 = string2 != null;
            object3 = ((DataTransportCrashlyticsReportSender)object2).enqueueReport((CrashlyticsReportWithSessionId)object3, bl4);
            object2 = new J03(this);
            object3 = ((Task)object3).continueWith(executor, (Continuation)object2);
            arrayList.add(object3);
        }
        return Tasks.whenAll(arrayList);
    }
}

