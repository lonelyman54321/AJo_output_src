/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Environment
 *  android.os.StatFs
 *  android.util.Base64
 */
package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.NativeSessionFileProvider;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.common.AppData;
import com.google.firebase.crashlytics.internal.common.BytesBackedNativeSessionFile;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber;
import com.google.firebase.crashlytics.internal.common.CrashlyticsController$1;
import com.google.firebase.crashlytics.internal.common.CrashlyticsController$3;
import com.google.firebase.crashlytics.internal.common.CrashlyticsController$4;
import com.google.firebase.crashlytics.internal.common.CrashlyticsController$5;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.common.CrashlyticsFileMarker;
import com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler;
import com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler$CrashListener;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.DeliveryMechanism;
import com.google.firebase.crashlytics.internal.common.FileBackedNativeSessionFile;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.common.NativeSessionFile;
import com.google.firebase.crashlytics.internal.common.NativeSessionFileGzipper;
import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import com.google.firebase.crashlytics.internal.common.c;
import com.google.firebase.crashlytics.internal.common.d;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsTasks;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.metadata.EventMetadata;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.crashlytics.internal.model.StaticSessionData$AppData;
import com.google.firebase.crashlytics.internal.model.StaticSessionData$DeviceData;
import com.google.firebase.crashlytics.internal.model.StaticSessionData$OsData;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

class CrashlyticsController {
    static final FilenameFilter APP_EXCEPTION_MARKER_FILTER;
    static final String APP_EXCEPTION_MARKER_PREFIX = ".ae";
    static final String FIREBASE_APPLICATION_EXCEPTION = "_ae";
    static final String FIREBASE_CRASH_TYPE = "fatal";
    static final int FIREBASE_CRASH_TYPE_FATAL = 1;
    static final String FIREBASE_TIMESTAMP = "timestamp";
    private static final String GENERATOR_FORMAT = "Crashlytics Android SDK/%s";
    private static final String META_INF_FOLDER = "META-INF/";
    private static final String VERSION_CONTROL_INFO_FILE = "version-control-info.textproto";
    private static final String VERSION_CONTROL_INFO_KEY = "com.crashlytics.version-control-info";
    private final AnalyticsEventLogger analyticsEventLogger;
    private final AppData appData;
    final AtomicBoolean checkForUnsentReportsCalled;
    private final Context context;
    private CrashlyticsUncaughtExceptionHandler crashHandler;
    private final CrashlyticsFileMarker crashMarker;
    private final CrashlyticsWorkers crashlyticsWorkers;
    private final DataCollectionArbiter dataCollectionArbiter;
    private final FileStore fileStore;
    private final IdManager idManager;
    private final LogFileManager logFileManager;
    private final CrashlyticsNativeComponent nativeComponent;
    final TaskCompletionSource reportActionProvided;
    private final SessionReportingCoordinator reportingCoordinator;
    private final CrashlyticsAppQualitySessionsSubscriber sessionsSubscriber;
    private SettingsProvider settingsProvider = null;
    final TaskCompletionSource unsentReportsAvailable;
    final TaskCompletionSource unsentReportsHandled;
    private final UserMetadata userMetadata;

    static {
        d d2 = new Object();
        APP_EXCEPTION_MARKER_FILTER = d2;
    }

    public CrashlyticsController(Context context, IdManager idManager, DataCollectionArbiter dataCollectionArbiter, FileStore fileStore, CrashlyticsFileMarker crashlyticsFileMarker, AppData appData, UserMetadata userMetadata, LogFileManager logFileManager, SessionReportingCoordinator sessionReportingCoordinator, CrashlyticsNativeComponent crashlyticsNativeComponent, AnalyticsEventLogger analyticsEventLogger, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber, CrashlyticsWorkers crashlyticsWorkers) {
        Object object = new TaskCompletionSource();
        this.unsentReportsAvailable = object;
        object = new TaskCompletionSource();
        this.reportActionProvided = object;
        object = new TaskCompletionSource();
        this.unsentReportsHandled = object;
        this.checkForUnsentReportsCalled = object = new AtomicBoolean(false);
        this.context = context;
        this.idManager = idManager;
        this.dataCollectionArbiter = dataCollectionArbiter;
        this.fileStore = fileStore;
        this.crashMarker = crashlyticsFileMarker;
        this.appData = appData;
        this.userMetadata = userMetadata;
        this.logFileManager = logFileManager;
        this.nativeComponent = crashlyticsNativeComponent;
        this.analyticsEventLogger = analyticsEventLogger;
        this.sessionsSubscriber = crashlyticsAppQualitySessionsSubscriber;
        this.reportingCoordinator = sessionReportingCoordinator;
        this.crashlyticsWorkers = crashlyticsWorkers;
    }

