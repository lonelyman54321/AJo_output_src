/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.analytics;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public abstract class zzj {
    public static String zza(Object object) {
        return zzj.zzd(object, 0);
    }

    public static String zzb(Map map2) {
        return zzj.zzd(map2, 1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String zzd(Object object, int n3) {
        char c2;
        int n4 = 10;
        if (n3 > n4) {
            return "ERROR: Recursive toString calls";
        }
        if (object == null) return "";
        n4 = object instanceof String;
        if (n4 != 0) {
            Object object2 = object;
            object2 = (String)object;
            n3 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
            if (n3 != 0) return "";
            return object.toString();
        }
        n4 = object instanceof Integer;
        if (n4 != 0) {
            Object object3 = object;
            object3 = (Integer)object;
            n3 = (Integer)object3;
            if (n3 == 0) return "";
            return object.toString();
        }
        n4 = object instanceof Long;
        if (n4 != 0) {
            Iterator iterator = object;
            iterator = (Long)object;
            long l2 = (Long)((Object)iterator);
            long l3 = 0L;
            double d2 = 0.0;
            n3 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
            if (n3 == 0) return "";
            return object.toString();
        }
        n4 = object instanceof Double;
        if (n4 != 0) {
            Iterator iterator = object;
            iterator = (Double)object;
            double d5 = (Double)((Object)iterator);
            long l4 = 0L;
            double d7 = 0.0;
            double d9 = d5 - d7;
            n3 = (int)(d9 == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1));
            if (n3 == 0) return "";
            return object.toString();
        }
        n4 = object instanceof Boolean;
        if (n4 != 0) {
            Object object4 = object;
            object4 = (Boolean)object;
            n3 = (int)(((Boolean)object4).booleanValue() ? 1 : 0);
            if (n3 == 0) return "";
            return object.toString();
        }
        n4 = object instanceof List;
        String string2 = ", ";
        if (n4 != 0) {
            boolean bl2;
            StringBuilder stringBuilder = new StringBuilder();
            if (n3 > 0) {
                String string3 = "[";
                stringBuilder.append(string3);
            }
            object = (List)object;
            int n7 = stringBuilder.length();
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                Object e2 = object.next();
                int n8 = stringBuilder.length();
                if (n8 > n7) {
                    stringBuilder.append(string2);
                }
                n8 = n3 + 1;
                String string4 = zzj.zzd(e2, n8);
                stringBuilder.append(string4);
            }
            if (n3 <= 0) return stringBuilder.toString();
            object = "]";
            stringBuilder.append((String)object);
            return stringBuilder.toString();
        }
        n4 = object instanceof Map;
        if (n4 == 0) return object.toString();
        StringBuilder stringBuilder = new StringBuilder();
        object = (Map)object;
        Object object5 = new TreeMap(object);
        object = ((TreeMap)object5).entrySet().iterator();
        boolean bl3 = false;
        object5 = null;
        int n10 = 0;
        Object var17_25 = null;
        while ((c2 = object.hasNext()) != '\u0000') {
            Object object6 = (Map.Entry)object.next();
            Object v4 = object6.getValue();
            int n14 = n3 + 1;
            String string5 = zzj.zzd(v4, n14);
            if ((n14 = (int)(TextUtils.isEmpty((CharSequence)string5) ? 1 : 0)) != 0) continue;
            if (n3 > 0 && !bl3) {
                object5 = "{";
                stringBuilder.append((String)object5);
                n10 = stringBuilder.length();
                bl3 = true;
            }
            if ((n14 = stringBuilder.length()) > n10) {
                stringBuilder.append(string2);
            }
            object6 = (String)object6.getKey();
            stringBuilder.append((String)object6);
            c2 = '=';
            stringBuilder.append(c2);
            stringBuilder.append(string5);
        }
        if (!bl3) return stringBuilder.toString();
        object = "}";
        stringBuilder.append((String)object);
        return stringBuilder.toString();
    }

    public abstract void zzc(zzj var1);
}

