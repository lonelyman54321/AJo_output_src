/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.common.AppData;
import com.google.firebase.crashlytics.internal.common.CLSUUID;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber;
import com.google.firebase.crashlytics.internal.common.CrashlyticsController;
import com.google.firebase.crashlytics.internal.common.CrashlyticsFileMarker;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.Settings;
import com.google.firebase.crashlytics.internal.settings.Settings$FeatureFlagData;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.google.firebase.crashlytics.internal.stacktrace.MiddleOutFallbackStrategy;
import com.google.firebase.crashlytics.internal.stacktrace.RemoveRepeatsStrategy;
import com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CrashlyticsCore {
    static final String CRASHLYTICS_REQUIRE_BUILD_ID = "com.crashlytics.RequireBuildId";
    static final boolean CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT = true;
    static final String CRASH_MARKER_FILE_NAME = "crash_marker";
    static final int DEFAULT_MAIN_HANDLER_TIMEOUT_SEC = 3;
    private static final String INITIALIZATION_MARKER_FILE_NAME = "initialization_marker";
    static final int MAX_STACK_SIZE = 1024;
    private static final String MISSING_BUILD_ID_MSG = "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin";
    static final int NUM_STACK_REPETITIONS_ALLOWED = 10;
    private static final String ON_DEMAND_DROPPED_KEY = "com.crashlytics.on-demand.dropped-exceptions";
    private static final String ON_DEMAND_RECORDED_KEY = "com.crashlytics.on-demand.recorded-exceptions";
    private final AnalyticsEventLogger analyticsEventLogger;
    private final FirebaseApp app;
    public final BreadcrumbSource breadcrumbSource;
    private final Context context;
    private CrashlyticsController controller;
    private CrashlyticsFileMarker crashMarker;
    private final CrashlyticsWorkers crashlyticsWorkers;
    private final DataCollectionArbiter dataCollectionArbiter;
    private boolean didCrashOnPreviousExecution;
    private final FileStore fileStore;
    private final IdManager idManager;
    private CrashlyticsFileMarker initializationMarker;
    private final CrashlyticsNativeComponent nativeComponent;
    private final OnDemandCounter onDemandCounter;
    private final RemoteConfigDeferredProxy remoteConfigDeferredProxy;
    private final CrashlyticsAppQualitySessionsSubscriber sessionsSubscriber;
    private final long startTime;

    public CrashlyticsCore(FirebaseApp object, IdManager idManager, CrashlyticsNativeComponent crashlyticsNativeComponent, DataCollectionArbiter dataCollectionArbiter, BreadcrumbSource breadcrumbSource, AnalyticsEventLogger analyticsEventLogger, FileStore fileStore, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber, RemoteConfigDeferredProxy remoteConfigDeferredProxy, CrashlyticsWorkers crashlyticsWorkers) {
        long l2;
        this.app = object;
        this.dataCollectionArbiter = dataCollectionArbiter;
        object = ((FirebaseApp)object).getApplicationContext();
        this.context = object;
        this.idManager = idManager;
        this.nativeComponent = crashlyticsNativeComponent;
        this.breadcrumbSource = breadcrumbSource;
        this.analyticsEventLogger = analyticsEventLogger;
        this.fileStore = fileStore;
        this.sessionsSubscriber = crashlyticsAppQualitySessionsSubscriber;
        this.remoteConfigDeferredProxy = remoteConfigDeferredProxy;
        this.crashlyticsWorkers = crashlyticsWorkers;
        this.startTime = l2 = System.currentTimeMillis();
        this.onDemandCounter = object = new OnDemandCounter();
    }

    public static /* synthetic */ void a(CrashlyticsCore crashlyticsCore, long l2, String string2) {
        crashlyticsCore.lambda$log$3(l2, string2);
    }

    public static /* synthetic */ Boolean b(CrashlyticsCore crashlyticsCore) {
        return crashlyticsCore.lambda$checkForPreviousCrash$10();
    }

    public static /* synthetic */ void c(CrashlyticsCore crashlyticsCore, Throwable throwable) {
        crashlyticsCore.lambda$logFatalException$8(throwable);
    }

    private void checkForPreviousCrash() {
        boolean bl2;
        Object object = this.crashlyticsWorkers.common.getExecutor();
        Object object2 = new Ad0(this, 0);
        object = object.submit(object2);
        try {
            object2 = TimeUnit.SECONDS;
        }
        catch (Exception exception) {
            this.didCrashOnPreviousExecution = false;
            return;
        }
        long l2 = 3;
        object = object.get(l2, (TimeUnit)((Object)object2));
        object = (Boolean)object;
        this.didCrashOnPreviousExecution = bl2 = Boolean.TRUE.equals(object);
    }

    public static /* synthetic */ void d(CrashlyticsCore crashlyticsCore, String string2) {
        crashlyticsCore.lambda$setUserId$4(string2);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void doBackgroundInitialization(SettingsProvider object) {
        Throwable throwable222;
        block8: {
            block7: {
                Object object2;
                Object object3;
                block6: {
                    object3 = "Collection of crash reports disabled in Crashlytics settings.";
                    CrashlyticsWorkers.checkBackgroundThread();
                    this.markInitializationStarted();
                    try {
                        object2 = this.breadcrumbSource;
                        vd0_0 vd0_02 = new vd0_0(this);
                        object2.registerBreadcrumbHandler(vd0_02);
                        object2 = this.controller;
                        ((CrashlyticsController)object2).saveVersionControlInfo();
                        object2 = object.getSettingsSync();
                        object2 = ((Settings)object2).featureFlagData;
                        boolean bl2 = ((Settings$FeatureFlagData)object2).collectReports;
                        if (!bl2) break block6;
                        object3 = this.controller;
                        boolean bl3 = ((CrashlyticsController)object3).finalizeSessions((SettingsProvider)object);
                        if (!bl3) {
                            object3 = Logger.getLogger();
                            object2 = "Previous sessions could not be finalized.";
                            ((Logger)object3).w((String)object2);
                        }
                        object3 = this.controller;
                        object = object.getSettingsAsync();
                        ((CrashlyticsController)object3).submitAllReports((Task)object);
                        break block7;
                    }
                    catch (Throwable throwable222) {
                        break block8;
                    }
                }
                object = Logger.getLogger();
                ((Logger)object).d((String)object3);
                object = new RuntimeException((String)object3);
                throw object;
                catch (Exception exception) {}
                object3 = Logger.getLogger();
                object2 = "Crashlytics encountered a problem during asynchronous initialization.";
                ((Logger)object3).e((String)object2, exception);
            }
            this.markInitializationComplete();
            return;
        }
        this.markInitializationComplete();
        throw throwable222;
    }

    public static /* synthetic */ void e(CrashlyticsCore crashlyticsCore, long l2, String string2) {
        crashlyticsCore.lambda$log$2(l2, string2);
    }

    public static /* synthetic */ void f(CrashlyticsCore crashlyticsCore, SettingsProvider settingsProvider) {
        crashlyticsCore.lambda$finishInitSynchronously$9(settingsProvider);
    }

    private void finishInitSynchronously(SettingsProvider object) {
        block5: {
            InterruptedException interruptedException2;
            Object object2;
            Object object3;
            block8: {
                ExecutionException executionException2;
                block7: {
                    object3 = this.crashlyticsWorkers.common.getExecutor();
                    object2 = new ud0(this, (SettingsProvider)object);
                    object = object3.submit((Runnable)object2);
                    object3 = Logger.getLogger();
                    object2 = "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.";
                    ((Logger)object3).d((String)object2);
                    object3 = TimeUnit.SECONDS;
                    long l2 = 3;
                    try {
                        object.get(l2, (TimeUnit)((Object)object3));
                        break block5;
                    }
                    catch (TimeoutException timeoutException) {
                    }
                    catch (ExecutionException executionException2) {
                        break block7;
                    }
                    catch (InterruptedException interruptedException2) {
                        break block8;
                    }
                    object3 = Logger.getLogger();
                    object2 = "Crashlytics timed out during initialization.";
                    ((Logger)object3).e((String)object2, timeoutException);
                    break block5;
                }
                object3 = Logger.getLogger();
                object2 = "Crashlytics encountered a problem during initialization.";
                ((Logger)object3).e((String)object2, executionException2);
                break block5;
            }
            object3 = Logger.getLogger();
            object2 = "Crashlytics was interrupted during initialization.";
            ((Logger)object3).e((String)object2, interruptedException2);
            Thread thread2 = Thread.currentThread();
            thread2.interrupt();
        }
    }

    public static /* synthetic */ void g(CrashlyticsCore crashlyticsCore, String string2, String string3) {
        crashlyticsCore.lambda$setCustomKey$5(string2, string3);
    }

    public static String getVersion() {
        return "19.4.0";
    }

    public static /* synthetic */ void h(CrashlyticsCore crashlyticsCore, Map map2) {
        crashlyticsCore.lambda$setCustomKeys$6(map2);
    }

    public static /* synthetic */ void i(CrashlyticsCore crashlyticsCore, Throwable throwable, Map map2) {
        crashlyticsCore.lambda$logException$1(throwable, map2);
    }

    public static boolean isBuildIdValid(String string2, boolean bl2) {
        boolean bl3 = true;
        if (!bl2) {
            Logger.getLogger().v("Configured not to require a build ID.");
            return bl3;
        }
        boolean bl4 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl4) {
            return bl3;
        }
        return false;
    }

    public static /* synthetic */ void j(CrashlyticsCore crashlyticsCore, SettingsProvider settingsProvider) {
        crashlyticsCore.lambda$doBackgroundInitializationAsync$0(settingsProvider);
    }

    public static /* synthetic */ void k(CrashlyticsCore crashlyticsCore, String string2, String string3) {
        crashlyticsCore.lambda$setInternalKey$7(string2, string3);
    }

    private /* synthetic */ Boolean lambda$checkForPreviousCrash$10() {
        return this.controller.didCrashOnPreviousExecution();
    }

    private /* synthetic */ void lambda$doBackgroundInitializationAsync$0(SettingsProvider settingsProvider) {
        this.doBackgroundInitialization(settingsProvider);
    }

    private /* synthetic */ void lambda$finishInitSynchronously$9(SettingsProvider settingsProvider) {
        this.doBackgroundInitialization(settingsProvider);
    }

    private /* synthetic */ void lambda$log$2(long l2, String string2) {
        this.controller.writeToLog(l2, string2);
    }

    private /* synthetic */ void lambda$log$3(long l2, String string2) {
        CrashlyticsWorker crashlyticsWorker = this.crashlyticsWorkers.diskWrite;
        zd0_0 zd0_02 = new zd0_0(this, l2, string2);
        crashlyticsWorker.submit(zd0_02);
    }

    private /* synthetic */ void lambda$logException$1(Throwable throwable, Map map2) {
        CrashlyticsController crashlyticsController = this.controller;
        Thread thread2 = Thread.currentThread();
        crashlyticsController.writeNonFatalException(thread2, throwable, map2);
    }

    private /* synthetic */ void lambda$logFatalException$8(Throwable throwable) {
        CrashlyticsController crashlyticsController = this.controller;
        Object object = Integer.toString(this.onDemandCounter.getRecordedOnDemandExceptions());
        crashlyticsController.setInternalKey(ON_DEMAND_RECORDED_KEY, (String)object);
        crashlyticsController = this.controller;
        object = Integer.toString(this.onDemandCounter.getDroppedOnDemandExceptions());
        crashlyticsController.setInternalKey(ON_DEMAND_DROPPED_KEY, (String)object);
        crashlyticsController = this.controller;
        object = Thread.currentThread();
        crashlyticsController.logFatalException((Thread)object, throwable);
    }

    private /* synthetic */ void lambda$setCustomKey$5(String string2, String string3) {
        this.controller.setCustomKey(string2, string3);
    }

    private /* synthetic */ void lambda$setCustomKeys$6(Map map2) {
        this.controller.setCustomKeys(map2);
    }

    private /* synthetic */ void lambda$setInternalKey$7(String string2, String string3) {
        this.controller.setInternalKey(string2, string3);
    }

    private /* synthetic */ void lambda$setUserId$4(String string2) {
        this.controller.setUserId(string2);
    }

    public Task checkForUnsentReports() {
        return this.controller.checkForUnsentReports();
    }

    public Task deleteUnsentReports() {
        return this.controller.deleteUnsentReports();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.didCrashOnPreviousExecution;
    }

    public boolean didPreviousInitializationFail() {
        return this.initializationMarker.isPresent();
    }

    public Task doBackgroundInitializationAsync(SettingsProvider settingsProvider) {
        CrashlyticsWorker crashlyticsWorker = this.crashlyticsWorkers.common;
        qw_0 qw_02 = new qw_0(1, this, settingsProvider);
        return crashlyticsWorker.submit(qw_02);
    }

    public CrashlyticsController getController() {
        return this.controller;
    }

    public boolean isCrashlyticsCollectionEnabled() {
        return this.dataCollectionArbiter.isAutomaticDataCollectionEnabled();
    }

    public void log(String string2) {
        long l2 = System.currentTimeMillis();
        long l3 = this.startTime;
        CrashlyticsWorker crashlyticsWorker = this.crashlyticsWorkers.common;
        Bd0 bd0 = new Bd0(this, l2 -= l3, string2);
        crashlyticsWorker.submit(bd0);
    }

    public void logException(Throwable throwable, Map map2) {
        CrashlyticsWorker crashlyticsWorker = this.crashlyticsWorkers.common;
        yd0_0 yd0_02 = new yd0_0(this, throwable, map2);
        crashlyticsWorker.submit(yd0_02);
    }

    public void logFatalException(Throwable throwable) {
        Object object = Logger.getLogger();
        Object object2 = new StringBuilder("Recorded on-demand fatal events: ");
        int n3 = this.onDemandCounter.getRecordedOnDemandExceptions();
        ((StringBuilder)object2).append(n3);
        object2 = ((StringBuilder)object2).toString();
        ((Logger)object).d((String)object2);
        object = Logger.getLogger();
        object2 = new StringBuilder("Dropped on-demand fatal events: ");
        n3 = this.onDemandCounter.getDroppedOnDemandExceptions();
        ((StringBuilder)object2).append(n3);
        object2 = ((StringBuilder)object2).toString();
        ((Logger)object).d((String)object2);
        object = this.crashlyticsWorkers.common;
        object2 = new wd0_0(0, this, throwable);
        ((CrashlyticsWorker)object).submit((Runnable)object2);
    }

    public void markInitializationComplete() {
        block5: {
            CrashlyticsWorkers.checkBackgroundThread();
            Object object = this.initializationMarker;
            boolean bl2 = ((CrashlyticsFileMarker)object).remove();
            if (bl2) break block5;
            object = Logger.getLogger();
            Object object2 = "Initialization marker file was not properly removed.";
            try {
                ((Logger)object).w((String)object2);
            }
            catch (Exception exception) {
                object2 = Logger.getLogger();
                String string2 = "Problem encountered deleting Crashlytics initialization marker.";
                ((Logger)object2).e(string2, exception);
            }
        }
    }

    public void markInitializationStarted() {
        CrashlyticsWorkers.checkBackgroundThread();
        this.initializationMarker.create();
        Logger.getLogger().v("Initialization marker file was created.");
    }

    public boolean onPreExecute(AppData appData, SettingsProvider settingsProvider) {
        Object object;
        block45: {
            Exception exception2;
            block46: {
                block44: {
                    Object object2;
                    CrashlyticsCore crashlyticsCore = this;
                    object = settingsProvider;
                    Object object3 = this.context;
                    int n3 = 1;
                    int n4 = CommonUtils.getBooleanResourceValue((Context)object3, CRASHLYTICS_REQUIRE_BUILD_ID, n3 != 0);
                    Object object4 = appData.buildId;
                    if ((n4 = CrashlyticsCore.isBuildIdValid((String)object4, n4 != 0)) == 0) break block45;
                    object3 = new CLSUUID();
                    Object object5 = ((CLSUUID)object3).getSessionId();
                    object4 = CRASH_MARKER_FILE_NAME;
                    try {
                        object2 = this.fileStore;
                    }
                    catch (Exception exception2) {}
                    object3 = new CrashlyticsFileMarker((String)object4, (FileStore)object2);
                    this.crashMarker = object3;
                    object4 = INITIALIZATION_MARKER_FILE_NAME;
                    object2 = this.fileStore;
                    object3 = new CrashlyticsFileMarker((String)object4, (FileStore)object2);
                    this.initializationMarker = object3;
                    object3 = this.fileStore;
                    object4 = this.crashlyticsWorkers;
                    Object object6 = new UserMetadata((String)object5, (FileStore)object3, (CrashlyticsWorkers)object4);
                    object3 = this.fileStore;
                    Object object7 = new LogFileManager((FileStore)object3);
                    int n7 = 10;
                    object3 = new RemoveRepeatsStrategy(n7);
                    object4 = new StackTraceTrimmingStrategy[n3];
                    object4[0] = object3;
                    n4 = 1024;
                    Object object8 = new MiddleOutFallbackStrategy(n4, (StackTraceTrimmingStrategy[])object4);
                    object3 = this.remoteConfigDeferredProxy;
                    ((RemoteConfigDeferredProxy)object3).setupListener((UserMetadata)object6);
                    object3 = this.context;
                    object4 = this.idManager;
                    object2 = this.fileStore;
                    Object object9 = this.onDemandCounter;
                    Object object10 = this.sessionsSubscriber;
                    Object object11 = this.crashlyticsWorkers;
                    Object object12 = appData;
                    CrashlyticsWorkers crashlyticsWorkers = object11;
                    object11 = object7;
                    Object object13 = object10;
                    object10 = object6;
                    Object object14 = object9;
                    object9 = settingsProvider;
                    LogFileManager logFileManager = object7;
                    object7 = object14;
                    UserMetadata userMetadata = object6;
                    object6 = object13;
                    String string2 = object5;
                    object5 = crashlyticsWorkers;
                    SessionReportingCoordinator sessionReportingCoordinator = SessionReportingCoordinator.create((Context)object3, (IdManager)object4, (FileStore)object2, appData, (LogFileManager)object11, (UserMetadata)object10, (StackTraceTrimmingStrategy)object8, settingsProvider, (OnDemandCounter)object14, (CrashlyticsAppQualitySessionsSubscriber)object13, crashlyticsWorkers);
                    object4 = this.context;
                    object2 = this.idManager;
                    object12 = this.dataCollectionArbiter;
                    object11 = this.fileStore;
                    object10 = this.crashMarker;
                    object8 = this.nativeComponent;
                    object9 = this.analyticsEventLogger;
                    object7 = this.sessionsSubscriber;
                    object6 = this.crashlyticsWorkers;
                    crashlyticsWorkers = object4;
                    object13 = object2;
                    object14 = object12;
                    object3 = new CrashlyticsController((Context)object4, (IdManager)object2, (DataCollectionArbiter)object12, (FileStore)object11, (CrashlyticsFileMarker)object10, appData, userMetadata, logFileManager, sessionReportingCoordinator, (CrashlyticsNativeComponent)object8, (AnalyticsEventLogger)object9, (CrashlyticsAppQualitySessionsSubscriber)object7, (CrashlyticsWorkers)object6);
                    this.controller = object3;
                    n4 = (int)(this.didPreviousInitializationFail() ? 1 : 0);
                    this.checkForPreviousCrash();
                    object4 = this.controller;
                    object2 = Thread.getDefaultUncaughtExceptionHandler();
                    ((CrashlyticsController)object4).enableExceptionHandling(string2, (Thread.UncaughtExceptionHandler)object2, settingsProvider);
                    if (n4 == 0) break block44;
                    object3 = this.context;
                    n4 = (int)(CommonUtils.canTryConnection((Context)object3) ? 1 : 0);
                    if (n4 == 0) break block44;
                    object3 = Logger.getLogger();
                    object4 = "Crashlytics did not finish previous background initialization. Initializing synchronously.";
                    ((Logger)object3).d((String)object4);
                    this.finishInitSynchronously(settingsProvider);
                    return false;
                    break block46;
                }
                Logger.getLogger().d("Successfully configured exception handler.");
                return true;
            }
            Logger.getLogger().e("Crashlytics was not started due to an exception during initialization", exception2);
            crashlyticsCore.controller = null;
            return false;
        }
        object = new IllegalStateException(MISSING_BUILD_ID_MSG);
        throw object;
    }

    public Task sendUnsentReports() {
        return this.controller.sendUnsentReports();
    }

    public void setCrashlyticsCollectionEnabled(Boolean bl2) {
        this.dataCollectionArbiter.setCrashlyticsDataCollectionEnabled(bl2);
    }

    public void setCustomKey(String string2, String string3) {
        CrashlyticsWorker crashlyticsWorker = this.crashlyticsWorkers.common;
        oh_1 oh_12 = new oh_1(this, 1, string2, string3);
        crashlyticsWorker.submit(oh_12);
    }

    public void setCustomKeys(Map map2) {
        boolean bl2 = map2.isEmpty();
        if (!bl2) {
            CrashlyticsWorker crashlyticsWorker = this.crashlyticsWorkers.common;
            int n3 = 1;
            th_2 th_22 = new th_2(n3, this, map2);
            crashlyticsWorker.submit(th_22);
        }
    }

    public void setInternalKey(String string2, String string3) {
        CrashlyticsWorker crashlyticsWorker = this.crashlyticsWorkers.common;
        xd0_0 xd0_02 = new xd0_0(this, string2, string3);
        crashlyticsWorker.submit(xd0_02);
    }

    public void setUserId(String string2) {
        CrashlyticsWorker crashlyticsWorker = this.crashlyticsWorkers.common;
        Fr fr = new Fr(1, this, string2);
        crashlyticsWorker.submit(fr);
    }
}

