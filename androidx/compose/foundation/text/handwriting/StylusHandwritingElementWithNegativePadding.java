/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.text.handwriting;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

final class StylusHandwritingElementWithNegativePadding
extends up1_0 {
    public final Function0 b;

    public StylusHandwritingElementWithNegativePadding(Function0 function0) {
        this.b = function0;
    }

    public final LP1$c b() {
        Function0 function0 = this.b;
        df3_1 df3_12 = new cf3_1(function0);
        return df3_12;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof StylusHandwritingElementWithNegativePadding;
        if (!bl3) {
            return false;
        }
        object = (StylusHandwritingElementWithNegativePadding)object;
        Function0 function0 = this.b;
        object = ((StylusHandwritingElementWithNegativePadding)object).b;
        boolean bl4 = Intrinsics.areEqual(function0, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final void j(LP1$c lP1$c) {
        Function0 function0;
        lP1$c = (df3_1)lP1$c;
        ((cf3_1)lP1$c).p = function0 = this.b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("StylusHandwritingElementWithNegativePadding(onHandwritingSlopExceeded=");
        Function0 function0 = this.b;
        stringBuilder.append(function0);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

