/*
 * Decompiled with CFR 0.152.
 */
package androidx.transition;

import androidx.transition.Transition;
import androidx.transition.b;
import androidx.transition.f;
import java.util.ArrayList;

public final class c
extends f {
    public final /* synthetic */ Object a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ b g;

    public c(b b2, Object object, ArrayList arrayList, Object object2, ArrayList arrayList2) {
        this.g = b2;
        this.a = object;
        this.b = arrayList;
        this.c = null;
        this.d = null;
        this.e = object2;
        this.f = arrayList2;
    }

    public final void onTransitionEnd(Transition transition2) {
        transition2.removeListener(this);
    }

    public final void onTransitionStart(Transition transition2) {
        ArrayList arrayList;
        b b2 = this.g;
        Object object = this.a;
        if (object != null) {
            arrayList = this.b;
            b2.A(object, arrayList, null);
        }
        if ((object = this.c) != null) {
            arrayList = this.d;
            b2.A(object, arrayList, null);
        }
        if ((object = this.e) != null) {
            arrayList = this.f;
            b2.A(object, arrayList, null);
        }
    }
}

