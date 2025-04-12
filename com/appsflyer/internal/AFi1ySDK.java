/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFi1wSDK;

public final class AFi1ySDK {
    public final String AFAdRevenueData;
    public final AFi1wSDK component1;
    public final Throwable component2;
    public final String component4;
    public final long getCurrencyIso4217Code;
    public final String getMediationNetwork;
    public final int getMonetizationNetwork;
    public final long getRevenue;

    public AFi1ySDK(String string2, String string3, long l2, long l3, int n3, AFi1wSDK aFi1wSDK, String string4, Throwable throwable) {
        this.getMediationNetwork = string2;
        this.AFAdRevenueData = string3;
        this.getRevenue = l2;
        this.getCurrencyIso4217Code = l3;
        this.getMonetizationNetwork = n3;
        this.component1 = aFi1wSDK;
        this.component4 = string4;
        this.component2 = throwable;
    }
}

