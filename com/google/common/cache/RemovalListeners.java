/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.base.Preconditions;
import com.google.common.cache.RemovalListener;
import com.google.common.cache.RemovalNotification;
import java.util.concurrent.Executor;

public final class RemovalListeners {
    private RemovalListeners() {
    }

    public static /* synthetic */ void a(RemovalListener removalListener, RemovalNotification removalNotification) {
        removalListener.onRemoval(removalNotification);
    }

    public static RemovalListener asynchronous(RemovalListener removalListener, Executor executor) {
        Preconditions.checkNotNull(removalListener);
        Preconditions.checkNotNull(executor);
        ni2_0 ni2_02 = new ni2_0(removalListener, executor);
        return ni2_02;
    }

    public static /* synthetic */ void b(Executor executor, RemovalListener removalListener, RemovalNotification removalNotification) {
        RemovalListeners.lambda$asynchronous$1(executor, removalListener, removalNotification);
    }

    private static /* synthetic */ void lambda$asynchronous$1(Executor executor, RemovalListener removalListener, RemovalNotification removalNotification) {
        mi2_0 mi2_02 = new mi2_0(removalListener, removalNotification);
        executor.execute(mi2_02);
    }
}

