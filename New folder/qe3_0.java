/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from qE3
 */
public final class qe3_0 {
    public static final qe3_0 k;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float[] g;
    public final float h;
    public final float i;
    public final float j;

    static {
        qe3_0 qe3_02;
        float[] fArray;
        float f5;
        int n3 = 3;
        float f6 = 4.2E-45f;
        int n4 = 2;
        float f7 = 2.8E-45f;
        int n7 = 1;
        float f8 = Float.MIN_VALUE;
        int n8 = 0;
        float[] fArray2 = os_2.c;
        double d2 = (double)os_2.f() * 63.66197723675813;
        double d5 = 100.0;
        float f11 = (float)(d2 /= d5);
        Object object = os_2.a;
        float f12 = fArray2[0];
        float[] fArray3 = object[0];
        float f14 = fArray3[0] * f12;
        float f15 = fArray2[n7];
        float f16 = fArray3[n7] * f15 + f14;
        f14 = fArray2[n4];
        float f17 = fArray3[n4] * f14 + f16;
        float[] fArray4 = object[n7];
        float f18 = fArray4[0] * f12;
        float f19 = fArray4[n7] * f15 + f18;
        f16 = fArray4[n4] * f14 + f19;
        object = object[n4];
        f18 = (float)object[0];
        f12 *= f18;
        f18 = (float)object[n7];
        f15 = f15 * f18 + f12;
        Object object2 = object[n4];
        f14 = f14 * object2 + f15;
        object2 = 1.0f;
        double d7 = (double)object2;
        double d9 = 0.9;
        double d12 = d7 - d9;
        Object object3 = d12 == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
        if (object3 >= 0) {
            object3 = 1060152279;
            f12 = 0.69f;
            f5 = 0.69f;
        } else {
            object3 = 1059565076;
            f12 = 0.655f;
            f5 = 0.655f;
        }
        f12 = (float)Math.exp((-f11 - 42.0f) / 92.0f) * 0.2777778f;
        f15 = 1.0f;
        f12 = (f15 - f12) * object2;
        d7 = f12;
        d9 = 1.0;
        Object object4 = d7 == d9 ? 0 : (d7 > d9 ? 1 : -1);
        if (object4 > 0) {
            object3 = 1065353216;
            f12 = 1.0f;
        } else {
            d9 = 0.0;
            double d13 = d7 - d9;
            object4 = d13 == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1);
            if (object4 < 0) {
                object3 = false;
                f12 = 0.0f;
                fArray = null;
            }
        }
        f18 = 100.0f;
        f19 = f18 / f17 * f12 + f15 - f12;
        float f20 = f18 / f16 * f12 + f15 - f12;
        f18 = f18 / f14 * f12 + f15 - f12;
        fArray = new float[n3];
        fArray[0] = f19;
        fArray[n7] = f20;
        fArray[n4] = f18;
        f18 = 5.0f * f11 + f15;
        f18 = f15 / f18;
        f19 = f18 * f18 * f18 * f18;
        f15 -= f19;
        f18 = 0.1f * f15 * f15;
        f6 = (float)Math.cbrt((double)f11 * 5.0);
        f6 = f18 * f6 + (f19 *= f11);
        f7 = os_2.f();
        float f22 = fArray2[n7];
        f19 = f7 / f22;
        double d14 = f19;
        f7 = f16;
        float f23 = (float)Math.sqrt(d14) + 1.48f;
        f22 = (float)Math.pow(d14, 0.2);
        f22 = 0.725f / f22;
        double d15 = (double)(fArray[0] * f6 * f17) / d5;
        f11 = f19;
        d7 = 0.42;
        f16 = (float)Math.pow(d15, d7);
        f8 = (float)Math.pow((double)(fArray[n7] * f6 * f7) / d5, d7);
        n8 = 2;
        float f24 = (float)Math.pow((double)(fArray[n8] * f6 * f14) / d5, d7);
        fArray3 = new float[3];
        fArray3[0] = f16;
        n4 = 1;
        fArray3[n4] = f8;
        fArray3[n8] = f24;
        f8 = fArray3[0];
        f24 = 400.0f;
        float f25 = f8 * f24;
        f14 = 27.13f;
        f25 /= (f8 += f14);
        f8 = fArray3[n4];
        f16 = f8 * f24;
        f8 = fArray3[n8];
        f24 *= f8;
        float[] fArray5 = new float[3];
        fArray5[0] = f25;
        fArray5[n4] = f16 /= (f8 += f14);
        fArray5[n8] = f24 /= (f8 += f14);
        f25 = fArray5[0] * 2.0f;
        f7 = fArray5[n4];
        f20 = (fArray5[n8] * 0.05f + (f25 += f7)) * f22;
        f8 = (float)Math.pow(f6, 0.25);
        k = qe3_02 = new qe3_0(f19, f20, f22, f22, f5, (float)object2, fArray, f6, f8, f23);
    }

    public qe3_0(float f5, float f6, float f7, float f8, float f11, float f12, float[] fArray, float f14, float f15, float f16) {
        this.f = f5;
        this.a = f6;
        this.b = f7;
        this.c = f8;
        this.d = f11;
        this.e = f12;
        this.g = fArray;
        this.h = f14;
        this.i = f15;
        this.j = f16;
    }
}

