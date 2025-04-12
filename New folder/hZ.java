/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 */
import android.graphics.Color;

public final class hZ {
    public static final ThreadLocal a;

    static {
        ThreadLocal threadLocal;
        a = threadLocal = new ThreadLocal();
    }

    public static void a(float[] fArray, int n3, int n4, int n7) {
        float f5;
        float f6 = n3;
        int n8 = 1132396544;
        float f7 = 255.0f;
        f6 /= f7;
        float f8 = (float)n4 / f7;
        float f11 = (float)n7 / f7;
        f7 = Math.max(f8, f11);
        f7 = Math.max(f6, f7);
        float f12 = Math.min(f8, f11);
        f12 = Math.min(f6, f12);
        float f14 = f7 - f12;
        float f15 = f7 + f12;
        float f16 = 2.0f;
        f15 /= f16;
        float f17 = 1.0f;
        float f18 = 0.0f;
        Object object = f7 == f12 ? 0 : (f7 > f12 ? 1 : -1);
        if (object == false) {
            n4 = 0;
            f8 = 0.0f;
            f14 = 0.0f;
        } else {
            object = f7 == f6 ? 0 : (f7 > f6 ? 1 : -1);
            if (object == false) {
                f8 = (f8 - f11) / f14;
                n3 = 0x40C00000;
                f6 = 6.0f;
                f8 %= f6;
            } else {
                n8 = (int)(f7 == f8 ? 0 : (f7 > f8 ? 1 : -1));
                if (n8 == 0) {
                    f11 = (f11 - f6) / f14;
                    f8 = f11 + f16;
                } else {
                    f6 = (f6 - f8) / f14;
                    n4 = 0x40800000;
                    f8 = 4.0f + f6;
                }
            }
            f16 = f16 * f15 - f17;
            f6 = Math.abs(f16);
            f6 = f17 - f6;
            f14 /= f6;
        }
        f8 *= 60.0f;
        n3 = 1135869952;
        f6 = 360.0f;
        float f19 = (f8 %= f6) - 0.0f;
        n7 = (int)(f19 == 0.0f ? 0 : (f19 < 0.0f ? -1 : 1));
        if (n7 < 0) {
            f8 += f6;
        }
        if ((n7 = (int)((f5 = f8 - 0.0f) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1))) < 0) {
            n3 = 0;
            f6 = 0.0f;
        } else {
            f6 = Math.min(f8, f6);
        }
        n4 = 0;
        f8 = 0.0f;
        fArray[0] = f6;
        float f20 = f14 - 0.0f;
        n3 = (int)(f20 == 0.0f ? 0 : (f20 < 0.0f ? -1 : 1));
        if (n3 < 0) {
            n3 = 0;
            f6 = 0.0f;
        } else {
            f6 = Math.min(f14, f17);
        }
        n4 = 1;
        f8 = Float.MIN_VALUE;
        fArray[n4] = f6;
        float f22 = f15 - 0.0f;
        n3 = (int)(f22 == 0.0f ? 0 : (f22 < 0.0f ? -1 : 1));
        if (n3 >= 0) {
            f18 = Math.min(f15, f17);
        }
        fArray[2] = f18;
    }

    public static int b(double d2, double d5, double d7) {
        double d9 = 3.2406 * d2;
        double d12 = -1.5372 * d5 + d9;
        long l2 = -4620718437840042171L;
        d9 = -0.4986 * d7 + d12;
        d12 = 100.0;
        d9 /= d12;
        double d13 = -0.9689 * d2;
        double d14 = 1.8758 * d5 + d13;
        long l3 = 4586141601340942451L;
        d13 = (0.0415 * d7 + d14) / d12;
        d14 = 0.0557 * d2;
        double d15 = -0.204 * d5 + d14;
        d14 = (1.057 * d7 + d15) / d12;
        long l4 = 4623462931452961751L;
        d12 = 12.92;
        d15 = 0.055;
        double d16 = 0.4166666666666667;
        double d17 = 1.055;
        double d18 = 0.0031308;
        double d19 = d9 - d18;
        Object object = d19 == 0.0 ? 0 : (d19 > 0.0 ? 1 : -1);
        d9 = object > 0 ? Math.pow(d9, d16) * d17 - d15 : (d9 *= d12);
        object = d13 == d18 ? 0 : (d13 > d18 ? 1 : -1);
        d13 = object > 0 ? Math.pow(d13, d16) * d17 - d15 : (d13 *= d12);
        object = d14 == d18 ? 0 : (d14 > d18 ? 1 : -1);
        d12 = object > 0 ? Math.pow(d14, d16) * d17 - d15 : (d12 *= d14);
        d14 = 255.0;
        l2 = Math.round(d9 *= d14);
        int n3 = (int)l2;
        int n4 = 255;
        int n7 = 0;
        n3 = n3 < 0 ? 0 : Math.min(n3, n4);
        l3 = Math.round(d13 *= d14);
        int n8 = (int)l3;
        int n10 = n8 < 0 ? 0 : Math.min(n8, n4);
        l4 = Math.round(d12 *= d14);
        int n14 = (int)l4;
        if (n14 >= 0) {
            n7 = Math.min(n14, n4);
        }
        return Color.rgb((int)n3, (int)n10, (int)n7);
    }

    public static int c(int n3, int n4, float f5) {
        float f6 = 1.0f - f5;
        float f7 = (float)Color.alpha((int)n3) * f6;
        float f8 = (float)Color.alpha((int)n4) * f5 + f7;
        f7 = (float)Color.red((int)n3) * f6;
        float f11 = (float)Color.red((int)n4) * f5 + f7;
        f7 = (float)Color.green((int)n3) * f6;
        float f12 = (float)Color.green((int)n4) * f5 + f7;
        float f14 = (float)Color.blue((int)n3) * f6;
        float f15 = (float)Color.blue((int)n4) * f5 + f14;
        n3 = (int)f8;
        int n7 = (int)f11;
        int n8 = (int)f12;
        n4 = (int)f15;
        return Color.argb((int)n3, (int)n7, (int)n8, (int)n4);
    }

    public static double d(int n3, int n4) {
        int n7;
        int n8 = Color.alpha((int)n4);
        if (n8 == (n7 = 255)) {
            n8 = Color.alpha((int)n3);
            if (n8 < n7) {
                n3 = hZ.g(n3, n4);
            }
            double d2 = hZ.e(n3);
            double d5 = 0.05;
            d2 += d5;
            double d7 = hZ.e(n4) + d5;
            d5 = Math.max(d2, d7);
            d7 = Math.min(d2, d7);
            return d5 / d7;
        }
        StringBuilder stringBuilder = new StringBuilder("background can not be translucent: #");
        String string2 = Integer.toHexString(n4);
        stringBuilder.append(string2);
        string2 = stringBuilder.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static double e(int n3) {
        Object object = a;
        double[] dArray = (double[])((ThreadLocal)object).get();
        int n4 = 3;
        if (dArray == null) {
            dArray = new double[n4];
            ((ThreadLocal)object).set(dArray);
        }
        int n7 = Color.red((int)n3);
        int n8 = Color.green((int)n3);
        int n10 = Color.blue((int)n3);
        int n14 = dArray.length;
        if (n14 == n4) {
            double d2 = n7;
            double d5 = 255.0;
            double d7 = 2.4;
            double d9 = 1.055;
            double d12 = 0.055;
            double d13 = 12.92;
            double d14 = 0.04045;
            double d15 = (d2 /= d5) - d14;
            n7 = (int)(d15 == 0.0 ? 0 : (d15 < 0.0 ? -1 : 1));
            d2 = n7 < 0 ? (d2 /= d13) : Math.pow((d2 + d12) / d9, d7);
            double d16 = (double)n8 / d5;
            n7 = (int)(d16 == d14 ? 0 : (d16 < d14 ? -1 : 1));
            d16 = n7 < 0 ? (d16 /= d13) : Math.pow((d16 + d12) / d9, d7);
            d7 = (double)n10 / d5;
            n7 = (int)(d7 == d14 ? 0 : (d7 < d14 ? -1 : 1));
            if (n7 < 0) {
                d7 /= d13;
            } else {
                d7 = (d7 + d12) / d9;
                d5 = 2.4;
                d7 = Math.pow(d7, d5);
            }
            d5 = 0.4124 * d2;
            d9 = 0.3576 * d16 + d5;
            d5 = 0.1805 * d7 + d9;
            d9 = 100.0;
            dArray[0] = d5 *= d9;
            d5 = 0.2126 * d2;
            d12 = 0.7152 * d16 + d5;
            dArray[1] = d5 = (0.0722 * d7 + d12) * d9;
            d16 = d16 * 0.1192 + (d2 *= 0.0193);
            dArray[2] = d7 = (d7 * 0.9505 + d16) * d9;
            return d5 / d9;
        }
        object = new IllegalArgumentException("outXyz must have a length of 3.");
        throw object;
    }

    public static int f(float f5, int n3, int n4) {
        int n7;
        int n8 = Color.alpha((int)n4);
        if (n8 == (n7 = 255)) {
            int n10;
            int n14;
            double d2;
            n8 = hZ.i(n3, n7);
            double d5 = hZ.d(n8, n4);
            double d7 = d5 - (d2 = (double)f5);
            Object object = d7 == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1);
            if (object < 0) {
                return -1;
            }
            f5 = 0.0f;
            Object var10_8 = null;
            n8 = 0;
            for (object = (Object)false; object <= (n14 = 10) && (n14 = n7 - n8) > (n10 = 1); ++object) {
                n14 = (n8 + n7) / 2;
                double d9 = hZ.d(hZ.i(n3, n14), n4);
                double d12 = d9 - d2;
                n10 = (int)(d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1));
                if (n10 < 0) {
                    n8 = n14;
                    continue;
                }
                n7 = n14;
            }
            return n7;
        }
        CharSequence charSequence = new StringBuilder("background can not be translucent: #");
        String string2 = Integer.toHexString(n4);
        charSequence.append(string2);
        charSequence = charSequence.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)charSequence);
        throw illegalArgumentException;
    }

    public static int g(int n3, int n4) {
        int n7 = Color.alpha((int)n4);
        int n8 = Color.alpha((int)n3);
        int n10 = 255 - n7;
        int n14 = (255 - n8) * n10 / 255;
        n10 = 255 - n14;
        n14 = Color.red((int)n3);
        int n15 = Color.red((int)n4);
        n14 = hZ.h(n14, n8, n15, n7, n10);
        n15 = Color.green((int)n3);
        int n16 = Color.green((int)n4);
        n15 = hZ.h(n15, n8, n16, n7, n10);
        n3 = Color.blue((int)n3);
        n4 = Color.blue((int)n4);
        n3 = hZ.h(n3, n8, n4, n7, n10);
        return Color.argb((int)n10, (int)n14, (int)n15, (int)n3);
    }

    public static int h(int n3, int n4, int n7, int n8, int n10) {
        if (n10 == 0) {
            return 0;
        }
        n3 = n3 * 255 * n4;
        n4 = (255 - n4) * (n7 *= n8) + n3;
        return n4 / (n10 *= 255);
    }

    public static int i(int n3, int n4) {
        int n7;
        if (n4 >= 0 && n4 <= (n7 = 255)) {
            return (n3 &= 0xFFFFFF) | (n4 <<= 24);
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("alpha must be between 0 and 255.");
        throw illegalArgumentException;
    }
}

