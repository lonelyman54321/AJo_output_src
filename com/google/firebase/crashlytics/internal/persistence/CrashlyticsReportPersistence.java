/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.persistence;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.Settings$SessionData;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

public class CrashlyticsReportPersistence {
    private static final String EVENT_COUNTER_FORMAT = "%010d";
    private static final int EVENT_COUNTER_WIDTH = 10;
    private static final FilenameFilter EVENT_FILE_FILTER;
    private static final String EVENT_FILE_NAME_PREFIX = "event";
    private static final int EVENT_NAME_LENGTH = 0;
    private static final Comparator LATEST_SESSION_ID_FIRST_COMPARATOR;
    private static final int MAX_OPEN_SESSIONS = 8;
    private static final String NORMAL_EVENT_SUFFIX = "";
    private static final String PRIORITY_EVENT_SUFFIX = "_";
    private static final String REPORT_FILE_NAME = "report";
    private static final String SESSION_START_TIMESTAMP_FILE_NAME = "start-time";
    private static final CrashlyticsReportJsonTransform TRANSFORM;
    private static final Charset UTF_8;
    private final AtomicInteger eventCounter;
    private final FileStore fileStore;
    private final CrashlyticsAppQualitySessionsSubscriber sessionsSubscriber;
    private final SettingsProvider settingsProvider;

    static {
        UTF_8 = Charset.forName("UTF-8");
        EVENT_NAME_LENGTH = 15;
        Object object = new CrashlyticsReportJsonTransform();
        TRANSFORM = object;
        LATEST_SESSION_ID_FIRST_COMPARATOR = object = new u0(1);
        EVENT_FILE_FILTER = object = new Object();
    }

    public CrashlyticsReportPersistence(FileStore fileStore, SettingsProvider settingsProvider, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber) {
        AtomicInteger atomicInteger;
        this.eventCounter = atomicInteger = new AtomicInteger(0);
        this.fileStore = fileStore;
        this.settingsProvider = settingsProvider;
        this.sessionsSubscriber = crashlyticsAppQualitySessionsSubscriber;
    }

    public static /* synthetic */ boolean a(File file, String string2) {
        return string2.startsWith(EVENT_FILE_NAME_PREFIX);
    }

    public static /* synthetic */ boolean b(File file, String string2) {
        return CrashlyticsReportPersistence.isNormalPriorityEventFile(file, string2);
    }

    public static /* synthetic */ int c(File file, File file2) {
        return CrashlyticsReportPersistence.oldestEventFileFirst(file, file2);
    }

    private SortedSet capAndGetOpenSessions(String string2) {
        int n3;
        int n4;
        this.fileStore.cleanupPreviousFileSystems();
        SortedSet sortedSet = this.getOpenSessionIds();
        if (string2 != null) {
            sortedSet.remove(string2);
        }
        if ((n4 = sortedSet.size()) <= (n3 = 8)) {
            return sortedSet;
        }
        while ((n4 = sortedSet.size()) > n3) {
            string2 = (String)sortedSet.last();
            Object object = Logger.getLogger();
            String string3 = "Removing session over cap: ";
            CharSequence charSequence = new StringBuilder(string3);
            charSequence.append(string2);
            charSequence = charSequence.toString();
            ((Logger)object).d((String)charSequence);
            object = this.fileStore;
            ((FileStore)object).deleteSessionFiles(string2);
            sortedSet.remove(string2);
        }
        return sortedSet;
    }

