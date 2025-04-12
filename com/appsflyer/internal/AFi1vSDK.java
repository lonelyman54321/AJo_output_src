/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFh1cSDK;
import com.appsflyer.internal.AFi1zSDK;
import org.json.JSONException;
import org.json.JSONObject;

public final class AFi1vSDK {
    public final String AFAdRevenueData;
    public final AFi1zSDK getCurrencyIso4217Code;
    public final String getMediationNetwork;
    private final boolean getMonetizationNetwork;
    public final AFh1cSDK getRevenue;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public AFi1vSDK(String object) {
        JSONException jSONException2;
        block5: {
            Object object2;
            if (object == null) {
                super("Failed to parse remote configuration JSON: originalJson is null");
                throw object;
            }
            try {
                boolean bl2;
                object2 = new JSONObject(object);
                String string2 = "ver";
                this.getMediationNetwork = string2 = object2.getString(string2);
                String string3 = "test_mode";
                this.getMonetizationNetwork = bl2 = object2.optBoolean(string3);
                this.AFAdRevenueData = object;
                object = "default";
                boolean bl3 = string2.startsWith((String)object);
                object = bl3 ? AFi1zSDK.getRevenue : AFi1zSDK.getMonetizationNetwork;
            }
            catch (JSONException jSONException2) {
                break block5;
            }
            this.getCurrencyIso4217Code = object;
            object = "features";
            object = object2.optJSONObject(object);
            if (object != null) {
                super((JSONObject)object);
            } else {
                object2 = null;
            }
            this.getRevenue = object2;
            return;
        }
        AFLogger.afErrorLogForExcManagerOnly("Error in RC config parsing", jSONException2);
        JSONException jSONException3 = new JSONException("Failed to parse remote configuration JSON");
        throw jSONException3;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        if (this == object) {
            return true;
        }
        String string2 = null;
        if (object != null && (object3 = AFi1vSDK.class) == (object2 = object.getClass())) {
            object = (AFi1vSDK)object;
            boolean bl2 = this.getMonetizationNetwork;
            boolean bl3 = ((AFi1vSDK)object).getMonetizationNetwork;
            if (bl2 != bl3) {
                return false;
            }
            object2 = this.getMediationNetwork;
            object3 = ((AFi1vSDK)object).getMediationNetwork;
            bl2 = object2.equals(object3);
            if (!bl2) {
                return false;
            }
            string2 = this.AFAdRevenueData;
            object = ((AFi1vSDK)object).AFAdRevenueData;
            return string2.equals(object);
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.getMonetizationNetwork * 31;
        int n4 = (this.getMediationNetwork.hashCode() + n3) * 31;
        String string2 = this.AFAdRevenueData;
        n3 = string2.hashCode() + n4;
        AFh1cSDK aFh1cSDK = this.getRevenue;
        if (aFh1cSDK != null) {
            n3 *= 31;
            n4 = aFh1cSDK.hashCode();
            n3 += n4;
        }
        return n3;
    }
}

