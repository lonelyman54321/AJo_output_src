/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzb;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjj;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzqv;
import com.google.android.gms.internal.gtm.zzqx;
import com.google.android.gms.internal.gtm.zzqz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class zzjk {
    public static final /* synthetic */ int zza;
    private static final Map zzb;

    static {
        HashMap<String, zzjj> hashMap = new HashMap<String, zzjj>();
        String string2 = com.google.android.gms.internal.gtm.zza.zzam.toString();
        zzjj zzjj2 = new zzjj("contains");
        hashMap.put(string2, zzjj2);
        string2 = com.google.android.gms.internal.gtm.zza.zzal.toString();
        zzjj2 = new zzjj("endsWith");
        hashMap.put(string2, zzjj2);
        string2 = com.google.android.gms.internal.gtm.zza.zzan.toString();
        zzjj2 = new zzjj("equals");
        hashMap.put(string2, zzjj2);
        string2 = com.google.android.gms.internal.gtm.zza.zzar.toString();
        zzjj2 = new zzjj("greaterEquals");
        hashMap.put(string2, zzjj2);
        string2 = com.google.android.gms.internal.gtm.zza.zzaq.toString();
        zzjj2 = new zzjj("greaterThan");
        hashMap.put(string2, zzjj2);
        string2 = com.google.android.gms.internal.gtm.zza.zzap.toString();
        zzjj2 = new zzjj("lessEquals");
        hashMap.put(string2, zzjj2);
        string2 = com.google.android.gms.internal.gtm.zza.zzao.toString();
        zzjj2 = new zzjj("lessThan");
        hashMap.put(string2, zzjj2);
        string2 = com.google.android.gms.internal.gtm.zza.zzaj.toString();
        String[] stringArray = com.google.android.gms.internal.gtm.zzb.zzr.toString();
        String string3 = com.google.android.gms.internal.gtm.zzb.zzs.toString();
        String string4 = com.google.android.gms.internal.gtm.zzb.zzbx.toString();
        stringArray = new String[]{stringArray, string3, string4};
        zzjj2 = new zzjj("regex", stringArray);
        hashMap.put(string2, zzjj2);
        string2 = com.google.android.gms.internal.gtm.zza.zzak.toString();
        zzjj2 = new zzjj("startsWith");
        hashMap.put(string2, zzjj2);
        zzb = hashMap;
    }

    public static zzqx zza(String object, Map arrayList, zzhx object2) {
        object2 = zzb;
        boolean bl2 = object2.containsKey(object);
        if (bl2) {
            int n3;
            object = (zzjj)object2.get(object);
            object2 = ((zzjj)object).zzb();
            ArrayList<Object> arrayList2 = new ArrayList<Object>();
            for (int i3 = 0; i3 < (n3 = ((String[])object2).length); ++i3) {
                Object object3 = object2[i3];
                n3 = (int)(arrayList.containsKey(object3) ? 1 : 0);
                if (n3 == 0) {
                    object3 = zzqs.zze;
                    arrayList2.add(object3);
                    continue;
                }
                object3 = object2[i3];
                object3 = (zzqo)arrayList.get(object3);
                arrayList2.add(object3);
            }
            arrayList = new ArrayList<String[]>();
            object2 = new zzqz("gtmUtils");
            arrayList.add((String[])object2);
            object2 = new zzqx("15", arrayList);
            arrayList = new ArrayList<String[]>();
            arrayList.add((String[])object2);
            object2 = new zzqz("mobile");
            arrayList.add((String[])object2);
            object2 = new zzqx("17", arrayList);
            arrayList = new ArrayList<String[]>();
            arrayList.add((String[])object2);
            object = ((zzjj)object).zza();
            object2 = new zzqz((String)object);
            arrayList.add((String[])object2);
            object = new zzqv(arrayList2);
            arrayList.add((String[])object);
            object = new zzqx("2", arrayList);
            return object;
        }
        object = cP.a("Fail to convert ", (String)object, " to the internal representation");
        arrayList = new ArrayList<String[]>((String)object);
        throw arrayList;
    }

    public static String zzb(String string2) {
        Map map2 = zzb;
        boolean bl2 = map2.containsKey(string2);
        if (bl2) {
            return ((zzjj)map2.get(string2)).zza();
        }
        return null;
    }
}

