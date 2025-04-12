/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1aSDK$2;
import com.appsflyer.internal.AFb1aSDK$AFa1tSDK;
import com.appsflyer.internal.AFb1aSDK$AFa1uSDK;

public final class AFb1aSDK {
    private final AFb1aSDK$AFa1tSDK getMediationNetwork;

    public AFb1aSDK() {
        AFb1aSDK$2 aFb1aSDK$2 = new AFb1aSDK$2(this);
        this.getMediationNetwork = aFb1aSDK$2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean AFAdRevenueData(String var1_1) {
        var2_3 = "Class: ";
        var3_4 = true;
        try {
            var4_5 = this.getMediationNetwork;
            var4_5.getCurrencyIso4217Code(var1_1);
            var4_5 = new StringBuilder(var2_3);
            var4_5.append(var1_1);
            var5_7 /* !! */  = " is found.";
            var4_5.append((String)var5_7 /* !! */ );
            var4_5 = var4_5.toString();
            AFLogger.afRDLog((String)var4_5);
            return var3_4;
        }
        catch (ClassNotFoundException var4_6) {}
        ** finally { 
lbl18:
        // 1 sources

        AFLogger.afErrorLog(var1_2.getMessage(), var1_2);
        return false;
    }

    public final String getMediationNetwork() {
        for (AFb1aSDK$AFa1uSDK aFb1aSDK$AFa1uSDK : AFb1aSDK$AFa1uSDK.values()) {
            String string2 = aFb1aSDK$AFa1uSDK.AFAdRevenueData;
            boolean bl2 = this.AFAdRevenueData(string2);
            if (!bl2) continue;
            return aFb1aSDK$AFa1uSDK.getRevenue;
        }
        return AFb1aSDK$AFa1uSDK.getMediationNetwork.getRevenue;
    }
}

