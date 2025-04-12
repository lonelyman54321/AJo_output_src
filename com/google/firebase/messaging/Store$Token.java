/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.firebase.messaging;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

class Store$Token {
    private static final String KEY_APP_VERSION = "appVersion";
    private static final String KEY_TIMESTAMP = "timestamp";
    private static final String KEY_TOKEN = "token";
    private static final long REFRESH_PERIOD_MILLIS = TimeUnit.DAYS.toMillis(7);
    final String appVersion;
    final long timestamp;
    final String token;

    private Store$Token(String string2, String string3, long l2) {
        this.token = string2;
        this.appVersion = string3;
        this.timestamp = l2;
    }

    public static String encode(String string2, String string3, long l2) {
        String string4;
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            string4 = KEY_TOKEN;
        }
        catch (JSONException jSONException) {
            ((Object)((Object)jSONException)).toString();
            return null;
        }
        jSONObject.put(string4, (Object)string2);
        string2 = KEY_APP_VERSION;
        jSONObject.put(string2, (Object)string3);
        string2 = KEY_TIMESTAMP;
        jSONObject.put(string2, l2);
        return jSONObject.toString();
    }

    public static Store$Token parse(String object) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (bl2) {
            return null;
        }
        Object object2 = "{";
        bl2 = ((String)object).startsWith((String)object2);
        if (bl2) {
            String string2;
            try {
                object2 = new JSONObject((String)object);
                string2 = KEY_TOKEN;
            }
            catch (JSONException jSONException) {
                ((Object)((Object)jSONException)).toString();
                return null;
            }
            string2 = object2.getString(string2);
            String string3 = KEY_APP_VERSION;
            string3 = object2.getString(string3);
            String string4 = KEY_TIMESTAMP;
            long l2 = object2.getLong(string4);
            object = new Store$Token(string2, string3, l2);
            return object;
        }
        object2 = new Store$Token((String)object, null, 0L);
        return object2;
    }

    public boolean needsRefresh(String string2) {
        String string3;
        boolean bl2;
        long l2 = System.currentTimeMillis();
        long l3 = this.timestamp;
        long l4 = REFRESH_PERIOD_MILLIS;
        long l7 = l2 - (l3 += l4);
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object <= 0 && (bl2 = string2.equals(string3 = this.appVersion))) {
            bl2 = false;
            string2 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }
}

