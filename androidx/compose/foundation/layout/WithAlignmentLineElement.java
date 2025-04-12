/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.i$a;
import kotlin.jvm.internal.Intrinsics;

public final class WithAlignmentLineElement
extends up1_0 {
    public final Oc b;

    public WithAlignmentLineElement(Oc oc) {
        this.b = oc;
    }

    public final LP1$c b() {
        Oc oc;
        i$a i$a = new LP1$c();
        i$a.n = oc = this.b;
        return i$a;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof WithAlignmentLineElement;
        if ((object = bl2 ? (WithAlignmentLineElement)object : null) == null) {
            return false;
        }
        Oc oc = this.b;
        object = ((WithAlignmentLineElement)object).b;
        return Intrinsics.areEqual(oc, object);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final void j(LP1$c lP1$c) {
        Oc oc;
        lP1$c = (i$a)lP1$c;
        ((i$a)lP1$c).n = oc = this.b;
    }
}

