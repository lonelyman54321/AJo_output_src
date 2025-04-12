/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

final class ClickableElement
extends up1_0 {
    public final wr1_1 b;
    public final Qg1 c;
    public final boolean d;
    public final String e;
    public final CP2 f;
    public final Function0 g;

    public ClickableElement() {
        throw null;
    }

    public ClickableElement(wr1_1 wr1_12, Qg1 qg1, boolean bl2, String string2, CP2 cP2, Function0 function0) {
        this.b = wr1_12;
        this.c = qg1;
        this.d = bl2;
        this.e = string2;
        this.f = cP2;
        this.g = function0;
    }

    public final LP1$c b() {
        boolean bl2 = this.d;
        String string2 = this.e;
        wr1_1 wr1_12 = this.b;
        Qg1 qg1 = this.c;
        CP2 cP2 = this.f;
        Function0 function0 = this.g;
        hv_0 hv_02 = new B0(wr1_12, qg1, bl2, string2, cP2, function0);
        return hv_02;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object == null) {
            return false;
        }
        Object object2 = ClickableElement.class;
        Object object3 = object.getClass();
        if (object2 != object3) {
            return false;
        }
        object = (ClickableElement)object;
        object3 = this.b;
        object2 = ((ClickableElement)object).b;
        boolean bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.c;
        object2 = ((ClickableElement)object).c;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        bl3 = this.d;
        boolean bl4 = ((ClickableElement)object).d;
        if (bl3 != bl4) {
            return false;
        }
        object3 = this.e;
        object2 = ((ClickableElement)object).e;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.f;
        object2 = ((ClickableElement)object).f;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.g;
        object = ((ClickableElement)object).g;
        if (object3 != object) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4;
        int n7 = 0;
        wr1_1 wr1_12 = this.b;
        if (wr1_12 != null) {
            n4 = wr1_12.hashCode();
        } else {
            n4 = 0;
            wr1_12 = null;
        }
        n4 *= 31;
        Object object = this.c;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.d ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object = this.e;
        if (object != null) {
            n3 = ((String)object).hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n4 = (n4 + n3) * 31;
        object = this.f;
        if (object != null) {
            n7 = ((CP2)object).a;
        }
        n4 = (n4 + n7) * 31;
        return this.g.hashCode() + n4;
    }

    public final void j(LP1$c lP1$c) {
        LP1$c lP1$c2 = lP1$c;
        lP1$c2 = (hv_0)lP1$c;
        boolean bl2 = this.d;
        String string2 = this.e;
        wr1_1 wr1_12 = this.b;
        Qg1 qg1 = this.c;
        CP2 cP2 = this.f;
        Function0 function0 = this.g;
        ((B0)lP1$c2).y1(wr1_12, qg1, bl2, string2, cP2, function0);
    }
}

