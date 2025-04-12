/*
 * Decompiled with CFR 0.152.
 */
package androidx.concurrent.futures;

import androidx.concurrent.futures.AbstractResolvableFuture;
import androidx.concurrent.futures.AbstractResolvableFuture$a;

public final class AbstractResolvableFuture$g {
    public static final AbstractResolvableFuture$g c;
    public volatile Thread a;
    public volatile AbstractResolvableFuture$g b;

    static {
        AbstractResolvableFuture$g abstractResolvableFuture$g;
        c = abstractResolvableFuture$g = new Object();
    }

    public AbstractResolvableFuture$g() {
        AbstractResolvableFuture$a abstractResolvableFuture$a = AbstractResolvableFuture.ATOMIC_HELPER;
        Thread thread2 = Thread.currentThread();
        abstractResolvableFuture$a.e(this, thread2);
    }
}

