/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.internal.AFd1wSDK$AFa1tSDK;
import com.appsflyer.internal.AFd1wSDK$AFa1ySDK;

public interface AFd1wSDK {
    public static final AFd1wSDK$AFa1ySDK AFa1ySDK = AFd1wSDK$AFa1ySDK.getCurrencyIso4217Code;

    public void AFAdRevenueData();

    public boolean getMediationNetwork();

    public void getRevenue(Context var1, AFd1wSDK$AFa1tSDK var2);
}

