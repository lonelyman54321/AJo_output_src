/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.selection;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

final class TriStateToggleableElement
extends up1_0 {
    public final ao3 b;
    public final wr1_1 c;
    public final Qg1 d;
    public final boolean e;
    public final CP2 f;
    public final Function0 g;

    public TriStateToggleableElement() {
        throw null;
    }

    public TriStateToggleableElement(ao3 ao32, wr1_1 wr1_12, Qg1 qg1, boolean bl2, CP2 cP2, Function0 function0) {
        this.b = ao32;
        this.c = wr1_12;
        this.d = qg1;
        this.e = bl2;
        this.f = cP2;
        this.g = function0;
    }

    public final LP1$c b() {
        fs3_0 fs3_02;
        boolean bl2 = this.e;
        wr1_1 wr1_12 = this.c;
        Qg1 qg1 = this.d;
        CP2 cP2 = this.f;
        Function0 function0 = this.g;
        Object object = fs3_02;
        fs3_02 = new B0(wr1_12, qg1, bl2, null, cP2, function0);
        object = this.b;
        fs3_02.H = object;
        return fs3_02;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object == null) {
            return false;
        }
        Object object2 = TriStateToggleableElement.class;
        Object object3 = object.getClass();
        if (object2 != object3) {
            return false;
        }
        object = (TriStateToggleableElement)object;
        object3 = this.b;
        object2 = ((TriStateToggleableElement)object).b;
        if (object3 != object2) {
            return false;
        }
        object3 = this.c;
        object2 = ((TriStateToggleableElement)object).c;
        boolean bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.d;
        object2 = ((TriStateToggleableElement)object).d;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        bl3 = this.e;
        boolean bl4 = ((TriStateToggleableElement)object).e;
        if (bl3 != bl4) {
            return false;
        }
        object3 = this.f;
        object2 = ((TriStateToggleableElement)object).f;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.g;
        object = ((TriStateToggleableElement)object).g;
        if (object3 != object) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        ao3 ao32 = this.b;
        int n4 = ((Object)((Object)ao32)).hashCode() * 31;
        int n7 = 0;
        Object object = this.c;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n4 = (n4 + n3) * 31;
        object = this.d;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.e ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.f;
        if (object != null) {
            n7 = ((CP2)object).a;
        }
        n4 = (n4 + n7) * 31;
        return this.g.hashCode() + n4;
    }

    public final void j(LP1$c object) {
        LP1$c lP1$c = object;
        lP1$c = (fs3_0)object;
        object = ((fs3_0)lP1$c).H;
        Object object2 = this.b;
        if (object != object2) {
            ((fs3_0)lP1$c).H = object2;
            object = go0.f(lP1$c);
            ((xp1_0)object).J();
        }
        boolean bl2 = this.e;
        object2 = this.c;
        Qg1 qg1 = this.d;
        CP2 cP2 = this.f;
        Function0 function0 = this.g;
        ((B0)lP1$c).y1((wr1_1)object2, qg1, bl2, null, cP2, function0);
    }
}

