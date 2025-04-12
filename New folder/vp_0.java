/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from vp
 */
public final class vp_0 {
    public final vp$a_0[][] a;

    public vp_0(int[] nArray, float[] fArray, float[][] fArray2) {
        float[] fArray3 = fArray;
        int n3 = fArray.length;
        int n4 = 1;
        vp$a_0[][] vp$a_0ArrayArray = new vp$a_0[n3 -= n4][];
        int n7 = 1;
        float f5 = Float.MIN_VALUE;
        int n8 = 1;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n10 = nArray[i3];
            int n14 = 2;
            int n15 = 3;
            if (n10 != 0) {
                if (n10 != n4) {
                    if (n10 != n14) {
                        if (n10 != n15) {
                            n15 = 4;
                            if (n10 != n15) {
                                n15 = 5;
                                if (n10 == n15) {
                                    n8 = 5;
                                }
                            } else {
                                n8 = 4;
                            }
                        } else {
                            if (n7 == n4) {
                                n7 = 2;
                                f5 = 2.8E-45f;
                            } else {
                                n7 = 1;
                                f5 = Float.MIN_VALUE;
                            }
                            n8 = n7;
                        }
                    } else {
                        n7 = 2;
                        f5 = 2.8E-45f;
                        n8 = 2;
                    }
                } else {
                    n7 = 1;
                    f5 = Float.MIN_VALUE;
                    n8 = 1;
                }
            } else {
                n8 = 3;
            }
            float[] fArray4 = fArray2[i3];
            n15 = fArray4.length / n14;
            n10 = fArray4.length % n14 + n15;
            vp$a_0[] vp$a_0Array = new vp$a_0[n10];
            for (int i8 = 0; i8 < n10; ++i8) {
                vp$a_0 vp$a_0;
                n15 = i8 * 2;
                float f6 = fArray3[i3];
                int n16 = i3 + 1;
                float f7 = fArray3[n16];
                float[] fArray5 = fArray2[i3];
                float f8 = fArray5[n15];
                int n17 = n15 + 1;
                float f11 = fArray5[n17];
                float[] fArray6 = fArray2[n16];
                float f12 = fArray6[n15];
                float f14 = fArray6[n17];
                float f15 = f7;
                f7 = f8;
                f8 = f12;
                vp$a_0Array[i8] = vp$a_0 = new vp$a_0(f6, f15, f7, n8, f11, f12, f14);
            }
            vp$a_0ArrayArray[i3] = vp$a_0Array;
        }
        this.a = vp$a_0ArrayArray;
    }
}

