/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class p
implements Runnable {
    private final TaskCompletionSource a;

    public p() {
        this.a = null;
    }

    public p(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    public abstract void a();

    public final TaskCompletionSource b() {
        return this.a;
    }

    public final void c(Exception exception) {
        TaskCompletionSource taskCompletionSource = this.a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exception);
        }
    }

    public final void run() {
        try {
            this.a();
            return;
        }
        catch (Exception exception) {
            this.c(exception);
            return;
        }
    }
}

