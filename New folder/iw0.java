/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class iw0 {
    public static final int[] a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    public static final int[] g;
    public static final int[] h;
    public static final int[] i;

    static {
        int[] nArray;
        int n3 = 8;
        int n4 = 5;
        int n7 = 6;
        int n8 = 16;
        int[] nArray2 = nArray = new int[n8];
        int[] nArray3 = nArray;
        nArray2[0] = 1;
        nArray3[1] = 2;
        nArray2[2] = 2;
        nArray3[3] = 2;
        nArray2[4] = 2;
        nArray3[5] = 3;
        nArray2[6] = 3;
        nArray3[7] = 4;
        nArray2[8] = 4;
        nArray3[9] = 5;
        nArray2[10] = 6;
        nArray3[11] = 6;
        nArray2[12] = 6;
        nArray3[13] = 7;
        nArray2[14] = 8;
        nArray3[15] = 8;
        a = nArray;
        int[] nArray4 = nArray = new int[n8];
        int[] nArray5 = nArray;
        nArray4[0] = -1;
        nArray5[1] = 8000;
        nArray4[2] = 16000;
        nArray5[3] = 32000;
        nArray4[4] = -1;
        nArray5[5] = -1;
        nArray4[6] = 11025;
        nArray5[7] = 22050;
        nArray4[8] = 44100;
        nArray5[9] = -1;
        nArray4[10] = -1;
        nArray5[11] = 12000;
        nArray4[12] = 24000;
        nArray5[13] = 48000;
        nArray4[14] = -1;
        nArray5[15] = -1;
        b = nArray;
        int[] nArray6 = nArray = new int[29];
        int[] nArray7 = nArray;
        nArray6[0] = 64;
        nArray7[1] = 112;
        nArray6[2] = 128;
        nArray7[3] = 192;
        nArray6[4] = 224;
        nArray7[5] = 256;
        nArray6[6] = 384;
        nArray7[7] = 448;
        nArray6[8] = 512;
        nArray7[9] = 640;
        nArray6[10] = 768;
        nArray7[11] = 896;
        nArray6[12] = 1024;
        nArray7[13] = 1152;
        nArray6[14] = 1280;
        nArray7[15] = 1536;
        nArray6[16] = 1920;
        nArray7[17] = 2048;
        nArray6[18] = 2304;
        nArray7[19] = 2560;
        nArray6[20] = 2688;
        nArray7[21] = 2816;
        nArray6[22] = 2823;
        nArray7[23] = 2944;
        nArray6[24] = 3072;
        nArray7[25] = 3840;
        nArray6[26] = 4096;
        nArray7[27] = 6144;
        nArray7[28] = 7680;
        c = nArray;
        int[] nArray8 = nArray = new int[n8];
        int[] nArray9 = nArray;
        nArray8[0] = 8000;
        nArray9[1] = 16000;
        nArray8[2] = 32000;
        nArray9[3] = 64000;
        nArray8[4] = 128000;
        nArray9[5] = 22050;
        nArray8[6] = 44100;
        nArray9[7] = 88200;
        nArray8[8] = 176400;
        nArray9[9] = 352800;
        nArray8[10] = 12000;
        nArray9[11] = 24000;
        nArray8[12] = 48000;
        nArray9[13] = 96000;
        nArray8[14] = 192000;
        nArray9[15] = 384000;
        d = nArray;
        int n10 = 10;
        int n14 = 12;
        e = new int[]{n4, n3, n10, n14};
        int n15 = 9;
        f = new int[]{n7, n15, n14, 15};
        g = new int[]{2, 4, n7, n3};
        h = new int[]{n15, 11, 13, n8};
        i = new int[]{n4, n3, n10, n14};
    }

    public static Vm2 a(byte[] byArray) {
        int n3 = 0;
        Vm2 vm2 = null;
        int n4 = byArray[0];
        int n7 = 127;
        if (n4 != n7 && n4 != (n7 = 100) && n4 != (n7 = 64) && n4 != (n7 = 113)) {
            int n8;
            int n10;
            Vm2 vm22;
            n4 = byArray.length;
            byArray = Arrays.copyOf(byArray, n4);
            n4 = byArray[0];
            n7 = -2;
            int n14 = 1;
            if (n4 == n7 || n4 == (n7 = -1) || n4 == (n7 = 37) || n4 == (n7 = -14) || n4 == (n7 = -24)) {
                vm22 = null;
                for (n4 = 0; n4 < (n7 = byArray.length - n14); n4 += 2) {
                    n7 = byArray[n4];
                    n10 = n4 + 1;
                    byArray[n4] = n8 = byArray[n10];
                    byArray[n10] = n7;
                }
            }
            n7 = byArray.length;
            vm22 = new Vm2(byArray, n7);
            n3 = byArray[0];
            n7 = 31;
            if (n3 == n7) {
                n7 = byArray.length;
                vm2 = new Vm2(byArray, n7);
                while ((n7 = vm2.b()) >= (n10 = 16)) {
                    byte[] byArray2;
                    vm2.o(2);
                    n7 = 14;
                    n10 = vm2.g(n7) & 0x3FFF;
                    n8 = vm22.c;
                    int n15 = 8;
                    n8 = Math.min(8 - n8, n7);
                    int n16 = vm22.c;
                    int n17 = 8 - n16 - n8;
                    n16 = 65280 >> n16;
                    int n18 = (n14 << n17) - n14;
                    n16 |= n18;
                    byte[] byArray3 = vm22.a;
                    int n19 = vm22.b;
                    int n20 = byArray3[n19];
                    byArray3[n19] = n16 = (int)((byte)(n16 & n20));
                    n20 = n10 >>> n8;
                    n17 = n20 << n17;
                    byArray3[n19] = n16 = (int)((byte)(n16 | n17));
                    n19 += n14;
                    for (n8 = 14 - n8; n8 > n15; n8 += -8) {
                        byArray2 = vm22.a;
                        n17 = n19 + 1;
                        n18 = n8 + -8;
                        byArray2[n19] = n18 = (int)((byte)(n10 >>> n18));
                        n19 = n17;
                    }
                    n15 = 8 - n8;
                    byArray2 = vm22.a;
                    n17 = byArray2[n19];
                    n18 = (n14 << n15) - n14;
                    byArray2[n19] = n17 = (int)((byte)(n17 & n18));
                    n8 = (n14 << n8) - n14;
                    byArray2[n19] = n10 = (int)((byte)((n10 & n8) << n15 | n17));
                    vm22.o(n7);
                    vm22.a();
                }
            }
            n3 = byArray.length;
            vm22.k(n3, byArray);
            return vm22;
        }
        n4 = byArray.length;
        vm2 = new Vm2(byArray, n4);
        return vm2;
    }

    public static int b(Vm2 vm2, int[] nArray) {
        int n3;
        int n4;
        int n7 = 0;
        int n8 = 0;
        for (n4 = 0; n4 < (n3 = 3) && (n3 = (int)(vm2.f() ? 1 : 0)) != 0; ++n4) {
            ++n8;
        }
        n4 = 0;
        while (n7 < n8) {
            n3 = nArray[n7];
            int n10 = 1;
            n3 = n10 << n3;
            n4 += n3;
            ++n7;
        }
        int n14 = nArray[n8];
        return vm2.g(n14) + n4;
    }
}

