/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFa1oSDK;
import com.appsflyer.internal.AFb1rSDK;

final class AFb1rSDK$AFa1tSDK
implements Runnable {
    private /* synthetic */ AFb1rSDK AFAdRevenueData;
    private final AFa1oSDK getMediationNetwork;

    public AFb1rSDK$AFa1tSDK(AFb1rSDK aFb1rSDK, AFa1oSDK aFa1oSDK) {
        this.AFAdRevenueData = aFb1rSDK;
        this.getMediationNetwork = aFa1oSDK;
    }

    public final void run() {
        AFb1rSDK aFb1rSDK = this.AFAdRevenueData;
        AFa1oSDK aFa1oSDK = this.getMediationNetwork;
        aFb1rSDK.getRevenue(aFa1oSDK);
    }
}

