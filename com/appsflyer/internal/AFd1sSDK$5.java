/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 */
package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.internal.AFd1sSDK;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AFd1sSDK$5
extends Lambda
implements Function0 {
    private /* synthetic */ AFd1sSDK getMonetizationNetwork;

    public AFd1sSDK$5(AFd1sSDK aFd1sSDK) {
        this.getMonetizationNetwork = aFd1sSDK;
        super(0);
    }

    public final /* synthetic */ Object invoke() {
        return this.t_();
    }

    public final SharedPreferences t_() {
        return (SharedPreferences)AFd1sSDK.getMonetizationNetwork((AFd1sSDK)this.getMonetizationNetwork).getCurrencyIso4217Code.invoke();
    }
}

