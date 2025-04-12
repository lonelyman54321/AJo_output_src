/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.google.android.gms.tagmanager;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

final class zzcu {
    public static Object zza(Object object) {
        boolean bl2 = object instanceof JSONArray;
        if (!bl2) {
            HashMap<String, Object> hashMap = JSONObject.NULL;
            bl2 = ((Object)hashMap).equals(object);
            if (!bl2) {
                bl2 = object instanceof JSONObject;
                if (bl2) {
                    boolean bl3;
                    object = (JSONObject)object;
                    hashMap = new HashMap<String, Object>();
                    Iterator iterator = object.keys();
                    while (bl3 = iterator.hasNext()) {
                        String string2 = (String)iterator.next();
                        Object object2 = zzcu.zza(object.get(string2));
                        hashMap.put(string2, object2);
                    }
                    return hashMap;
                }
                return object;
            }
            object = new RuntimeException("JSON nulls are not supported");
            throw object;
        }
        object = new RuntimeException("JSONArrays are not supported");
        throw object;
    }
}

