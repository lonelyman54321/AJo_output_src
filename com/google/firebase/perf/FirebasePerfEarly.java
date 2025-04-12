/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.firebase.perf;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.StartupTime;
import com.google.firebase.perf.FirebasePerformanceInitializer;
import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.metrics.AppStartTrace$StartFromBackgroundRunnable;
import com.google.firebase.perf.session.SessionManager;
import java.util.concurrent.Executor;

public class FirebasePerfEarly {
    public FirebasePerfEarly(FirebaseApp object, StartupTime object2, Executor executor) {
        object = ((FirebaseApp)object).getApplicationContext();
        ConfigResolver.getInstance().setApplicationContext((Context)object);
        AppStateMonitor appStateMonitor = AppStateMonitor.getInstance();
        appStateMonitor.registerActivityLifecycleCallbacks((Context)object);
        FirebasePerformanceInitializer firebasePerformanceInitializer = new FirebasePerformanceInitializer();
        appStateMonitor.registerForAppColdStart(firebasePerformanceInitializer);
        if (object2 != null) {
            object2 = AppStartTrace.getInstance();
            ((AppStartTrace)object2).registerActivityLifecycleCallbacks((Context)object);
            object = new AppStartTrace$StartFromBackgroundRunnable((AppStartTrace)object2);
            executor.execute((Runnable)object);
        }
        SessionManager.getInstance().initializeGaugeCollection();
    }
}

