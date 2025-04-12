/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

public final class AFb1hSDK {
    public static Map AFAdRevenueData(Map object) {
        boolean bl2;
        String string2 = "utf-8";
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (Map.Entry)object.next();
            String string3 = (String)object2.getKey();
            object2 = (String)object2.getValue();
            string3 = URLEncoder.encode(string3, string2);
            object2 = URLEncoder.encode((String)object2, string2);
            try {
                hashMap.put(string3, object2);
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                string3 = "failed to encode map";
                AFLogger.afErrorLogForExcManagerOnly(string3, unsupportedEncodingException);
            }
        }
        return hashMap;
    }
}

