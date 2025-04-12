/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.semantics;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class ClearAndSetSemanticsElement
extends up1_0
implements by2_1 {
    public final Function1 b;

    public ClearAndSetSemanticsElement(Function1 function1) {
        this.b = function1;
    }

    public final LP1$c b() {
        Function1 function1 = this.b;
        G80 g80 = new G80(false, true, function1);
        return g80;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ClearAndSetSemanticsElement;
        if (!bl3) {
            return false;
        }
        object = (ClearAndSetSemanticsElement)object;
        Function1 function1 = this.b;
        object = ((ClearAndSetSemanticsElement)object).b;
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
        lP1$c = (G80)lP1$c;
        ((G80)lP1$c).p = function1 = this.b;
    }

    public final zy2_0 m() {
        zy2_0 zy2_02 = new zy2_0();
        zy2_02.b = false;
        zy2_02.c = true;
        this.b.invoke(zy2_02);
        return zy2_02;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ClearAndSetSemanticsElement(properties=");
        Function1 function1 = this.b;
        stringBuilder.append(function1);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

