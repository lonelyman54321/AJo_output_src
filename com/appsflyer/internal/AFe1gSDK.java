/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFe1jSDK;
import java.util.HashMap;
import org.json.JSONObject;

public final class AFe1gSDK
implements AFe1jSDK {
    public final /* synthetic */ Object getRevenue(String object) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        String string2 = ((String)object).trim();
        boolean bl2 = string2.isEmpty();
        if (!bl2) {
            boolean bl3;
            string2 = new JSONObject((String)object);
            object = string2.keys();
            while (bl3 = object.hasNext()) {
                String string3 = (String)object.next();
                String string4 = string2.optString(string3);
                hashMap.put(string3, string4);
            }
        }
        return hashMap;
    }
}

