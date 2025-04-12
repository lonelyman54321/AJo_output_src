/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFa1oSDK;
import com.appsflyer.internal.AFf1zSDK;
import com.appsflyer.internal.AFh1gSDK;

public final class AFh1aSDK
extends AFh1gSDK {
    public AFh1aSDK() {
        Boolean bl2 = Boolean.TRUE;
        super("af_purchase", bl2);
    }

    public final AFf1zSDK getCurrencyIso4217Code() {
        return AFf1zSDK.valueOf;
    }

    public final AFa1oSDK getRevenue(String string2) {
        string2 = AFa1oSDK.AFAdRevenueData(string2);
        return super.getRevenue(string2);
    }
}

