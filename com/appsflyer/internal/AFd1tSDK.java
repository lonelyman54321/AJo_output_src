/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.internal.AFc1aSDK;
import com.appsflyer.internal.AFc1cSDK;
import com.appsflyer.internal.AFe1nSDK;
import com.appsflyer.internal.AFh1pSDK;

public final class AFd1tSDK {
    public String AFAdRevenueData;
    public boolean areAllFieldsValid;
    public AppsFlyerConsent component1;
    public AFe1nSDK component3;
    public AFh1pSDK component4;
    public String getCurrencyIso4217Code;
    public AFc1cSDK getMediationNetwork;
    public AFc1aSDK getMonetizationNetwork;
    public String getRevenue;

    public final boolean getMonetizationNetwork() {
        return this.areAllFieldsValid;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void getRevenue(AFe1nSDK aFe1nSDK) {
        synchronized (this) {
            this.component3 = aFe1nSDK;
            return;
        }
    }
}

