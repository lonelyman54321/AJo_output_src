/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class zp {
    public static final zp$j a;
    public static final zp$d b;
    public static final zp$k c;
    public static final zp$c d;
    public static final zp$h e;
    public static final zp$g f;
    public static final zp$f g;

    static {
        Object object = new Object();
        a = object;
        object = new Object();
        b = object;
        c = object = new Object();
        d = object = new zp$c();
        e = object = new zp$h();
        f = object = new zp$g();
        g = object = new zp$f();
    }

    public static void a(int n3, int[] nArray, int[] nArray2, boolean n4) {
        int n7;
        int n8;
        int n10 = nArray.length;
        int n14 = 0;
        int n15 = 0;
        for (n8 = 0; n8 < n10; ++n8) {
            n7 = nArray[n8];
            n15 += n7;
        }
        float f5 = n3 -= n15;
        n10 = 2;
        float f6 = n10;
        f5 /= f6;
        if (n4 == 0) {
            n4 = nArray.length;
            n10 = 0;
            f6 = 0.0f;
            while (n14 < n4) {
                n8 = nArray[n14];
                n15 = n10 + 1;
                nArray2[n10] = n7 = Math.round(f5);
                f6 = n8;
                f5 += f6;
                ++n14;
                n10 = n15;
            }
        } else {
            n4 = nArray.length + -1;
            while (true) {
                n10 = -1;
                f6 = 0.0f / 0.0f;
                if (n10 >= n4) break;
                n10 = nArray[n4];
                nArray2[n4] = n14 = Math.round(f5);
                f6 = n10;
                f5 += f6;
                n4 += -1;
            }
        }
    }

    public static void b(int[] nArray, int[] nArray2, boolean n3) {
        int n4;
        if (n3 == 0) {
            n3 = nArray.length;
            int n7 = 0;
            int n8 = 0;
            for (n4 = 0; n4 < n3; ++n4) {
                int n10 = nArray[n4];
                int n14 = n7 + 1;
                nArray2[n7] = n8;
                n8 += n10;
                n7 = n14;
            }
        } else {
            int n15;
            for (n3 = nArray.length + -1; (n15 = -1) < n3; n3 += -1) {
                n15 = nArray[n3];
                nArray2[n3] = n4;
                n4 += n15;
            }
        }
    }

    public static void c(int n3, int[] nArray, int[] nArray2, boolean n4) {
        int n7;
        int n8 = nArray.length;
        int n10 = 0;
        int n14 = 0;
        for (n7 = 0; n7 < n8; ++n7) {
            int n15 = nArray[n7];
            n14 += n15;
        }
        n3 -= n14;
        if (n4 == 0) {
            n4 = nArray.length;
            n8 = 0;
            while (n10 < n4) {
                n7 = nArray[n10];
                n14 = n8 + 1;
                nArray2[n8] = n3;
                n3 += n7;
                ++n10;
                n8 = n14;
            }
        } else {
            for (n4 = nArray.length + -1; (n8 = -1) < n4; n4 += -1) {
                n8 = nArray[n4];
                nArray2[n4] = n3;
                n3 += n8;
            }
        }
    }

    public static void d(int n3, int[] nArray, int[] nArray2, boolean n4) {
        float f5;
        float f6;
        int n7;
        int n8;
        int n10 = nArray.length;
        int n14 = 0;
        float f7 = 0.0f;
        float f8 = 0.0f;
        int n15 = 0;
        for (n8 = 0; n8 < n10; ++n8) {
            n7 = nArray[n8];
            n15 += n7;
        }
        n10 = nArray.length;
        n8 = 1;
        f8 = Float.MIN_VALUE;
        if (n10 == 0) {
            n10 = 1;
            f6 = Float.MIN_VALUE;
        } else {
            n10 = 0;
            f6 = 0.0f;
        }
        if ((n10 ^= n8) != 0) {
            f5 = n3 -= n15;
            n10 = nArray.length;
            f6 = n10;
            f5 /= f6;
        } else {
            n3 = 0;
            f5 = 0.0f;
        }
        n10 = 2;
        f6 = n10;
        f6 = f5 / f6;
        if (n4 == 0) {
            n4 = nArray.length;
            n8 = 0;
            f8 = 0.0f;
            while (n14 < n4) {
                int n16;
                n15 = nArray[n14];
                n7 = n8 + 1;
                nArray2[n8] = n16 = Math.round(f6);
                f8 = (float)n15 + f5;
                f6 += f8;
                ++n14;
                n8 = n7;
            }
        } else {
            n4 = nArray.length - n8;
            while (true) {
                n14 = -1;
                f7 = 0.0f / 0.0f;
                if (n14 >= n4) break;
                n14 = nArray[n4];
                nArray2[n4] = n8 = Math.round(f6);
                f7 = (float)n14 + f5;
                f6 += f7;
                n4 += -1;
            }
        }
    }

    public static void e(int n3, int[] nArray, int[] nArray2, boolean n4) {
        int n7;
        int n8;
        int n10 = nArray.length;
        if (n10 == 0) {
            return;
        }
        n10 = nArray.length;
        int n14 = 0;
        float f5 = 0.0f;
        float f6 = 0.0f;
        int n15 = 0;
        for (n8 = 0; n8 < n10; ++n8) {
            n7 = nArray[n8];
            n15 += n7;
        }
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(nArray, string2);
        n10 = nArray.length;
        n8 = 1;
        f6 = Float.MIN_VALUE;
        n10 = Math.max(n10 - n8, n8);
        float f7 = n3 -= n15;
        float f8 = n10;
        f7 /= f8;
        if (n4 != 0 && (n10 = nArray.length) == n8) {
            f8 = f7;
        } else {
            n10 = 0;
            f8 = 0.0f;
            string2 = null;
        }
        if (n4 == 0) {
            n4 = nArray.length;
            n8 = 0;
            f6 = 0.0f;
            while (n14 < n4) {
                int n16;
                n15 = nArray[n14];
                n7 = n8 + 1;
                nArray2[n8] = n16 = Math.round(f8);
                f6 = (float)n15 + f7;
                f8 += f6;
                ++n14;
                n8 = n7;
            }
        } else {
            n4 = nArray.length - n8;
            while (true) {
                n14 = -1;
                f5 = 0.0f / 0.0f;
                if (n14 >= n4) break;
                n14 = nArray[n4];
                nArray2[n4] = n8 = Math.round(f8);
                f5 = (float)n14 + f7;
                f8 += f5;
                n4 += -1;
            }
        }
    }

    public static void f(int n3, int[] nArray, int[] nArray2, boolean n4) {
        int n7;
        int n8;
        int n10 = nArray.length;
        int n14 = 0;
        float f5 = 0.0f;
        float f6 = 0.0f;
        int n15 = 0;
        for (n8 = 0; n8 < n10; ++n8) {
            n7 = nArray[n8];
            n15 += n7;
        }
        float f7 = n3 -= n15;
        n10 = nArray.length + 1;
        float f8 = n10;
        f7 /= f8;
        if (n4 == 0) {
            n4 = nArray.length;
            f6 = f7;
            n10 = 0;
            f8 = 0.0f;
            while (n14 < n4) {
                int n16;
                n15 = nArray[n14];
                n7 = n10 + 1;
                nArray2[n10] = n16 = Math.round(f6);
                f8 = (float)n15 + f7;
                f6 += f8;
                ++n14;
                n10 = n7;
            }
        } else {
            n4 = nArray.length + -1;
            f8 = f7;
            while (true) {
                n14 = -1;
                f5 = 0.0f / 0.0f;
                if (n14 >= n4) break;
                n14 = nArray[n4];
                nArray2[n4] = n8 = Math.round(f8);
                f5 = (float)n14 + f7;
                f8 += f5;
                n4 += -1;
            }
        }
    }

    public static zp$i g(float f5) {
        Ap ap2 = Ap.c;
        zp$i zp$i = new zp$i(f5, true, ap2);
        return zp$i;
    }
}

