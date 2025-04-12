/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.JdkFutureAdapters$ListenableFutureAdapter;

public final class o
implements Runnable {
    public final /* synthetic */ JdkFutureAdapters$ListenableFutureAdapter a;

    public /* synthetic */ o(JdkFutureAdapters$ListenableFutureAdapter jdkFutureAdapters$ListenableFutureAdapter) {
        this.a = jdkFutureAdapters$ListenableFutureAdapter;
    }

    public final void run() {
        JdkFutureAdapters$ListenableFutureAdapter.a(this.a);
    }
}

