/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1qSDK;
import com.appsflyer.internal.AFd1rSDK;
import com.appsflyer.internal.AFj1sSDK;

public abstract class AFi1cSDK
extends AFj1sSDK {
    private AFd1qSDK getCurrencyIso4217Code;

    public AFi1cSDK(String string2, String string3, AFd1qSDK aFd1qSDK, Runnable runnable2) {
        super(string2, string3, runnable2);
        this.getCurrencyIso4217Code = aFd1qSDK;
    }

    public final boolean getMonetizationNetwork() {
        AFd1rSDK aFd1rSDK = this.getCurrencyIso4217Code.getRevenue;
        String string2 = "appsFlyerCount";
        int n3 = aFd1rSDK.getMediationNetwork(string2, 0);
        if (n3 > 0) {
            AFLogger.afRDLog("Install referrer will not load, the counter > 1, ");
            return false;
        }
        return true;
    }
}

