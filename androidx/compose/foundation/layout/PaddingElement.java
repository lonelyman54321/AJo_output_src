/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.layout;

import kotlin.jvm.functions.Function1;

final class PaddingElement
extends up1_0 {
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final Function1 g;

    public PaddingElement() {
        throw null;
    }

    public PaddingElement(float f5, float f6, float f7, float f8, Function1 function1) {
        float f11;
        float f12;
        float f14;
        int n3;
        this.b = f5;
        this.c = f6;
        this.d = f7;
        this.e = f8;
        this.f = true;
        this.g = function1;
        float f15 = 0.0f / 0.0f;
        float f16 = f5 - 0.0f;
        float f17 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
        if (f17 < 0 && (n3 = xs0_0.a(f5, f15)) == 0 || (n3 = (f14 = f6 - 0.0f) == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1)) < 0 && (n3 = (int)(xs0_0.a(f6, f15) ? 1 : 0)) == 0 || (n3 = (int)((f12 = f7 - 0.0f) == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1))) < 0 && (n3 = (int)(xs0_0.a(f7, f15) ? 1 : 0)) == 0 || (n3 = (int)((f11 = f8 - 0.0f) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1))) < 0 && (n3 = (int)(xs0_0.a(f8, f15) ? 1 : 0)) == 0) {
            String string2 = "Padding must be non-negative".toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
            throw illegalArgumentException;
        }
    }

    public final LP1$c b() {
        boolean bl2;
        float f5;
        lk2_1 lk2_12 = new LP1$c();
        lk2_12.n = f5 = this.b;
        lk2_12.o = f5 = this.c;
        lk2_12.p = f5 = this.d;
        lk2_12.q = f5 = this.e;
        lk2_12.r = bl2 = this.f;
        return lk2_12;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof PaddingElement;
        if (bl3) {
            object = (PaddingElement)object;
        } else {
            bl2 = false;
            object = null;
        }
        bl3 = false;
        if (object == null) {
            return false;
        }
        float f5 = this.b;
        float f6 = ((PaddingElement)object).b;
        boolean bl4 = xs0_0.a(f5, f6);
        if (bl4 && (bl4 = xs0_0.a(f5 = this.c, f6 = ((PaddingElement)object).c)) && (bl4 = xs0_0.a(f5 = this.d, f6 = ((PaddingElement)object).d)) && (bl4 = xs0_0.a(f5 = this.e, f6 = ((PaddingElement)object).e)) && (bl4 = this.f) == (bl2 = ((PaddingElement)object).f)) {
            bl3 = true;
        }
        return bl3;
    }

    public final int hashCode() {
        float f5 = this.b;
        int n3 = Float.floatToIntBits(f5);
        int n4 = 31;
        n3 *= 31;
        n3 = UR0.a(this.c, n3, n4);
        n3 = UR0.a(this.d, n3, n4);
        float f6 = this.e;
        n3 = UR0.a(f6, n3, n4);
        n4 = (int)(this.f ? 1 : 0);
        n4 = n4 != 0 ? 1231 : 1237;
        return n3 + n4;
    }

    public final void j(LP1$c lP1$c) {
        boolean bl2;
        float f5;
        lP1$c = (lk2_1)lP1$c;
        ((lk2_1)lP1$c).n = f5 = this.b;
        ((lk2_1)lP1$c).o = f5 = this.c;
        ((lk2_1)lP1$c).p = f5 = this.d;
        ((lk2_1)lP1$c).q = f5 = this.e;
        ((lk2_1)lP1$c).r = bl2 = this.f;
    }
}

