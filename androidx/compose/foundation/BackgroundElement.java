/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

final class BackgroundElement
extends up1_0 {
    public final long b;
    public final ZD c;
    public final float d;
    public final i13 e;
    public final Function1 f;

    public BackgroundElement() {
        throw null;
    }

    public BackgroundElement(long l2, cu1_0 cu1_02, float f5, i13 i132, Function1 function1, int n3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            l2 = OX.l;
        }
        if ((n3 &= 2) != 0) {
            cu1_02 = null;
        }
        this.b = l2;
        this.c = cu1_02;
        this.d = f5;
        this.e = i132;
        this.f = function1;
    }

    public final LP1$c b() {
        float f5;
        long l2;
        yu_0 yu_02 = new LP1$c();
        yu_02.n = l2 = this.b;
        Object object = this.c;
        yu_02.o = object;
        yu_02.p = f5 = this.d;
        yu_02.q = object = this.e;
        yu_02.r = 9205357640488583168L;
        return yu_02;
    }

    public final boolean equals(Object object) {
        float f5;
        float f6;
        float f7;
        ZD zD;
        Object object2;
        boolean bl2;
        boolean bl3 = object instanceof BackgroundElement;
        if (bl3) {
            object = (BackgroundElement)object;
        } else {
            bl2 = false;
            object = null;
        }
        bl3 = false;
        if (object == null) {
            return false;
        }
        long l2 = this.b;
        long l3 = ((BackgroundElement)object).b;
        boolean bl4 = OX.c(l2, l3);
        if (bl4 && (bl4 = Intrinsics.areEqual(object2 = this.c, zD = ((BackgroundElement)object).c)) && !(bl4 = (f7 = (f6 = this.d) - (f5 = ((BackgroundElement)object).d)) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1)) && (bl2 = Intrinsics.areEqual(object2 = this.e, object = ((BackgroundElement)object).e))) {
            bl3 = true;
        }
        return bl3;
    }

    public final int hashCode() {
        int n3;
        int n4 = OX.m;
        long l2 = this.b;
        n4 = mt3_0.a(l2);
        int n7 = 31;
        n4 *= 31;
        ZD zD = this.c;
        if (zD != null) {
            n3 = zD.hashCode();
        } else {
            n3 = 0;
            zD = null;
        }
        n4 = (n4 + n3) * 31;
        n4 = UR0.a(this.d, n4, n7);
        return this.e.hashCode() + n4;
    }

    public final void j(LP1$c lP1$c) {
        float f5;
        long l2;
        lP1$c = (yu_0)lP1$c;
        ((yu_0)lP1$c).n = l2 = this.b;
        Object object = this.c;
        ((yu_0)lP1$c).o = object;
        ((yu_0)lP1$c).p = f5 = this.d;
        ((yu_0)lP1$c).q = object = this.e;
    }
}

