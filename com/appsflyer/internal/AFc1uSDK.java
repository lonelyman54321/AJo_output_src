/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFa1mSDK;
import com.appsflyer.internal.AFb1cSDK;
import com.appsflyer.internal.AFb1rSDK;
import org.json.JSONObject;

public final class AFc1uSDK {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static JSONObject AFAdRevenueData(String string2) {
        Throwable throwable2;
        block4: {
            Object object;
            String string3;
            String string4;
            Object object2;
            block3: {
                if ((string2 = AFa1mSDK.getMonetizationNetwork(string2)) == null) return string2;
                object2 = "ol_id";
                try {
                    boolean bl2 = string2.has((String)object2);
                    if (!bl2) return string2;
                    object2 = "ol_scheme";
                    string4 = null;
                    object2 = string2.optString((String)object2, null);
                    string3 = "ol_domain";
                    string3 = string2.optString(string3, null);
                    object = "ol_ver";
                    string4 = string2.optString((String)object, null);
                    if (object2 == null) break block3;
                    object = AppsFlyerProperties.getInstance();
                    String string5 = "onelinkScheme";
                    ((AppsFlyerProperties)object).set(string5, (String)object2);
                }
                catch (Throwable throwable2) {
                    break block4;
                }
            }
            if (string3 != null) {
                object2 = AppsFlyerProperties.getInstance();
                object = "onelinkDomain";
                ((AppsFlyerProperties)object2).set((String)object, string3);
            }
            if (string4 == null) return string2;
            object2 = AppsFlyerProperties.getInstance();
            string3 = "onelinkVersion";
            ((AppsFlyerProperties)object2).set(string3, string4);
            return string2;
        }
        CharSequence charSequence = new StringBuilder("Error in handleResponse: ");
        String string6 = throwable2.getMessage();
        charSequence.append(string6);
        charSequence = ((Object)charSequence).toString();
        AFLogger.afErrorLogForExcManagerOnly((String)charSequence, throwable2);
        AFb1rSDK.getRevenue().getMonetizationNetwork().copydefault().getMediationNetwork();
        AFb1cSDK aFb1cSDK = AFb1rSDK.getRevenue().getMonetizationNetwork().copydefault();
        aFb1cSDK.AFAdRevenueData();
        return string2;
    }
}

