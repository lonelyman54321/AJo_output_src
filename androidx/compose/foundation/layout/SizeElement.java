/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.layout;

import kotlin.jvm.functions.Function1;

final class SizeElement
extends up1_0 {
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final Function1 g;

    public SizeElement() {
        throw null;
    }

    public /* synthetic */ SizeElement(float f5, float f6, float f7, float f8, Function1 function1, int n3) {
        int n4 = n3 & 1;
        float f11 = n4 != 0 ? 0.0f / 0.0f : f5;
        int n7 = n3 & 2;
        float f12 = n7 != 0 ? 0.0f / 0.0f : f6;
        n7 = n3 & 4;
        float f14 = n7 != 0 ? 0.0f / 0.0f : f7;
        n7 = n3 & 8;
        float f15 = n7 != 0 ? 0.0f / 0.0f : f8;
        this(f11, f12, f14, f15, true, function1);
    }

    public SizeElement(float f5, float f6, float f7, float f8, boolean bl2, Function1 function1) {
        this.b = f5;
        this.c = f6;
        this.d = f7;
        this.e = f8;
        this.f = bl2;
        this.g = function1;
    }

    public final LP1$c b() {
        boolean bl2;
        float f5;
        j63_0 j63_02 = new LP1$c();
        j63_02.n = f5 = this.b;
        j63_02.o = f5 = this.c;
        j63_02.p = f5 = this.d;
        j63_02.q = f5 = this.e;
        j63_02.r = bl2 = this.f;
        return j63_02;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof SizeElement;
        if (!bl3) {
            return false;
        }
        object = (SizeElement)object;
        float f5 = this.b;
        float f6 = ((SizeElement)object).b;
        bl3 = xs0_0.a(f5, f6);
        if (!bl3) {
            return false;
        }
        f6 = this.c;
        f5 = ((SizeElement)object).c;
        bl3 = xs0_0.a(f6, f5);
        if (!bl3) {
            return false;
        }
        f6 = this.d;
        f5 = ((SizeElement)object).d;
        bl3 = xs0_0.a(f6, f5);
        if (!bl3) {
            return false;
        }
        f6 = this.e;
        f5 = ((SizeElement)object).e;
        bl3 = xs0_0.a(f6, f5);
        if (!bl3) {
            return false;
        }
        bl3 = this.f;
        boolean bl4 = ((SizeElement)object).f;
        if (bl3 != bl4) {
            return false;
        }
        return bl2;
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
        lP1$c = (j63_0)lP1$c;
        ((j63_0)lP1$c).n = f5 = this.b;
        ((j63_0)lP1$c).o = f5 = this.c;
        ((j63_0)lP1$c).p = f5 = this.d;
        ((j63_0)lP1$c).q = f5 = this.e;
        ((j63_0)lP1$c).r = bl2 = this.f;
    }
}

