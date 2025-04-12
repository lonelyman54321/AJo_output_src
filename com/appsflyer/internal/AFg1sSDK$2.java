/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFg1sSDK;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AFg1sSDK$2
extends Lambda
implements Function0 {
    private /* synthetic */ AFg1sSDK getMonetizationNetwork;

    public AFg1sSDK$2(AFg1sSDK aFg1sSDK) {
        this.getMonetizationNetwork = aFg1sSDK;
        super(0);
    }

    public final Boolean getRevenue() {
        return Boolean.parseBoolean(AFg1sSDK.getMonetizationNetwork(this.getMonetizationNetwork).getRevenue("com.appsflyer.rc.sandbox"));
    }

    public final /* synthetic */ Object invoke() {
        return this.getRevenue();
    }
}

