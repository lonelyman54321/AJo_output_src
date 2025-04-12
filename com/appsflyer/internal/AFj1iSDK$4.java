/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Parcelable
 */
package com.appsflyer.internal;

import android.content.Intent;
import android.os.Parcelable;
import com.appsflyer.internal.AFj1iSDK;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AFj1iSDK$4
extends Lambda
implements Function0 {
    private /* synthetic */ String $getMediationNetwork;
    private /* synthetic */ AFj1iSDK getRevenue;

    public AFj1iSDK$4(AFj1iSDK aFj1iSDK, String string2) {
        this.getRevenue = aFj1iSDK;
        this.$getMediationNetwork = string2;
        super(0);
    }

    public final Parcelable L_() {
        Intent intent = this.getRevenue.getMediationNetwork;
        String string2 = this.$getMediationNetwork;
        return intent.getParcelableExtra(string2);
    }

    public final /* synthetic */ Object invoke() {
        return this.L_();
    }
}

