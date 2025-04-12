/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation;

import kotlin.jvm.internal.Intrinsics;

final class ScrollSemanticsElement
extends up1_0 {
    public final st2_2 b;
    public final boolean c;
    public final TR0 d;
    public final boolean e;
    public final boolean f;

    public ScrollSemanticsElement(st2_2 st2_22, boolean bl2, TR0 tR0, boolean bl3, boolean bl4) {
        this.b = st2_22;
        this.c = bl2;
        this.d = tR0;
        this.e = bl3;
        this.f = bl4;
    }

    public final LP1$c b() {
        boolean bl2;
        rt2_1 rt2_12 = new LP1$c();
        Object object = this.b;
        rt2_12.n = object;
        rt2_12.o = bl2 = this.c;
        rt2_12.p = object = this.d;
        rt2_12.q = bl2 = this.f;
        return rt2_12;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ScrollSemanticsElement;
        if (!bl3) {
            return false;
        }
        object = (ScrollSemanticsElement)object;
        Object object2 = this.b;
        Object object3 = ((ScrollSemanticsElement)object).b;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        bl3 = this.c;
        boolean bl4 = ((ScrollSemanticsElement)object).c;
        if (bl3 != bl4) {
            return false;
        }
        object3 = this.d;
        object2 = ((ScrollSemanticsElement)object).d;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        bl3 = this.e;
        bl4 = ((ScrollSemanticsElement)object).e;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.f;
        boolean bl5 = ((ScrollSemanticsElement)object).f;
        if (bl3 != bl5) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        st2_2 st2_22 = this.b;
        int n3 = st2_22.hashCode() * 31;
        int n4 = 1237;
        int n7 = this.c;
        n7 = n7 != 0 ? 1231 : 1237;
        n3 = (n3 + n7) * 31;
        TR0 tR0 = this.d;
        if (tR0 == null) {
            n7 = 0;
            tR0 = null;
        } else {
            n7 = tR0.hashCode();
        }
        n3 = (n3 + n7) * 31;
        n7 = (int)(this.e ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        n3 = (n3 + n7) * 31;
        n7 = (int)(this.f ? 1 : 0);
        if (n7 != 0) {
            n4 = 1231;
        }
        return n3 + n4;
    }

    public final void j(LP1$c lP1$c) {
        boolean bl2;
        lP1$c = (rt2_1)lP1$c;
        Object object = this.b;
        ((rt2_1)lP1$c).n = object;
        ((rt2_1)lP1$c).o = bl2 = this.c;
        ((rt2_1)lP1$c).p = object = this.d;
        ((rt2_1)lP1$c).q = bl2 = this.f;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ScrollSemanticsElement(state=");
        Object object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", reverseScrolling=");
        boolean bl2 = this.c;
        stringBuilder.append(bl2);
        stringBuilder.append(", flingBehavior=");
        object = this.d;
        stringBuilder.append(object);
        stringBuilder.append(", isScrollable=");
        bl2 = this.e;
        stringBuilder.append(bl2);
        stringBuilder.append(", isVertical=");
        bl2 = this.f;
        return AR.a(stringBuilder, bl2, ')');
    }
}

