/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

public class AFk1zSDK {
    public static void AFAdRevenueData(byte[] byArray, byte by2, long l2) {
        int n3;
        for (int i3 = 0; i3 < (n3 = byArray.length); ++i3) {
            long l3 = 1L << i3 & l2;
            long l4 = 0L;
            long l7 = l3 - l4;
            Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object == false) continue;
            byArray[i3] = n3 = (int)((byte)(byArray[i3] ^ by2));
        }
    }
}

