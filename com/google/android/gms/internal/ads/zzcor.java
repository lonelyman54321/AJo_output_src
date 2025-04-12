/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcot;
import com.google.android.gms.internal.ads.zzcou;
import com.google.android.gms.internal.ads.zzfhd;
import com.google.android.gms.internal.ads.zzfhf;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public final class zzcor {
    private final Map zza;
    private final Map zzb;

    public zzcor(Map map2, Map map3) {
        this.zza = map2;
        this.zzb = map3;
    }

    public final void zza(zzfhf object) {
        boolean bl2;
        object = ((zzfhf)object).zzb.zzc.iterator();
        while (bl2 = object.hasNext()) {
            boolean bl3;
            zzfhd zzfhd2 = (zzfhd)object.next();
            Object object2 = this.zza;
            Object object3 = zzfhd2.zza;
            boolean bl4 = object2.containsKey(object3);
            if (bl4) {
                object2 = this.zza;
                object3 = zzfhd2.zza;
                object2 = (zzcou)object2.get(object3);
                zzfhd2 = zzfhd2.zzb;
                object2.zza((JSONObject)zzfhd2);
                continue;
            }
            object2 = this.zzb;
            object3 = zzfhd2.zza;
            bl4 = object2.containsKey(object3);
            if (!bl4) continue;
            object2 = this.zzb;
            object3 = zzfhd2.zza;
            object2 = (zzcot)object2.get(object3);
            zzfhd2 = zzfhd2.zzb;
            object3 = new Object();
            Iterator iterator = zzfhd2.keys();
            while (bl3 = iterator.hasNext()) {
                String string2 = (String)iterator.next();
                String string3 = zzfhd2.optString(string2);
                if (string3 == null) continue;
                ((HashMap)object3).put(string2, string3);
            }
            object2.zza((Map)object3);
        }
    }
}

