/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.content.Context
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.appsflyer.internal.AFh1sSDK;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class AFa1mSDK {
    public static AFh1sSDK AFAdRevenueData(Context object) {
        boolean bl2;
        boolean bl3 = object instanceof Activity;
        object = bl3 ? AFh1sSDK.AFAdRevenueData : ((bl2 = object instanceof Application) ? AFh1sSDK.getMonetizationNetwork : AFh1sSDK.getRevenue);
        return object;
    }

    private static List getCurrencyIso4217Code(JSONArray jSONArray) {
        int n3;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (int i3 = 0; i3 < (n3 = jSONArray.length()); ++i3) {
            Object object = jSONArray.get(i3);
            boolean bl2 = object instanceof JSONArray;
            if (bl2) {
                object = AFa1mSDK.getCurrencyIso4217Code((JSONArray)object);
            } else {
                bl2 = object instanceof JSONObject;
                if (bl2) {
                    object = AFa1mSDK.getRevenue((JSONObject)object);
                }
            }
            arrayList.add(object);
        }
        return arrayList;
    }

    private static Object getMediationNetwork(Object object) {
        if (object == null) {
            return JSONObject.NULL;
        }
        int n3 = object instanceof JSONArray;
        if (n3 == 0 && (n3 = object instanceof JSONObject) == 0) {
            block27: {
                JSONArray jSONArray;
                JSONArray jSONArray2 = JSONObject.NULL;
                n3 = object.equals(jSONArray2);
                if (n3 != 0) {
                    return object;
                }
                n3 = object instanceof Collection;
                if (n3 != 0) {
                    jSONArray2 = new JSONArray();
                    object = (Collection)object;
                    object = object.iterator();
                    while (true) {
                        boolean bl2 = object.hasNext();
                        if (!bl2) break;
                        Object object2 = object.next();
                        object2 = AFa1mSDK.getMediationNetwork(object2);
                        jSONArray2.put(object2);
                        continue;
                        break;
                    }
                    return jSONArray2;
                }
                jSONArray2 = object.getClass();
                n3 = jSONArray2.isArray();
                if (n3 == 0) break block27;
                n3 = Array.getLength(object);
                try {
                    jSONArray = new JSONArray();
                }
                catch (Exception exception) {
                    object = JSONObject.NULL;
                }
                for (int i3 = 0; i3 < n3; ++i3) {
                    Object object3 = Array.get(object, i3);
                    object3 = AFa1mSDK.getMediationNetwork(object3);
                    jSONArray.put(object3);
                    continue;
                }
                return jSONArray;
            }
            n3 = object instanceof Map;
            if (n3 != 0) {
                object = (Map)object;
                return AFa1mSDK.getMediationNetwork((Map)object);
            }
            n3 = object instanceof Boolean;
            if (n3 == 0 && (n3 = object instanceof Byte) == 0 && (n3 = object instanceof Character) == 0 && (n3 = object instanceof Double) == 0 && (n3 = object instanceof Float) == 0 && (n3 = object instanceof Integer) == 0 && (n3 = object instanceof Long) == 0 && (n3 = object instanceof Short) == 0 && (n3 = object instanceof String) == 0) {
                object = object.toString();
            }
            return object;
        }
        return object;
    }

    public static JSONObject getMediationNetwork(Map object) {
        boolean bl2;
        JSONObject jSONObject = new JSONObject();
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (Map.Entry)object.next();
            Object object3 = AFa1mSDK.getMediationNetwork(object2.getValue());
            try {
                object2 = object2.getKey();
            }
            catch (JSONException jSONException) {}
            object2 = (String)object2;
            jSONObject.put((String)object2, object3);
        }
        return jSONObject;
    }

    public static JSONObject getMonetizationNetwork(String string2) {
        if (string2 == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string2);
            return jSONObject;
        }
        catch (JSONException jSONException) {
            return null;
        }
    }

    public static Map getRevenue(JSONObject jSONObject) {
        boolean bl2;
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        Iterator iterator = jSONObject.keys();
        while (bl2 = iterator.hasNext()) {
            String string2 = (String)iterator.next();
            Object object = jSONObject.get(string2);
            boolean bl3 = object instanceof JSONArray;
            if (bl3) {
                object = AFa1mSDK.getCurrencyIso4217Code((JSONArray)object);
            } else {
                bl3 = object instanceof JSONObject;
                if (bl3) {
                    object = AFa1mSDK.getRevenue((JSONObject)object);
                }
            }
            hashMap.put(string2, object);
        }
        return hashMap;
    }
}

