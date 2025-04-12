/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager$NameNotFoundException
 */
package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.AnalyticsDeferredProxy;
import com.google.firebase.crashlytics.CustomKeysAndValues;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.common.AppData;
import com.google.firebase.crashlytics.internal.common.BuildIdInfo;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.google.firebase.inject.Deferred;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public class FirebaseCrashlytics {
    static final int APP_EXCEPTION_CALLBACK_TIMEOUT_MS = 500;
    static final String FIREBASE_CRASHLYTICS_ANALYTICS_ORIGIN = "clx";
    static final String LEGACY_CRASH_ANALYTICS_ORIGIN = "crash";
    final CrashlyticsCore core;

    private FirebaseCrashlytics(CrashlyticsCore crashlyticsCore) {
        this.core = crashlyticsCore;
    }

    public static /* synthetic */ void a(Exception exception) {
        FirebaseCrashlytics.lambda$init$0(exception);
    }

    public static FirebaseCrashlytics getInstance() {
        Object object = FirebaseApp.getInstance();
        Class<FirebaseCrashlytics> clazz = FirebaseCrashlytics.class;
        if ((object = (FirebaseCrashlytics)((FirebaseApp)object).get(clazz)) != null) {
            return object;
        }
        object = new NullPointerException("FirebaseCrashlytics component is not present.");
        throw object;
    }

    public static FirebaseCrashlytics init(FirebaseApp firebaseApp, FirebaseInstallationsApi object, Deferred object2, Deferred object3, Deferred object4, ExecutorService object5, ExecutorService executorService, ExecutorService executorService2) {
        boolean bl2;
        Object object6;
        Object object7 = firebaseApp.getApplicationContext();
        Object object8 = object7.getPackageName();
        Object object9 = Logger.getLogger();
        Object object10 = new StringBuilder("Initializing Firebase Crashlytics ");
        Object object11 = CrashlyticsCore.getVersion();
        ((StringBuilder)object10).append((String)object11);
        ((StringBuilder)object10).append(" for ");
        ((StringBuilder)object10).append((String)object8);
        object10 = ((StringBuilder)object10).toString();
        ((Logger)object9).i((String)object10);
        object9 = object5;
        object10 = executorService;
        CrashlyticsWorkers crashlyticsWorkers = new CrashlyticsWorkers((ExecutorService)object5, executorService);
        object10 = new FileStore((Context)object7);
        object9 = new DataCollectionArbiter(firebaseApp);
        object11 = object;
        Object object12 = new IdManager((Context)object7, (String)object8, (FirebaseInstallationsApi)object, (DataCollectionArbiter)object9);
        object8 = object2;
        Object object13 = new CrashlyticsNativeComponentDeferredProxy((Deferred)object2);
        object11 = object3;
        object8 = new AnalyticsDeferredProxy((Deferred)object3);
        Object object14 = new CrashlyticsAppQualitySessionsSubscriber((DataCollectionArbiter)object9, (FileStore)object10);
        FirebaseSessionsDependencies.register((SessionSubscriber)object14);
        object11 = object4;
        Object object15 = new RemoteConfigDeferredProxy((Deferred)object4);
        Object object16 = ((AnalyticsDeferredProxy)object8).getDeferredBreadcrumbSource();
        object8 = ((AnalyticsDeferredProxy)object8).getAnalyticsEventLogger();
        object11 = object6;
        Object object17 = firebaseApp;
        Object object18 = object12;
        Object object19 = object9;
        CrashlyticsCore crashlyticsCore = object6;
        object6 = object8;
        object8 = object15;
        object15 = object10;
        IdManager idManager = object12;
        object12 = object8;
        ((CrashlyticsCore)object11)(firebaseApp, (IdManager)object18, (CrashlyticsNativeComponent)object13, (DataCollectionArbiter)object9, (BreadcrumbSource)object16, (AnalyticsEventLogger)object6, (FileStore)object10, (CrashlyticsAppQualitySessionsSubscriber)object14, (RemoteConfigDeferredProxy)object8, crashlyticsWorkers);
        object8 = firebaseApp.getOptions().getApplicationId();
        object11 = CommonUtils.getMappingFileId((Context)object7);
        object17 = CommonUtils.getBuildIdInfo((Context)object7);
        object18 = Logger.getLogger();
        object19 = "Mapping file ID is: ";
        object13 = new StringBuilder((String)object19);
        ((StringBuilder)object13).append((String)object11);
        object13 = ((StringBuilder)object13).toString();
        ((Logger)object18).d((String)object13);
        object18 = object17.iterator();
        while (bl2 = object18.hasNext()) {
            object13 = (BuildIdInfo)object18.next();
            object19 = Logger.getLogger();
            object16 = ((BuildIdInfo)object13).getLibraryName();
            object6 = ((BuildIdInfo)object13).getArch();
            object13 = ((BuildIdInfo)object13).getBuildId();
            object15 = "Build id for ";
            object14 = " on ";
            object12 = ": ";
            object16 = og_1.a((String)object15, (String)object16, (String)object14, (String)object6, (String)object12);
            ((StringBuilder)object16).append((String)object13);
            object13 = ((StringBuilder)object16).toString();
            ((Logger)object19).d((String)object13);
        }
        object18 = new DevelopmentPlatformProvider((Context)object7);
        firebaseApp = object7;
        object = idManager;
        object2 = object8;
        object3 = object11;
        object4 = object17;
        object5 = object18;
        try {
            object16 = AppData.create((Context)object7, idManager, (String)object8, (String)object11, (List)object17, (DevelopmentPlatformProvider)object18);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            Logger.getLogger().e("Error retrieving app package info.", nameNotFoundException);
            return null;
        }
        object11 = Logger.getLogger();
        object17 = new StringBuilder("Installer package name is: ");
        object18 = ((AppData)object16).installerPackageName;
        ((StringBuilder)object17).append((String)object18);
        object17 = ((StringBuilder)object17).toString();
        ((Logger)object11).v((String)object17);
        object11 = new HttpRequestFactory();
        object17 = ((AppData)object16).versionCode;
        object18 = ((AppData)object16).versionName;
        object19 = object9;
        object9 = object8;
        object8 = object10;
        object10 = idManager;
        object13 = object8;
        object8 = SettingsController.create((Context)object7, (String)object2, idManager, (HttpRequestFactory)object11, (String)object17, (String)object18, (FileStore)object8, (DataCollectionArbiter)object19);
        object7 = ((SettingsController)object8).loadSettingsData(crashlyticsWorkers);
        object9 = new Object();
        object10 = executorService2;
        ((Task)object7).addOnFailureListener(executorService2, (OnFailureListener)object9);
        object7 = crashlyticsCore;
        boolean bl3 = crashlyticsCore.onPreExecute((AppData)object16, (SettingsProvider)object8);
        if (bl3) {
            crashlyticsCore.doBackgroundInitializationAsync((SettingsProvider)object8);
        }
        object8 = new FirebaseCrashlytics((CrashlyticsCore)object7);
        return object8;
    }

    private static /* synthetic */ void lambda$init$0(Exception exception) {
        Logger.getLogger().e("Error fetching settings.", exception);
    }

    public Task checkForUnsentReports() {
        return this.core.checkForUnsentReports();
    }

    public void deleteUnsentReports() {
        this.core.deleteUnsentReports();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.core.didCrashOnPreviousExecution();
    }

    public boolean isCrashlyticsCollectionEnabled() {
        return this.core.isCrashlyticsCollectionEnabled();
    }

    public void log(String string2) {
        this.core.log(string2);
    }

    public void recordException(Throwable throwable) {
        if (throwable == null) {
            Logger.getLogger().w("A null value was passed to recordException. Ignoring.");
            return;
        }
        CrashlyticsCore crashlyticsCore = this.core;
        Map map2 = Collections.emptyMap();
        crashlyticsCore.logException(throwable, map2);
    }

    public void recordException(Throwable throwable, CustomKeysAndValues object) {
        if (throwable == null) {
            Logger.getLogger().w("A null value was passed to recordException. Ignoring.");
            return;
        }
        CrashlyticsCore crashlyticsCore = this.core;
        object = ((CustomKeysAndValues)object).keysAndValues;
        crashlyticsCore.logException(throwable, (Map)object);
    }

    public void sendUnsentReports() {
        this.core.sendUnsentReports();
    }

    public void setCrashlyticsCollectionEnabled(Boolean bl2) {
        this.core.setCrashlyticsCollectionEnabled(bl2);
    }

    public void setCrashlyticsCollectionEnabled(boolean bl2) {
        CrashlyticsCore crashlyticsCore = this.core;
        Boolean bl3 = bl2;
        crashlyticsCore.setCrashlyticsCollectionEnabled(bl3);
    }

    public void setCustomKey(String string2, double d2) {
        CrashlyticsCore crashlyticsCore = this.core;
        String string3 = Double.toString(d2);
        crashlyticsCore.setCustomKey(string2, string3);
    }

    public void setCustomKey(String string2, float f5) {
        CrashlyticsCore crashlyticsCore = this.core;
        String string3 = Float.toString(f5);
        crashlyticsCore.setCustomKey(string2, string3);
    }

    public void setCustomKey(String string2, int n3) {
        CrashlyticsCore crashlyticsCore = this.core;
        String string3 = Integer.toString(n3);
        crashlyticsCore.setCustomKey(string2, string3);
    }

    public void setCustomKey(String string2, long l2) {
        CrashlyticsCore crashlyticsCore = this.core;
        String string3 = Long.toString(l2);
        crashlyticsCore.setCustomKey(string2, string3);
    }

    public void setCustomKey(String string2, String string3) {
        this.core.setCustomKey(string2, string3);
    }

    public void setCustomKey(String string2, boolean bl2) {
        CrashlyticsCore crashlyticsCore = this.core;
        String string3 = Boolean.toString(bl2);
        crashlyticsCore.setCustomKey(string2, string3);
    }

    public void setCustomKeys(CustomKeysAndValues object) {
        CrashlyticsCore crashlyticsCore = this.core;
        object = ((CustomKeysAndValues)object).keysAndValues;
        crashlyticsCore.setCustomKeys((Map)object);
    }

    public void setUserId(String string2) {
        this.core.setUserId(string2);
    }
}

