/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.layout;

import kotlin.jvm.internal.Intrinsics;

public final class VerticalAlignElement
extends up1_0 {
    public final Nc$c b;

    public VerticalAlignElement(Gx$b gx$b) {
        this.b = gx$b;
    }

    public final LP1$c b() {
        Nc$c nc$c;
        rb3_0 rb3_02 = new LP1$c();
        rb3_02.n = nc$c = this.b;
        return rb3_02;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof VerticalAlignElement;
        if ((object = bl2 ? (VerticalAlignElement)object : null) == null) {
            return false;
        }
        Nc$c nc$c = this.b;
        object = ((VerticalAlignElement)object).b;
        return Intrinsics.areEqual(nc$c, object);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final void j(LP1$c lP1$c) {
        Nc$c nc$c;
        lP1$c = (rb3_0)lP1$c;
        ((rb3_0)lP1$c).n = nc$c = this.b;
    }
}

