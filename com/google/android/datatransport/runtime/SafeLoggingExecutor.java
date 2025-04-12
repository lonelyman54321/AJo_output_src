/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.SafeLoggingExecutor$SafeLoggingRunnable;
import java.util.concurrent.Executor;

class SafeLoggingExecutor
implements Executor {
    private final Executor delegate;

    public SafeLoggingExecutor(Executor executor) {
        this.delegate = executor;
    }

    public void execute(Runnable runnable2) {
        Executor executor = this.delegate;
        SafeLoggingExecutor$SafeLoggingRunnable safeLoggingExecutor$SafeLoggingRunnable = new SafeLoggingExecutor$SafeLoggingRunnable(runnable2);
        executor.execute(safeLoggingExecutor$SafeLoggingRunnable);
    }
}

