/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from mS0
 */
public final class ms0_0 {
    public static final float[] a;

    static {
        long l2;
        long[] lArray;
        float[] fArray;
        int n3;
        pr1_2 pr1_22 = new ls0_1();
        int n4 = et2_1.g(0);
        if (n4 > 0) {
            n4 = et2_1.f(n4);
            n3 = 7;
            n4 = Math.max(n3, n4);
        } else {
            n4 = 0;
            fArray = null;
        }
        pr1_22.c = n4;
        if (n4 == 0) {
            lArray = et2_1.a;
        } else {
            n3 = (n4 + 15 & 0xFFFFFFF8) >> 3;
            lArray = new long[n3];
            rp_1.q(lArray);
        }
        pr1_22.a = lArray;
        int n7 = n4 >> 3;
        int n8 = (n4 & 7) << 3;
        long l3 = lArray[n7];
        long l4 = 255L << n8;
        long l7 = l4 ^ (long)-1;
        lArray[n7] = l2 = l3 & l7 | l4;
        fArray = new float[n4];
        pr1_22.b = fArray;
        a = new float[0];
    }
}

