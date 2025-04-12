/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFe1jSDK;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class AFe1rSDK
implements AFe1jSDK {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Map AFAdRevenueData(String string2) {
        Iterator iterator;
        Object object;
        HashMap<Object, Object> hashMap;
        block6: {
            try {
                hashMap = new HashMap<Object, Object>();
                object = new JSONObject(string2);
                iterator = object.keys();
                break block6;
            }
            catch (JSONException jSONException) {}
            AFLogger.afErrorLogForExcManagerOnly("error while paring GCD response", jSONException);
            hashMap = new HashMap<Object, Object>();
            String string3 = "string_response";
            hashMap.put(string3, string2);
            return hashMap;
        }
        while (true) {
            Object object2;
            boolean bl2;
            if (!(bl2 = iterator.hasNext())) {
                object = "is_cache";
                hashMap.remove(object);
                return hashMap;
            }
            Object object3 = iterator.next();
            boolean bl3 = object.isNull(object3 = (String)object3);
            if (bl3) {
                bl3 = false;
                object2 = null;
            } else {
                object2 = object.get(object3);
            }
            hashMap.put(object3, object2);
        }
    }

    public final /* synthetic */ Object getRevenue(String string2) {
        return AFe1rSDK.AFAdRevenueData(string2);
    }
}

