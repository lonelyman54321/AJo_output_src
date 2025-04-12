/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.layout;

import kotlin.jvm.functions.Function1;

final class OffsetElement
extends up1_0 {
    public final float b;
    public final float c;
    public final boolean d;
    public final Function1 e;

    public OffsetElement() {
        throw null;
    }

    public OffsetElement(float f5, float f6, boolean bl2, Function1 function1) {
        this.b = f5;
        this.c = f6;
        this.d = bl2;
        this.e = function1;
    }

    public final LP1$c b() {
        boolean bl2;
        float f5;
        j72 j722 = new LP1$c();
        j722.n = f5 = this.b;
        j722.o = f5 = this.c;
        j722.p = bl2 = this.d;
        return j722;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof OffsetElement;
        if (bl4) {
            object = (OffsetElement)object;
        } else {
            bl2 = false;
            object = null;
        }
        bl4 = false;
        if (object == null) {
            return false;
        }
        float f5 = this.b;
        float f6 = ((OffsetElement)object).b;
        boolean bl5 = xs0_0.a(f5, f6);
        if (!bl5 || !(bl5 = xs0_0.a(f5 = this.c, f6 = ((OffsetElement)object).c)) || (bl5 = this.d) != (bl2 = ((OffsetElement)object).d)) {
            bl3 = false;
        }
        return bl3;
    }

    public final int hashCode() {
        float f5 = this.b;
        int n3 = Float.floatToIntBits(f5) * 31;
        float f6 = this.c;
        n3 = UR0.a(f6, n3, 31);
        int n4 = this.d;
        n4 = n4 != 0 ? 1231 : 1237;
        return n3 + n4;
    }

    public final void j(LP1$c lP1$c) {
        boolean bl2;
        float f5;
        lP1$c = (j72)lP1$c;
        ((j72)lP1$c).n = f5 = this.b;
        ((j72)lP1$c).o = f5 = this.c;
        ((j72)lP1$c).p = bl2 = this.d;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("OffsetModifierElement(x=");
        String string2 = xs0_0.b(this.b);
        stringBuilder.append((Object)string2);
        stringBuilder.append(", y=");
        string2 = xs0_0.b(this.c);
        stringBuilder.append((Object)string2);
        stringBuilder.append(", rtlAware=");
        boolean bl2 = this.d;
        return AR.a(stringBuilder, bl2, ')');
    }
}

