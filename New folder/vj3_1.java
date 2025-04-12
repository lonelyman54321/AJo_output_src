/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from vJ3
 */
public final class vj3_1
extends py_1 {
    public final float[] a(float[] fArray) {
        int n3;
        int n4 = 0;
        float f5 = fArray[0];
        float f6 = -2.0f;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object < 0) {
            n3 = -1073741824;
            f5 = -2.0f;
        }
        object = 0x40000000;
        float f8 = 2.0f;
        float f11 = f5 - f8;
        Object object2 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (object2 > 0) {
            n3 = 0x40000000;
            f5 = 2.0f;
        }
        fArray[0] = f5;
        n4 = 1;
        f5 = fArray[n4];
        float f12 = f5 - f6;
        object2 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
        if (object2 < 0) {
            n3 = -1073741824;
            f5 = -2.0f;
        }
        if ((object2 = f5 == f8 ? 0 : (f5 > f8 ? 1 : -1)) > 0) {
            n3 = 0x40000000;
            f5 = 2.0f;
        }
        fArray[n4] = f5;
        n4 = 2;
        f5 = fArray[n4];
        float f14 = f5 - f6;
        object2 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
        if (object2 >= 0) {
            f6 = f5;
        }
        n3 = (int)(f6 == f8 ? 0 : (f6 > f8 ? 1 : -1));
        if (n3 <= 0) {
            f8 = f6;
        }
        fArray[n4] = f8;
        return fArray;
    }

    public final float b(int n3) {
        return 2.0f;
    }

    public final float c(int n3) {
        return -2.0f;
    }

    public final long e(float f5, float f6, float f7) {
        int n3 = -1073741824;
        f7 = -2.0f;
        float f8 = f5 - f7;
        Object object = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        if (object < 0) {
            f5 = -2.0f;
        }
        object = 0x40000000;
        float f11 = 2.0f;
        float f12 = f5 - f11;
        Object object2 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
        if (object2 > 0) {
            f5 = 2.0f;
        }
        if ((object2 = f6 == f7 ? 0 : (f6 < f7 ? -1 : 1)) < 0) {
            f6 = -2.0f;
        }
        if ((n3 = (int)(f6 == f11 ? 0 : (f6 > f11 ? 1 : -1))) <= 0) {
            f11 = f6;
        }
        long l2 = Float.floatToRawIntBits(f5);
        long l3 = Float.floatToRawIntBits(f11);
        return (l2 <<= 32) | (l3 &= 0xFFFFFFFFL);
    }

    public final float[] f(float[] fArray) {
        int n3;
        int n4 = 0;
        float f5 = fArray[0];
        float f6 = -2.0f;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object < 0) {
            n3 = -1073741824;
            f5 = -2.0f;
        }
        object = 0x40000000;
        float f8 = 2.0f;
        float f11 = f5 - f8;
        Object object2 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (object2 > 0) {
            n3 = 0x40000000;
            f5 = 2.0f;
        }
        fArray[0] = f5;
        n4 = 1;
        f5 = fArray[n4];
        float f12 = f5 - f6;
        object2 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
        if (object2 < 0) {
            n3 = -1073741824;
            f5 = -2.0f;
        }
        if ((object2 = f5 == f8 ? 0 : (f5 > f8 ? 1 : -1)) > 0) {
            n3 = 0x40000000;
            f5 = 2.0f;
        }
        fArray[n4] = f5;
        n4 = 2;
        f5 = fArray[n4];
        float f14 = f5 - f6;
        object2 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
        if (object2 >= 0) {
            f6 = f5;
        }
        n3 = (int)(f6 == f8 ? 0 : (f6 > f8 ? 1 : -1));
        if (n3 <= 0) {
            f8 = f6;
        }
        fArray[n4] = f8;
        return fArray;
    }

    public final float g(float f5, float f6, float f7) {
        float f8;
        f5 = -2.0f;
        float f11 = f7 - f5;
        Object object = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
        if (object < 0) {
            f7 = -2.0f;
        }
        if ((object = (f8 = f7 - (f5 = 2.0f)) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1)) > 0) {
            f7 = 2.0f;
        }
        return f7;
    }

    public final long h(float f5, float f6, float f7, float f8, py_1 py_12) {
        int n3 = -1073741824;
        float f11 = -2.0f;
        float f12 = f5 - f11;
        Object object = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
        if (object < 0) {
            f5 = -2.0f;
        }
        object = 0x40000000;
        float f14 = 2.0f;
        float f15 = f5 - f14;
        Object object2 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
        if (object2 > 0) {
            f5 = 2.0f;
        }
        if ((object2 = f6 == f11 ? 0 : (f6 < f11 ? -1 : 1)) < 0) {
            f6 = -2.0f;
        }
        if ((object2 = f6 == f14 ? 0 : (f6 > f14 ? 1 : -1)) > 0) {
            f6 = 2.0f;
        }
        if ((object2 = f7 == f11 ? 0 : (f7 < f11 ? -1 : 1)) < 0) {
            f7 = -2.0f;
        }
        if ((n3 = (int)(f7 == f14 ? 0 : (f7 > f14 ? 1 : -1))) <= 0) {
            f14 = f7;
        }
        return zx_0.b(f5, f6, f14, f8, py_12);
    }
}

