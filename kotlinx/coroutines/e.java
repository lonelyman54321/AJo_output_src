/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class e
extends ut2_2 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater e;
    private volatile /* synthetic */ int _decision$volatile;

    static {
        e = AtomicIntegerFieldUpdater.newUpdater(e.class, "_decision$volatile");
    }

    public e() {
        throw null;
    }

    public final void s(Object object) {
        this.t(object);
    }

    public final void t(Object object) {
        int n3;
        Object object2;
        int n4;
        do {
            if ((n3 = ((AtomicIntegerFieldUpdater)(object2 = e)).get(this)) == 0) continue;
            n4 = 1;
            if (n3 == n4) {
                object2 = zj1_2.b(this.d);
                object = n00_0.a(object);
                dr0_2.a((f80_0)object2, object);
                return;
            }
            object2 = "Already resumed".toString();
            object = new IllegalStateException((String)object2);
            throw object;
        } while ((n4 = (int)(((AtomicIntegerFieldUpdater)object2).compareAndSet(this, 0, n3 = 2) ? 1 : 0)) == 0);
    }
}

