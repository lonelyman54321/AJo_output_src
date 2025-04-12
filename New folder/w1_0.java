/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from w1
 */
public final class w1_0 {
    public static final int[] a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;

    static {
        int[] nArray;
        int[] nArray2;
        a = new int[]{1, 2, 3, 6};
        b = new int[]{48000, 44100, 32000};
        c = new int[]{24000, 22050, 16000};
        int[] nArray3 = nArray2 = new int[8];
        int[] nArray4 = nArray2;
        nArray3[0] = 2;
        nArray4[1] = 1;
        nArray3[2] = 2;
        nArray4[3] = 3;
        nArray3[4] = 3;
        nArray4[5] = 4;
        nArray3[6] = 4;
        nArray4[7] = 5;
        d = nArray2;
        int n3 = 19;
        int[] nArray5 = nArray = new int[n3];
        int[] nArray6 = nArray;
        nArray5[0] = 32;
        nArray6[1] = 40;
        nArray5[2] = 48;
        nArray6[3] = 56;
        nArray5[4] = 64;
        nArray6[5] = 80;
        nArray5[6] = 96;
        nArray6[7] = 112;
        nArray5[8] = 128;
        nArray6[9] = 160;
        nArray5[10] = 192;
        nArray6[11] = 224;
        nArray5[12] = 256;
        nArray6[13] = 320;
        nArray5[14] = 384;
        nArray6[15] = 448;
        nArray5[16] = 512;
        nArray6[17] = 576;
        nArray6[18] = 640;
        e = nArray;
        int[] nArray7 = nArray2 = new int[n3];
        int[] nArray8 = nArray2;
        nArray7[0] = 69;
        nArray8[1] = 87;
        nArray7[2] = 104;
        nArray8[3] = 121;
        nArray7[4] = 139;
        nArray8[5] = 174;
        nArray7[6] = 208;
        nArray8[7] = 243;
        nArray7[8] = 278;
        nArray8[9] = 348;
        nArray7[10] = 417;
        nArray8[11] = 487;
        nArray7[12] = 557;
        nArray8[13] = 696;
        nArray7[14] = 835;
        nArray8[15] = 975;
        nArray7[16] = 1114;
        nArray8[17] = 1253;
        nArray8[18] = 1393;
        f = nArray2;
    }

    public static int a(int n3, int n4) {
        int n7;
        int n8 = n4 / 2;
        if (n3 >= 0 && n3 < (n7 = 3) && n4 >= 0 && n8 < (n7 = 19)) {
            int[] nArray = b;
            n7 = 44100;
            if ((n3 = nArray[n3]) == n7) {
                n3 = f[n8];
                return (n4 % 2 + n3) * 2;
            }
            int[] nArray2 = e;
            n4 = nArray2[n8];
            n8 = 32000;
            if (n3 == n8) {
                return n4 * 6;
            }
            return n4 * 4;
        }
        return -1;
    }
}

