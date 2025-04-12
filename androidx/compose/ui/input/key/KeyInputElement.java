/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.input.key;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

final class KeyInputElement
extends up1_0 {
    public final Function1 b;
    public final Function1 c;

    public KeyInputElement(Function1 function1, Function1 function12) {
        this.b = function1;
        this.c = function12;
    }

    public final LP1$c b() {
        Function1 function1;
        fo1_2 fo1_22 = new LP1$c();
        fo1_22.n = function1 = this.b;
        fo1_22.o = function1 = this.c;
        return fo1_22;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof KeyInputElement;
        if (!bl3) {
            return false;
        }
        object = (KeyInputElement)object;
        Function1 function1 = this.b;
        Function1 function12 = ((KeyInputElement)object).b;
        bl3 = Intrinsics.areEqual(function1, function12);
        if (!bl3) {
            return false;
        }
        function12 = this.c;
        object = ((KeyInputElement)object).c;
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
        lP1$c = (fo1_2)lP1$c;
        ((fo1_2)lP1$c).n = function1 = this.b;
        ((fo1_2)lP1$c).o = function1 = this.c;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("KeyInputElement(onKeyEvent=");
        Function1 function1 = this.b;
        stringBuilder.append(function1);
        stringBuilder.append(", onPreKeyEvent=");
        function1 = this.c;
        stringBuilder.append(function1);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

