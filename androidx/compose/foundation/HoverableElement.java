/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation;

import kotlin.jvm.internal.Intrinsics;

final class HoverableElement
extends up1_0 {
    public final wr1_1 b;

    public HoverableElement(wr1_1 wr1_12) {
        this.b = wr1_12;
    }

    public final LP1$c b() {
        wr1_1 wr1_12;
        B91 b91 = new LP1$c();
        b91.n = wr1_12 = this.b;
        return b91;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof HoverableElement;
        if (!bl3) {
            return false;
        }
        object = ((HoverableElement)object).b;
        wr1_1 wr1_12 = this.b;
        boolean bl4 = Intrinsics.areEqual(object, wr1_12);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.b.hashCode() * 31;
    }

    public final void j(LP1$c lP1$c) {
        lP1$c = (B91)lP1$c;
        wr1_1 wr1_12 = ((B91)lP1$c).n;
        wr1_1 wr1_13 = this.b;
        boolean bl2 = Intrinsics.areEqual(wr1_12, wr1_13);
        if (!bl2) {
            ((B91)lP1$c).t1();
            ((B91)lP1$c).n = wr1_13;
        }
    }
}

