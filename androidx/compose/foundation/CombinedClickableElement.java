/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

final class CombinedClickableElement
extends up1_0 {
    public final wr1_1 b;
    public final Qg1 c;
    public final boolean d;
    public final String e;
    public final CP2 f;
    public final Function0 g;
    public final String h;
    public final Function0 i;
    public final Function0 j;

    public CombinedClickableElement() {
        throw null;
    }

    public CombinedClickableElement(wr1_1 wr1_12, boolean bl2, String string2, CP2 cP2, Function0 function0, String string3, Function0 function02, Function0 function03) {
        this.b = wr1_12;
        this.c = null;
        this.d = bl2;
        this.e = string2;
        this.f = cP2;
        this.g = function0;
        this.h = string3;
        this.i = function02;
        this.j = function03;
    }

    public final LP1$c b() {
        vZ vZ2;
        boolean bl2 = this.d;
        String string2 = this.e;
        wr1_1 wr1_12 = this.b;
        Qg1 qg1 = this.c;
        CP2 cP2 = this.f;
        Function0 function0 = this.g;
        Object object = vZ2;
        vZ2 = new B0(wr1_12, qg1, bl2, string2, cP2, function0);
        vZ2.H = object = this.h;
        vZ2.I = object = this.i;
        vZ2.J = object = this.j;
        return vZ2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object == null) {
            return false;
        }
        Object object2 = CombinedClickableElement.class;
        Object object3 = object.getClass();
        if (object2 != object3) {
            return false;
        }
        object = (CombinedClickableElement)object;
        object3 = this.b;
        object2 = ((CombinedClickableElement)object).b;
        boolean bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.c;
        object2 = ((CombinedClickableElement)object).c;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        bl3 = this.d;
        boolean bl4 = ((CombinedClickableElement)object).d;
        if (bl3 != bl4) {
            return false;
        }
        object3 = this.e;
        object2 = ((CombinedClickableElement)object).e;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.f;
        object2 = ((CombinedClickableElement)object).f;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.g;
        object2 = ((CombinedClickableElement)object).g;
        if (object3 != object2) {
            return false;
        }
        object3 = this.h;
        object2 = ((CombinedClickableElement)object).h;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.i;
        object2 = ((CombinedClickableElement)object).i;
        if (object3 != object2) {
            return false;
        }
        object3 = this.j;
        object = ((CombinedClickableElement)object).j;
        if (object3 != object) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4;
        int n7 = 0;
        Object object = this.b;
        if (object != null) {
            n4 = object.hashCode();
        } else {
            n4 = 0;
            object = null;
        }
        n4 *= 31;
        Object object2 = this.c;
        if (object2 != null) {
            n3 = object2.hashCode();
        } else {
            n3 = 0;
            object2 = null;
        }
        n4 = (n4 + n3) * 31;
        n3 = (int)(this.d ? 1 : 0);
        n3 = n3 != 0 ? 1231 : 1237;
        n4 = (n4 + n3) * 31;
        object2 = this.e;
        if (object2 != null) {
            n3 = ((String)object2).hashCode();
        } else {
            n3 = 0;
            object2 = null;
        }
        n4 = (n4 + n3) * 31;
        object2 = this.f;
        if (object2 != null) {
            n3 = ((CP2)object2).a;
        } else {
            n3 = 0;
            object2 = null;
        }
        n4 = (n4 + n3) * 31;
        object2 = this.g;
        n3 = (object2.hashCode() + n4) * 31;
        object = this.h;
        if (object != null) {
            n4 = ((String)object).hashCode();
        } else {
            n4 = 0;
            object = null;
        }
        n3 = (n3 + n4) * 31;
        object = this.i;
        if (object != null) {
            n4 = object.hashCode();
        } else {
            n4 = 0;
            object = null;
        }
        n3 = (n3 + n4) * 31;
        object = this.j;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n3 + n7;
    }

    public final void j(LP1$c object) {
        boolean bl2;
        Object object2;
        boolean bl3;
        object = (vZ)object;
        Object object3 = ((vZ)object).H;
        Object object4 = this.h;
        boolean bl4 = Intrinsics.areEqual(object3, object4);
        if (!bl4) {
            ((vZ)object).H = object4;
            object3 = go0.f((fo0)object);
            ((xp1_0)object3).J();
        }
        object3 = ((vZ)object).I;
        boolean bl5 = false;
        Qg1 qg1 = null;
        if (object3 == null) {
            bl4 = true;
        } else {
            bl4 = false;
            object3 = null;
        }
        Function0 function0 = this.i;
        if (function0 == null) {
            bl3 = true;
        } else {
            bl3 = false;
            object2 = null;
        }
        if (bl4 != bl3) {
            ((B0)object).w1();
            object3 = go0.f((fo0)object);
            ((xp1_0)object3).J();
            bl4 = true;
        } else {
            bl4 = false;
            object3 = null;
        }
        ((vZ)object).I = function0;
        function0 = ((vZ)object).J;
        if (function0 == null) {
            bl2 = true;
        } else {
            bl2 = false;
            function0 = null;
        }
        object2 = this.j;
        if (object2 == null) {
            bl5 = true;
        }
        if (bl2 != bl5) {
            bl4 = true;
        }
        ((vZ)object).J = object2;
        bl5 = ((B0)object).t;
        bl2 = this.d;
        boolean bl6 = bl5 != bl2 ? true : bl4;
        qg1 = this.c;
        object2 = this.e;
        object4 = this.b;
        CP2 cP2 = this.f;
        Function0 function02 = this.g;
        object3 = object;
        ((B0)object).y1((wr1_1)object4, qg1, bl2, (String)object2, cP2, function02);
        if (bl6 && (object = ((B0)object).x) != null) {
            object.m0();
            object = Unit.a;
        }
    }
}

