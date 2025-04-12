/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.logging;

class LogWrapper {
    private static final String LOG_TAG = "FirebasePerformance";
    private static LogWrapper instance;

    private LogWrapper() {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static LogWrapper getInstance() {
        Class<LogWrapper> clazz = LogWrapper.class;
        synchronized (clazz) {
            try {
                LogWrapper logWrapper = instance;
                if (logWrapper != null) return instance;
                instance = logWrapper = new LogWrapper();
                return instance;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public void d(String string2) {
    }

    public void e(String string2) {
    }

    public void i(String string2) {
    }

    public void v(String string2) {
    }

    public void w(String string2) {
    }
}

