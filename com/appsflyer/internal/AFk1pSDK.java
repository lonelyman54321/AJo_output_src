/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFj1aSDK;

public final class AFk1pSDK {
    public int AFAdRevenueData;
    public int getCurrencyIso4217Code;
    public int getMonetizationNetwork;

    public static void getCurrencyIso4217Code(int[] nArray) {
        int n3;
        for (int i3 = 0; i3 < (n3 = nArray.length / 2); ++i3) {
            n3 = nArray[i3];
            int n4 = nArray.length - i3 + -1;
            nArray[i3] = n4 = nArray[n4];
            n4 = nArray.length - i3 + -1;
            nArray[n4] = n3;
        }
    }

    public static int getRevenue(int object) {
        Object object2 = AFj1aSDK.getCurrencyIso4217Code;
        Object object3 = object >>> 24 & 0xFF;
        Object object4 = object >>> 16 & 0xFF;
        int n3 = object >>> 8 & 0xFF;
        object &= 0xFF;
        object2 = ((AFj1aSDK)object2).getMonetizationNetwork;
        object3 = object2[0][object3];
        object4 = object2[1][object4];
        object3 += object4;
        object4 = object2[2][n3];
        object = object2[3][object];
        return (object3 ^= object4) + object;
    }
}

