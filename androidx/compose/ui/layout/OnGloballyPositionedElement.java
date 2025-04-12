/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.layout;

import kotlin.jvm.functions.Function1;

final class OnGloballyPositionedElement
extends up1_0 {
    public final Function1 b;

    public OnGloballyPositionedElement(Function1 function1) {
        this.b = function1;
    }

    public final LP1$c b() {
        Function1 function1;
        c82_0 c82_02 = new LP1$c();
        c82_02.n = function1 = this.b;
        return c82_02;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof OnGloballyPositionedElement;
        if (!bl3) {
            return false;
        }
        Function1 function1 = this.b;
        object = ((OnGloballyPositionedElement)object).b;
        if (function1 != object) {
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final void j(LP1$c lP1$c) {
        Function1 function1;
        lP1$c = (c82_0)lP1$c;
        ((c82_0)lP1$c).n = function1 = this.b;
    }
}

