/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.cache.LocalCache$LoadingValueReference;
import com.google.common.cache.LocalCache$Segment;
import com.google.common.util.concurrent.ListenableFuture;

public final class c
implements Runnable {
    public final /* synthetic */ LocalCache$Segment a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ LocalCache$LoadingValueReference d;
    public final /* synthetic */ ListenableFuture e;

    public /* synthetic */ c(LocalCache$Segment localCache$Segment, Object object, int n3, LocalCache$LoadingValueReference localCache$LoadingValueReference, ListenableFuture listenableFuture) {
        this.a = localCache$Segment;
        this.b = object;
        this.c = n3;
        this.d = localCache$LoadingValueReference;
        this.e = listenableFuture;
    }

    public final void run() {
        LocalCache$LoadingValueReference localCache$LoadingValueReference = this.d;
        ListenableFuture listenableFuture = this.e;
        LocalCache$Segment localCache$Segment = this.a;
        Object object = this.b;
        int n3 = this.c;
        LocalCache$Segment.a(localCache$Segment, object, n3, localCache$LoadingValueReference, listenableFuture);
    }
}

