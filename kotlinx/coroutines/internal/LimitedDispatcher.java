/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.c;
import kotlinx.coroutines.internal.LimitedDispatcher$Worker;

public final class LimitedDispatcher
extends c
implements ao0_1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater h;
    public final /* synthetic */ ao0_1 b;
    public final c c;
    public final int d;
    public final String e;
    public final aw1_2 f;
    public final Object g;
    private volatile /* synthetic */ int runningWorkers$volatile;

    static {
        h = AtomicIntegerFieldUpdater.newUpdater(LimitedDispatcher.class, "runningWorkers$volatile");
    }

    public LimitedDispatcher(c object, int n3, String string2) {
        Object object2;
        boolean bl2 = object instanceof ao0_1;
        if (bl2) {
            object2 = object;
            object2 = (ao0_1)object;
        } else {
            bl2 = false;
            object2 = null;
        }
        if (object2 == null) {
            object2 = hl0_2.a;
        }
        this.b = object2;
        this.c = object;
        this.d = n3;
        this.e = string2;
        this.f = object = new aw1_2();
        this.g = object = new Object();
    }

    public final fr0_1 H(long l2, Runnable runnable2, CoroutineContext coroutineContext) {
        return this.b.H(l2, runnable2, coroutineContext);
    }

    public final void J0(CoroutineContext object, Runnable runnable2) {
        this.f.a(runnable2);
        object = h;
        int n3 = ((AtomicIntegerFieldUpdater)object).get(this);
        int n4 = this.d;
        if (n3 < n4 && (n3 = (int)(this.O0() ? 1 : 0)) != 0 && (object = this.N0()) != null) {
            runnable2 = new LimitedDispatcher$Worker(this, (Runnable)object);
            object = this.c;
            dr0_2.b((c)object, this, runnable2);
        }
    }

    public final void K0(CoroutineContext object, Runnable runnable2) {
        this.f.a(runnable2);
        object = h;
        int n3 = ((AtomicIntegerFieldUpdater)object).get(this);
        int n4 = this.d;
        if (n3 < n4 && (n3 = (int)(this.O0() ? 1 : 0)) != 0 && (object = this.N0()) != null) {
            runnable2 = new LimitedDispatcher$Worker(this, (Runnable)object);
            object = this.c;
            ((c)object).K0(this, runnable2);
        }
    }

    public final c M0(int n3, String string2) {
        tu1_2.a(n3);
        int n4 = this.d;
        if (n3 >= n4) {
            c c2 = string2 != null ? new fs1_2(this, string2) : this;
            return c2;
        }
        return super.M0(n3, string2);
    }

    public final Runnable N0() {
        Object object;
        while ((object = (Runnable)this.f.d()) == null) {
            object = this.g;
            synchronized (object) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
                block7: {
                    atomicIntegerFieldUpdater = h;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    aw1_2 aw1_22 = this.f;
                    int n3 = aw1_22.c();
                    if (n3 != 0) break block7;
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
        return object;
    }

    public final boolean O0() {
        Object object = this.g;
        synchronized (object) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
            block6: {
                atomicIntegerFieldUpdater = h;
                int n3 = atomicIntegerFieldUpdater.get(this);
                int n4 = this.d;
                if (n3 < n4) break block6;
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    public final void l0(long l2, CancellableContinuationImpl cancellableContinuationImpl) {
        this.b.l0(l2, cancellableContinuationImpl);
    }

    public final String toString() {
        CharSequence charSequence = this.e;
        if (charSequence == null) {
            charSequence = new StringBuilder();
            Object object = this.c;
            ((StringBuilder)charSequence).append(object);
            object = ".limitedParallelism(";
            ((StringBuilder)charSequence).append((String)object);
            int n3 = this.d;
            char c2 = ')';
            charSequence = tu.a((StringBuilder)charSequence, n3, c2);
        }
        return charSequence;
    }
}

