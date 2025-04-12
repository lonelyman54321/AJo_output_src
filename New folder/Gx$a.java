/*
 * Decompiled with CFR 0.152.
 */
public final class Gx$a
implements Nc$b {
    public final float a;

    public Gx$a(float f5) {
        this.a = f5;
    }

    public final int a(int n3, int n4, bp1_0 bp1_02) {
        float f5 = n4 - n3;
        n4 = 0x40000000;
        float f6 = 2.0f;
        f5 /= f6;
        bp1_0 bp1_03 = bp1_0.Ltr;
        float f7 = this.a;
        if (bp1_02 != bp1_03) {
            n4 = -1;
            f6 = n4;
            f7 *= f6;
        }
        return Math.round((1.0f + f7) * f5);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Gx$a;
        if (!bl3) {
            return false;
        }
        object = (Gx$a)object;
        float f5 = this.a;
        float f6 = ((Gx$a)object).a;
        int n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Horizontal(bias=");
        float f5 = this.a;
        return yh_0.a(stringBuilder, f5, ')');
    }
}

