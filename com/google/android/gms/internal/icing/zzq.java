/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public final class zzq {
    static final String[] zza;
    private static final Map zzb;

    static {
        HashMap hashMap;
        String string2 = "intent_activity";
        String string3 = "thing_proto";
        String string4 = "text2";
        Object object = "icon";
        Object object2 = "intent_action";
        Object object3 = "intent_data";
        String string5 = "intent_data_id";
        String string6 = "intent_extra_data";
        String string7 = "suggest_large_icon";
        zza = new String[]{"text1", string4, object, object2, object3, string5, string6, string7, string2, string3};
        int n3 = 10;
        zzb = hashMap = new HashMap(n3);
        int n4 = 0;
        hashMap = null;
        while (true) {
            object = zza;
            int cfr_ignored_0 = ((String[])object).length;
            if (n4 >= n3) break;
            object2 = zzb;
            object = object[n4];
            object3 = n4;
            object2.put(object, object3);
            ++n4;
        }
    }

    public static String zza(int n3) {
        if (n3 >= 0) {
            String[] stringArray = zza;
            int n4 = stringArray.length;
            n4 = 10;
            if (n3 < n4) {
                return stringArray[n3];
            }
        }
        return null;
    }

    public static int zzb(String string2) {
        Serializable serializable = (Integer)zzb.get(string2);
        if (serializable != null) {
            return serializable;
        }
        int n3 = string2.length();
        StringBuilder stringBuilder = new StringBuilder(n3 += 44);
        string2 = BW0.b(stringBuilder, "[", string2, "] is not a valid global search section name");
        serializable = new IllegalArgumentException(string2);
        throw serializable;
    }
}

