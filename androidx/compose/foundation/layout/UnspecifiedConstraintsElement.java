/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.layout;

final class UnspecifiedConstraintsElement
extends up1_0 {
    public final float b;
    public final float c;

    public UnspecifiedConstraintsElement(float f5, float f6) {
        this.b = f5;
        this.c = f6;
    }

    public final LP1$c b() {
        float f5;
        ow3_0 ow3_02 = new LP1$c();
        ow3_02.n = f5 = this.b;
        ow3_02.o = f5 = this.c;
        return ow3_02;
    }

    public final boolean equals(Object object) {
        float f5;
        boolean bl2;
        boolean bl3 = object instanceof UnspecifiedConstraintsElement;
        boolean bl4 = false;
        if (!bl3) {
            return false;
        }
        object = (UnspecifiedConstraintsElement)object;
        float f6 = this.b;
        float f7 = ((UnspecifiedConstraintsElement)object).b;
        bl3 = xs0_0.a(f6, f7);
        if (bl3 && (bl2 = xs0_0.a(f7 = this.c, f5 = ((UnspecifiedConstraintsElement)object).c))) {
            bl4 = true;
        }
        return bl4;
    }

    public final int hashCode() {
        int n3 = Float.floatToIntBits(this.b) * 31;
        return Float.floatToIntBits(this.c) + n3;
    }

    public final void j(LP1$c lP1$c) {
        float f5;
        lP1$c = (ow3_0)lP1$c;
        ((ow3_0)lP1$c).n = f5 = this.b;
        ((ow3_0)lP1$c).o = f5 = this.c;
    }
}

