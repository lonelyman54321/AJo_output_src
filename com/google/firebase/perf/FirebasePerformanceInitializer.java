/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf;

import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.application.AppStateMonitor$AppColdStartCallback;
import com.google.firebase.perf.logging.AndroidLogger;

public final class FirebasePerformanceInitializer
implements AppStateMonitor$AppColdStartCallback {
    private static final AndroidLogger logger = AndroidLogger.getInstance();

    public void onAppColdStart() {
        try {
            FirebasePerformance.getInstance();
        }
        catch (IllegalStateException illegalStateException) {
            AndroidLogger androidLogger = logger;
            String string2 = "FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s";
            int n3 = 1;
            Object[] objectArray = new Object[n3];
            objectArray[0] = illegalStateException;
            androidLogger.warn(string2, objectArray);
        }
    }
}

