/*
 * Decompiled with CFR 0.152.
 */
package androidx.concurrent.futures;

import java.util.concurrent.Executor;

public final class AbstractResolvableFuture$d {
    public static final AbstractResolvableFuture$d d;
    public final Runnable a;
    public final Executor b;
    public AbstractResolvableFuture$d c;

    static {
        AbstractResolvableFuture$d abstractResolvableFuture$d;
        d = abstractResolvableFuture$d = new AbstractResolvableFuture$d(null, null);
    }

    public AbstractResolvableFuture$d(Runnable runnable2, Executor executor) {
        this.a = runnable2;
        this.b = executor;
    }
}

