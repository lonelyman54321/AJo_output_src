/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import java.nio.charset.Charset;

public final class AFd1pSDK$AFa1tSDK {
    public static byte[] AFAdRevenueData(String string2) {
        Charset charset = Charset.defaultCharset();
        return string2.getBytes(charset);
    }

    public static byte[] AFAdRevenueData(byte[] byArray) {
        int n3;
        for (int i3 = 0; i3 < (n3 = byArray.length); ++i3) {
            n3 = byArray[i3];
            int n4 = i3 % 2 + 42;
            byArray[i3] = n3 = (int)((byte)(n3 ^ n4));
        }
        return byArray;
    }
}

