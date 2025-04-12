/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzjl;
import com.google.android.gms.internal.gtm.zzoy;
import com.google.android.gms.internal.gtm.zzpz;
import com.google.android.gms.internal.gtm.zzqb;
import com.google.android.gms.internal.gtm.zzqc;
import com.google.android.gms.internal.gtm.zzqe;
import com.google.android.gms.internal.gtm.zzqi;
import com.google.android.gms.internal.gtm.zzqk;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzqx;
import com.google.android.gms.internal.gtm.zzra;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzoz {
    public static zzjl zza(Object object) {
        block12: {
            int n3;
            Object object2;
            Object object3;
            int n4;
            JSONArray jSONArray;
            Object object4;
            String string2;
            int n7;
            block11: {
                int n8;
                int n10;
                block10: {
                    n10 = object instanceof JSONObject;
                    n7 = 0;
                    if (n10 == 0) break block10;
                    object = (JSONObject)object;
                    string2 = object.getString("name");
                    object4 = object.getJSONArray("params");
                    jSONArray = "instructions";
                    object = object.getJSONArray((String)jSONArray);
                    break block11;
                }
                n10 = object instanceof JSONArray;
                if (n10 == 0) break block12;
                object = (JSONArray)object;
                n10 = object.length();
                int n14 = 3;
                int n15 = 1;
                if (n10 >= n14) {
                    n10 = 1;
                } else {
                    n10 = 0;
                    string2 = null;
                }
                Preconditions.checkArgument(n10 != 0);
                string2 = object.getString(n15);
                n4 = 2;
                object3 = object.getJSONArray(n4);
                object2 = new JSONArray();
                while (n15 < (n8 = object3.length())) {
                    n8 = object3.get(n15) instanceof String;
                    Preconditions.checkArgument(n8 != 0);
                    Object object5 = object3.get(n15);
                    object2.put(object5);
                    ++n15;
                }
                jSONArray = new JSONArray();
                while (n14 < (n4 = object.length())) {
                    object3 = object.get(n14);
                    jSONArray.put(object3);
                    ++n14;
                }
                object = jSONArray;
                object4 = object2;
            }
            jSONArray = new ArrayList();
            object3 = null;
            for (n4 = 0; n4 < (n3 = object4.length()); ++n4) {
                object2 = object4.getString(n4);
                jSONArray.add(object2);
            }
            object4 = new ArrayList();
            while (n7 < (n4 = object.length())) {
                object3 = object.getJSONArray(n7);
                n3 = object3.length();
                if (n3 != 0) {
                    object3 = zzoz.zze(object3);
                    ((ArrayList)object4).add(object3);
                }
                ++n7;
            }
            object = new zzjl(null, string2, (List)jSONArray, (List)object4);
            return object;
        }
        object = new IllegalArgumentException("invalid JSON in runtime section");
        throw object;
    }

    public static zzqe zzb(JSONArray jSONArray, List list, List list2) {
        int n3;
        zzqc zzqc2 = new zzqc();
        for (int i3 = 0; i3 < (n3 = jSONArray.length()); ++i3) {
            String string2;
            int n4;
            Object object = jSONArray.getJSONArray(i3);
            Object object2 = object.getString(0);
            String string3 = "if";
            int n7 = ((String)object2).equals(string3);
            if (n7 != 0) {
                for (n4 = 1; n4 < (n7 = object.length()); ++n4) {
                    n7 = object.getInt(n4);
                    object2 = (zzqb)list2.get(n7);
                    zzqc2.zzc((zzqb)object2);
                }
                continue;
            }
            object2 = object.getString(0);
            n7 = (int)(((String)object2).equals(string2 = "unless") ? 1 : 0);
            if (n7 != 0) {
                while (n4 < (n7 = object.length())) {
                    n7 = object.getInt(n4);
                    object2 = (zzqb)list2.get(n7);
                    zzqc2.zzb((zzqb)object2);
                    ++n4;
                }
                continue;
            }
            object2 = object.getString(0);
            n7 = (int)(((String)object2).equals(string2 = "add") ? 1 : 0);
            if (n7 != 0) {
                while (n4 < (n7 = object.length())) {
                    n7 = object.getInt(n4);
                    object2 = (zzqb)list.get(n7);
                    zzqc2.zza((zzqb)object2);
                    ++n4;
                }
                continue;
            }
            object2 = object.getString(0);
            n7 = (int)(((String)object2).equals(string2 = "block") ? 1 : 0);
            if (n7 != 0) {
                while (n4 < (n7 = object.length())) {
                    n7 = object.getInt(n4);
                    object2 = (zzqb)list.get(n7);
                    zzqc2.zzd((zzqb)object2);
                    ++n4;
                }
                continue;
            }
            object = String.valueOf(object.getString(0));
            object2 = "Unknown Rule property: ";
            object = ((String)object2).concat((String)object);
            zzoz.zzf((String)object);
        }
        return zzqc2.zze();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static zzqi zzc(Object object, List object2) {
        int n3 = object instanceof JSONArray;
        int n4 = 0;
        Object object3 = "Invalid value type: ";
        boolean bl2 = true;
        if (n3 == 0) {
            boolean bl3 = object instanceof Boolean;
            if (bl3) {
                n3 = 8;
                return new zzqi(n3, object);
            }
            bl3 = object instanceof Integer;
            if (bl3) {
                n3 = 6;
                return new zzqi(n3, object);
            }
            bl3 = object instanceof String;
            if (bl3) {
                return new zzqi((int)(bl2 ? 1 : 0), object);
            }
        } else {
            Object object4 = object;
            object4 = (JSONArray)object;
            int n7 = 0;
            Object object5 = object4.getString(0);
            String string2 = "escape";
            boolean bl4 = ((String)object5).equals(string2);
            int n8 = 2;
            if (bl4) {
                int n10;
                object = zzoz.zzc(object4.get((int)(bl2 ? 1 : 0)), (List)object2);
                while (n8 < (n10 = object4.length())) {
                    n10 = object4.getInt(n8);
                    ((zzqi)object).zza(n10);
                    ++n8;
                }
                return object;
            }
            string2 = "list";
            bl4 = ((String)object5).equals(string2);
            if (bl4) {
                int n14;
                object = new ArrayList();
                for (n4 = 1; n4 < (n14 = object4.length()); ++n4) {
                    object3 = zzoz.zzc(object4.get(n4), (List)object2).zzc();
                    ((ArrayList)object).add(object3);
                }
                object2 = new zzqi(n8, object);
                ((zzqi)object2).zzb(bl2);
                return object2;
            }
            string2 = "map";
            bl4 = ((String)object5).equals(string2);
            if (bl4) {
                int n15;
                object = new HashMap();
                for (n4 = 1; n4 < (n15 = object4.length()); n4 += 2) {
                    object3 = zzoz.zzc(object4.get(n4), (List)object2).zzc();
                    n7 = n4 + 1;
                    object5 = zzoz.zzc(object4.get(n7), (List)object2).zzc();
                    ((HashMap)object).put(object3, object5);
                }
                n3 = 3;
                object2 = new zzqi(n3, object);
                ((zzqi)object2).zzb(bl2);
                return object2;
            }
            string2 = "macro";
            bl4 = ((String)object5).equals(string2);
            if (!bl4) {
                string2 = "template";
                n7 = ((String)object5).equals(string2);
                if (n7 != 0) {
                    int n16;
                    object = new ArrayList();
                    for (n4 = 1; n4 < (n16 = object4.length()); ++n4) {
                        object3 = object4.get(n4);
                        object3 = zzoz.zzc(object3, (List)object2).zzc();
                        ((ArrayList)object).add(object3);
                    }
                    n3 = 7;
                    object2 = new zzqi(n3, object);
                    ((zzqi)object2).zzb(bl2);
                    return object2;
                }
                object = String.valueOf(object);
                zzoz.zzf(((String)object3).concat((String)object));
                return null;
            }
            n3 = object4.getInt((int)(bl2 ? 1 : 0));
            object2 = object2.get(n3);
            n3 = 4;
            object = new zzqi(n3, object2);
            ((zzqi)object).zzb(bl2);
            return object;
        }
        object = String.valueOf(object);
        zzoz.zzf(((String)object3).concat((String)object));
        return null;
    }

    public static List zzd(JSONArray jSONArray, List list) {
        int n3;
        ArrayList<JSONObject> arrayList = new ArrayList<JSONObject>();
        for (int i3 = 0; i3 < (n3 = jSONArray.length()); ++i3) {
            boolean bl2;
            Object object = jSONArray.getJSONObject(i3);
            zzpz zzpz2 = new zzpz();
            Iterator iterator = object.keys();
            while (bl2 = iterator.hasNext()) {
                String string2 = (String)iterator.next();
                zzqk zzqk2 = zzoz.zzc(object.get(string2), list).zzc();
                String string3 = "push_after_evaluate";
                boolean bl3 = string3.equals(string2);
                if (bl3) {
                    zzpz2.zzb(zzqk2);
                    continue;
                }
                zzpz2.zza(string2, zzqk2);
            }
            object = zzpz2.zzc();
            arrayList.add((JSONObject)object);
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    private static zzqx zze(JSONArray object) {
        int n3;
        void var1_4;
        String string2;
        int bl2 = object.length();
        ArrayList<Object> arrayList = null;
        int n4 = 1;
        if (bl2 > 0) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
            string2 = null;
        }
        Preconditions.checkArgument((boolean)var1_4);
        string2 = object.getString(0);
        arrayList = new ArrayList<Object>();
        while (n4 < (n3 = object.length())) {
            Object object2 = object.get(n4);
            int n7 = object2 instanceof JSONArray;
            if (n7 != 0) {
                n7 = (object2 = (JSONArray)object2).length();
                if (n7 != 0) {
                    object2 = zzoz.zze((JSONArray)object2);
                    arrayList.add(object2);
                }
            } else {
                Object object3 = JSONObject.NULL;
                if (object2 == object3) {
                    object2 = zzqs.zzd;
                    arrayList.add(object2);
                } else {
                    object2 = zzra.zzb(object2);
                    arrayList.add(object2);
                }
            }
            ++n4;
        }
        object = new zzqx(string2, arrayList);
        return object;
    }

    private static void zzf(String string2) {
        zzhi.zza(string2);
        zzoy zzoy2 = new zzoy(string2);
        throw zzoy2;
    }
}

