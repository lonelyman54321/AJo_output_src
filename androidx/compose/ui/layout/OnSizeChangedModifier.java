/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.layout;

import kotlin.jvm.functions.Function1;

final class OnSizeChangedModifier
extends up1_0 {
    public final Function1 b;

    public OnSizeChangedModifier(Function1 function1) {
        this.b = function1;
    }

    public final LP1$c b() {
        Function1 function1 = this.b;
        b92 b922 = new b92(function1);
        return b922;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof OnSizeChangedModifier;
        if (!bl3) {
            return false;
        }
        Function1 function1 = this.b;
        object = ((OnSizeChangedModifier)object).b;
        if (function1 != object) {
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final void j(LP1$c lP1$c) {
        long l2;
        Function1 function1;
        lP1$c = (b92)lP1$c;
        ((b92)lP1$c).n = function1 = this.b;
        int n3 = -1 << -1;
        ((b92)lP1$c).p = l2 = dj1.a(n3, n3);
    }
}

