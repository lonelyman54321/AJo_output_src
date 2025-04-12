/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFg1sSDK;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AFg1sSDK$5
extends Lambda
implements Function0 {
    private /* synthetic */ AFg1sSDK getMediationNetwork;

    public AFg1sSDK$5(AFg1sSDK aFg1sSDK) {
        this.getMediationNetwork = aFg1sSDK;
        super(0);
    }

    public final Boolean AFAdRevenueData() {
        return Boolean.parseBoolean(AFg1sSDK.getMonetizationNetwork(this.getMediationNetwork).getRevenue("com.appsflyer.rc.staging"));
    }

    public final /* synthetic */ Object invoke() {
        return this.AFAdRevenueData();
    }
}

