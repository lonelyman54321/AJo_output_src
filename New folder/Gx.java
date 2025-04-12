/*
 * Decompiled with CFR 0.152.
 */
public final class Gx
implements Nc {
    public final float b;
    public final float c;

    public Gx(float f5, float f6) {
        this.b = f5;
        this.c = f6;
    }

    public final long a(long l2, long l3, bp1_0 bp1_02) {
        float f5;
        int n3 = 32;
        long l4 = l3 >> n3;
        int n4 = (int)l4;
        long l7 = l2 >> n3;
        int n7 = (int)l7;
        float f6 = n4 -= n7;
        n7 = 0x40000000;
        float f7 = 2.0f;
        f6 /= f7;
        long l8 = 0xFFFFFFFFL;
        int n8 = (int)(l3 &= l8);
        int n10 = (int)(l2 &= l8);
        float f8 = (float)(n8 -= n10) / f7;
        bp1_0 bp1_03 = bp1_0.Ltr;
        float f11 = this.b;
        if (bp1_02 != bp1_03) {
            n10 = -1;
            f5 = n10;
            f11 *= f5;
        }
        f5 = 1.0f;
        f11 = (f11 + f5) * f6;
        float f12 = this.c;
        f5 = (f5 + f12) * f8;
        int n14 = Math.round(f11);
        n10 = Math.round(f5);
        return Ti1.a(n14, n10);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof Gx;
        if (n3 == 0) {
            return false;
        }
        object = (Gx)object;
        float f5 = this.b;
        float f6 = ((Gx)object).b;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        f6 = this.c;
        float f7 = ((Gx)object).c;
        int n4 = Float.compare(f6, f7);
        if (n4 != 0) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = Float.floatToIntBits(this.b) * 31;
        return Float.floatToIntBits(this.c) + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BiasAlignment(horizontalBias=");
        float f5 = this.b;
        stringBuilder.append(f5);
        stringBuilder.append(", verticalBias=");
        f5 = this.c;
        return yh_0.a(stringBuilder, f5, ')');
    }
}

