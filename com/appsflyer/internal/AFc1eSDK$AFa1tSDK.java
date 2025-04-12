/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFa1rSDK$AFa1tSDK;
import com.appsflyer.internal.AFc1eSDK;
import java.util.LinkedHashMap;
import java.util.Map;

public final class AFc1eSDK$AFa1tSDK
implements AFa1rSDK$AFa1tSDK {
    private /* synthetic */ AFc1eSDK AFAdRevenueData;
    private /* synthetic */ long getMediationNetwork;

    public AFc1eSDK$AFa1tSDK(AFc1eSDK aFc1eSDK, long l2) {
        this.AFAdRevenueData = aFc1eSDK;
        this.getMediationNetwork = l2;
    }

    public final void AFAdRevenueData(String object, String map2, String string2) {
        LinkedHashMap<Object, String> linkedHashMap = "link";
        if (object != null) {
            AFLogger.afInfoLog("Facebook Deferred AppLink data received: ".concat((String)object));
            Object object2 = this.AFAdRevenueData.AFAdRevenueData;
            if (object2 != null) {
                object2.put(linkedHashMap, object);
            }
            if (map2 != null && (object = this.AFAdRevenueData.AFAdRevenueData) != null) {
                linkedHashMap = "target_url";
                object.put(linkedHashMap, map2);
            }
            if (string2 != null) {
                object = this.AFAdRevenueData;
                map2 = new Map<String, LinkedHashMap<Object, String>>();
                linkedHashMap = new LinkedHashMap<Object, String>();
                object2 = "promo_code";
                linkedHashMap.put(object2, string2);
                string2 = "deeplink_context";
                map2.put(string2, linkedHashMap);
                object = ((AFc1eSDK)object).AFAdRevenueData;
                if (object != null) {
                    string2 = "extras";
                    object.put(string2, map2);
                }
            }
        } else {
            object = this.AFAdRevenueData.AFAdRevenueData;
            if (object != null) {
                map2 = "";
                object.put(linkedHashMap, map2);
            }
        }
        long l2 = System.currentTimeMillis();
        long l3 = this.getMediationNetwork;
        object = String.valueOf(l2 -= l3);
        map2 = this.AFAdRevenueData.AFAdRevenueData;
        if (map2 != null) {
            string2 = "ttr";
            map2.put(string2, (LinkedHashMap<Object, String>)object);
        }
    }

    public final void getRevenue(String string2) {
        Map map2 = this.AFAdRevenueData.AFAdRevenueData;
        if (map2 != null) {
            String string3 = "error";
            map2.put(string3, string2);
        }
    }
}

