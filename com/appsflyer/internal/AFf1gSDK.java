/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.AFAdRevenueData;
import com.appsflyer.internal.AFa1oSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFf1eSDK;
import com.appsflyer.internal.AFh1nSDK;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

public final class AFf1gSDK
extends AFf1eSDK {
    private final AFh1nSDK copy;

    public AFf1gSDK(AFh1nSDK aFh1nSDK, AFd1kSDK aFd1kSDK) {
        String string2 = "";
        Intrinsics.checkNotNullParameter(aFh1nSDK, string2);
        Intrinsics.checkNotNullParameter(aFd1kSDK, string2);
        super(aFh1nSDK, aFd1kSDK);
        this.copy = aFh1nSDK;
    }

    public final void getCurrencyIso4217Code(AFa1oSDK object) {
        boolean bl2;
        String string2 = "";
        Intrinsics.checkNotNullParameter(object, string2);
        super.getCurrencyIso4217Code((AFa1oSDK)object);
        LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
        LinkedHashMap<String, Object> linkedHashMap2 = new LinkedHashMap<String, Object>();
        Object object2 = this.copy.toString;
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        Object object3 = ((AFAdRevenueData)object2).getMonetizationNetwork();
        linkedHashMap.put("monetization_network", object3);
        Object object4 = ((AFAdRevenueData)object2).getCurrencyIso4217Code();
        linkedHashMap.put("event_revenue_currency", object4);
        object3 = ((AFAdRevenueData)object2).getMediationNetwork().getValue();
        object4 = "mediation_network";
        linkedHashMap.put(object4, object3);
        double d2 = ((AFAdRevenueData)object2).getRevenue();
        object2 = d2;
        object3 = "event_revenue";
        linkedHashMap.put(object3, object2);
        object2 = this.copy.copy;
        if (object2 != null && !(bl2 = object2.isEmpty())) {
            boolean bl3;
            object4 = "placement";
            String string3 = "ad_type";
            String string4 = "ad_unit";
            object3 = xx_2.i(string3, string4, "country", object4);
            object2 = object2.entrySet().iterator();
            while (bl3 = object2.hasNext()) {
                object4 = object2.next();
                string3 = (String)object4.getKey();
                object4 = object4.getValue();
                boolean bl4 = object3.contains(string3);
                if (bl4) {
                    linkedHashMap.put(string3, object4);
                    continue;
                }
                linkedHashMap2.put(string3, object4);
            }
            object2 = "custom_parameters";
            linkedHashMap.put(object2, linkedHashMap2);
        }
        linkedHashMap2 = new LinkedHashMap<String, Object>();
        linkedHashMap2.put("name", "adrevenue_sdk");
        linkedHashMap2.put("payload", linkedHashMap);
        object = ((AFa1oSDK)object).getMonetizationNetwork();
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object.put("ad_network", linkedHashMap2);
    }
}

