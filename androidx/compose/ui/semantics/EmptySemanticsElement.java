/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.semantics;

public final class EmptySemanticsElement
extends up1_0 {
    public final tz0_0 b;

    public EmptySemanticsElement(tz0_0 tz0_02) {
        this.b = tz0_02;
    }

    public final LP1$c b() {
        return this.b;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        if (object == this) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }
}

