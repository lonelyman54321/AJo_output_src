/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.input.rotary;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

final class RotaryInputElement
extends up1_0 {
    public final Function1 b;
    public final Function1 c;

    public RotaryInputElement(Function1 function1) {
        this.b = function1;
        this.c = null;
    }

    public final LP1$c b() {
        Function1 function1;
        lp2_0 lp2_02 = new LP1$c();
        lp2_02.n = function1 = this.b;
        lp2_02.o = function1 = this.c;
        return lp2_02;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof RotaryInputElement;
        if (!bl3) {
            return false;
        }
        object = (RotaryInputElement)object;
        Function1 function1 = this.b;
        Function1 function12 = ((RotaryInputElement)object).b;
        bl3 = Intrinsics.areEqual(function1, function12);
        if (!bl3) {
            return false;
        }
        function12 = this.c;
        object = ((RotaryInputElement)object).c;
        boolean bl4 = Intrinsics.areEqual(function12, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4 = 0;
        Function1 function1 = this.b;
        if (function1 == null) {
            n3 = 0;
            function1 = null;
        } else {
            n3 = function1.hashCode();
        }
        n3 *= 31;
        Function1 function12 = this.c;
        if (function12 != null) {
            n4 = function12.hashCode();
        }
        return n3 + n4;
    }

    public final void j(LP1$c lP1$c) {
        Function1 function1;
        lP1$c = (lp2_0)lP1$c;
        ((lp2_0)lP1$c).n = function1 = this.b;
        ((lp2_0)lP1$c).o = function1 = this.c;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RotaryInputElement(onRotaryScrollEvent=");
        Function1 function1 = this.b;
        stringBuilder.append(function1);
        stringBuilder.append(", onPreRotaryScrollEvent=");
        function1 = this.c;
        stringBuilder.append(function1);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

