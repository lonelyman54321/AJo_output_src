/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

public final class AFk1ySDK {
    private static int getMediationNetwork(int n3, int[][] nArray) {
        int n4 = n3 >>> 24;
        int n7 = n3 >>> 16 & 0xFF;
        int n8 = n3 >>> 8 & 0xFF;
        n3 &= 0xFF;
        n4 = nArray[0][n4];
        n7 = nArray[1][n7];
        n4 += n7;
        n7 = nArray[2][n8];
        n3 = nArray[3][n3];
        return (n4 ^= n7) + n3;
    }

    private static void getMonetizationNetwork(int[] nArray) {
        int n3;
        for (int i3 = 0; i3 < (n3 = nArray.length / 2); ++i3) {
            n3 = nArray[i3];
            int n4 = nArray.length - i3 + -1;
            nArray[i3] = n4 = nArray[n4];
            n4 = nArray.length - i3 + -1;
            nArray[n4] = n3;
        }
    }

    public static void getRevenue(int n3, int n4, boolean bl2, int n7, int[] nArray, int[][] nArray2, int[] nArray3) {
        if (!bl2) {
            AFk1ySDK.getMonetizationNetwork(nArray);
        }
        for (int i3 = 0; i3 < n7; ++i3) {
            int n8 = nArray[i3];
            n3 ^= n8;
            n8 = AFk1ySDK.getMediationNetwork(n3, nArray2);
            int n10 = n4 ^= n8;
            n4 = n3;
            n3 = n10;
        }
        n7 = nArray.length + -2;
        n7 = nArray[n7];
        n3 ^= n7;
        n7 = nArray.length;
        int n14 = 1;
        n7 -= n14;
        n7 = nArray[n7];
        n4 ^= n7;
        if (!bl2) {
            AFk1ySDK.getMonetizationNetwork(nArray);
        }
        nArray3[0] = n4;
        nArray3[n14] = n3;
    }
}

