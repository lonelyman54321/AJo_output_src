/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFe1fSDK;

public final class AFe1iSDK$AFa1uSDK {
    public static final /* synthetic */ int[] getRevenue;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        AFe1fSDK aFe1fSDK;
        int n7 = AFe1fSDK.values().length;
        int[] nArray = new int[n7];
        try {
            aFe1fSDK = AFe1fSDK.getCurrencyIso4217Code;
            n4 = aFe1fSDK.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aFe1fSDK = AFe1fSDK.getRevenue;
            n4 = aFe1fSDK.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aFe1fSDK = AFe1fSDK.getMediationNetwork;
            n4 = aFe1fSDK.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        getRevenue = nArray;
    }
}

