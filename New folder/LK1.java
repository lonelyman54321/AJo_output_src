/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class LK1 {
    public static final ve1_0 a;

    static {
        ve1_0 ve1_02;
        a = ve1_02 = new ve1_0(false);
    }

    public static final void a(String string2, long l2, LP1 lP1, tv0_0 tv0_02, long l3, long l4, b30_0 b30_02, int n3) {
        lm3_0 lm3_02;
        CF2 cF2;
        Object object;
        int n4;
        int n7;
        LP1 lP12 = lP1;
        tv0_0 tv0_03 = tv0_02;
        int n8 = n3;
        Intrinsics.checkNotNullParameter(string2, "value");
        Intrinsics.checkNotNullParameter(lP1, "modifier");
        Object object2 = "fontWeight";
        Intrinsics.checkNotNullParameter(tv0_02, (String)object2);
        Object object3 = b30_02.g(625455494);
        int n10 = n3 & 0xE;
        if (n10 == 0) {
            n10 = ((j30_0)object3).J(string2) ? 1 : 0;
            n10 = n10 != 0 ? 4 : 2;
            n10 |= n8;
        } else {
            n10 = n3;
        }
        int n14 = n8 & 0x70;
        if (n14 == 0) {
            n14 = ((j30_0)object3).d(l2) ? 1 : 0;
            n14 = n14 != 0 ? 32 : 16;
            n10 |= n14;
        }
        if ((n14 = n8 & 0x380) == 0) {
            n14 = ((j30_0)object3).J(lP12) ? 1 : 0;
            n14 = n14 != 0 ? 256 : 128;
            n10 |= n14;
        }
        if ((n14 = n8 & 0x1C00) == 0) {
            n14 = ((j30_0)object3).J(tv0_03) ? 1 : 0;
            n14 = n14 != 0 ? 2048 : 1024;
            n10 |= n14;
        }
        if ((n14 = 0xE000 & n8) == 0) {
            n14 = ((j30_0)object3).d(l3) ? 1 : 0;
            n14 = n14 != 0 ? 16384 : 8192;
            n10 |= n14;
        }
        if ((n7 = n8 & (n14 = 458752)) == 0) {
            n7 = ((j30_0)object3).d(l4) ? 1 : 0;
            n7 = n7 != 0 ? 131072 : 65536;
            n10 |= n7;
        }
        if ((n7 = 0x5B6DB & n10) == (n4 = 74898) && (n7 = (int)(((j30_0)object3).h() ? 1 : 0)) != 0) {
            ((j30_0)object3).D();
            object = object3;
        } else {
            n7 = n10 & 0xE;
            n4 = n10 >> 3;
            int n15 = n4 & 0x70;
            n7 |= n15;
            n15 = n10 << 3 & 0x380;
            n7 |= n15;
            n14 = n14 & (n10 <<= 6) | (n7 |= (n4 &= 0x1C00));
            int n16 = n14 | (n10 &= 0x1C00000);
            n7 = 0;
            n4 = 0;
            n10 = 0;
            cF2 = null;
            lm3_02 = null;
            long l7 = 0L;
            n15 = 0;
            int n17 = 130896;
            object2 = string2;
            object = object3;
            tv0_03 = tv0_02;
            Ll3.b(string2, lP1, l2, l3, null, tv0_02, null, l4, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object3, n16, 0, n17);
        }
        cF2 = ((j30_0)object).X();
        if (cF2 != null) {
            object2 = lm3_02;
            object3 = tv0_02;
            lm3_02 = new lm3_0(string2, l2, lP1, tv0_02, l3, l4, n3);
            cF2.d = lm3_02;
        }
    }

    public static final float b(float f5) {
        long l2 = (long)Float.floatToRawIntBits(f5) & 0x1FFFFFFFFL;
        long l3 = 3;
        float f6 = Float.intBitsToFloat((int)(l2 / l3) + 709952852);
        float f7 = f6 * f6;
        f7 = f5 / f7;
        f7 = f6 - f7;
        float f8 = 0.33333334f;
        f7 = (f6 -= (f7 *= f8)) * f6;
        f5 /= f7;
        f5 = (f6 - f5) * f8;
        return f6 - f5;
    }

    public static final float c(float f5, float f6, float f7) {
        float f8 = (1.0f - f7) * f5;
        return f7 * f6 + f8;
    }

    public static final int d(int n3, int n4, float f5) {
        double d2 = n4 - n3;
        double d5 = f5;
        int n7 = (int)Math.round(d2 * d5);
        return n3 + n7;
    }
}

