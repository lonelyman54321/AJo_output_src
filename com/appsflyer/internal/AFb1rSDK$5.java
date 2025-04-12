/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.AppsFlyerProperties$EmailsCryptType;

final class AFb1rSDK$5 {
    static final /* synthetic */ int[] getRevenue;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        AppsFlyerProperties$EmailsCryptType appsFlyerProperties$EmailsCryptType;
        int n7 = AppsFlyerProperties$EmailsCryptType.values().length;
        int[] nArray = new int[n7];
        getRevenue = nArray;
        try {
            appsFlyerProperties$EmailsCryptType = AppsFlyerProperties$EmailsCryptType.SHA256;
            n4 = appsFlyerProperties$EmailsCryptType.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = getRevenue;
            appsFlyerProperties$EmailsCryptType = AppsFlyerProperties$EmailsCryptType.NONE;
            n4 = appsFlyerProperties$EmailsCryptType.ordinal();
            nArray[n4] = n3 = 2;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