    public static /* synthetic */ boolean a(File file, String string2) {
        return string2.startsWith(APP_EXCEPTION_MARKER_PREFIX);
    }

    public static /* synthetic */ long access$000(long l2) {
        return CrashlyticsController.getTimestampSeconds(l2);
    }

    public static /* synthetic */ String access$100(CrashlyticsController crashlyticsController) {
        return crashlyticsController.getCurrentSessionId();
    }

    public static /* synthetic */ AnalyticsEventLogger access$1000(CrashlyticsController crashlyticsController) {
        return crashlyticsController.analyticsEventLogger;
    }

    public static /* synthetic */ CrashlyticsFileMarker access$200(CrashlyticsController crashlyticsController) {
        return crashlyticsController.crashMarker;
    }

    public static /* synthetic */ SessionReportingCoordinator access$300(CrashlyticsController crashlyticsController) {
        return crashlyticsController.reportingCoordinator;
    }

    public static /* synthetic */ void access$400(CrashlyticsController crashlyticsController, long l2) {
        crashlyticsController.doWriteAppExceptionMarker(l2);
    }

    public static /* synthetic */ void access$500(CrashlyticsController crashlyticsController, String string2, Boolean bl2) {
        crashlyticsController.doOpenSession(string2, bl2);
    }

    public static /* synthetic */ DataCollectionArbiter access$600(CrashlyticsController crashlyticsController) {
        return crashlyticsController.dataCollectionArbiter;
    }

    public static /* synthetic */ CrashlyticsWorkers access$700(CrashlyticsController crashlyticsController) {
        return crashlyticsController.crashlyticsWorkers;
    }

    public static /* synthetic */ Task access$800(CrashlyticsController crashlyticsController) {
        return crashlyticsController.logAnalyticsAppExceptionEvents();
    }

    public static /* synthetic */ void access$900(List list) {
        CrashlyticsController.deleteFiles(list);
    }

    public static /* synthetic */ void b(CrashlyticsController crashlyticsController, String string2) {
        crashlyticsController.lambda$openSession$1(string2);
    }

    private static StaticSessionData$AppData createAppData(IdManager idManager, AppData appData) {
        String string2 = idManager.getAppIdentifier();
        String string3 = appData.versionCode;
        String string4 = appData.versionName;
        String string5 = idManager.getInstallIds().getCrashlyticsInstallId();
        int n3 = DeliveryMechanism.determineFrom(appData.installerPackageName).getId();
        DevelopmentPlatformProvider developmentPlatformProvider = appData.developmentPlatformProvider;
        return StaticSessionData$AppData.create(string2, string3, string4, string5, n3, developmentPlatformProvider);
    }

    private static StaticSessionData$DeviceData createDeviceData(Context context) {
        String string2 = Environment.getDataDirectory().getPath();
        StatFs statFs = new StatFs(string2);
        long l2 = statFs.getBlockCount();
        long l3 = statFs.getBlockSize();
        long l4 = l2 * l3;
        int n3 = CommonUtils.getCpuArchitectureInt();
        String string3 = Build.MODEL;
        int n4 = Runtime.getRuntime().availableProcessors();
        long l7 = CommonUtils.calculateTotalRamInBytes(context);
        boolean bl2 = CommonUtils.isEmulator();
        int n7 = CommonUtils.getDeviceState();
        String string4 = Build.MANUFACTURER;
        String string5 = Build.PRODUCT;
        return StaticSessionData$DeviceData.create(n3, string3, n4, l7, l4, bl2, n7, string4, string5);
    }