    private static int capFilesCount(List object, int n3) {
        boolean bl2;
        int n4 = object.size();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            File file = (File)object.next();
            if (n4 <= n3) {
                return n4;
            }
            FileStore.recursiveDelete(file);
            n4 += -1;
        }
        return n4;
    }

    private void capFinalizedReports() {
        boolean bl2;
        Object object = this.settingsProvider.getSettingsSync().sessionData;
        int n3 = ((Settings$SessionData)object).maxCompleteSessionsCount;
        Object object2 = this.getAllFinalizedReportFiles();
        int n4 = object2.size();
        if (n4 <= n3) {
            return;
        }
        object = object2.subList(n3, n4).iterator();
        while (bl2 = object.hasNext()) {
            object2 = (File)object.next();
            ((File)object2).delete();
        }
    }

    private static long convertTimestampFromSecondsToMs(long l2) {
        return l2 * 1000L;
    }

    public static /* synthetic */ int d(File file, File file2) {
        return CrashlyticsReportPersistence.lambda$static$0(file, file2);
    }

    private void deleteFiles(List object) {
        boolean bl2;
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            File file = (File)object.next();
            file.delete();
        }
    }

    private static String generateEventFilename(int n3, boolean bl2) {
        Locale locale = Locale.US;
        Object object = n3;
        int n4 = 1;
        Object[] objectArray = new Object[n4];
        objectArray[0] = object;
        object = String.format(locale, EVENT_COUNTER_FORMAT, objectArray);
        String string2 = bl2 ? PRIORITY_EVENT_SUFFIX : NORMAL_EVENT_SUFFIX;
        return cP.a(EVENT_FILE_NAME_PREFIX, (String)object, string2);
    }

    private List getAllFinalizedReportFiles() {
        ArrayList arrayList = new ArrayList();
        Object object = this.fileStore.getPriorityReports();
        arrayList.addAll(object);
        object = this.fileStore.getNativeReports();
        arrayList.addAll(object);
        object = LATEST_SESSION_ID_FIRST_COMPARATOR;
        Collections.sort(arrayList, object);
        List list = this.fileStore.getReports();
        Collections.sort(list, object);
        arrayList.addAll(list);
        return arrayList;
    }

    private static String getEventNameWithoutPriority(String string2) {
        int n3 = EVENT_NAME_LENGTH;
        return string2.substring(0, n3);
    }

    private static boolean isHighPriorityEventFile(String string2) {
        boolean bl2;
        String string3 = EVENT_FILE_NAME_PREFIX;
        boolean bl3 = string2.startsWith(string3);
        if (bl3 && (bl2 = string2.endsWith(string3 = PRIORITY_EVENT_SUFFIX))) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        return bl2;
    }

    private static boolean isNormalPriorityEventFile(File object, String string2) {
        object = EVENT_FILE_NAME_PREFIX;
        boolean bl2 = string2.startsWith((String)object);
        if (bl2 && !(bl2 = string2.endsWith((String)(object = PRIORITY_EVENT_SUFFIX)))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    private static /* synthetic */ int lambda$static$0(File object, File object2) {
        object2 = ((File)object2).getName();
        object = ((File)object).getName();
        return ((String)object2).compareTo((String)object);
    }

    private static int oldestEventFileFirst(File object, File object2) {
        object = CrashlyticsReportPersistence.getEventNameWithoutPriority(((File)object).getName());
        object2 = CrashlyticsReportPersistence.getEventNameWithoutPriority(((File)object2).getName());
        return ((String)object).compareTo((String)object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String readTextFile(File object) {
        Throwable throwable2;
        FileInputStream fileInputStream;
        block5: {
            int n3 = 8192;
            byte[] byArray = new byte[n3];
            Object object2 = new ByteArrayOutputStream();
            fileInputStream = new FileInputStream((File)object);
            try {
                int n4;
                while ((n4 = fileInputStream.read(byArray)) > 0) {
                    ((ByteArrayOutputStream)object2).write(byArray, 0, n4);
                }
            }
            catch (Throwable throwable2) {
                break block5;
            }
            byArray = ((ByteArrayOutputStream)object2).toByteArray();
            object2 = UTF_8;
            object = new String(byArray, (Charset)object2);
            fileInputStream.close();
            return object;
        }
        try {
            fileInputStream.close();
            throw throwable2;
        }
        catch (Throwable throwable3) {
            throwable2.addSuppressed(throwable3);
        }
        throw throwable2;
    }

    private void synthesizeNativeReportFile(File object, CrashlyticsReport$FilesPayload object2, String object3, CrashlyticsReport$ApplicationExitInfo object4) {
        String string2 = this.sessionsSubscriber.getAppQualitySessionId((String)object3);
        CrashlyticsReportJsonTransform crashlyticsReportJsonTransform = TRANSFORM;
        Object object5 = CrashlyticsReportPersistence.readTextFile((File)object);
        object5 = crashlyticsReportJsonTransform.reportFromJson((String)object5);
        object2 = ((CrashlyticsReport)object5).withNdkPayload((CrashlyticsReport$FilesPayload)object2);
        object2 = ((CrashlyticsReport)object2).withApplicationExitInfo((CrashlyticsReport$ApplicationExitInfo)object4);
        object2 = ((CrashlyticsReport)object2).withAppQualitySessionId(string2);
        object4 = this.fileStore;
        object3 = ((FileStore)object4).getNativeReport((String)object3);
        object2 = crashlyticsReportJsonTransform.reportToJson((CrashlyticsReport)object2);
        try {
            CrashlyticsReportPersistence.writeTextFile((File)object3, (String)object2);
        }
        catch (IOException iOException) {
            object3 = Logger.getLogger();
            string2 = "Could not synthesize final native report file for ";
            object4 = new StringBuilder(string2);
            ((StringBuilder)object4).append(object);
            object = ((StringBuilder)object4).toString();
            ((Logger)object3).w((String)object, iOException);
        }
    }

    private void synthesizeReport(String string2, long l2) {
        CharSequence charSequence;
        Object object;
        boolean bl2;
        Object object2 = this.fileStore;
        Object object3 = EVENT_FILE_FILTER;
        boolean bl3 = (object2 = ((FileStore)object2).getSessionFiles(string2, (FilenameFilter)object3)).isEmpty();
        if (bl3) {
            Logger logger = Logger.getLogger();
            StringBuilder stringBuilder = new StringBuilder("Session ");
            stringBuilder.append(string2);
            stringBuilder.append(" has no events.");
            string2 = stringBuilder.toString();
            logger.v(string2);
            return;
        }
        Collections.sort(object2);
        ArrayList<Object> arrayList = new ArrayList<Object>();
        object2 = object2.iterator();
        bl3 = false;
        object3 = null;
        block7: while (true) {
            boolean bl4;
            bl2 = false;
            while (bl4 = object2.hasNext()) {
                IOException iOException2;
                Object object4;
                block12: {
                    block11: {
                        Object object5;
                        object4 = (File)object2.next();
                        try {
                            object5 = TRANSFORM;
                        }
                        catch (IOException iOException2) {
                            break block12;
                        }
                        object = CrashlyticsReportPersistence.readTextFile((File)object4);
                        object5 = ((CrashlyticsReportJsonTransform)object5).eventFromJson((String)object);
                        arrayList.add(object5);
                        if (bl2) break block11;
                        object5 = ((File)object4).getName();
                        bl4 = CrashlyticsReportPersistence.isHighPriorityEventFile((String)object5);
                        if (!bl4) continue block7;
                    }
                    bl4 = true;
                    bl2 = true;
                    continue;
                }
                object = Logger.getLogger();
                String string3 = "Could not add event to report for ";
                charSequence = new StringBuilder(string3);
                ((StringBuilder)charSequence).append(object4);
                object4 = ((StringBuilder)charSequence).toString();
                ((Logger)object).w((String)object4, iOException2);
            }
            break;
        }
        boolean bl5 = arrayList.isEmpty();
        if (bl5) {
            Logger logger = Logger.getLogger();
            StringBuilder stringBuilder = new StringBuilder("Could not parse event files for session ");
            stringBuilder.append(string2);
            string2 = stringBuilder.toString();
            logger.w(string2);
            return;
        }
        object2 = this.fileStore;
        object = UserMetadata.readUserId(string2, (FileStore)object2);
        charSequence = this.sessionsSubscriber.getAppQualitySessionId(string2);
        object3 = this.fileStore.getSessionFile(string2, REPORT_FILE_NAME);
        object2 = this;
        this.synthesizeReportFile((File)object3, arrayList, l2, bl2, (String)object, (String)charSequence);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void synthesizeReportFile(File object, List object2, long l2, boolean bl2, String charSequence, String string2) {
        IOException iOException2;
        block5: {
            Object object3;
            CrashlyticsReportJsonTransform crashlyticsReportJsonTransform;
            block4: {
                Object object4;
                block3: {
                    String string3 = "appQualitySessionId: ";
                    try {
                        crashlyticsReportJsonTransform = TRANSFORM;
                        Object object5 = CrashlyticsReportPersistence.readTextFile((File)object);
                        object5 = crashlyticsReportJsonTransform.reportFromJson((String)object5);
                        object3 = ((CrashlyticsReport)object5).withSessionEndFields(l2, bl2, (String)charSequence);
                        object3 = ((CrashlyticsReport)object3).withAppQualitySessionId(string2);
                        object2 = ((CrashlyticsReport)object3).withEvents((List)object2);
                        object3 = ((CrashlyticsReport)object2).getSession();
                        if (object3 == null) {
                            return;
                        }
                        object4 = Logger.getLogger();
                        charSequence = new StringBuilder(string3);
                        ((StringBuilder)charSequence).append(string2);
                        charSequence = ((StringBuilder)charSequence).toString();
                        ((Logger)object4).d((String)charSequence);
                        if (!bl2) break block3;
                        object4 = this.fileStore;
                        object3 = ((CrashlyticsReport$Session)object3).getIdentifier();
                        object3 = ((FileStore)object4).getPriorityReport((String)object3);
                        break block4;
                    }
                    catch (IOException iOException2) {
                        break block5;
                    }
                }
                object4 = this.fileStore;
                object3 = ((CrashlyticsReport$Session)object3).getIdentifier();
                object3 = ((FileStore)object4).getReport((String)object3);
            }
            object2 = crashlyticsReportJsonTransform.reportToJson((CrashlyticsReport)object2);
            CrashlyticsReportPersistence.writeTextFile((File)object3, (String)object2);
            return;
        }
        Logger logger = Logger.getLogger();
        String string4 = "Could not synthesize final report file for ";
        StringBuilder stringBuilder = new StringBuilder(string4);
        stringBuilder.append(object);
        object = stringBuilder.toString();
        logger.w((String)object, iOException2);
    }

    private int trimEvents(String object, int n3) {
        Object object2 = this.fileStore;
        Hd0 hd0 = new Object();
        object = ((FileStore)object2).getSessionFiles((String)object, hd0);
        object2 = new Object();
        Collections.sort(object, object2);
        return CrashlyticsReportPersistence.capFilesCount((List)object, n3);
    }

    private static void writeTextFile(File comparable, String string2) {
        FileOutputStream fileOutputStream = new FileOutputStream((File)comparable);
        comparable = UTF_8;
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter((OutputStream)fileOutputStream, (Charset)comparable);
        try {
            outputStreamWriter.write(string2);
            return;
        }
        finally {
            outputStreamWriter.close();
        }
    }

    private static void writeTextFile(File file, String string2, long l2) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        Charset charset = UTF_8;
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter((OutputStream)fileOutputStream, charset);
        try {
            outputStreamWriter.write(string2);
            long l3 = CrashlyticsReportPersistence.convertTimestampFromSecondsToMs(l2);
            file.setLastModified(l3);
            return;
        }
        finally {
            try {
                outputStreamWriter.close();
            }
            catch (Throwable throwable) {
                Throwable throwable2;
                throwable2.addSuppressed(throwable);
            }
        }
    }

    public void deleteAllReports() {
        List list = this.fileStore.getReports();
        this.deleteFiles(list);
        list = this.fileStore.getPriorityReports();
        this.deleteFiles(list);
        list = this.fileStore.getNativeReports();
        this.deleteFiles(list);
    }

    public void finalizeReports(String object, long l2) {
        boolean bl2;
        object = this.capAndGetOpenSessions((String)object).iterator();
        while (bl2 = object.hasNext()) {
            String string2 = (String)object.next();
            Object object2 = Logger.getLogger();
            String string3 = "Finalizing report for session ";
            CharSequence charSequence = new StringBuilder(string3);
            charSequence.append(string2);
            charSequence = charSequence.toString();
            ((Logger)object2).v((String)charSequence);
            this.synthesizeReport(string2, l2);
            object2 = this.fileStore;
            ((FileStore)object2).deleteSessionFiles(string2);
        }
        this.capFinalizedReports();
    }

    public void finalizeSessionWithNativeEvent(String string2, CrashlyticsReport$FilesPayload crashlyticsReport$FilesPayload, CrashlyticsReport$ApplicationExitInfo crashlyticsReport$ApplicationExitInfo) {
        File file = this.fileStore.getSessionFile(string2, REPORT_FILE_NAME);
        Logger logger = Logger.getLogger();
        CharSequence charSequence = new StringBuilder("Writing native session report for ");
        charSequence.append(string2);
        charSequence.append(" to file: ");
        charSequence.append(file);
        charSequence = charSequence.toString();
        logger.d((String)charSequence);
        this.synthesizeNativeReportFile(file, crashlyticsReport$FilesPayload, string2, crashlyticsReport$ApplicationExitInfo);
    }

    public SortedSet getOpenSessionIds() {
        List list = this.fileStore.getAllOpenSessionIds();
        TreeSet treeSet = new TreeSet(list);
        return treeSet.descendingSet();
    }

    public long getStartTimestampMillis(String string2) {
        return this.fileStore.getSessionFile(string2, SESSION_START_TIMESTAMP_FILE_NAME).lastModified();
    }

    public boolean hasFinalizedReports() {
        List list = this.fileStore.getReports();
        boolean bl2 = list.isEmpty();
        if (bl2 && (bl2 = (list = this.fileStore.getPriorityReports()).isEmpty()) && (bl2 = (list = this.fileStore.getNativeReports()).isEmpty())) {
            bl2 = false;
            list = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public List loadFinalizedReports() {
        boolean bl2;
        Object object = this.getAllFinalizedReportFiles();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            File file = (File)object.next();
            Object object2 = TRANSFORM;
            Object object3 = CrashlyticsReportPersistence.readTextFile(file);
            object2 = ((CrashlyticsReportJsonTransform)object2).reportFromJson((String)object3);
            object3 = file.getName();
            object2 = CrashlyticsReportWithSessionId.create((CrashlyticsReport)object2, (String)object3, file);
            try {
                arrayList.add(object2);
            }
            catch (IOException iOException) {
                object3 = Logger.getLogger();
                CharSequence charSequence = new StringBuilder("Could not load report file ");
                charSequence.append(file);
                String string2 = "; deleting";
                charSequence.append(string2);
                charSequence = charSequence.toString();
                ((Logger)object3).w((String)charSequence, iOException);
                file.delete();
            }
        }
        return arrayList;
    }

    public void persistEvent(CrashlyticsReport$Session$Event crashlyticsReport$Session$Event, String string2) {
        this.persistEvent(crashlyticsReport$Session$Event, string2, false);
    }

    public void persistEvent(CrashlyticsReport$Session$Event object, String string2, boolean bl2) {
        Settings$SessionData settings$SessionData = this.settingsProvider.getSettingsSync().sessionData;
        int n3 = settings$SessionData.maxCustomExceptionEvents;
        object = TRANSFORM.eventToJson((CrashlyticsReport$Session$Event)object);
        Object object2 = this.eventCounter;
        int n4 = ((AtomicInteger)object2).getAndIncrement();
        Object object3 = CrashlyticsReportPersistence.generateEventFilename(n4, bl2);
        object2 = this.fileStore;
        object3 = ((FileStore)object2).getSessionFile(string2, (String)object3);
        try {
            CrashlyticsReportPersistence.writeTextFile((File)object3, (String)object);
        }
        catch (IOException iOException) {
            object3 = Logger.getLogger();
            String string3 = "Could not persist event for session ";
            object2 = new StringBuilder(string3);
            ((StringBuilder)object2).append(string2);
            object2 = ((StringBuilder)object2).toString();
            ((Logger)object3).w((String)object2, iOException);
        }
        this.trimEvents(string2, n3);
    }

    public void persistReport(CrashlyticsReport object) {
        Object object2 = ((CrashlyticsReport)object).getSession();
        if (object2 == null) {
            Logger.getLogger().d("Could not get session for report");
            return;
        }
        String string2 = ((CrashlyticsReport$Session)object2).getIdentifier();
        Object object3 = TRANSFORM;
        object = ((CrashlyticsReportJsonTransform)object3).reportToJson((CrashlyticsReport)object);
        object3 = this.fileStore;
        String string3 = REPORT_FILE_NAME;
        object3 = ((FileStore)object3).getSessionFile(string2, string3);
        CrashlyticsReportPersistence.writeTextFile((File)object3, (String)object);
        object = this.fileStore;
        object3 = SESSION_START_TIMESTAMP_FILE_NAME;
        object = ((FileStore)object).getSessionFile(string2, (String)object3);
        object3 = NORMAL_EVENT_SUFFIX;
        long l2 = ((CrashlyticsReport$Session)object2).getStartedAt();
        try {
            CrashlyticsReportPersistence.writeTextFile((File)object, (String)object3, l2);
        }
        catch (IOException iOException) {
            object2 = Logger.getLogger();
            string3 = "Could not persist report for session ";
            object3 = new StringBuilder(string3);
            ((StringBuilder)object3).append(string2);
            string2 = ((StringBuilder)object3).toString();
            ((Logger)object2).d(string2, iOException);
        }
    }
}

