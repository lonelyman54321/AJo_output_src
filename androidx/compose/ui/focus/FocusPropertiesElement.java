/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.focus;

import kotlin.jvm.internal.Intrinsics;

final class FocusPropertiesElement
extends up1_0 {
    public final kU0 b;

    public FocusPropertiesElement(kU0 kU02) {
        this.b = kU02;
    }

    public final LP1$c b() {
        kU0 kU02;
        mu0_1 mu0_12 = new LP1$c();
        mu0_12.n = kU02 = this.b;
        return mu0_12;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof FocusPropertiesElement;
        if (!bl3) {
            return false;
        }
        object = (FocusPropertiesElement)object;
        kU0 kU02 = this.b;
        object = ((FocusPropertiesElement)object).b;
        boolean bl4 = Intrinsics.areEqual(kU02, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return ((Object)this.b).hashCode();
    }

    public final void j(LP1$c lP1$c) {
        kU0 kU02;
        lP1$c = (mu0_1)lP1$c;
        ((mu0_1)lP1$c).n = kU02 = this.b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FocusPropertiesElement(scope=");
        kU0 kU02 = this.b;
        stringBuilder.append(kU02);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

