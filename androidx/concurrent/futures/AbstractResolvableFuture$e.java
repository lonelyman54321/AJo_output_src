/*
 * Decompiled with CFR 0.152.
 */
package androidx.concurrent.futures;

import androidx.concurrent.futures.AbstractResolvableFuture;
import androidx.concurrent.futures.AbstractResolvableFuture$a;
import androidx.concurrent.futures.AbstractResolvableFuture$d;
import androidx.concurrent.futures.AbstractResolvableFuture$g;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class AbstractResolvableFuture$e
extends AbstractResolvableFuture$a {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public AbstractResolvableFuture$e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    public final boolean a(AbstractResolvableFuture abstractResolvableFuture, AbstractResolvableFuture$d abstractResolvableFuture$d, AbstractResolvableFuture$d abstractResolvableFuture$d2) {
        boolean bl2;
        block1: {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                boolean bl3;
                if (!(bl3 = (atomicReferenceFieldUpdater = this.d).compareAndSet(abstractResolvableFuture, abstractResolvableFuture$d, abstractResolvableFuture$d2))) continue;
                bl2 = true;
                break block1;
            } while ((atomicReferenceFieldUpdater = atomicReferenceFieldUpdater.get(abstractResolvableFuture)) == abstractResolvableFuture$d);
            bl2 = false;
            abstractResolvableFuture = null;
        }
        return bl2;
    }

    public final boolean b(AbstractResolvableFuture abstractResolvableFuture, Object object, Object object2) {
        boolean bl2;
        block1: {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                boolean bl3;
                if (!(bl3 = (atomicReferenceFieldUpdater = this.e).compareAndSet(abstractResolvableFuture, object, object2))) continue;
                bl2 = true;
                break block1;
            } while ((atomicReferenceFieldUpdater = atomicReferenceFieldUpdater.get(abstractResolvableFuture)) == object);
            bl2 = false;
            abstractResolvableFuture = null;
        }
        return bl2;
    }

    public final boolean c(AbstractResolvableFuture abstractResolvableFuture, AbstractResolvableFuture$g abstractResolvableFuture$g, AbstractResolvableFuture$g abstractResolvableFuture$g2) {
        boolean bl2;
        block1: {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                boolean bl3;
                if (!(bl3 = (atomicReferenceFieldUpdater = this.c).compareAndSet(abstractResolvableFuture, abstractResolvableFuture$g, abstractResolvableFuture$g2))) continue;
                bl2 = true;
                break block1;
            } while ((atomicReferenceFieldUpdater = atomicReferenceFieldUpdater.get(abstractResolvableFuture)) == abstractResolvableFuture$g);
            bl2 = false;
            abstractResolvableFuture = null;
        }
        return bl2;
    }

    public final void d(AbstractResolvableFuture$g abstractResolvableFuture$g, AbstractResolvableFuture$g abstractResolvableFuture$g2) {
        this.b.lazySet(abstractResolvableFuture$g, abstractResolvableFuture$g2);
    }

    public final void e(AbstractResolvableFuture$g abstractResolvableFuture$g, Thread thread2) {
        this.a.lazySet(abstractResolvableFuture$g, thread2);
    }
}

