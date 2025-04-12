/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
package com.appsflyer.internal;

import android.content.Intent;
import com.appsflyer.internal.AFj1iSDK;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AFj1iSDK$2
extends Lambda
implements Function0 {
    private /* synthetic */ String $getCurrencyIso4217Code;
    private /* synthetic */ long $getMediationNetwork;
    private /* synthetic */ AFj1iSDK AFAdRevenueData;

    public AFj1iSDK$2(AFj1iSDK aFj1iSDK, String string2, long l2) {
        this.AFAdRevenueData = aFj1iSDK;
        this.$getCurrencyIso4217Code = string2;
        this.$getMediationNetwork = l2;
        super(0);
    }

    public final Intent M_() {
        Intent intent = this.AFAdRevenueData.getMediationNetwork;
        String string2 = this.$getCurrencyIso4217Code;
        long l2 = this.$getMediationNetwork;
        return intent.putExtra(string2, l2);
    }

    public final /* synthetic */ Object invoke() {
        return this.M_();
    }
}

