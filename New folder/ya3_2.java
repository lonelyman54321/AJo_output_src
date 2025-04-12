/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Ya3
 */
public final class ya3_2
implements dc3_0 {
    public double a;
    public double b;
    public double c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public int i;

    public final float a() {
        return 0.0f;
    }

    public final boolean b() {
        boolean bl2;
        float f5;
        float f6 = this.e;
        double d2 = f6;
        double d5 = this.c;
        d2 -= d5;
        d5 = this.b;
        float f7 = this.f;
        double d7 = f7;
        float f8 = this.g;
        double d9 = f8;
        double d12 = (d2 = Math.sqrt(d9 = (d5 * d2 * d2 + (d7 = d7 * d7 * d9)) / d5)) - (d5 = (double)(f5 = this.h));
        Object object = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
        if (object <= 0) {
            bl2 = true;
            f6 = Float.MIN_VALUE;
        } else {
            bl2 = false;
            f6 = 0.0f;
        }
        return bl2;
    }

    public final float getInterpolation(float f5) {
        int n3;
        double d2;
        float f6;
        ya3_2 ya3_22;
        ya3_2 ya3_23 = this;
        float f7 = f5;
        float f8 = this.d;
        double d5 = f8 = f5 - f8;
        double d7 = 0.0;
        double d9 = d5 - d7;
        Object object = d9 == 0.0 ? 0 : (d9 < 0.0 ? -1 : 1);
        if (object <= 0) {
            ya3_22 = this;
            f6 = f5;
        } else {
            d7 = this.b;
            double d12 = this.a;
            float f11 = this.g;
            double d13 = f11;
            d13 = Math.sqrt(d7 / d13) * d5 * 4.0;
            double d14 = 9.0 / d13;
            d13 = 1.0;
            int n4 = (int)(d14 += d13);
            double d15 = n4;
            d5 /= d15;
            int n7 = 0;
            while (n7 < n4) {
                float f12 = ya3_23.e;
                double d16 = f12;
                double d17 = ya3_23.c;
                double d18 = d16 - d17;
                int n8 = n4;
                int n10 = n7;
                d13 = -d7 * d18;
                float f14 = ya3_23.f;
                double d19 = d7;
                d7 = f14;
                double d20 = d12 * d7;
                d13 -= d20;
                f7 = ya3_23.g;
                d2 = f7;
                d13 = d13 / d2 * d5;
                d20 = 2.0;
                d13 = d13 / d20 + d7;
                double d22 = d5 * d13 / d20 + d16;
                d16 = -(d22 - d17) * d19;
                d16 = (d16 - (d13 *= d12)) / d2 * d5;
                d2 = d16 / d20 + d7;
                float f15 = (float)d16;
                ya3_22 = this;
                this.f = f14 += f15;
                f6 = (float)(d2 *= d5);
                this.e = f12 += f6;
                n3 = this.i;
                if (n3 > 0) {
                    float f16;
                    float f17;
                    int n14;
                    f7 = 0.0f;
                    float f18 = f12 - 0.0f;
                    Object object2 = f18 == 0.0f ? 0 : (f18 < 0.0f ? -1 : 1);
                    if (object2 < 0) {
                        object2 = n3 & 1;
                        n14 = 1;
                        f17 = Float.MIN_VALUE;
                        if (object2 == n14) {
                            this.e = f7 = -f12;
                            this.f = f7 = -f14;
                        }
                    }
                    if ((n14 = (f16 = (f7 = ya3_22.e) - (f17 = 1.0f)) == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1)) > 0) {
                        n14 = 2;
                        f17 = 2.8E-45f;
                        if ((n3 &= 2) == n14) {
                            n3 = 0x40000000;
                            ya3_22.e = f6 = 2.0f - f7;
                            ya3_22.f = f6 = -ya3_22.f;
                        }
                    }
                }
                n7 = n10 + 1;
                f7 = f5;
                ya3_23 = ya3_22;
                n4 = n8;
                d7 = d19;
            }
            ya3_22 = ya3_23;
            f6 = f5;
        }
        ya3_22.d = f6;
        n3 = this.b();
        if (n3 != 0) {
            d2 = ya3_22.c;
            ya3_22.e = f6 = (float)d2;
        }
        return ya3_22.e;
    }
}

