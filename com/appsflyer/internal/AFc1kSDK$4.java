/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.deeplink.DeepLinkResult$Error;
import com.appsflyer.internal.AFc1kSDK;
import com.appsflyer.internal.AFf1lSDK$AFa1uSDK;
import java.util.Map;

final class AFc1kSDK$4
implements AFf1lSDK$AFa1uSDK {
    private /* synthetic */ Map getCurrencyIso4217Code;
    private /* synthetic */ AFc1kSDK getMediationNetwork;

    public AFc1kSDK$4(AFc1kSDK aFc1kSDK, Map map2) {
        this.getMediationNetwork = aFc1kSDK;
        this.getCurrencyIso4217Code = map2;
    }

    public final void getCurrencyIso4217Code(String string2) {
        AFc1kSDK aFc1kSDK = this.getMediationNetwork;
        DeepLinkResult$Error deepLinkResult$Error = DeepLinkResult$Error.NETWORK;
        aFc1kSDK.getMonetizationNetwork(string2, deepLinkResult$Error);
    }

    public final void getRevenue(Map object) {
        boolean bl2;
        Object object2 = object.keySet().iterator();
        while (bl2 = object2.hasNext()) {
            String string2 = (String)object2.next();
            Map map2 = this.getCurrencyIso4217Code;
            String string3 = (String)object.get(string2);
            map2.put(string2, string3);
        }
        object = this.getMediationNetwork;
        object2 = this.getCurrencyIso4217Code;
        ((AFc1kSDK)object).AFAdRevenueData((Map)object2);
    }
}

