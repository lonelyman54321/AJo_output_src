/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ep1
 */
public final class ep1_1
extends py_1 {
    public final float[] a(float[] fArray) {
        int n3;
        double d2;
        int n4 = 0;
        float f5 = 0.0f;
        float f6 = fArray[0];
        float[] fArray2 = ed1_0.e;
        float f7 = fArray2[0];
        f6 /= f7;
        int n7 = 1;
        f7 = Float.MIN_VALUE;
        float f8 = fArray[n7];
        float f11 = fArray2[n7];
        f8 /= f11;
        int n8 = 2;
        f11 = 2.8E-45f;
        float f12 = fArray[n8];
        float f14 = fArray2[n8];
        f12 /= f14;
        int n10 = 1041055179;
        f14 = 0.13793103f;
        int n14 = 1090072424;
        float f15 = 7.787037f;
        int n15 = 1007753895;
        float f16 = 0.008856452f;
        float f17 = f6 - f16;
        Object object = f17 == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1);
        if (object > 0) {
            d2 = Math.cbrt(f6);
            f6 = (float)d2;
        } else {
            f6 = f6 * f15 + f14;
        }
        object = f8 == f16 ? 0 : (f8 > f16 ? 1 : -1);
        if (object > 0) {
            d2 = Math.cbrt(f8);
            f8 = (float)d2;
        } else {
            f8 = f8 * f15 + f14;
        }
        n15 = (int)(f12 == f16 ? 0 : (f12 > f16 ? 1 : -1));
        if (n15 > 0) {
            double d5 = Math.cbrt(f12);
            f14 = (float)d5;
        } else {
            f14 += (f12 *= f15);
        }
        int n16 = 1122500608;
        f12 = 116.0f * f8 - 16.0f;
        f6 = (f6 - f8) * 500.0f;
        f15 = 200.0f;
        f8 = (f8 - f14) * f15;
        n10 = 0;
        f14 = 0.0f;
        fArray2 = null;
        float f18 = f12 - 0.0f;
        n14 = (int)(f18 == 0.0f ? 0 : (f18 < 0.0f ? -1 : 1));
        if (n14 < 0) {
            n16 = 0;
            f12 = 0.0f;
        }
        n10 = 1120403456;
        f14 = 100.0f;
        float f19 = f12 - f14;
        n14 = (int)(f19 == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1));
        if (n14 > 0) {
            n16 = 1120403456;
            f12 = 100.0f;
        }
        fArray[0] = f12;
        n4 = -1023410176;
        f5 = -128.0f;
        float f20 = f6 - f5;
        n10 = (int)(f20 == 0.0f ? 0 : (f20 < 0.0f ? -1 : 1));
        if (n10 < 0) {
            n3 = -1023410176;
            f6 = -128.0f;
        }
        n10 = 0x43000000;
        f14 = 128.0f;
        float f22 = f6 - f14;
        n16 = (int)(f22 == 0.0f ? 0 : (f22 > 0.0f ? 1 : -1));
        if (n16 > 0) {
            n3 = 0x43000000;
            f6 = 128.0f;
        }
        fArray[n7] = f6;
        n3 = (int)(f8 == f5 ? 0 : (f8 < f5 ? -1 : 1));
        if (n3 < 0) {
            f8 = -128.0f;
        }
        if ((n4 = (int)(f8 == f14 ? 0 : (f8 > f14 ? 1 : -1))) <= 0) {
            f14 = f8;
        }
        fArray[n8] = f14;
        return fArray;
    }

    public final float b(int n3) {
        float f5;
        if (n3 == 0) {
            n3 = 1120403456;
            f5 = 100.0f;
        } else {
            n3 = 0x43000000;
            f5 = 128.0f;
        }
        return f5;
    }

    public final float c(int n3) {
        float f5;
        if (n3 == 0) {
            n3 = 0;
            f5 = 0.0f;
        } else {
            n3 = -1023410176;
            f5 = -128.0f;
        }
        return f5;
    }

    public final long e(float f5, float f6, float f7) {
        float f8;
        int n3;
        float f11;
        float f12;
        float[] fArray;
        f7 = 0.0f;
        float f14 = f5 - 0.0f;
        Object object = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
        if (object < 0) {
            f5 = 0.0f;
            fArray = null;
        }
        if ((object = (f12 = f5 - (f7 = 100.0f)) == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1)) > 0) {
            f5 = 100.0f;
        }
        if ((object = (f11 = f6 - (f7 = -128.0f)) == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1)) < 0) {
            n3 = -1023410176;
            f6 = -128.0f;
        }
        if ((object = (f8 = f6 - (f7 = 128.0f)) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1)) > 0) {
            n3 = 0x43000000;
            f6 = 128.0f;
        }
        f5 = (f5 + 16.0f) / 116.0f;
        f6 = f6 * 0.002f + f5;
        f7 = 0.13793103f;
        object = 1040416807;
        float f15 = 0.12841855f;
        float f16 = 0.20689656f;
        float f17 = f6 - f16;
        Object object2 = f17 == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1);
        float f18 = object2 > 0 ? f6 * f6 * f6 : (f6 -= f7) * f15;
        n3 = (int)(f5 == f16 ? 0 : (f5 > f16 ? 1 : -1));
        f6 = n3 > 0 ? f5 * f5 * f5 : (f5 -= f7) * f15;
        fArray = ed1_0.e;
        f7 = fArray[0];
        f5 = fArray[1];
        long l2 = Float.floatToRawIntBits(f18 *= f7);
        long l3 = Float.floatToRawIntBits(f6 *= f5);
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
        n4 = 1120403456;
        f7 = 100.0f;
        float f11 = f6 - f7;
        object = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (object > 0) {
            n3 = 1120403456;
            f6 = 100.0f;
        }
        fArray[0] = f6;
        n4 = 1;
        f7 = Float.MIN_VALUE;
        float f12 = fArray[n4];
        float f14 = -128.0f;
        float f15 = f12 - f14;
        Object object2 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
        if (object2 < 0) {
            object = -1023410176;
            f12 = -128.0f;
        }
        object2 = 0x43000000;
        float f16 = 128.0f;
        float f17 = f12 - f16;
        Object object3 = f17 == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1);
        if (object3 > 0) {
            object = 0x43000000;
            f12 = 128.0f;
        }
        fArray[n4] = f12;
        object3 = 2;
        float f18 = fArray[object3];
        float f19 = f18 - f14;
        Object object4 = f19 == 0.0f ? 0 : (f19 < 0.0f ? -1 : 1);
        if (object4 >= 0) {
            f14 = f18;
        }
        float f20 = f14 == f16 ? 0 : (f14 > f16 ? 1 : -1);
        if (f20 <= 0) {
            f16 = f14;
        }
        fArray[object3] = f16;
        f6 = (f6 + 16.0f) / 116.0f;
        f12 = f12 * 0.002f + f6;
        f14 = f6 - (f16 *= 0.005f);
        object2 = 1041055179;
        f16 = 0.13793103f;
        f20 = 1040416807;
        f18 = 0.12841855f;
        object4 = 1045683377;
        float f22 = 0.20689656f;
        float f23 = f12 == f22 ? 0 : (f12 > f22 ? 1 : -1);
        float f24 = f23 > 0 ? f12 * f12 * f12 : (f12 -= f16) * f18;
        object = f6 == f22 ? 0 : (f6 > f22 ? 1 : -1);
        f12 = object > 0 ? f6 * f6 * f6 : (f6 -= f16) * f18;
        n3 = (int)(f14 == f22 ? 0 : (f14 > f22 ? 1 : -1));
        f6 = n3 > 0 ? f14 * f14 * f14 : (f14 -= f16) * f18;
        float[] fArray2 = ed1_0.e;
        f16 = fArray2[0];
        fArray[0] = f24 *= f16;
        f5 = fArray2[n4];
        fArray[n4] = f12 *= f5;
        f5 = fArray2[object3];
        fArray[object3] = f6 *= f5;
        return fArray;
    }

    public final float g(float f5, float f6, float f7) {
        int n3 = 0;
        f6 = 0.0f;
        float f8 = f5 - 0.0f;
        Object object = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        if (object < 0) {
            f5 = 0.0f;
        }
        n3 = 1120403456;
        f6 = 100.0f;
        float f11 = f5 - f6;
        object = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (object > 0) {
            f5 = 100.0f;
        }
        n3 = -1023410176;
        f6 = -128.0f;
        float f12 = f7 - f6;
        object = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
        if (object < 0) {
            f7 = -128.0f;
        }
        n3 = 0x43000000;
        f6 = 128.0f;
        float f14 = f7 - f6;
        object = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
        if (object > 0) {
            f7 = 128.0f;
        }
        f5 = (f5 + 16.0f) / 116.0f;
        f6 = 0.20689656f;
        float f15 = (f5 -= (f7 *= 0.005f)) - f6;
        n3 = (int)(f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1));
        if (n3 > 0) {
            f6 = f5 * f5 * f5;
        } else {
            n3 = 1040416807;
            f6 = 0.12841855f * (f5 -= 0.13793103f);
        }
        f5 = ed1_0.e[2];
        return f6 * f5;
    }

    public final long h(float f5, float f6, float f7, float f8, py_1 py_12) {
        double d2;
        float[] fArray = ed1_0.e;
        float f11 = fArray[0];
        f5 /= f11;
        f11 = fArray[1];
        f6 /= f11;
        float f12 = fArray[2];
        f7 /= f12;
        f12 = 0.13793103f;
        int n3 = 1090072424;
        f11 = 7.787037f;
        int n4 = 1007753895;
        float f14 = 0.008856452f;
        float f15 = f5 - f14;
        Object object = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
        if (object > 0) {
            d2 = Math.cbrt(f5);
            f5 = (float)d2;
        } else {
            f5 = f5 * f11 + f12;
        }
        object = f6 == f14 ? 0 : (f6 > f14 ? 1 : -1);
        if (object > 0) {
            d2 = Math.cbrt(f6);
            f6 = (float)d2;
        } else {
            f6 = f6 * f11 + f12;
        }
        n4 = (int)(f7 == f14 ? 0 : (f7 > f14 ? 1 : -1));
        if (n4 > 0) {
            double d5 = Math.cbrt(f7);
            f7 = (float)d5;
        } else {
            f7 = f7 * f11 + f12;
        }
        f12 = 116.0f * f6 - 16.0f;
        f5 = (f5 - f6) * 500.0f;
        f11 = 200.0f;
        f6 = (f6 - f7) * f11;
        int n7 = 0;
        f7 = 0.0f;
        float f16 = f12 - 0.0f;
        n3 = (int)(f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1));
        if (n3 < 0) {
            f12 = 0.0f;
            fArray = null;
        }
        n7 = 1120403456;
        f7 = 100.0f;
        float f17 = f12 - f7;
        n3 = (int)(f17 == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1));
        if (n3 > 0) {
            f12 = 100.0f;
        }
        n7 = -1023410176;
        f7 = -128.0f;
        float f18 = f5 - f7;
        n3 = (int)(f18 == 0.0f ? 0 : (f18 < 0.0f ? -1 : 1));
        if (n3 < 0) {
            f5 = -128.0f;
        }
        n3 = 0x43000000;
        f11 = 128.0f;
        float f19 = f5 - f11;
        n4 = (int)(f19 == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1));
        if (n4 > 0) {
            f5 = 128.0f;
        }
        if ((n4 = (int)(f6 == f7 ? 0 : (f6 < f7 ? -1 : 1))) < 0) {
            f6 = -128.0f;
        }
        if ((n7 = (int)(f6 == f11 ? 0 : (f6 > f11 ? 1 : -1))) <= 0) {
            f11 = f6;
        }
        return zx_0.b(f12, f5, f11, f8, py_12);
    }
}

