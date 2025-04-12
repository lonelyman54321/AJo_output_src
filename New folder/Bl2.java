/*
 * Decompiled with CFR 0.152.
 */
public final class Bl2 {
    public static final float a(hm0_0 hm0_02) {
        float f5;
        pg2_0 pg2_02;
        pg2_0 pg2_03 = hm0_02.l().a();
        if (pg2_03 == (pg2_02 = pg2_0.Horizontal)) {
            long l2 = hm0_02.p();
            f5 = e72.d(l2);
        } else {
            long l3 = hm0_02.p();
            f5 = e72.e(l3);
        }
        return f5;
    }

    public static final boolean b(hm0_0 hm0_02) {
        float f5;
        float f6;
        int n3;
        kl2_1 kl2_12 = hm0_02.l();
        boolean bl2 = kl2_12.g();
        float f7 = Bl2.a(hm0_02);
        float f8 = f7 - 0.0f;
        float f11 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (f11 > 0 && bl2 || (n3 = (f6 = (f5 = Bl2.a(hm0_02)) - 0.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) <= 0 && !bl2) {
            n3 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n3 = 0;
            f5 = 0.0f;
            hm0_02 = null;
        }
        return n3 != 0;
    }
}

