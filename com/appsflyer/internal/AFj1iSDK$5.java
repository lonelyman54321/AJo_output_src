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

final class AFj1iSDK$5
extends Lambda
implements Function0 {
    private /* synthetic */ String $getMediationNetwork;
    private /* synthetic */ AFj1iSDK getCurrencyIso4217Code;

    public AFj1iSDK$5(AFj1iSDK aFj1iSDK, String string2) {
        this.getCurrencyIso4217Code = aFj1iSDK;
        this.$getMediationNetwork = string2;
        super(0);
    }

    public final Boolean getMonetizationNetwork() {
        Intent intent = this.getCurrencyIso4217Code.getMediationNetwork;
        String string2 = this.$getMediationNetwork;
        return intent.hasExtra(string2);
    }

    public final /* synthetic */ Object invoke() {
        return this.getMonetizationNetwork();
    }
}

