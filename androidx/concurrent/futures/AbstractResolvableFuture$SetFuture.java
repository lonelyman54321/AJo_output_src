/*
 * Decompiled with CFR 0.152.
 */
package androidx.concurrent.futures;

import androidx.concurrent.futures.AbstractResolvableFuture;
import androidx.concurrent.futures.AbstractResolvableFuture$a;
import com.google.common.util.concurrent.ListenableFuture;

final class AbstractResolvableFuture$SetFuture
implements Runnable {
    public final AbstractResolvableFuture a;
    public final ListenableFuture b;

    public AbstractResolvableFuture$SetFuture(AbstractResolvableFuture abstractResolvableFuture, ListenableFuture listenableFuture) {
        this.a = abstractResolvableFuture;
        this.b = listenableFuture;
    }

    public final void run() {
        Object object = this.a.value;
        if (object != this) {
            return;
        }
        AbstractResolvableFuture$a abstractResolvableFuture$a = AbstractResolvableFuture.ATOMIC_HELPER;
        AbstractResolvableFuture abstractResolvableFuture = this.a;
        object = AbstractResolvableFuture.getFutureValue(this.b);
        boolean bl2 = abstractResolvableFuture$a.b(abstractResolvableFuture, this, object);
        if (bl2) {
            object = this.a;
            AbstractResolvableFuture.complete((AbstractResolvableFuture)object);
        }
    }
}

