/*
 * Decompiled with CFR 0.152.
 */
public final class Fx
implements Nc {
    public final float b;
    public final float c;

    public Fx(float f5) {
        this.b = f5;
        this.c = -1.0f;
    }

    public final long a(long l2, long l3, bp1_0 bp1_02) {
        int n3 = 32;
        int n4 = (int)(l3 >> n3);
        int n7 = (int)(l2 >> n3);
        long l4 = 0xFFFFFFFFL;
        int n8 = (int)(l3 & l4);
        int n10 = (int)(l2 & l4);
        l2 = dj1.a(n4 -= n7, n8 -= n10);
        float f5 = (int)(l2 >> n3);
        float f6 = 2.0f;
        f5 /= f6;
        float f7 = (float)((int)(l2 & l4)) / f6;
        float f8 = 1.0f;
        f6 = (this.b + f8) * f5;
        f5 = this.c;
        f8 = (f8 + f5) * f7;
        int n14 = Math.round(f6);
        n10 = Math.round(f8);
        return Ti1.a(n14, n10);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof Fx;
        if (n3 == 0) {
            return false;
        }
        object = (Fx)object;
        float f5 = this.b;
        float f6 = ((Fx)object).b;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        f6 = this.c;
        float f7 = ((Fx)object).c;
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
        StringBuilder stringBuilder = new StringBuilder("BiasAbsoluteAlignment(horizontalBias=");
        float f5 = this.b;
        stringBuilder.append(f5);
        stringBuilder.append(", verticalBias=");
        f5 = this.c;
        return yh_0.a(stringBuilder, f5, ')');
    }
}

