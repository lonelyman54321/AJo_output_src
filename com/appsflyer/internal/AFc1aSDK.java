/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFb1rSDK;
import java.util.HashMap;
import java.util.Map;

public final class AFc1aSDK {
    public final Map getCurrencyIso4217Code;
    public Map getRevenue;

    public AFc1aSDK() {
        HashMap hashMap;
        this.getCurrencyIso4217Code = hashMap = new HashMap();
        this.getRevenue = hashMap = new HashMap();
    }

    public final void getRevenue(Map hashMap) {
        Map map2 = this.getCurrencyIso4217Code;
        boolean bl2 = map2.isEmpty();
        String string2 = "partner_data";
        if (!bl2) {
            map2 = this.getCurrencyIso4217Code;
            hashMap.put(string2, map2);
        }
        if (!(bl2 = (map2 = this.getRevenue).isEmpty())) {
            hashMap = AFb1rSDK.getCurrencyIso4217Code(hashMap);
            map2 = this.getRevenue;
            hashMap.put(string2, map2);
            this.getRevenue = hashMap = new HashMap<String, Map>();
        }
    }
}

