/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFe1nSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AFe1kSDK
implements ResponseNetwork {
    public final AFe1nSDK AFAdRevenueData;
    private final Object getCurrencyIso4217Code;
    final int getMediationNetwork;
    final Map getMonetizationNetwork;
    final boolean getRevenue;

    public AFe1kSDK(Object hashMap, int n3, boolean bl2, Map map2, AFe1nSDK aFe1nSDK) {
        this.getCurrencyIso4217Code = hashMap;
        this.getMediationNetwork = n3;
        this.getRevenue = bl2;
        this.getMonetizationNetwork = hashMap = new HashMap(map2);
        this.AFAdRevenueData = aFe1nSDK;
    }

    public boolean equals(Object object) {
        Object object2;
        Object object3;
        if (this == object) {
            return true;
        }
        AFe1nSDK aFe1nSDK = null;
        if (object != null && (object3 = this.getClass()) == (object2 = object.getClass())) {
            object = (AFe1kSDK)object;
            int n3 = this.getMediationNetwork;
            int n4 = ((AFe1kSDK)object).getMediationNetwork;
            if (n3 != n4) {
                return false;
            }
            n3 = (int)(this.getRevenue ? 1 : 0);
            n4 = (int)(((AFe1kSDK)object).getRevenue ? 1 : 0);
            if (n3 != n4) {
                return false;
            }
            object3 = this.getCurrencyIso4217Code;
            object2 = ((AFe1kSDK)object).getCurrencyIso4217Code;
            n3 = (int)(object3.equals(object2) ? 1 : 0);
            if (n3 == 0) {
                return false;
            }
            object3 = this.getMonetizationNetwork;
            object2 = ((AFe1kSDK)object).getMonetizationNetwork;
            n3 = (int)(object3.equals(object2) ? 1 : 0);
            if (n3 == 0) {
                return false;
            }
            aFe1nSDK = this.AFAdRevenueData;
            object = ((AFe1kSDK)object).AFAdRevenueData;
            return aFe1nSDK.equals(object);
        }
        return false;
    }

    public Object getBody() {
        return this.getCurrencyIso4217Code;
    }

    public List getHeaderField(String string2) {
        boolean bl2;
        Iterator iterator = this.getMonetizationNetwork.keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            boolean bl3;
            String string3 = (String)iterator.next();
            if (string3 == null || !(bl3 = string3.equalsIgnoreCase(string2))) continue;
            return (List)this.getMonetizationNetwork.get(string3);
        }
        return null;
    }

    public final String getRevenue(String iterator) {
        boolean bl2;
        if ((iterator = this.getHeaderField((String)((Object)iterator))) != null && !(bl2 = iterator.isEmpty())) {
            boolean bl3;
            iterator = iterator.iterator();
            String string2 = (String)iterator.next();
            StringBuilder stringBuilder = new StringBuilder(string2);
            while (bl3 = iterator.hasNext()) {
                stringBuilder.append(", ");
                string2 = (String)iterator.next();
                stringBuilder.append(string2);
            }
            return ((Object)stringBuilder).toString();
        }
        return null;
    }

    public int getStatusCode() {
        return this.getMediationNetwork;
    }

    public int hashCode() {
        int n3 = this.getCurrencyIso4217Code.hashCode() * 31;
        int n4 = this.getMediationNetwork;
        n3 = (n3 + n4) * 31;
        n4 = (int)(this.getRevenue ? 1 : 0);
        n3 = (n3 + n4) * 31;
        n4 = (this.getMonetizationNetwork.hashCode() + n3) * 31;
        return this.AFAdRevenueData.hashCode() + n4;
    }

    public boolean isSuccessful() {
        return this.getRevenue;
    }
}

