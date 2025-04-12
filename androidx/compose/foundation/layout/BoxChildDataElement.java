/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.layout;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

final class BoxChildDataElement
extends up1_0 {
    public final Nc b;
    public final boolean c;
    public final Function1 d;

    public BoxChildDataElement(Nc nc, boolean bl2, Function1 function1) {
        this.b = nc;
        this.c = bl2;
        this.d = function1;
    }

    public final LP1$c b() {
        boolean bl2;
        Nc nc;
        ga_0 ga_02 = new LP1$c();
        ga_02.n = nc = this.b;
        ga_02.o = bl2 = this.c;
        return ga_02;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof BoxChildDataElement;
        if (bl4) {
            object = (BoxChildDataElement)object;
        } else {
            bl2 = false;
            object = null;
        }
        bl4 = false;
        if (object == null) {
            return false;
        }
        Nc nc = this.b;
        Nc nc2 = ((BoxChildDataElement)object).b;
        boolean bl5 = Intrinsics.areEqual(nc, nc2);
        if (!bl5 || (bl5 = this.c) != (bl2 = ((BoxChildDataElement)object).c)) {
            bl3 = false;
        }
        return bl3;
    }

    public final int hashCode() {
        Nc nc = this.b;
        int n3 = nc.hashCode() * 31;
        int n4 = this.c;
        n4 = n4 != 0 ? 1231 : 1237;
        return n3 + n4;
    }

    public final void j(LP1$c lP1$c) {
        boolean bl2;
        Nc nc;
        lP1$c = (ga_0)lP1$c;
        ((ga_0)lP1$c).n = nc = this.b;
        ((ga_0)lP1$c).o = bl2 = this.c;
    }
}

