/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.h$d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

final class PaddingValuesElement
extends up1_0 {
    public final mk2_0 b;
    public final Function1 c;

    public PaddingValuesElement(mk2_0 mk2_02, h$d h$d) {
        this.b = mk2_02;
    }

    public final LP1$c b() {
        mk2_0 mk2_02;
        ok2_1 ok2_12 = new LP1$c();
        ok2_12.n = mk2_02 = this.b;
        return ok2_12;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof PaddingValuesElement;
        if ((object = bl2 ? (PaddingValuesElement)object : null) == null) {
            return false;
        }
        mk2_0 mk2_02 = this.b;
        object = ((PaddingValuesElement)object).b;
        return Intrinsics.areEqual(mk2_02, object);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final void j(LP1$c lP1$c) {
        mk2_0 mk2_02;
        lP1$c = (ok2_1)lP1$c;
        ((ok2_1)lP1$c).n = mk2_02 = this.b;
    }
}

