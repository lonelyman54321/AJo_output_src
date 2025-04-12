/*
 * Decompiled with CFR 0.152.
 */
public final class SP2 {
    public static final rp2_0 a;

    static {
        rp2_0 rp2_02;
        float f5 = 50;
        eq2_1 eq2_12 = new eq2_1(f5);
        a = rp2_02 = new q90_0(eq2_12, eq2_12, eq2_12, eq2_12);
    }

    public static final rp2_0 a(float f5) {
        ys0_0 ys0_02 = new ys0_0(f5);
        rp2_0 rp2_02 = new q90_0(ys0_02, ys0_02, ys0_02, ys0_02);
        return rp2_02;
    }

    public static rp2_0 b(float f5, float f6, float f7, float f8, int n3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            f5 = 0.0f;
        }
        if ((n4 = n3 & 2) != 0) {
            f6 = 0.0f;
        }
        if ((n4 = n3 & 4) != 0) {
            f7 = 0.0f;
        }
        if ((n3 &= 8) != 0) {
            f8 = 0.0f;
        }
        ys0_0 ys0_02 = new ys0_0(f5);
        ys0_0 ys0_03 = new ys0_0(f6);
        ys0_0 ys0_04 = new ys0_0(f7);
        ys0_0 ys0_05 = new ys0_0(f8);
        rp2_0 rp2_02 = new q90_0(ys0_02, ys0_03, ys0_04, ys0_05);
        return rp2_02;
    }
}

