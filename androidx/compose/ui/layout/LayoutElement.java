/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.layout;

import kotlin.jvm.internal.Intrinsics;

final class LayoutElement
extends up1_0 {
    public final gx0_2 b;

    public LayoutElement(gx0_2 gx0_22) {
        this.b = gx0_22;
    }

    public final LP1$c b() {
        gx0_2 gx0_22;
        pp1_1 pp1_12 = new LP1$c();
        pp1_12.n = gx0_22 = this.b;
        return pp1_12;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof LayoutElement;
        if (!bl3) {
            return false;
        }
        object = (LayoutElement)object;
        gx0_2 gx0_22 = this.b;
        object = ((LayoutElement)object).b;
        boolean bl4 = Intrinsics.areEqual(gx0_22, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final void j(LP1$c lP1$c) {
        gx0_2 gx0_22;
        lP1$c = (pp1_1)lP1$c;
        ((pp1_1)lP1$c).n = gx0_22 = this.b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LayoutElement(measure=");
        gx0_2 gx0_22 = this.b;
        stringBuilder.append(gx0_22);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

