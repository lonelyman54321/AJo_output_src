/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.logging.Logging;

class SafeLoggingExecutor$SafeLoggingRunnable
implements Runnable {
    private final Runnable delegate;

    public SafeLoggingExecutor$SafeLoggingRunnable(Runnable runnable2) {
        this.delegate = runnable2;
    }

    public void run() {
        Runnable runnable2 = this.delegate;
        try {
            runnable2.run();
        }
        catch (Exception exception) {
            String string2 = "Executor";
            String string3 = "Background execution failure.";
            Logging.e(string2, string3, exception);
        }
    }
}

