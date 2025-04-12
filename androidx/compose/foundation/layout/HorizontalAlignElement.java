/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.layout;

import kotlin.jvm.internal.Intrinsics;

public final class HorizontalAlignElement
extends up1_0 {
    public final Nc$b b;

    public HorizontalAlignElement(Gx$a gx$a) {
        this.b = gx$a;
    }

    public final LP1$c b() {
        Nc$b nc$b;
        l91 l912 = new LP1$c();
        l912.n = nc$b = this.b;
        return l912;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof HorizontalAlignElement;
        if ((object = bl2 ? (HorizontalAlignElement)object : null) == null) {
            return false;
        }
        Nc$b nc$b = this.b;
        object = ((HorizontalAlignElement)object).b;
        return Intrinsics.areEqual(nc$b, object);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final void j(LP1$c lP1$c) {
        Nc$b nc$b;
        lP1$c = (l91)lP1$c;
        ((l91)lP1$c).n = nc$b = this.b;
    }
}

