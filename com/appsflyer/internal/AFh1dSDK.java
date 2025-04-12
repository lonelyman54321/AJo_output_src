/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import org.json.JSONException;
import org.json.JSONObject;

public final class AFh1dSDK {
    public final long AFAdRevenueData;
    public final String getCurrencyIso4217Code;
    public final int getMediationNetwork;
    public final int getMonetizationNetwork;

    public AFh1dSDK(String string2, int n3, int n4, long l2) {
        this.getCurrencyIso4217Code = string2;
        this.getMediationNetwork = n3;
        this.getMonetizationNetwork = n4;
        this.AFAdRevenueData = l2;
    }

    public final boolean equals(Object object) {
        Object object2;
        Class<AFh1dSDK> clazz;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz = AFh1dSDK.class) == (object2 = object.getClass())) {
            boolean bl3;
            long l2;
            long l3;
            long l4;
            long l7;
            object = (AFh1dSDK)object;
            int n3 = this.getMediationNetwork;
            int n4 = ((AFh1dSDK)object).getMediationNetwork;
            if (n3 == n4 && (n3 = this.getMonetizationNetwork) == (n4 = ((AFh1dSDK)object).getMonetizationNetwork) && (l7 = (l4 = (l3 = this.AFAdRevenueData) - (l2 = ((AFh1dSDK)object).AFAdRevenueData)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false && (object2 = this.getCurrencyIso4217Code) != null && (bl3 = object2.equals(object = ((AFh1dSDK)object).getCurrencyIso4217Code))) {
                return bl2;
            }
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String getRevenue() {
        String string2;
        JSONObject jSONObject = new JSONObject();
        String string3 = "sdk_ver";
        try {
            string2 = this.getCurrencyIso4217Code;
        }
        catch (JSONException jSONException) {
            return jSONObject.toString();
        }
        jSONObject.put(string3, (Object)string2);
        string3 = "min";
        int n3 = this.getMediationNetwork;
        jSONObject.put(string3, n3);
        string3 = "expire";
        n3 = this.getMonetizationNetwork;
        jSONObject.put(string3, n3);
        string3 = "ttl";
        long l2 = this.AFAdRevenueData;
        jSONObject.put(string3, l2);
        return jSONObject.toString();
    }

    public final int hashCode() {
        int n3;
        String string2 = this.getCurrencyIso4217Code;
        if (string2 != null) {
            n3 = string2.hashCode();
        } else {
            n3 = 0;
            string2 = null;
        }
        n3 *= 31;
        int n4 = this.getMediationNetwork;
        n3 = (n3 + n4) * 31;
        n4 = this.getMonetizationNetwork;
        n3 = (n3 + n4) * 31;
        int n7 = (int)this.AFAdRevenueData;
        return n3 + n7;
    }
}

