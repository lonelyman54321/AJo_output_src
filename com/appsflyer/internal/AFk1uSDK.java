/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

public final class AFk1uSDK {
    static final int[] AFAdRevenueData;
    private static int[] component1;
    private static byte[] component3;
    static final int[] getCurrencyIso4217Code;
    static final int[] getMediationNetwork;
    static final int[] getMonetizationNetwork;
    static final byte[] getRevenue;

    static {
        int n3;
        int n4;
        int n7;
        int n8;
        Object[] objectArray;
        int[] nArray;
        int n10;
        int n14;
        int n15;
        int n16 = 256;
        component3 = new byte[n16];
        getRevenue = new byte[n16];
        getMonetizationNetwork = new int[n16];
        getCurrencyIso4217Code = new int[n16];
        getMediationNetwork = new int[n16];
        int[] nArray2 = new int[n16];
        AFAdRevenueData = nArray2;
        int n17 = 10;
        int[] nArray3 = new int[n17];
        component1 = nArray3;
        int n18 = 1;
        int n19 = 1;
        int n20 = 1;
        do {
            n14 = n19 << 1 ^ n19;
            n10 = 0;
            if ((n19 &= 0x80) != 0) {
                n19 = 27;
            } else {
                n19 = 0;
                nArray = null;
            }
            n19 = (byte)(n19 ^ n14);
            n14 = n20 << 1;
            n20 = (byte)(n20 ^ n14);
            n14 = n20 << 2;
            n20 = (byte)(n20 ^ n14);
            n14 = n20 << 4;
            n20 = (byte)(n20 ^ n14);
            n14 = n20 & 0x80;
            if (n14 != 0) {
                n14 = 9;
            } else {
                n14 = 0;
                objectArray = null;
            }
            n20 = (byte)(n20 ^ n14);
            objectArray = component3;
            n15 = n19 & 0xFF;
            n8 = n20 ^ 0x63;
            n7 = n20 & 0xFF;
            n4 = n7 << 1;
            n3 = n7 >> 7;
            n8 ^= (n4 |= n3);
            n4 = n7 << 2;
            n3 = n7 >> 6;
            n8 ^= (n4 |= n3);
            n4 = n7 << 3;
            n3 = n7 >> 5;
            n8 ^= (n4 |= n3);
            n4 = n7 << 4;
            n7 = n7 >> 4 | n4;
            objectArray[n15] = n8 = (int)((byte)(n8 ^ n7));
        } while (n15 != n18);
        objectArray[0] = 99;
        nArray = null;
        for (n19 = 0; n19 < n16; ++n19) {
            byte[] byArray = component3;
            n20 = byArray[n19] & 0xFF;
            objectArray = getRevenue;
            objectArray[n20] = n15 = (int)((byte)n19);
            n14 = n19 << 1;
            if (n14 >= n16) {
                n14 ^= 0x11B;
            }
            if ((n15 = n14 << 1) >= n16) {
                n15 ^= 0x11B;
            }
            if ((n8 = n15 << 1) >= n16) {
                n8 ^= 0x11B;
            }
            n7 = n8 ^ n19;
            n4 = n7 ^ n14;
            n3 = n7 ^ n15;
            n14 = (n14 ^ (n15 ^= n8)) << 24;
            n15 = n7 << 16;
            n14 |= n15;
            n15 = n3 << 8;
            AFk1uSDK.getMonetizationNetwork[n20] = n14 = n14 | n15 | n4;
            int[] nArray4 = getCurrencyIso4217Code;
            n8 = n14 >>> 8;
            n7 = n14 << 24;
            nArray4[n20] = n8 |= n7;
            nArray4 = getMediationNetwork;
            n8 = n14 >>> 16;
            n7 = n14 << 16;
            nArray4[n20] = n8 |= n7;
            nArray4 = AFAdRevenueData;
            n8 = n14 >>> 24;
            nArray4[n20] = n14 = n14 << 8 | n8;
        }
        nArray = component1;
        nArray[0] = 0x1000000;
        n20 = 1;
        for (n19 = 1; n19 < n17; ++n19) {
            if ((n20 <<= n18) >= n16) {
                n20 ^= 0x11B;
            }
            objectArray = component1;
            objectArray[n19] = n10 = n20 << 24;
        }
    }

