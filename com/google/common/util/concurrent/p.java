/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.ListeningExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public final class p {
    public static /* bridge */ /* synthetic */ Future a(ListeningExecutorService listeningExecutorService, Runnable runnable2) {
        return listeningExecutorService.submit(runnable2);
    }

    public static /* bridge */ /* synthetic */ Future b(ListeningExecutorService listeningExecutorService, Runnable runnable2, Object object) {
        return listeningExecutorService.submit(runnable2, object);
    }

    public static /* bridge */ /* synthetic */ Future c(ListeningExecutorService listeningExecutorService, Callable callable) {
        return listeningExecutorService.submit(callable);
    }
}

