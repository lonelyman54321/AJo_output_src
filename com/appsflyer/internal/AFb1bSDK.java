/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import org.json.JSONException;
import org.json.JSONObject;

public final class AFb1bSDK {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void getCurrencyIso4217Code(String string2, JSONObject object) {
        boolean bl2;
        boolean bl3;
        boolean bl4;
        CharSequence charSequence;
        Object object2;
        Object object3;
        block7: {
            int n3;
            StringBuilder stringBuilder;
            String string3;
            String string4;
            block8: {
                object3 = "pia_token";
                object2 = "referrer";
                charSequence = "tcstring";
                string4 = "appsflyerKey";
                if (object == null) return;
                try {
                    boolean bl5 = object.has(string4);
                    if (!bl5) break block7;
                    string3 = object.getString(string4);
                    stringBuilder = new StringBuilder();
                    break block8;
                }
                catch (JSONException jSONException) {}
                object = AFLogger.INSTANCE;
                object3 = AFh1vSDK.getMonetizationNetwork;
                object2 = "Not able to log the payload";
                ((AFh1uSDK)object).e((AFh1vSDK)((Object)object3), (String)object2, jSONException);
                return;
            }
            for (int i3 = 0; i3 < (n3 = string3.length()); ++i3) {
                if (i3 != 0 && i3 != (n3 = string3.length() + -1)) {
                    String string5 = "*";
                    stringBuilder.append(string5);
                    continue;
                }
                n3 = string3.charAt(i3);
                stringBuilder.append((char)n3);
            }
            string3 = ((Object)stringBuilder).toString();
            object.put(string4, (Object)string3);
        }
        if (bl4 = object.has((String)charSequence)) {
            object.put((String)charSequence, (Object)charSequence);
        }
        if (bl3 = object.has(object2)) {
            object.put(object2, object2);
        }
        if (bl2 = object.has((String)object3)) {
            object.put((String)object3, object3);
        }
        object3 = AFLogger.INSTANCE;
        object2 = AFh1vSDK.getMonetizationNetwork;
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append(object);
        string2 = charSequence.toString();
        ((AFh1uSDK)object3).i((AFh1vSDK)((Object)object2), string2);
    }
}

