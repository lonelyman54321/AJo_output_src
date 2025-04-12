/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFe1iSDK;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

final class AFe1iSDK$5
extends Lambda
implements Function0 {
    private /* synthetic */ AFe1iSDK getCurrencyIso4217Code;

    public AFe1iSDK$5(AFe1iSDK aFe1iSDK) {
        this.getCurrencyIso4217Code = aFe1iSDK;
        super(0);
    }

    public final String getMediationNetwork() {
        String string2 = AFe1iSDK.getRevenue((AFe1iSDK)this.getCurrencyIso4217Code).getMonetizationNetwork.AFAdRevenueData.getPackageName();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = AFe1iSDK.getMonetizationNetwork(this.getCurrencyIso4217Code);
        return AFe1iSDK.getMediationNetwork(string2, string3);
    }

    public final /* synthetic */ Object invoke() {
        return this.getMediationNetwork();
    }
}

