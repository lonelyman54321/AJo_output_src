/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.draw;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

final class DrawWithCacheElement
extends up1_0 {
    public final Function1 b;

    public DrawWithCacheElement(Function1 function1) {
        this.b = function1;
    }

    public final LP1$c b() {
        xi_0 xi_02 = new xi_0();
        Function1 function1 = this.b;
        vi_0 vi_02 = new vi_0(xi_02, function1);
        return vi_02;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof DrawWithCacheElement;
        if (!bl3) {
            return false;
        }
        object = (DrawWithCacheElement)object;
        Function1 function1 = this.b;
        object = ((DrawWithCacheElement)object).b;
        boolean bl4 = Intrinsics.areEqual(function1, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final void j(LP1$c lP1$c) {
        Function1 function1;
        lP1$c = (vi_0)lP1$c;
        ((vi_0)lP1$c).q = function1 = this.b;
        ((vi_0)lP1$c).q0();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DrawWithCacheElement(onBuildDrawCache=");
        Function1 function1 = this.b;
        stringBuilder.append(function1);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