    public static int[] getMediationNetwork(byte[] byArray, int n3) {
        Object object = byArray;
        int n4 = n3;
        int n7 = byArray.length;
        int n8 = 16;
        if (n7 == n8) {
            int[] nArray;
            int n10;
            int n14;
            int n15;
            int n16;
            int n17;
            n7 = n3 + 1;
            int n18 = 4;
            int[] nArray2 = new int[n7 *= 4];
            int n19 = 0;
            int n20 = 0;
            byte[] byArray2 = null;
            for (n17 = 0; n17 < n18; ++n17) {
                n16 = n20 + 1;
                n15 = object[n20] << 24;
                n14 = n20 + 2;
                n16 = (object[n16] & 0xFF) << n8 | n15;
                n15 = n20 + 3;
                n14 = (object[n14] & 0xFF) << 8;
                n16 |= n14;
                n20 += n18;
                n15 = object[n15] & 0xFF;
                nArray2[n17] = n16 |= n15;
            }
            n17 = 4;
            n20 = 0;
            byArray2 = null;
            n16 = 0;
            while (n17 < n7) {
                n15 = n17 + -1;
                n15 = nArray2[n15];
                if (n20 == 0) {
                    byArray2 = component3;
                    n14 = n15 >>> 16 & 0xFF;
                    n14 = byArray2[n14] << 24;
                    n10 = n15 >>> 8 & 0xFF;
                    n10 = (byArray2[n10] & 0xFF) << n8;
                    n14 |= n10;
                    n10 = n15 & 0xFF;
                    n10 = (byArray2[n10] & 0xFF) << 8;
                    n20 = byArray2[n15 >>>= 24] & 0xFF | (n14 |= n10);
                    nArray = component1;
                    n14 = n16 + 1;
                    n16 = nArray[n16];
                    n15 = n20 ^ n16;
                    n16 = n14;
                    n20 = 4;
                }
                n14 = n17 + -4;
                n14 = nArray2[n14];
                nArray2[n17] = n15 ^= n14;
                ++n17;
                n20 += -1;
            }
            int n21 = ((byte[])object).length;
            if (n21 == n8) {
                object = new int[n7];
                n7 = n4 * 4;
                n8 = n7 + 1;
                object[0] = n17 = nArray2[n7];
                n19 = n7 + 2;
                n8 = nArray2[n8];
                object[n17] = n8;
                n8 = n7 + 3;
                n19 = nArray2[n19];
                n20 = 2;
                object[n20] = n19;
                n8 = nArray2[n8];
                n19 = 3;
                object[n19] = n8;
                n7 += -4;
                for (n17 = 1; n17 < n4; ++n17) {
                    n8 = n7 + 1;
                    n20 = nArray2[n7];
                    n16 = n18 + 1;
                    nArray = getMonetizationNetwork;
                    byte[] byArray3 = component3;
                    n10 = n20 >>> 24;
                    n10 = byArray3[n10] & 0xFF;
                    n10 = nArray[n10];
                    int[] nArray3 = getCurrencyIso4217Code;
                    int n22 = n20 >>> 16 & 0xFF;
                    n22 = byArray3[n22] & 0xFF;
                    n22 = nArray3[n22];
                    n10 ^= n22;
                    int[] nArray4 = getMediationNetwork;
                    int n24 = n20 >>> 8 & 0xFF;
                    n24 = byArray3[n24] & 0xFF;
                    n24 = nArray4[n24];
                    int[] nArray5 = AFAdRevenueData;
                    n20 &= 0xFF;
                    n20 = byArray3[n20] & 0xFF;
                    object[n18] = n20 = nArray5[n20] ^ (n10 ^= n24);
                    n20 = n7 + 2;
                    n8 = nArray2[n8];
                    n10 = n18 + 2;
                    int n25 = n8 >>> 24;
                    n19 = byArray3[n25] & 0xFF;
                    n19 = nArray[n19];
                    n4 = n8 >>> 16 & 0xFF;
                    n4 = byArray3[n4] & 0xFF;
                    n4 = nArray3[n4] ^ n19;
                    n19 = n8 >>> 8 & 0xFF;
                    n19 = byArray3[n19] & 0xFF;
                    n19 = nArray4[n19];
                    n4 ^= n19;
                    n8 &= 0xFF;
                    n8 = byArray3[n8] & 0xFF;
                    n8 = nArray5[n8];
                    object[n16] = n4 ^= n8;
                    n4 = n7 + 3;
                    n8 = nArray2[n20];
                    n19 = n18 + 3;
                    n20 = n8 >>> 24;
                    n20 = byArray3[n20] & 0xFF;
                    n20 = nArray[n20];
                    n16 = n8 >>> 16 & 0xFF;
                    n16 = byArray3[n16] & 0xFF;
                    n16 = nArray3[n16];
                    n20 ^= n16;
                    n16 = n8 >>> 8 & 0xFF;
                    n16 = byArray3[n16] & 0xFF;
                    n16 = nArray4[n16];
                    n8 &= 0xFF;
                    n8 = byArray3[n8] & 0xFF;
                    object[n10] = n8 = nArray5[n8] ^ (n20 ^= n16);
                    n4 = nArray2[n4];
                    n18 += 4;
                    n8 = n4 >>> 24;
                    n8 = byArray3[n8] & 0xFF;
                    n8 = nArray[n8];
                    n20 = n4 >>> 16 & 0xFF;
                    n20 = byArray3[n20] & 0xFF;
                    n20 = nArray3[n20];
                    n8 ^= n20;
                    n20 = n4 >>> 8 & 0xFF;
                    n20 = byArray3[n20] & 0xFF;
                    n20 = nArray4[n20];
                    n4 &= 0xFF;
                    n4 = byArray3[n4] & 0xFF;
                    object[n19] = n4 = nArray5[n4] ^ (n8 ^= n20);
                    n7 += -4;
                    n4 = n3;
                    n19 = 3;
                }
                n4 = n18 + 1;
                n8 = n7 + 1;
                object[n18] = n19 = nArray2[n7];
                n19 = n18 + 2;
                n17 = n7 + 2;
                object[n4] = n8 = nArray2[n8];
                n4 = 3;
                n18 += n4;
                n7 += n4;
                object[n19] = n4 = nArray2[n17];
                object[n18] = n4 = nArray2[n7];
                return object;
            }
            object = new IllegalArgumentException;
            object();
            throw object;
        }
        object = new IllegalArgumentException;
        object();
        throw object;
    }

    public static byte[][] getMonetizationNetwork(int n3) {
        int n4 = 1;
        int n7 = 2;
        int n8 = 3;
        int n10 = 4;
        byte[][] byArrayArray = new byte[n10][];
        for (int i3 = 0; i3 < n10; i3 += n4) {
            int n14 = i3 << 3;
            n14 = n3 >>> n14;
            byte by2 = (byte)(n14 & 3);
            byte by4 = (byte)(n14 >> 2 & n8);
            byte by5 = (byte)(n14 >> 4 & n8);
            n14 = (byte)(n14 >> 6 & n8);
            byte[] byArray = new byte[n10];
            byArray[0] = by2;
            byArray[n4] = by4;
            byArray[n7] = by5;
            byArray[n8] = n14;
            byArrayArray[i3] = byArray;
        }
        return byArrayArray;
    }
}

