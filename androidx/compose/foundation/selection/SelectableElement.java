/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.selection;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

final class SelectableElement
extends up1_0 {
    public final boolean b;
    public final wr1_1 c;
    public final Qg1 d;
    public final boolean e;
    public final CP2 f;
    public final Function0 g;

    public SelectableElement() {
        throw null;
    }

    public SelectableElement(boolean bl2, wr1_1 wr1_12, Qg1 qg1, boolean bl3, CP2 cP2, Function0 function0) {
        this.b = bl2;
        this.c = wr1_12;
        this.d = qg1;
        this.e = bl3;
        this.f = cP2;
        this.g = function0;
    }

    public final LP1$c b() {
        boolean bl2;
        boolean bl3 = this.e;
        wr1_1 wr1_12 = this.c;
        Qg1 qg1 = this.d;
        CP2 cP2 = this.f;
        Function0 function0 = this.g;
        lx2_1 lx2_12 = new B0(wr1_12, qg1, bl3, null, cP2, function0);
        lx2_12.H = bl2 = this.b;
        return lx2_12;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object == null) {
            return false;
        }
        Object object2 = SelectableElement.class;
        Object object3 = object.getClass();
        if (object2 != object3) {
            return false;
        }
        object = (SelectableElement)object;
        boolean bl3 = this.b;
        boolean bl4 = ((SelectableElement)object).b;
        if (bl3 != bl4) {
            return false;
        }
        object3 = this.c;
        object2 = ((SelectableElement)object).c;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.d;
        object2 = ((SelectableElement)object).d;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        bl3 = this.e;
        bl4 = ((SelectableElement)object).e;
        if (bl3 != bl4) {
            return false;
        }
        object3 = this.f;
        object2 = ((SelectableElement)object).f;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.g;
        object = ((SelectableElement)object).g;
        if (object3 != object) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4 = 1237;
        int n7 = this.b;
        n7 = n7 != 0 ? 1231 : 1237;
        n7 *= 31;
        int n8 = 0;
        Object object = this.c;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n7 = (n7 + n3) * 31;
        object = this.d;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n7 = (n7 + n3) * 31;
        n3 = (int)(this.e ? 1 : 0);
        if (n3 != 0) {
            n4 = 1231;
        }
        n7 = (n7 + n4) * 31;
        CP2 cP2 = this.f;
        if (cP2 != null) {
            n8 = cP2.a;
        }
        n7 = (n7 + n8) * 31;
        return this.g.hashCode() + n7;
    }

    public final void j(LP1$c object) {
        LP1$c lP1$c = object;
        lP1$c = (lx2_1)object;
        boolean bl2 = ((lx2_1)lP1$c).H;
        boolean bl3 = this.b;
        if (bl2 != bl3) {
            ((lx2_1)lP1$c).H = bl3;
            object = go0.f(lP1$c);
            ((xp1_0)object).J();
        }
        boolean bl4 = this.e;
        wr1_1 wr1_12 = this.c;
        Qg1 qg1 = this.d;
        CP2 cP2 = this.f;
        Function0 function0 = this.g;
        ((B0)lP1$c).y1(wr1_12, qg1, bl4, null, cP2, function0);
    }
}