    private static StaticSessionData$OsData createOsData() {
        String string2 = Build.VERSION.RELEASE;
        String string3 = Build.VERSION.CODENAME;
        boolean bl2 = CommonUtils.isRooted();
        return StaticSessionData$OsData.create(string2, string3, bl2);
    }

    private static void deleteFiles(List object) {
        boolean bl2;
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            File file = (File)object.next();
            file.delete();
        }
    }

    /*
     * Unable to fully structure code
     */
    private void doCloseSessions(boolean var1_1, SettingsProvider var2_2, boolean var3_3) {
        CrashlyticsWorkers.checkBackgroundThread();
        var5_5 = this.reportingCoordinator.listSortedOpenSessionIds();
        var4_4 = new ArrayList<E>(var5_5);
        var6_6 = var4_4.size();
        if (var6_6 <= var1_1) {
            Logger.getLogger().v("No open sessions to be closed.");
            return;
        }
        var5_5 = (String)var4_4.get(var1_1);
        if (!var3_3) ** GOTO lbl-1000
        var2_2 = var2_2.getSettingsSync().featureFlagData;
        var7_7 = var2_2.collectAnrs;
        if (var7_7) {
            this.writeApplicationExitInfoEventIfRelevant((String)var5_5);
        } else lbl-1000:
        // 2 sources

        {
            var2_2 = Logger.getLogger();
            var8_8 = "ANR feature disabled.";
            var2_2.v(var8_8);
        }
        if (var3_3 && (var7_7 = (var2_2 = this.nativeComponent).hasCrashDataForSession((String)var5_5))) {
            this.finalizePreviousNativeSession((String)var5_5);
        }
        if (var1_1 != 0) {
            var1_1 = 0;
            var9_9 = (String)var4_4.get(0);
        } else {
            var9_9 = this.sessionsSubscriber;
            var7_7 = false;
            var2_2 = null;
            var9_9.setSessionId(null);
            var1_1 = 0;
            var9_9 = null;
        }
        var2_2 = this.reportingCoordinator;
        var10_10 = CrashlyticsController.getCurrentTimestampSeconds();
        var2_2.finalizeSessions(var10_10, (String)var9_9);
    }

    private void doOpenSession(String string2, Boolean object) {
        long l2 = CrashlyticsController.getCurrentTimestampSeconds();
        Object object2 = Logger.getLogger();
        Object object3 = new StringBuilder("Opening a new session with ID ");
        ((StringBuilder)object3).append(string2);
        object3 = ((StringBuilder)object3).toString();
        ((Logger)object2).d((String)object3);
        object2 = Locale.US;
        object2 = CrashlyticsCore.getVersion();
        String string3 = kp1_0.c("Crashlytics Android SDK/", (String)object2);
        object2 = this.idManager;
        object3 = this.appData;
        object2 = CrashlyticsController.createAppData((IdManager)object2, (AppData)object3);
        object3 = CrashlyticsController.createOsData();
        StaticSessionData$DeviceData staticSessionData$DeviceData = CrashlyticsController.createDeviceData(this.context);
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.nativeComponent;
        StaticSessionData staticSessionData = StaticSessionData.create((StaticSessionData$AppData)object2, (StaticSessionData$OsData)object3, staticSessionData$DeviceData);
        object2 = crashlyticsNativeComponent;
        object3 = string2;
        crashlyticsNativeComponent.prepareNativeSession(string2, string3, l2, staticSessionData);
        boolean bl2 = (Boolean)object;
        if (bl2 && string2 != null) {
            object = this.userMetadata;
            ((UserMetadata)object).setNewSession(string2);
        }
        this.logFileManager.setCurrentSession(string2);
        this.sessionsSubscriber.setSessionId(string2);
        this.reportingCoordinator.onBeginSession(string2, l2);
    }

    private void doWriteAppExceptionMarker(long l2) {
        block9: {
            String string2 = APP_EXCEPTION_MARKER_PREFIX;
            FileStore fileStore = this.fileStore;
            StringBuilder stringBuilder = new StringBuilder(string2);
            stringBuilder.append(l2);
            Object object = stringBuilder.toString();
            object = fileStore.getCommonFile((String)object);
            boolean bl2 = ((File)object).createNewFile();
            if (bl2) break block9;
            Object object2 = "Create new file failed.";
            try {
                object = new IOException((String)object2);
                throw object;
            }
            catch (IOException iOException) {
                object2 = Logger.getLogger();
                string2 = "Could not create app exception marker file.";
                ((Logger)object2).w(string2, iOException);
            }
        }
    }

    private void finalizePreviousNativeSession(String string2) {
        Object object = Logger.getLogger();
        Object object2 = new StringBuilder("Finalizing native report for session ");
        ((StringBuilder)object2).append(string2);
        object2 = ((StringBuilder)object2).toString();
        ((Logger)object).v((String)object2);
        object = this.nativeComponent.getSessionFileProvider(string2);
        object2 = object.getMinidumpFile();
        CrashlyticsReport$ApplicationExitInfo crashlyticsReport$ApplicationExitInfo = object.getApplicationExitInto();
        boolean bl2 = CrashlyticsController.nativeCoreAbsent(string2, (File)object2, crashlyticsReport$ApplicationExitInfo);
        if (bl2) {
            Logger.getLogger().w("No native core present");
            return;
        }
        long l2 = ((File)object2).lastModified();
        Object object3 = this.fileStore;
        object2 = new LogFileManager((FileStore)object3, string2);
        object3 = this.fileStore.getNativeSessionDir(string2);
        boolean bl3 = ((File)object3).isDirectory();
        if (!bl3) {
            Logger.getLogger().w("Couldn't create directory to store native session files, aborting.");
            return;
        }
        this.doWriteAppExceptionMarker(l2);
        FileStore fileStore = this.fileStore;
        byte[] byArray = ((LogFileManager)object2).getBytesForLog();
        object = CrashlyticsController.getNativeSessionFiles((NativeSessionFileProvider)object, string2, fileStore, byArray);
        NativeSessionFileGzipper.processNativeSessions((File)object3, (List)object);
        Logger.getLogger().d("CrashlyticsController#finalizePreviousNativeSession");
        this.reportingCoordinator.finalizeSessionWithNativeEvent(string2, (List)object, crashlyticsReport$ApplicationExitInfo);
        ((LogFileManager)object2).clearLog();
    }

    private static boolean firebaseCrashExists() {
        String string2 = "com.google.firebase.crash.FirebaseCrash";
        try {
            Class.forName(string2);
            return true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return false;
        }
    }

    private String getCurrentSessionId() {
        Object object = this.reportingCoordinator.listSortedOpenSessionIds();
        boolean bl2 = object.isEmpty();
        object = !bl2 ? (String)object.first() : null;
        return object;
    }

    private static long getCurrentTimestampSeconds() {
        return CrashlyticsController.getTimestampSeconds(System.currentTimeMillis());
    }

    public static List getNativeSessionFiles(NativeSessionFileProvider object, String object2, FileStore arrayList, byte[] object3) {
        File file = ((FileStore)((Object)arrayList)).getSessionFile((String)object2, "user-data");
        String string2 = "keys";
        File file2 = ((FileStore)((Object)arrayList)).getSessionFile((String)object2, string2);
        object2 = ((FileStore)((Object)arrayList)).getSessionFile((String)object2, "rollouts-state");
        arrayList = new ArrayList<BytesBackedNativeSessionFile>();
        Object object4 = new BytesBackedNativeSessionFile("logs_file", "logs", (byte[])object3);
        arrayList.add((BytesBackedNativeSessionFile)object4);
        object3 = new FileBackedNativeSessionFile;
        object4 = object.getMetadataFile();
        object3("crash_meta_file", "metadata", (File)object4);
        arrayList.add((BytesBackedNativeSessionFile)object3);
        object3 = new FileBackedNativeSessionFile;
        File file3 = object.getSessionFile();
        object3("session_meta_file", "session", file3);
        arrayList.add((BytesBackedNativeSessionFile)object3);
        object3 = new FileBackedNativeSessionFile;
        file3 = object.getAppFile();
        object3("app_meta_file", "app", file3);
        arrayList.add((BytesBackedNativeSessionFile)object3);
        object3 = new FileBackedNativeSessionFile;
        file3 = object.getDeviceFile();
        object3("device_meta_file", "device", file3);
        arrayList.add((BytesBackedNativeSessionFile)object3);
        object3 = new FileBackedNativeSessionFile;
        file3 = object.getOsFile();
        object3("os_meta_file", "os", file3);
        arrayList.add((BytesBackedNativeSessionFile)object3);
        object = CrashlyticsController.nativeCoreFile((NativeSessionFileProvider)object);
        arrayList.add((BytesBackedNativeSessionFile)object);
        object = new FileBackedNativeSessionFile("user_meta_file", "user", file);
        arrayList.add((BytesBackedNativeSessionFile)object);
        object = new FileBackedNativeSessionFile("keys_file", string2, file2);
        arrayList.add((BytesBackedNativeSessionFile)object);
        object = new FileBackedNativeSessionFile("rollouts_file", "rollouts", (File)object2);
        arrayList.add((BytesBackedNativeSessionFile)object);
        return arrayList;
    }

    private InputStream getResourceAsStream(String object) {
        ClassLoader classLoader = this.getClass().getClassLoader();
        if (classLoader == null) {
            Logger.getLogger().w("Couldn't get Class Loader");
            return null;
        }
        if ((object = classLoader.getResourceAsStream((String)object)) == null) {
            Logger.getLogger().i("No version control information found");
            return null;
        }
        return object;
    }

    private static long getTimestampSeconds(long l2) {
        return l2 / 1000L;
    }

    private /* synthetic */ void lambda$openSession$1(String string2) {
        Boolean bl2 = Boolean.FALSE;
        this.doOpenSession(string2, bl2);
    }

    private Task logAnalyticsAppExceptionEvent(long l2) {
        boolean bl2 = CrashlyticsController.firebaseCrashExists();
        if (bl2) {
            Logger.getLogger().w("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return Tasks.forResult(null);
        }
        Logger.getLogger().d("Logging app exception event to Firebase Analytics");
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        CrashlyticsController$5 crashlyticsController$5 = new CrashlyticsController$5(this, l2);
        return Tasks.call(scheduledThreadPoolExecutor, crashlyticsController$5);
    }

    private Task logAnalyticsAppExceptionEvents() {
        boolean bl2;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Iterator iterator = this.listAppExceptionMarkerFiles().iterator();
        while (bl2 = iterator.hasNext()) {
            File file = (File)iterator.next();
            Object object = file.getName();
            int n3 = 3;
            object = ((String)object).substring(n3);
            long l2 = Long.parseLong((String)object);
            object = this.logAnalyticsAppExceptionEvent(l2);
            try {
                arrayList.add(object);
            }
            catch (NumberFormatException numberFormatException) {
                object = Logger.getLogger();
                CharSequence charSequence = new StringBuilder("Could not parse app exception timestamp from file ");
                String string2 = file.getName();
                charSequence.append(string2);
                charSequence = charSequence.toString();
                ((Logger)object).w((String)charSequence);
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    private static boolean nativeCoreAbsent(String string2, File file, CrashlyticsReport$ApplicationExitInfo crashlyticsReport$ApplicationExitInfo) {
        boolean bl2;
        CharSequence charSequence;
        String string3;
        Logger logger;
        boolean bl3;
        if (file == null || !(bl3 = file.exists())) {
            logger = Logger.getLogger();
            string3 = "No minidump data found for session ";
            charSequence = new StringBuilder(string3);
            ((StringBuilder)charSequence).append(string2);
            charSequence = ((StringBuilder)charSequence).toString();
            logger.w((String)charSequence);
        }
        if (crashlyticsReport$ApplicationExitInfo == null) {
            logger = Logger.getLogger();
            string3 = "No Tombstones data found for session ";
            charSequence = new StringBuilder(string3);
            ((StringBuilder)charSequence).append(string2);
            string2 = ((StringBuilder)charSequence).toString();
            logger.i(string2);
        }
        if (!(file != null && (bl2 = file.exists()) || crashlyticsReport$ApplicationExitInfo != null)) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        return bl2;
    }

    private static NativeSessionFile nativeCoreFile(NativeSessionFileProvider object) {
        int n3;
        Object object2 = null;
        object = object.getMinidumpFile();
        String string2 = "minidump";
        String string3 = "minidump_file";
        if (object != null && (n3 = ((File)object).exists()) != 0) {
            object2 = new FileBackedNativeSessionFile(string3, string2, (File)object);
        } else {
            n3 = 1;
            byte[] byArray = new byte[n3];
            byArray[0] = 0;
            object2 = object = new BytesBackedNativeSessionFile(string3, string2, byArray);
        }
        return object2;
    }

    private static byte[] readResource(InputStream inputStream) {
        int n3;
        int n4;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int n7 = 1024;
        byte[] byArray = new byte[n7];
        while ((n4 = inputStream.read(byArray)) != (n3 = -1)) {
            n3 = 0;
            byteArrayOutputStream.write(byArray, 0, n4);
        }
        return byteArrayOutputStream.toByteArray();
    }

    private Task waitForReportAction() {
        Object object = this.dataCollectionArbiter;
        boolean bl2 = ((DataCollectionArbiter)object).isAutomaticDataCollectionEnabled();
        if (bl2) {
            Logger.getLogger().d("Automatic data collection is enabled. Allowing upload.");
            object = this.unsentReportsAvailable;
            Boolean bl3 = Boolean.FALSE;
            ((TaskCompletionSource)object).trySetResult(bl3);
            return Tasks.forResult(Boolean.TRUE);
        }
        Logger.getLogger().d("Automatic data collection is disabled.");
        Logger.getLogger().v("Notifying that unsent reports are available.");
        object = this.unsentReportsAvailable;
        Object object2 = Boolean.TRUE;
        ((TaskCompletionSource)object).trySetResult(object2);
        object = this.dataCollectionArbiter.waitForAutomaticDataCollectionEnabled();
        object2 = new CrashlyticsController$3(this);
        object = ((Task)object).onSuccessTask((SuccessContinuation)object2);
        Logger.getLogger().d("Waiting for send/deleteUnsentReports to be called.");
        object2 = this.reportActionProvided.getTask();
        return CrashlyticsTasks.race((Task)object, (Task)object2);
    }

    private void writeApplicationExitInfoEventIfRelevant(String object) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 30;
        if (n3 >= n4) {
            Object object2 = this.context;
            Object object3 = "activity";
            n4 = (object2 = wv0_0.a((ActivityManager)object2.getSystemService((String)object3))).size();
            if (n4 != 0) {
                Object object4 = this.fileStore;
                object3 = new LogFileManager((FileStore)object4, (String)object);
                object4 = this.fileStore;
                Object object5 = this.crashlyticsWorkers;
                object4 = UserMetadata.loadFromExistingSession((String)object, (FileStore)object4, (CrashlyticsWorkers)object5);
                object5 = this.reportingCoordinator;
                ((SessionReportingCoordinator)object5).persistRelevantAppExitInfoEvent((String)object, (List)object2, (LogFileManager)object3, (UserMetadata)object4);
            } else {
                object2 = Logger.getLogger();
                String string2 = "No ApplicationExitInfo available. Session: ";
                object3 = new StringBuilder(string2);
                ((StringBuilder)object3).append((String)object);
                object = ((StringBuilder)object3).toString();
                ((Logger)object2).v((String)object);
            }
        } else {
            object = Logger.getLogger();
            String string3 = "ANR feature enabled, but device is API ";
            StringBuilder stringBuilder = new StringBuilder(string3);
            stringBuilder.append(n3);
            String string4 = stringBuilder.toString();
            ((Logger)object).v(string4);
        }
    }

    public Task checkForUnsentReports() {
        AtomicBoolean atomicBoolean = this.checkForUnsentReportsCalled;
        boolean bl2 = true;
        boolean bl3 = atomicBoolean.compareAndSet(false, bl2);
        if (!bl3) {
            Logger.getLogger().w("checkForUnsentReports should only be called once per execution.");
            return Tasks.forResult(Boolean.FALSE);
        }
        return this.unsentReportsAvailable.getTask();
    }

    public Task deleteUnsentReports() {
        TaskCompletionSource taskCompletionSource = this.reportActionProvided;
        Boolean bl2 = Boolean.FALSE;
        taskCompletionSource.trySetResult(bl2);
        return this.unsentReportsHandled.getTask();
    }

    public boolean didCrashOnPreviousExecution() {
        CrashlyticsWorkers.checkBackgroundThread();
        Object object = this.crashMarker;
        boolean bl2 = ((CrashlyticsFileMarker)object).isPresent();
        boolean bl3 = true;
        if (!bl2) {
            CrashlyticsNativeComponent crashlyticsNativeComponent;
            object = this.getCurrentSessionId();
            if (object == null || !(bl2 = (crashlyticsNativeComponent = this.nativeComponent).hasCrashDataForSession((String)object))) {
                bl3 = false;
            }
            return bl3;
        }
        Logger.getLogger().v("Found previous crash marker.");
        this.crashMarker.remove();
        return bl3;
    }

    public void doCloseSessions(SettingsProvider settingsProvider) {
        this.doCloseSessions(false, settingsProvider, false);
    }

    public void enableExceptionHandling(String object, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, SettingsProvider settingsProvider) {
        CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler;
        this.settingsProvider = settingsProvider;
        this.openSession((String)object);
        object = new CrashlyticsController$1(this);
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.nativeComponent;
        this.crashHandler = crashlyticsUncaughtExceptionHandler = new CrashlyticsUncaughtExceptionHandler((CrashlyticsUncaughtExceptionHandler$CrashListener)object, settingsProvider, uncaughtExceptionHandler, crashlyticsNativeComponent);
        Thread.setDefaultUncaughtExceptionHandler(crashlyticsUncaughtExceptionHandler);
    }

    public boolean finalizeSessions(SettingsProvider settingsProvider) {
        CrashlyticsWorkers.checkBackgroundThread();
        boolean bl2 = this.isHandlingException();
        if (bl2) {
            Logger.getLogger().w("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        Logger logger = Logger.getLogger();
        String string2 = "Finalizing previously open sessions.";
        logger.v(string2);
        bl2 = true;
        try {
            this.doCloseSessions(bl2, settingsProvider, bl2);
            Logger.getLogger().v("Closed all previously open sessions.");
            return bl2;
        }
        catch (Exception exception) {
            Logger.getLogger().e("Unable to finalize previously open sessions.", exception);
            return false;
        }
    }

    public UserMetadata getUserMetadata() {
        return this.userMetadata;
    }

    public String getVersionControlInfo() {
        InputStream inputStream = this.getResourceAsStream("META-INF/version-control-info.textproto");
        if (inputStream == null) {
            return null;
        }
        Logger.getLogger().d("Read version control info");
        return Base64.encodeToString((byte[])CrashlyticsController.readResource(inputStream), (int)0);
    }

    public void handleUncaughtException(SettingsProvider settingsProvider, Thread thread2, Throwable throwable) {
        this.handleUncaughtException(settingsProvider, thread2, throwable, false);
    }

    /*
     * Exception decompiling
     */
    public void handleUncaughtException(SettingsProvider var1_1, Thread var2_4, Throwable var3_5, boolean var4_6) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 13[TRYBLOCK] [18 : 138->141)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public boolean isHandlingException() {
        boolean bl2;
        CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = this.crashHandler;
        if (crashlyticsUncaughtExceptionHandler != null && (bl2 = crashlyticsUncaughtExceptionHandler.isHandlingException())) {
            bl2 = true;
        } else {
            bl2 = false;
            crashlyticsUncaughtExceptionHandler = null;
        }
        return bl2;
    }

    public List listAppExceptionMarkerFiles() {
        FileStore fileStore = this.fileStore;
        FilenameFilter filenameFilter = APP_EXCEPTION_MARKER_FILTER;
        return fileStore.getCommonFiles(filenameFilter);
    }

    public void logFatalException(Thread thread2, Throwable throwable) {
        SettingsProvider settingsProvider = this.settingsProvider;
        if (settingsProvider == null) {
            Logger.getLogger().w("settingsProvider not set");
            return;
        }
        this.handleUncaughtException(settingsProvider, thread2, throwable, true);
    }

    public void openSession(String string2) {
        CrashlyticsWorker crashlyticsWorker = this.crashlyticsWorkers.common;
        c c2 = new c(this, string2);
        crashlyticsWorker.submit(c2);
    }

    public void saveVersionControlInfo() {
        block4: {
            Object object = this.getVersionControlInfo();
            if (object == null) break block4;
            Object object2 = VERSION_CONTROL_INFO_KEY;
            this.setInternalKey((String)object2, (String)object);
            object = Logger.getLogger();
            object2 = "Saved version control info";
            try {
                ((Logger)object).i((String)object2);
            }
            catch (IOException iOException) {
                object2 = Logger.getLogger();
                String string2 = "Unable to save version control info";
                ((Logger)object2).w(string2, iOException);
            }
        }
    }

    public Task sendUnsentReports() {
        TaskCompletionSource taskCompletionSource = this.reportActionProvided;
        Boolean bl2 = Boolean.TRUE;
        taskCompletionSource.trySetResult(bl2);
        return this.unsentReportsHandled.getTask();
    }

    public void setCustomKey(String string2, String string3) {
        UserMetadata userMetadata = this.userMetadata;
        try {
            userMetadata.setCustomKey(string2, string3);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            boolean bl2;
            string3 = this.context;
            if (string3 != null && (bl2 = CommonUtils.isAppDebuggable((Context)string3))) {
                throw illegalArgumentException;
            }
            Logger logger = Logger.getLogger();
            string3 = "Attempting to set custom attribute with null key, ignoring.";
            logger.e(string3);
        }
    }

    public void setCustomKeys(Map map2) {
        this.userMetadata.setCustomKeys(map2);
    }

    public void setInternalKey(String string2, String string3) {
        UserMetadata userMetadata = this.userMetadata;
        try {
            userMetadata.setInternalKey(string2, string3);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            boolean bl2;
            string3 = this.context;
            if (string3 != null && (bl2 = CommonUtils.isAppDebuggable((Context)string3))) {
                throw illegalArgumentException;
            }
            Logger logger = Logger.getLogger();
            string3 = "Attempting to set custom attribute with null key, ignoring.";
            logger.e(string3);
        }
    }

    public void setUserId(String string2) {
        this.userMetadata.setUserId(string2);
    }

    public void submitAllReports(Task object) {
        Object object2 = this.reportingCoordinator;
        boolean bl2 = ((SessionReportingCoordinator)object2).hasReportsToSend();
        if (!bl2) {
            Logger.getLogger().v("No crash reports are available to be sent.");
            object = this.unsentReportsAvailable;
            object2 = Boolean.FALSE;
            ((TaskCompletionSource)object).trySetResult(object2);
            return;
        }
        Logger.getLogger().v("Crash reports are available to be sent.");
        object2 = this.waitForReportAction();
        CrashlyticsWorker crashlyticsWorker = this.crashlyticsWorkers.common;
        CrashlyticsController$4 crashlyticsController$4 = new CrashlyticsController$4(this, (Task)object);
        ((Task)object2).onSuccessTask(crashlyticsWorker, crashlyticsController$4);
    }

    public void writeNonFatalException(Thread thread2, Throwable throwable, Map object) {
        long l2 = System.currentTimeMillis();
        boolean bl2 = this.isHandlingException();
        if (!bl2) {
            l2 = CrashlyticsController.getTimestampSeconds(l2);
            String string2 = this.getCurrentSessionId();
            if (string2 == null) {
                Logger.getLogger().w("Tried to write a non-fatal exception while no session was open.");
                return;
            }
            EventMetadata eventMetadata = new EventMetadata(string2, l2, (Map)object);
            object = this.reportingCoordinator;
            ((SessionReportingCoordinator)object).persistNonFatalEvent(throwable, thread2, eventMetadata);
        }
    }

    public void writeToLog(long l2, String string2) {
        boolean bl2 = this.isHandlingException();
        if (!bl2) {
            LogFileManager logFileManager = this.logFileManager;
            logFileManager.writeToLog(l2, string2);
        }
    }
}

