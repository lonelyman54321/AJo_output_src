/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.AFAdRevenueData;
import com.appsflyer.internal.AFa1oSDK;
import com.appsflyer.internal.AFf1zSDK;
import java.util.Map;

public final class AFh1nSDK
extends AFa1oSDK {
    public final Map copy;
    public final AFAdRevenueData toString;

    public AFh1nSDK(AFAdRevenueData aFAdRevenueData, Map map2) {
        Boolean bl2 = Boolean.TRUE;
        super("adrevenue_generic", null, bl2);
        this.toString = aFAdRevenueData;
        this.copy = map2;
    }

    public final AFf1zSDK getCurrencyIso4217Code() {
        return AFf1zSDK.unregisterClient;
    }
}

