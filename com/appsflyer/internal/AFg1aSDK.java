/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.internal.AFb1rSDK;
import java.util.Map;

public final class AFg1aSDK {
    public static void AFAdRevenueData(Map map2) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1rSDK.getRevenue().getMonetizationNetwork;
        if (appsFlyerConversionListener != null) {
            CharSequence charSequence = new StringBuilder("[GCD-A02] Calling onConversionDataSuccess with:\n");
            String string2 = map2.toString();
            charSequence.append(string2);
            charSequence = ((Object)charSequence).toString();
            AFLogger.afDebugLog((String)charSequence);
            appsFlyerConversionListener.onConversionDataSuccess(map2);
        }
    }

    public static void getRevenue(String string2) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1rSDK.getRevenue().getMonetizationNetwork;
        if (appsFlyerConversionListener != null) {
            String string3 = String.valueOf(string2);
            String string4 = "[GCD-A02] Calling onConversionFailure with:\n";
            string3 = string4.concat(string3);
            AFLogger.afDebugLog(string3);
            appsFlyerConversionListener.onConversionDataFail(string2);
        }
    }
}

