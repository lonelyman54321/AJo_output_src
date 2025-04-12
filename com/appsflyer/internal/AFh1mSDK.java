/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 */
package com.appsflyer.internal;

import android.app.Activity;
import android.content.Intent;
import com.appsflyer.internal.AFi1mSDK;
import kotlin.jvm.internal.Intrinsics;

public final class AFh1mSDK {
    public final Intent getCurrencyIso4217Code;
    public final String getMonetizationNetwork;
    public final String getRevenue;

    public AFh1mSDK(Activity object, AFi1mSDK aFi1mSDK) {
        String string2 = "";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(aFi1mSDK, string2);
        string2 = object.getIntent();
        this.getCurrencyIso4217Code = string2;
        this.getRevenue = string2 = aFi1mSDK.getCurrencyIso4217Code((Activity)object);
        object = aFi1mSDK.getMediationNetwork((Activity)object);
        this.getMonetizationNetwork = object;
    }
}

