/*
 * Decompiled with CFR 0.152.
 */
package androidx.concurrent.futures;

import androidx.concurrent.futures.AbstractResolvableFuture;
import androidx.concurrent.futures.AbstractResolvableFuture$c$a;

public final class AbstractResolvableFuture$c {
    public static final AbstractResolvableFuture$c b;
    public final Throwable a;

    static {
        AbstractResolvableFuture$c abstractResolvableFuture$c;
        AbstractResolvableFuture$c$a abstractResolvableFuture$c$a = new Throwable("Failure occurred while trying to finish a future.");
        b = abstractResolvableFuture$c = new AbstractResolvableFuture$c(abstractResolvableFuture$c$a);
    }

    public AbstractResolvableFuture$c(Throwable throwable) {
        this.a = throwable = (Throwable)AbstractResolvableFuture.checkNotNull(throwable);
    }
}

