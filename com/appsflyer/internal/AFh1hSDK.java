/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFa1oSDK;
import com.appsflyer.internal.AFf1zSDK;

public final class AFh1hSDK
extends AFa1oSDK {
    public final AFf1zSDK equals;

    public AFh1hSDK() {
        this.equals = null;
    }

    public AFh1hSDK(String string2, byte[] byArray, String string3, AFf1zSDK aFf1zSDK) {
        Boolean bl2 = Boolean.FALSE;
        super(null, string2, bl2);
        this.getMonetizationNetwork = string3;
        this.AFAdRevenueData(byArray);
        this.equals = aFf1zSDK;
    }

    public final AFf1zSDK getCurrencyIso4217Code() {
        AFf1zSDK aFf1zSDK = this.equals;
        if (aFf1zSDK != null) {
            return aFf1zSDK;
        }
        return AFf1zSDK.getCurrencyIso4217Code;
    }
}

