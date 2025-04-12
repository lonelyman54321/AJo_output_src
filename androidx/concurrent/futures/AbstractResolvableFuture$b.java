/*
 * Decompiled with CFR 0.152.
 */
package androidx.concurrent.futures;

import androidx.concurrent.futures.AbstractResolvableFuture;
import java.util.concurrent.CancellationException;

public final class AbstractResolvableFuture$b {
    public static final AbstractResolvableFuture$b c;
    public static final AbstractResolvableFuture$b d;
    public final boolean a;
    public final Throwable b;

    static {
        boolean bl2 = AbstractResolvableFuture.GENERATE_CANCELLATION_CAUSES;
        if (bl2) {
            d = null;
            c = null;
        } else {
            AbstractResolvableFuture$b abstractResolvableFuture$b;
            d = abstractResolvableFuture$b = new AbstractResolvableFuture$b(false, null);
            boolean bl3 = true;
            c = abstractResolvableFuture$b = new AbstractResolvableFuture$b(bl3, null);
        }
    }

    public AbstractResolvableFuture$b(boolean bl2, CancellationException cancellationException) {
        this.a = bl2;
        this.b = cancellationException;
    }
}

