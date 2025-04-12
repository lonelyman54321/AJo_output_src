/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.draw;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

final class DrawBehindElement
extends up1_0 {
    public final Function1 b;

    public DrawBehindElement(Function1 function1) {
        this.b = function1;
    }

    public final LP1$c b() {
        Function1 function1;
        bt0 bt02 = new LP1$c();
        bt02.n = function1 = this.b;
        return bt02;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof DrawBehindElement;
        if (!bl3) {
            return false;
        }
        object = (DrawBehindElement)object;
        Function1 function1 = this.b;
        object = ((DrawBehindElement)object).b;
        boolean bl4 = Intrinsics.areEqual(function1, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final void j(LP1$c lP1$c) {
        Function1 function1;
        lP1$c = (bt0)lP1$c;
        ((bt0)lP1$c).n = function1 = this.b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DrawBehindElement(onDraw=");
        Function1 function1 = this.b;
        stringBuilder.append(function1);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

