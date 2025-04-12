/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class LazyLayoutItemAnimator$a
extends LP1$c
implements it0_0 {
    public LazyLayoutItemAnimator n;

    public LazyLayoutItemAnimator$a() {
        throw null;
    }

    public final /* synthetic */ void C0() {
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof LazyLayoutItemAnimator$a;
        if (!bl3) {
            return false;
        }
        object = (LazyLayoutItemAnimator$a)object;
        LazyLayoutItemAnimator lazyLayoutItemAnimator = this.n;
        object = ((LazyLayoutItemAnimator$a)object).n;
        boolean bl4 = Intrinsics.areEqual(lazyLayoutItemAnimator, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.n.hashCode();
    }

    public final void j1() {
        this.n.j = this;
    }

    public final void k1() {
        this.n.f();
    }

    public final void n(E60 object) {
        ArrayList arrayList = this.n.i;
        int n3 = arrayList.size();
        float f5 = 0.0f;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object2 = (Gr1)arrayList.get(i3);
            W01 w01 = ((Gr1)object2).n;
            if (w01 == null) continue;
            long l2 = ((Gr1)object2).m;
            int n4 = 32;
            long l3 = l2 >> n4;
            int n7 = (int)l3;
            float f6 = n7;
            long l4 = 0xFFFFFFFFL;
            int n8 = (int)(l2 &= l4);
            float f7 = n8;
            long l7 = w01.s;
            long l8 = l7 >> n4;
            float f8 = (int)l8;
            f6 -= f8;
            n4 = (int)(l4 &= l7);
            f8 = n4;
            object2 = object.M0().a;
            ((yl_0)object2).g(f6, f7 -= f8);
            try {
                Y01.a((Kt0)object, w01);
                continue;
            }
            finally {
                object2 = object.M0().a;
                float f11 = -f6;
                f7 = -f7;
                ((yl_0)object2).g(f11, f7);
            }
        }
        object.e1();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DisplayingDisappearingItemsNode(animator=");
        LazyLayoutItemAnimator lazyLayoutItemAnimator = this.n;
        stringBuilder.append(lazyLayoutItemAnimator);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

