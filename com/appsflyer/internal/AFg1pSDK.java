/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFb1rSDK;
import com.appsflyer.internal.AFd1tSDK;
import com.appsflyer.internal.AFf1zSDK;
import com.appsflyer.internal.AFg1oSDK;
import com.appsflyer.internal.AFg1qSDK;
import com.appsflyer.internal.AFg1tSDK;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

public final class AFg1pSDK
implements AFg1tSDK {
    private final AFg1qSDK AFAdRevenueData;
    private final AFd1tSDK getMediationNetwork;
    private final AppsFlyerProperties getRevenue;

    public AFg1pSDK(AFg1qSDK aFg1qSDK, AFd1tSDK aFd1tSDK, AppsFlyerProperties appsFlyerProperties) {
        String string2 = "";
        Intrinsics.checkNotNullParameter(aFg1qSDK, string2);
        Intrinsics.checkNotNullParameter(aFd1tSDK, string2);
        Intrinsics.checkNotNullParameter(appsFlyerProperties, string2);
        this.AFAdRevenueData = aFg1qSDK;
        this.getMediationNetwork = aFd1tSDK;
        this.getRevenue = appsFlyerProperties;
    }

    public final void AFAdRevenueData(Map map2, AFf1zSDK object) {
        int n3;
        Object object2;
        Object object3;
        Object object4 = "";
        Intrinsics.checkNotNullParameter(map2, (String)object4);
        Intrinsics.checkNotNullParameter(object, (String)object4);
        Object object5 = this.AFAdRevenueData.getCurrencyIso4217Code();
        Object object6 = this.getMediationNetwork.component1;
        LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
        String string2 = "gdpr_applies";
        if (object6 != null) {
            LinkedHashMap<Object, Object> linkedHashMap2 = new LinkedHashMap<Object, Object>();
            boolean bl2 = ((AppsFlyerConsent)object6).isUserSubjectToGDPR();
            object3 = bl2;
            linkedHashMap2.put(string2, object3);
            object3 = ((AppsFlyerConsent)object6).getHasConsentForDataUsage();
            if (object3 != null) {
                object2 = "ad_user_data_enabled";
                linkedHashMap2.put(object2, object3);
            }
            if ((object3 = ((AppsFlyerConsent)object6).getHasConsentForAdsPersonalization()) != null) {
                object2 = "ad_personalization_enabled";
                linkedHashMap2.put(object2, object3);
            }
            object3 = "manual";
            linkedHashMap.put(object3, linkedHashMap2);
        }
        int n4 = 1;
        if (object5 != null) {
            int n7;
            if (object6 != null) {
                n7 = 1;
            } else {
                n7 = 0;
                object6 = null;
            }
            object3 = new LinkedHashMap();
            object2 = ((AFg1oSDK)object5).AFAdRevenueData;
            object3.put("policy_version", object2);
            object2 = ((AFg1oSDK)object5).getMonetizationNetwork;
            object3.put("cmp_sdk_id", object2);
            int n8 = ((AFg1oSDK)object5).getCurrencyIso4217Code;
            object2 = n8;
            String string3 = "cmp_sdk_version";
            object3.put(string3, object2);
            object2 = "tcstring";
            if (n7 != 0) {
                n3 = -1;
                object5 = n3;
                object3.put(string2, object5);
                object3.put(object2, object4);
            } else {
                n7 = ((AFg1oSDK)object5).getRevenue;
                object6 = n7;
                object3.put(string2, object6);
                object5 = ((AFg1oSDK)object5).getMediationNetwork;
                object3.put(object2, object5);
            }
            object5 = "tcf";
            linkedHashMap.put(object5, object3);
        }
        if ((n3 = linkedHashMap.isEmpty() ^ n4) != 0) {
            object5 = "consent_data";
            map2.put(object5, linkedHashMap);
        }
        if (object == (object5 = AFf1zSDK.getMonetizationNetwork)) {
            object = this.getRevenue;
            object5 = "enableTCFDataCollection";
            if ((object = ((AppsFlyerProperties)object).getString((String)object5)) != null) {
                map2 = AFb1rSDK.getCurrencyIso4217Code(map2);
                Intrinsics.checkNotNullExpressionValue(map2, (String)object4);
                object = this.getRevenue.getString((String)object5);
                object4 = new Pair(object5, object);
                object = eh1_2.d((Pair)object4);
                object4 = "api";
                map2.put(object4, object);
            }
        }
    }
}

