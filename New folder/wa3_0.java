/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Wa3
 */
public final class wa3_0 {
    public float a;
    public double b;
    public boolean c;
    public double d;
    public double e;
    public double f;
    public float g;

    public final long a(float f5, float f6, long l2) {
        block11: {
            double d2;
            double d5;
            float f7;
            double d7;
            double d9;
            double d12;
            double d13;
            float f8;
            float f11;
            int n3;
            boolean bl2;
            float f12;
            wa3_0 wa3_02;
            block10: {
                wa3_02 = this;
                f12 = f6;
                Object object = this.c;
                bl2 = true;
                n3 = 1065353216;
                f11 = 1.0f;
                if (object != 0) break block10;
                f8 = this.a;
                float f14 = Float.MAX_VALUE;
                float f15 = f8 - f14;
                object = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
                if (object == 0) break block11;
                f8 = this.g;
                d13 = f8;
                d13 *= d13;
                Object object2 = f8 == f11 ? 0 : (f8 > f11 ? 1 : -1);
                if (object2 > 0) {
                    d12 = -f8;
                    d9 = this.b;
                    d7 = (double)bl2;
                    d13 -= d7;
                    this.d = d7 = Math.sqrt(d13) * d9 + (d12 *= d9);
                    f8 = -this.g;
                    d12 = f8;
                    d9 = this.b;
                    d12 *= d9;
                    d13 = Math.sqrt(d13) * d9;
                    this.e = d12 -= d13;
                } else {
                    f7 = 0.0f;
                    float f16 = f8 - 0.0f;
                    object2 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
                    if (object2 >= 0 && (object = f8 == f11 ? 0 : (f8 < f11 ? -1 : 1)) < 0) {
                        d12 = this.b;
                        d9 = (double)bl2 - d13;
                        this.f = d13 = Math.sqrt(d9) * d12;
                    }
                }
                wa3_02.c = bl2;
            }
            f8 = wa3_02.a;
            f8 = f5 - f8;
            d13 = l2;
            d12 = 1000.0;
            d13 /= d12;
            f7 = wa3_02.g;
            float f17 = f7 - f11;
            Object object = f17 == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1);
            if (object > 0) {
                double d14 = f8;
                d12 = wa3_02.e;
                d9 = d12 * d14;
                d7 = f12;
                d9 -= d7;
                double d15 = wa3_02.d;
                double d16 = d12 - d15;
                d9 /= d16;
                d9 = d14 - d9;
                d14 = d14 * d12 - d7;
                d7 = d12 - d15;
                d14 /= d7;
                d12 = Math.exp(d12 * d13) * d9;
                d7 = Math.exp(wa3_02.d * d13) * d14 + d12;
                d12 = wa3_02.e;
                d9 *= d12;
                d12 = Math.exp(d12 * d13) * d9;
                d9 = wa3_02.d;
                d14 *= d9;
                d5 = Math.exp(d9 *= d13) * d14 + d12;
            } else {
                n3 = (int)(f7 == f11 ? 0 : (f7 < f11 ? -1 : 1));
                if (n3 == 0) {
                    double d17 = f12;
                    d12 = wa3_02.b;
                    d2 = f8;
                    d9 = d12 * d2 + d17;
                    d17 = d9 * d13 + d2;
                    d7 = Math.exp(-d12 * d13) * d17;
                    d2 = Math.exp(-wa3_02.b * d13) * d17;
                    d17 = wa3_02.b;
                    d12 = -d17;
                    d17 = Math.exp(-d17 * d13) * d9;
                    d5 = d17 + (d2 *= d12);
                } else {
                    double d18 = (double)bl2;
                    double d19 = wa3_02.f;
                    d18 /= d19;
                    d19 = f7;
                    double d20 = wa3_02.b;
                    d19 *= d20;
                    double d22 = f8;
                    d19 *= d22;
                    d2 = f12;
                    d19 = (d19 + d2) * d18;
                    f12 = -f7;
                    d2 = Math.exp((double)f12 * d20 * d13);
                    d18 = Math.cos(wa3_02.f * d13) * d22;
                    d20 = Math.sin(wa3_02.f * d13) * d19 + d18;
                    d2 *= d20;
                    d18 = wa3_02.b;
                    d20 = -d18 * d2;
                    f7 = wa3_02.g;
                    double d23 = f7;
                    d20 *= d23;
                    f7 = -f7;
                    d18 = Math.exp((double)f7 * d18 * d13);
                    d23 = wa3_02.f;
                    double d24 = d2;
                    d2 = -d23 * d22;
                    d22 = Math.sin(d23 *= d13) * d2;
                    d2 = wa3_02.f;
                    d19 *= d2;
                    d2 = (Math.cos(d2 * d13) * d19 + d22) * d18;
                    d5 = d2 + d20;
                    d7 = d24;
                }
            }
            d2 = wa3_02.a;
            f12 = (float)(d7 + d2);
            f8 = (float)d5;
            long l3 = Float.floatToRawIntBits(f12);
            long l4 = Float.floatToRawIntBits(f8);
            return l4 & 0xFFFFFFFFL | (l3 <<= 32);
        }
        IllegalStateException illegalStateException = new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        throw illegalStateException;
    }
}

