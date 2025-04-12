/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.layout;

import kotlin.jvm.functions.Function1;

final class AspectRatioElement
extends up1_0 {
    public final float b;
    public final boolean c;
    public final Function1 d;

    public AspectRatioElement(float f5, boolean n3, Function1 function1) {
        this.b = f5;
        this.c = n3;
        this.d = function1;
        IllegalArgumentException illegalArgumentException = null;
        float f6 = f5 - 0.0f;
        n3 = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (n3 > 0) {
            return;
        }
        String string2 = g9_0.a(f5, "aspectRatio ", " must be > 0");
        string2 = string2.toString();
        illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public final LP1$c b() {
        boolean bl2;
        float f5;
        bq_0 bq_02 = new LP1$c();
        bq_02.n = f5 = this.b;
        bq_02.o = bl2 = this.c;
        return bq_02;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        block8: {
            block7: {
                float f5;
                Object object2;
                bl2 = true;
                if (this == object) {
                    return bl2;
                }
                Object object3 = object instanceof AspectRatioElement;
                if (object3) {
                    object2 = object;
                    object2 = (AspectRatioElement)object;
                } else {
                    object3 = false;
                    f5 = 0.0f;
                    object2 = null;
                }
                if (object2 == null) {
                    return false;
                }
                float f6 = this.b;
                f5 = ((AspectRatioElement)object2).b;
                float f7 = f6 - f5;
                object3 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
                if (object3) break block7;
                object = (AspectRatioElement)object;
                object3 = this.c;
                boolean bl3 = ((AspectRatioElement)object).c;
                if (object3 == bl3) break block8;
            }
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        float f5 = this.b;
        int n3 = Float.floatToIntBits(f5) * 31;
        int n4 = this.c;
        n4 = n4 != 0 ? 1231 : 1237;
        return n3 + n4;
    }

    public final void j(LP1$c lP1$c) {
        boolean bl2;
        float f5;
        lP1$c = (bq_0)lP1$c;
        ((bq_0)lP1$c).n = f5 = this.b;
        ((bq_0)lP1$c).o = bl2 = this.c;
    }
}

