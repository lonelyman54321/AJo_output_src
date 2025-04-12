/*
 * Decompiled with CFR 0.152.
 */
package com.clevertap.android.sdk.task;

import com.clevertap.android.sdk.task.PostAsyncSafelyExecutor;
import java.util.concurrent.Callable;

public final class PostAsyncSafelyExecutor$a
implements Callable {
    public final /* synthetic */ Callable a;
    public final /* synthetic */ PostAsyncSafelyExecutor b;

    public PostAsyncSafelyExecutor$a(PostAsyncSafelyExecutor postAsyncSafelyExecutor, Callable callable) {
        this.b = postAsyncSafelyExecutor;
        this.a = callable;
    }

    public final Object call() {
        long l2;
        this.b.a = l2 = Thread.currentThread().getId();
        return this.a.call();
    }
}

