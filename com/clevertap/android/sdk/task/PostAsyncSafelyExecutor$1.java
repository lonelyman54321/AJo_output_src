/*
 * Decompiled with CFR 0.152.
 */
package com.clevertap.android.sdk.task;

import com.clevertap.android.sdk.task.PostAsyncSafelyExecutor;

class PostAsyncSafelyExecutor$1
implements Runnable {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ PostAsyncSafelyExecutor b;

    public PostAsyncSafelyExecutor$1(PostAsyncSafelyExecutor postAsyncSafelyExecutor, Runnable runnable2) {
        this.b = postAsyncSafelyExecutor;
        this.a = runnable2;
    }

    public final void run() {
        long l2;
        this.b.a = l2 = Thread.currentThread().getId();
        this.a.run();
    }
}

