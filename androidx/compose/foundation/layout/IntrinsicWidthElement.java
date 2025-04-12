/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.layout;

import kotlin.jvm.functions.Function1;

final class IntrinsicWidthElement
extends up1_0 {
    public final Tj1 b;
    public final boolean c;
    public final Function1 d;

    public IntrinsicWidthElement(Tj1 tj1, Function1 function1) {
        this.b = tj1;
        this.c = true;
        this.d = function1;
    }

    public final LP1$c b() {
        boolean bl2;
        Tj1 tj1;
        Wj1 wj1 = new LP1$c();
        wj1.n = tj1 = this.b;
        wj1.o = bl2 = this.c;
        return wj1;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3;
        boolean bl4 = true;
        if (this == object) {
            return bl4;
        }
        boolean bl5 = object instanceof IntrinsicWidthElement;
        if (bl5) {
            object = (IntrinsicWidthElement)object;
        } else {
            bl3 = false;
            object = null;
        }
        bl5 = false;
        if (object == null) {
            return false;
        }
        Tj1 tj1 = this.b;
        Tj1 tj12 = ((IntrinsicWidthElement)object).b;
        if (tj1 != tj12 || (bl2 = this.c) != (bl3 = ((IntrinsicWidthElement)object).c)) {
            bl4 = false;
        }
        return bl4;
    }

    public final int hashCode() {
        Tj1 tj1 = this.b;
        int n3 = ((Object)((Object)tj1)).hashCode() * 31;
        int n4 = this.c;
        n4 = n4 != 0 ? 1231 : 1237;
        return n3 + n4;
    }

    public final void j(LP1$c lP1$c) {
        boolean bl2;
        Tj1 tj1;
        lP1$c = (Wj1)lP1$c;
        ((Wj1)lP1$c).n = tj1 = this.b;
        ((Wj1)lP1$c).o = bl2 = this.c;
    }
}

