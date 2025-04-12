/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFe1cSDK;
import com.appsflyer.internal.AFj1sSDK$AFa1zSDK;

public final class AFf1iSDK$AFa1uSDK {
    public static final /* synthetic */ int[] AFAdRevenueData;
    public static final /* synthetic */ int[] getCurrencyIso4217Code;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        Enum enum_;
        int n4;
        int n7 = AFe1cSDK.values().length;
        int[] nArray = new int[n7];
        int n8 = 1;
        try {
            AFe1cSDK aFe1cSDK = AFe1cSDK.getRevenue;
            n4 = aFe1cSDK.ordinal();
            nArray[n4] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n4 = 2;
        try {
            enum_ = AFe1cSDK.getMonetizationNetwork;
            n3 = enum_.ordinal();
            nArray[n3] = n4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        AFAdRevenueData = nArray;
        n7 = AFj1sSDK$AFa1zSDK.values().length;
        nArray = new int[n7];
        try {
            enum_ = AFj1sSDK$AFa1zSDK.getRevenue;
            n3 = enum_.ordinal();
            nArray[n3] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            AFj1sSDK$AFa1zSDK aFj1sSDK$AFa1zSDK = AFj1sSDK$AFa1zSDK.AFAdRevenueData;
            n8 = aFj1sSDK$AFa1zSDK.ordinal();
            nArray[n8] = n4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        getCurrencyIso4217Code = nArray;
    }
}

