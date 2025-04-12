/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.internal.AFc1pSDK;
import com.appsflyer.internal.AFe1jSDK;
import org.json.JSONObject;

public final class AFc1jSDK
implements AFe1jSDK {
    public final /* synthetic */ Object getRevenue(String object) {
        int n3;
        boolean bl2 = false;
        String string2 = null;
        DeepLink deepLink = null;
        if (object != null && (n3 = object.length()) != 0) {
            Object object2 = new JSONObject((String)object);
            object = "found";
            boolean bl3 = object2.optBoolean((String)object, false);
            string2 = "is_second_ping";
            boolean bl4 = true;
            bl2 = object2.optBoolean(string2, bl4);
            if (bl3 && (object = object2.optJSONObject("click_event")) != null) {
                deepLink = DeepLink.getRevenue((JSONObject)object);
                object = deepLink.getMediationNetwork;
                object2 = "is_deferred";
                object.put((String)object2, bl4);
            }
            object = new AFc1pSDK(bl2, deepLink);
            return object;
        }
        object = new AFc1pSDK(false, null, 3, null);
        return object;
    }
}

