/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.PackageManager
 */
package com.appsflyer.internal;

import android.content.pm.PackageManager;

public interface AFb1cSDK {
    public void AFAdRevenueData();

    public boolean areAllFieldsValid();

    public void getCurrencyIso4217Code(String var1, String var2);

    public boolean getCurrencyIso4217Code();

    public void getMediationNetwork();

    public void getMediationNetwork(String var1, int var2, String var3);

    public void getMediationNetwork(String var1, String var2);

    public void getMediationNetwork(String var1, String ... var2);

    public void getMonetizationNetwork();

    public void getRevenue();

    public void getRevenue(Throwable var1);

    public void k_(String var1, PackageManager var2);
}

