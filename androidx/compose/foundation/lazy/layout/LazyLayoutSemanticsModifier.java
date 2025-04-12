/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

final class LazyLayoutSemanticsModifier
extends up1_0 {
    public final Function0 b;
    public final zs1_0 c;
    public final pg2_0 d;
    public final boolean e;
    public final boolean f;

    public LazyLayoutSemanticsModifier(hn1_2 hn1_22, zs1_0 zs1_02, pg2_0 pg2_02, boolean bl2, boolean bl3) {
        this.b = hn1_22;
        this.c = zs1_02;
        this.d = pg2_02;
        this.e = bl2;
        this.f = bl3;
    }

    public final LP1$c b() {
        cs1_1 cs1_12;
        boolean bl2 = this.f;
        Object object = this.b;
        Function0 function0 = object;
        function0 = (hn1_2)object;
        zs1_0 zs1_02 = this.c;
        pg2_0 pg2_02 = this.d;
        boolean bl3 = this.e;
        object = cs1_12;
        cs1_12 = new cs1_1((hn1_2)function0, zs1_02, pg2_02, bl3, bl2);
        return cs1_12;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof LazyLayoutSemanticsModifier;
        if (!bl3) {
            return false;
        }
        object = (LazyLayoutSemanticsModifier)object;
        Object object2 = this.b;
        Object object3 = ((LazyLayoutSemanticsModifier)object).b;
        if (object2 != object3) {
            return false;
        }
        object3 = this.c;
        object2 = ((LazyLayoutSemanticsModifier)object).c;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.d;
        object2 = ((LazyLayoutSemanticsModifier)object).d;
        if (object3 != object2) {
            return false;
        }
        bl3 = this.e;
        boolean bl4 = ((LazyLayoutSemanticsModifier)object).e;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.f;
        boolean bl5 = ((LazyLayoutSemanticsModifier)object).f;
        if (bl3 != bl5) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.b.hashCode() * 31;
        zs1_0 zs1_02 = this.c;
        int n4 = (zs1_02.hashCode() + n3) * 31;
        pg2_0 pg2_02 = this.d;
        n3 = (((Object)((Object)pg2_02)).hashCode() + n4) * 31;
        n4 = 1237;
        int n7 = this.e;
        n7 = n7 != 0 ? 1231 : 1237;
        n3 = (n3 + n7) * 31;
        n7 = (int)(this.f ? 1 : 0);
        if (n7 != 0) {
            n4 = 1231;
        }
        return n3 + n4;
    }

    public final void j(LP1$c object) {
        object = (cs1_1)object;
        Object object2 = this.b;
        ((cs1_1)object).n = object2;
        ((cs1_1)object).o = object2 = this.c;
        object2 = ((cs1_1)object).p;
        pg2_0 pg2_02 = this.d;
        if (object2 != pg2_02) {
            ((cs1_1)object).p = pg2_02;
            object2 = go0.f((fo0)object);
            ((xp1_0)object2).J();
        }
        boolean bl2 = ((cs1_1)object).q;
        boolean bl3 = this.e;
        boolean bl4 = this.f;
        if (bl2 != bl3 || (bl2 = ((cs1_1)object).r) != bl4) {
            ((cs1_1)object).q = bl3;
            ((cs1_1)object).r = bl4;
            ((cs1_1)object).r1();
            object = go0.f((fo0)object);
            ((xp1_0)object).J();
        }
    }
}

