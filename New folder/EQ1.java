/*
 * Decompiled with CFR 0.152.
 */
public final class EQ1 {
    public static final String[] a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    public static final int[] g;

    static {
        int[] nArray;
        int[] nArray2;
        a = new String[]{"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
        b = new int[]{44100, 48000, 32000};
        int n3 = 14;
        int[] nArray3 = nArray2 = new int[n3];
        int[] nArray4 = nArray2;
        nArray3[0] = 32000;
        nArray4[1] = 64000;
        nArray3[2] = 96000;
        nArray4[3] = 128000;
        nArray3[4] = 160000;
        nArray4[5] = 192000;
        nArray3[6] = 224000;
        nArray4[7] = 256000;
        nArray3[8] = 288000;
        nArray4[9] = 320000;
        nArray3[10] = 352000;
        nArray4[11] = 384000;
        nArray3[12] = 416000;
        nArray4[13] = 448000;
        c = nArray2;
        int[] nArray5 = nArray2 = new int[n3];
        int[] nArray6 = nArray2;
        nArray5[0] = 32000;
        nArray6[1] = 48000;
        nArray5[2] = 56000;
        nArray6[3] = 64000;
        nArray5[4] = 80000;
        nArray6[5] = 96000;
        nArray5[6] = 112000;
        nArray6[7] = 128000;
        nArray5[8] = 144000;
        nArray6[9] = 160000;
        nArray5[10] = 176000;
        nArray6[11] = 192000;
        nArray5[12] = 224000;
        nArray6[13] = 256000;
        d = nArray2;
        int[] nArray7 = nArray2 = new int[n3];
        int[] nArray8 = nArray2;
        nArray7[0] = 32000;
        nArray8[1] = 48000;
        nArray7[2] = 56000;
        nArray8[3] = 64000;
        nArray7[4] = 80000;
        nArray8[5] = 96000;
        nArray7[6] = 112000;
        nArray8[7] = 128000;
        nArray7[8] = 160000;
        nArray8[9] = 192000;
        nArray7[10] = 224000;
        nArray8[11] = 256000;
        nArray7[12] = 320000;
        nArray8[13] = 384000;
        e = nArray2;
        int[] nArray9 = nArray2 = new int[n3];
        int[] nArray10 = nArray2;
        nArray9[0] = 32000;
        nArray10[1] = 40000;
        nArray9[2] = 48000;
        nArray10[3] = 56000;
        nArray9[4] = 64000;
        nArray10[5] = 80000;
        nArray9[6] = 96000;
        nArray10[7] = 112000;
        nArray9[8] = 128000;
        nArray10[9] = 160000;
        nArray9[10] = 192000;
        nArray10[11] = 224000;
        nArray9[12] = 256000;
        nArray10[13] = 320000;
        f = nArray2;
        int[] nArray11 = nArray = new int[n3];
        int[] nArray12 = nArray;
        nArray11[0] = 8000;
        nArray12[1] = 16000;
        nArray11[2] = 24000;
        nArray12[3] = 32000;
        nArray11[4] = 40000;
        nArray12[5] = 48000;
        nArray11[6] = 56000;
        nArray12[7] = 64000;
        nArray11[8] = 80000;
        nArray12[9] = 96000;
        nArray11[10] = 112000;
        nArray12[11] = 128000;
        nArray11[12] = 144000;
        nArray12[13] = 160000;
        g = nArray;
    }

    public static int a(int n3) {
        int[] nArray;
        int n4 = -2097152;
        int n7 = n3 & n4;
        int n8 = 1;
        if (n7 == n4) {
            n4 = 1;
        } else {
            n4 = 0;
            nArray = null;
        }
        n7 = -1;
        if (n4 == 0) {
            return n7;
        }
        n4 = n3 >>> 19;
        int n10 = 3;
        if ((n4 &= n10) == n8) {
            return n7;
        }
        int n14 = n3 >>> 17 & n10;
        if (n14 == 0) {
            return n7;
        }
        int n15 = n3 >>> 12;
        int n16 = 15;
        if ((n15 &= n16) != 0 && n15 != n16) {
            n16 = n3 >>> 10 & n10;
            if (n16 == n10) {
                return n7;
            }
            int[] nArray2 = b;
            n7 = nArray2[n16];
            n16 = 2;
            if (n4 == n16) {
                n7 /= 2;
            } else if (n4 == 0) {
                n7 /= 4;
            }
            n3 = n3 >>> 9 & n8;
            if (n14 == n10) {
                if (n4 == n10) {
                    nArray = c;
                    n4 = nArray[n15 -= n8];
                } else {
                    nArray = d;
                    n4 = nArray[n15 -= n8];
                }
                return (n4 * 12 / n7 + n3) * 4;
            }
            if (n4 == n10) {
                if (n14 == n16) {
                    int[] nArray3 = e;
                    n15 -= n8;
                    n15 = nArray3[n15];
                } else {
                    int[] nArray4 = f;
                    n15 -= n8;
                    n15 = nArray4[n15];
                }
            } else {
                int[] nArray5 = g;
                n15 -= n8;
                n15 = nArray5[n15];
            }
            n16 = 144;
            if (n4 == n10) {
                return zy_2.a(n15, n16, n7, n3);
            }
            if (n14 == n8) {
                n16 = 72;
            }
            return zy_2.a(n16, n15, n7, n3);
        }
        return n7;
    }
}

