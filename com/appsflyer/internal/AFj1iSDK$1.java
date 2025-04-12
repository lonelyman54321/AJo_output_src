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

final class AFj1iSDK$1
extends Lambda
implements Function0 {
    private /* synthetic */ String $getMonetizationNetwork;
    private /* synthetic */ AFj1iSDK getCurrencyIso4217Code;

    public AFj1iSDK$1(AFj1iSDK aFj1iSDK, String string2) {
        this.getCurrencyIso4217Code = aFj1iSDK;
        this.$getMonetizationNetwork = string2;
        super(0);
    }

    public final String getMediationNetwork() {
        Intent intent = this.getCurrencyIso4217Code.getMediationNetwork;
        String string2 = this.$getMonetizationNetwork;
        return intent.getStringExtra(string2);
    }

    public final /* synthetic */ Object invoke() {
        return this.getMediationNetwork();
    }
}

