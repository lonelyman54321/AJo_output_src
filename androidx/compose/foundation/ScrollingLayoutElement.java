/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation;

import kotlin.jvm.internal.Intrinsics;

public final class ScrollingLayoutElement
extends up1_0 {
    public final st2_2 b;
    public final boolean c;
    public final boolean d;

    public ScrollingLayoutElement(st2_2 st2_22, boolean bl2, boolean bl3) {
        this.b = st2_22;
        this.c = bl2;
        this.d = bl3;
    }

    public final LP1$c b() {
        boolean bl2;
        st2_2 st2_22;
        ju2_2 ju2_22 = new LP1$c();
        ju2_22.n = st2_22 = this.b;
        ju2_22.o = bl2 = this.c;
        ju2_22.p = bl2 = this.d;
        return ju2_22;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3;
        boolean bl4 = object instanceof ScrollingLayoutElement;
        boolean bl5 = false;
        if (!bl4) {
            return false;
        }
        object = (ScrollingLayoutElement)object;
        st2_2 st2_22 = this.b;
        st2_2 st2_23 = ((ScrollingLayoutElement)object).b;
        bl4 = Intrinsics.areEqual(st2_22, st2_23);
        if (bl4 && (bl4 = this.c) == (bl3 = ((ScrollingLayoutElement)object).c) && (bl4 = this.d) == (bl2 = ((ScrollingLayoutElement)object).d)) {
            bl5 = true;
        }
        return bl5;
    }

    public final int hashCode() {
        st2_2 st2_22 = this.b;
        int n3 = st2_22.hashCode() * 31;
        int n4 = 1237;
        int n7 = this.c;
        n7 = n7 != 0 ? 1231 : 1237;
        n3 = (n3 + n7) * 31;
        n7 = (int)(this.d ? 1 : 0);
        if (n7 != 0) {
            n4 = 1231;
        }
        return n3 + n4;
    }

    public final void j(LP1$c lP1$c) {
        boolean bl2;
        st2_2 st2_22;
        lP1$c = (ju2_2)lP1$c;
        ((ju2_2)lP1$c).n = st2_22 = this.b;
        ((ju2_2)lP1$c).o = bl2 = this.c;
        ((ju2_2)lP1$c).p = bl2 = this.d;
    }
}

