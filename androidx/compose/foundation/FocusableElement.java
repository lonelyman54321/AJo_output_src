/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation;

import kotlin.jvm.internal.Intrinsics;

final class FocusableElement
extends up1_0 {
    public final wr1_1 b;

    public FocusableElement(wr1_1 wr1_12) {
        this.b = wr1_12;
    }

    public final LP1$c b() {
        wr1_1 wr1_12 = this.b;
        EU0 eU0 = new EU0(wr1_12);
        return eU0;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof FocusableElement;
        if (!bl3) {
            return false;
        }
        wr1_1 wr1_12 = this.b;
        object = ((FocusableElement)object).b;
        boolean bl4 = Intrinsics.areEqual(wr1_12, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        wr1_1 wr1_12 = this.b;
        if (wr1_12 != null) {
            n3 = wr1_12.hashCode();
        } else {
            n3 = 0;
            wr1_12 = null;
        }
        return n3;
    }

    public final void j(LP1$c lP1$c) {
        lP1$c = (EU0)lP1$c;
        wr1_1 wr1_12 = this.b;
        ((EU0)lP1$c).u1(wr1_12);
    }
}

