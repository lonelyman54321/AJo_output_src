/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.focus;

import kotlin.jvm.internal.Intrinsics;

final class FocusRequesterElement
extends up1_0 {
    public final ou0_0 b;

    public FocusRequesterElement(ou0_0 ou0_02) {
        this.b = ou0_02;
    }

    public final LP1$c b() {
        ou0_0 ou0_02;
        su0_1 su0_12 = new LP1$c();
        su0_12.n = ou0_02 = this.b;
        return su0_12;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof FocusRequesterElement;
        if (!bl3) {
            return false;
        }
        object = (FocusRequesterElement)object;
        ou0_0 ou0_02 = this.b;
        object = ((FocusRequesterElement)object).b;
        boolean bl4 = Intrinsics.areEqual(ou0_02, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final void j(LP1$c lP1$c) {
        ou0_0 ou0_02;
        lP1$c = (su0_1)lP1$c;
        ((su0_1)lP1$c).n.a.m(lP1$c);
        ((su0_1)lP1$c).n = ou0_02 = this.b;
        ou0_02.a.b(lP1$c);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FocusRequesterElement(focusRequester=");
        ou0_0 ou0_02 = this.b;
        stringBuilder.append(ou0_02);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

