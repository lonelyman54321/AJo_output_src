/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.semantics;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class AppendedSemanticsElement
extends up1_0
implements by2_1 {
    public final boolean b;
    public final Function1 c;

    public AppendedSemanticsElement(Function1 function1, boolean bl2) {
        this.b = bl2;
        this.c = function1;
    }

    public final LP1$c b() {
        Function1 function1 = this.c;
        boolean bl2 = this.b;
        G80 g80 = new G80(bl2, false, function1);
        return g80;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof AppendedSemanticsElement;
        if (!bl3) {
            return false;
        }
        object = (AppendedSemanticsElement)object;
        boolean bl4 = this.b;
        bl3 = ((AppendedSemanticsElement)object).b;
        if (bl4 != bl3) {
            return false;
        }
        Function1 function1 = this.c;
        object = ((AppendedSemanticsElement)object).c;
        boolean bl5 = Intrinsics.areEqual(function1, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.b;
        n3 = n3 != 0 ? 1231 : 1237;
        return this.c.hashCode() + (n3 *= 31);
    }

    public final void j(LP1$c lP1$c) {
        Function1 function1;
        boolean bl2;
        lP1$c = (G80)lP1$c;
        ((G80)lP1$c).n = bl2 = this.b;
        ((G80)lP1$c).p = function1 = this.c;
    }

    public final zy2_0 m() {
        boolean bl2;
        zy2_0 zy2_02 = new zy2_0();
        zy2_02.b = bl2 = this.b;
        this.c.invoke(zy2_02);
        return zy2_02;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AppendedSemanticsElement(mergeDescendants=");
        boolean bl2 = this.b;
        stringBuilder.append(bl2);
        stringBuilder.append(", properties=");
        Function1 function1 = this.c;
        stringBuilder.append(function1);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

