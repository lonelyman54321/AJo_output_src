/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.metrics;

import com.google.firebase.perf.metrics.AppStartTrace;

public class AppStartTrace$StartFromBackgroundRunnable
implements Runnable {
    private final AppStartTrace trace;

    public AppStartTrace$StartFromBackgroundRunnable(AppStartTrace appStartTrace) {
        this.trace = appStartTrace;
    }

    public void run() {
        Object object = AppStartTrace.access$100(this.trace);
        if (object == null) {
            object = this.trace;
            boolean bl2 = true;
            AppStartTrace.access$202((AppStartTrace)object, bl2);
        }
    }
}

