/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.g$b;
import kotlin.jvm.functions.Function1;

final class OffsetPxElement
extends up1_0 {
    public final Function1 b;
    public final boolean c;
    public final Function1 d;

    public OffsetPxElement(Function1 function1, g$b g$b) {
        this.b = function1;
        this.c = true;
    }

    public final LP1$c b() {
        boolean bl2;
        Function1 function1;
        l72 l722 = new LP1$c();
        l722.n = function1 = this.b;
        l722.o = bl2 = this.c;
        return l722;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3;
        boolean bl4 = true;
        if (this == object) {
            return bl4;
        }
        boolean bl5 = object instanceof OffsetPxElement;
        if (bl5) {
            object = (OffsetPxElement)object;
        } else {
            bl3 = false;
            object = null;
        }
        bl5 = false;
        if (object == null) {
            return false;
        }
        Function1 function1 = this.b;
        Function1 function12 = ((OffsetPxElement)object).b;
        if (function1 != function12 || (bl2 = this.c) != (bl3 = ((OffsetPxElement)object).c)) {
            bl4 = false;
        }
        return bl4;
    }

    public final int hashCode() {
        Function1 function1 = this.b;
        int n3 = function1.hashCode() * 31;
        int n4 = this.c;
        n4 = n4 != 0 ? 1231 : 1237;
        return n3 + n4;
    }

    public final void j(LP1$c lP1$c) {
        boolean bl2;
        Function1 function1;
        lP1$c = (l72)lP1$c;
        ((l72)lP1$c).n = function1 = this.b;
        ((l72)lP1$c).o = bl2 = this.c;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("OffsetPxModifier(offset=");
        Function1 function1 = this.b;
        stringBuilder.append(function1);
        stringBuilder.append(", rtlAware=");
        boolean bl2 = this.c;
        return AR.a(stringBuilder, bl2, ')');
    }
}

