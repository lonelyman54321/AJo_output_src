/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Q72
 */
public final class q72_0
extends py_1 {
    public static final float[] d;
    public static final float[] e;
    public static final float[] f;
    public static final float[] g;

    static {
        float[] fArray;
        float[] fArray2;
        float[] fArray3;
        float[] fArray4;
        int n3 = 3;
        int n4 = 9;
        float[] fArray5 = fArray4 = new float[n4];
        float[] fArray6 = fArray4;
        fArray5[0] = 0.818933f;
        fArray6[1] = 0.032984544f;
        fArray5[2] = 0.0482003f;
        fArray6[3] = 0.36186674f;
        fArray5[4] = 0.9293119f;
        fArray6[5] = 0.26436627f;
        fArray5[6] = -0.12885971f;
        fArray6[7] = 0.03614564f;
        fArray6[8] = 0.6338517f;
        i4$a i4$a = i4.b;
        float[] fArray7 = fArray3 = new float[n3];
        fArray3[0] = 0.964212f;
        fArray7[1] = 1.0f;
        fArray7[2] = 0.8251883f;
        float[] fArray8 = fArray2 = new float[n3];
        fArray2[0] = 0.95042855f;
        fArray8[1] = 1.0f;
        fArray8[2] = 1.0889004f;
        fArray2 = ry_0.b(i4$a.a, fArray3, fArray2);
        fArray2 = ry_0.f(fArray4, fArray2);
        d = fArray2;
        float[] fArray9 = fArray = new float[n4];
        float[] fArray10 = fArray;
        fArray9[0] = 0.21045426f;
        fArray10[1] = 1.9779985f;
        fArray9[2] = 0.025904037f;
        fArray10[3] = 0.7936178f;
        fArray9[4] = -2.4285922f;
        fArray10[5] = 0.78277177f;
        fArray9[6] = -0.004072047f;
        fArray10[7] = 0.4505937f;
        fArray10[8] = -0.80867577f;
        e = fArray;
        f = ry_0.e(fArray2);
        g = ry_0.e(fArray);
    }

    public final float[] a(float[] fArray) {
        float f5;
        ry_0.h(d, fArray);
        fArray[0] = f5 = LK1.b(fArray[0]);
        int n3 = 1;
        fArray[n3] = f5 = LK1.b(fArray[n3]);
        n3 = 2;
        fArray[n3] = f5 = LK1.b(fArray[n3]);
        ry_0.h(e, fArray);
        return fArray;
    }

    public final float b(int n3) {
        float f5;
        if (n3 == 0) {
            n3 = 1065353216;
            f5 = 1.0f;
        } else {
            n3 = 0x3F000000;
            f5 = 0.5f;
        }
        return f5;
    }

    public final float c(int n3) {
        float f5;
        if (n3 == 0) {
            n3 = 0;
            f5 = 0.0f;
        } else {
            n3 = -1090519040;
            f5 = -0.5f;
        }
        return f5;
    }

    public final long e(float f5, float f6, float f7) {
        int n3 = 0;
        float f8 = 0.0f;
        float f11 = f5 - 0.0f;
        Object object = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
        if (object < 0) {
            f5 = 0.0f;
        }
        n3 = 1065353216;
        f8 = 1.0f;
        float f12 = f5 - f8;
        object = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
        if (object > 0) {
            f5 = 1.0f;
        }
        n3 = -1090519040;
        f8 = -0.5f;
        float f14 = f6 - f8;
        object = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
        if (object < 0) {
            f6 = -0.5f;
        }
        object = 0x3F000000;
        float f15 = 0.5f;
        float f16 = f6 - f15;
        Object object2 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
        if (object2 > 0) {
            f6 = 0.5f;
        }
        if ((object2 = f7 == f8 ? 0 : (f7 < f8 ? -1 : 1)) < 0) {
            f7 = -0.5f;
        }
        if ((n3 = (int)(f7 == f15 ? 0 : (f7 > f15 ? 1 : -1))) <= 0) {
            f15 = f7;
        }
        float[] fArray = g;
        float f17 = fArray[0] * f5;
        int n4 = 3;
        float f18 = fArray[n4] * f6 + f17;
        object2 = 6;
        float f19 = fArray[object2] * f15 + f18;
        int n7 = 1;
        float f20 = fArray[n7] * f5;
        int n8 = 4;
        float f22 = fArray[n8] * f6 + f20;
        int n10 = 7;
        float f23 = fArray[n10] * f15 + f22;
        f22 = fArray[2] * f5;
        f5 = fArray[5] * f6 + f22;
        f6 = fArray[8] * f15 + f5;
        f5 = f19 * f19 * f19;
        f7 = f23 * f23 * f23;
        f15 = f6 * f6 * f6;
        float[] fArray2 = f;
        f8 = fArray2[0] * f5;
        float f24 = fArray2[n4] * f7 + f8;
        f8 = fArray2[object2] * f15 + f24;
        f17 = fArray2[n7] * f5;
        f5 = fArray2[n8] * f7 + f17;
        f6 = fArray2[n10] * f15 + f5;
        long l2 = Float.floatToRawIntBits(f8);
        long l3 = Float.floatToRawIntBits(f6);
        return l3 & 0xFFFFFFFFL | (l2 <<= 32);
    }

    public final float[] f(float[] fArray) {
        int n3;
        float f5 = 0.0f;
        float f6 = fArray[0];
        int n4 = 0;
        float f7 = 0.0f;
        float f8 = f6 - 0.0f;
        Object object = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        if (object < 0) {
            n3 = 0;
            f6 = 0.0f;
        }
        n4 = 1065353216;
        f7 = 1.0f;
        float f11 = f6 - f7;
        object = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (object > 0) {
            n3 = 1065353216;
            f6 = 1.0f;
        }
        fArray[0] = f6;
        n3 = 1;
        f6 = Float.MIN_VALUE;
        f7 = fArray[n3];
        object = -1090519040;
        float f12 = -0.5f;
        float f14 = f7 - f12;
        Object object2 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
        if (object2 < 0) {
            n4 = -1090519040;
            f7 = -0.5f;
        }
        object2 = 0x3F000000;
        float f15 = 0.5f;
        float f16 = f7 - f15;
        Object object3 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
        if (object3 > 0) {
            n4 = 0x3F000000;
            f7 = 0.5f;
        }
        fArray[n3] = f7;
        n4 = 2;
        f7 = 2.8E-45f;
        float f17 = fArray[n4];
        float f18 = f17 - f12;
        Object object4 = f18 == 0.0f ? 0 : (f18 < 0.0f ? -1 : 1);
        if (object4 >= 0) {
            f12 = f17;
        }
        object3 = f12 == f15 ? 0 : (f12 > f15 ? 1 : -1);
        if (object3 <= 0) {
            f15 = f12;
        }
        fArray[n4] = f15;
        ry_0.h(g, fArray);
        f12 = fArray[0];
        fArray[0] = f15 = f12 * f12 * f12;
        f5 = fArray[n3];
        fArray[n3] = f12 = f5 * f5 * f5;
        f5 = fArray[n4];
        fArray[n4] = f6 = f5 * f5 * f5;
        ry_0.h(f, fArray);
        return fArray;
    }

    public final float g(float f5, float f6, float f7) {
        int n3;
        int n4;
        int n7 = 0;
        float f8 = 0.0f;
        float f11 = f5 - 0.0f;
        Object object = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
        if (object < 0) {
            n4 = 0;
            f5 = 0.0f;
        }
        n7 = 1065353216;
        f8 = 1.0f;
        float f12 = f5 - f8;
        object = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
        if (object > 0) {
            n4 = 1065353216;
            f5 = 1.0f;
        }
        n7 = -1090519040;
        f8 = -0.5f;
        float f14 = f6 - f8;
        object = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
        if (object < 0) {
            n3 = -1090519040;
            f6 = -0.5f;
        }
        object = 0x3F000000;
        float f15 = 0.5f;
        float f16 = f6 - f15;
        Object object2 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
        if (object2 > 0) {
            n3 = 0x3F000000;
            f6 = 0.5f;
        }
        if ((object2 = f7 == f8 ? 0 : (f7 < f8 ? -1 : 1)) < 0) {
            f7 = -0.5f;
        }
        if ((n7 = (int)(f7 == f15 ? 0 : (f7 > f15 ? 1 : -1))) <= 0) {
            f15 = f7;
        }
        float[] fArray = g;
        f8 = fArray[0] * f5;
        float f17 = fArray[3] * f6 + f8;
        f8 = fArray[6] * f15 + f17;
        f17 = fArray[1] * f5;
        float f18 = fArray[4] * f6 + f17;
        f17 = fArray[7] * f15 + f18;
        int n8 = 2;
        float f19 = fArray[n8] * f5;
        n4 = 5;
        float f20 = fArray[n4] * f6 + f19;
        n3 = 8;
        f7 = fArray[n3] * f15 + f20;
        f15 = f8 * f8 * f8;
        f8 = f17 * f17 * f17;
        f17 = f7 * f7 * f7;
        fArray = f;
        f18 = fArray[n8] * f15;
        f5 = fArray[n4] * f8 + f18;
        return fArray[n3] * f17 + f5;
    }

    public final long h(float f5, float f6, float f7, float f8, py_1 py_12) {
        float[] fArray = d;
        float f11 = fArray[0] * f5;
        int n3 = 3;
        float f12 = fArray[n3] * f6 + f11;
        int n4 = 6;
        float f14 = fArray[n4] * f7 + f12;
        int n7 = 1;
        float f15 = fArray[n7] * f5;
        int n8 = 4;
        float f16 = fArray[n8] * f6 + f15;
        int n10 = 7;
        float f17 = fArray[n10] * f7 + f16;
        int n14 = 2;
        float f18 = fArray[n14] * f5;
        int n15 = 5;
        float f19 = fArray[n15] * f6 + f18;
        int n16 = 8;
        float f20 = fArray[n16] * f7 + f19;
        f14 = LK1.b(f14);
        f17 = LK1.b(f17);
        f20 = LK1.b(f20);
        float[] fArray2 = e;
        float f22 = fArray2[0] * f14;
        float f23 = fArray2[n3] * f17 + f22;
        f22 = fArray2[n4] * f20 + f23;
        f11 = fArray2[n7] * f14;
        f23 = fArray2[n8] * f17 + f11;
        f11 = fArray2[n10] * f20 + f23;
        f23 = fArray2[n14] * f14;
        f12 = fArray2[n15] * f17 + f23;
        f23 = fArray2[n16] * f20 + f12;
        f20 = f8;
        return zx_0.b(f22, f11, f23, f8, py_12);
    }
}

