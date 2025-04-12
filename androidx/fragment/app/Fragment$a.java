/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import java.util.concurrent.atomic.AtomicReference;

public final class Fragment$a
extends I3 {
    public final /* synthetic */ AtomicReference a;

    public Fragment$a(AtomicReference atomicReference, x3 x32) {
        this.a = atomicReference;
    }

    public final void a(Object object) {
        I3 i3 = (I3)this.a.get();
        if (i3 != null) {
            i3.a(object);
            return;
        }
        object = new IllegalStateException("Operation cannot be started before fragment is in created state");
        throw object;
    }

    public final void b() {
        I3 i3 = this.a.getAndSet(null);
        if (i3 != null) {
            i3.b();
        }
    }
}

