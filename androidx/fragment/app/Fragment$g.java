/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.Fragment$i;
import java.util.concurrent.atomic.AtomicReference;

public final class Fragment$g
extends Fragment$i {
    public final /* synthetic */ NX0 a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ x3 c;
    public final /* synthetic */ w3 d;
    public final /* synthetic */ Fragment e;

    public Fragment$g(Fragment fragment, NX0 nX0, AtomicReference atomicReference, x3 x32, w3 w34) {
        this.e = fragment;
        this.a = nX0;
        this.b = atomicReference;
        this.c = x32;
        this.d = w34;
    }

    public final void a() {
        Object object = this.e;
        String string2 = ((Fragment)object).generateActivityResultKey();
        K3 k3 = (K3)this.a.apply(null);
        x3 x32 = this.c;
        w3 w34 = this.d;
        object = k3.c(string2, (mu1_1)object, x32, w34);
        this.b.set(object);
    }
}

