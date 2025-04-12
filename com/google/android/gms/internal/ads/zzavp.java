/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzavn;
import java.util.HashMap;

public final class zzavp
extends zzavn {
    public String zza;
    public long zzb;
    public String zzc;
    public String zzd;
    public String zze;

    public zzavp() {
        String string2;
        this.zza = string2 = "E";
        this.zzb = -1;
        this.zzc = string2;
        this.zzd = string2;
        this.zze = string2;
    }

    public zzavp(String object) {
        long l2;
        Object object2 = "E";
        this.zza = object2;
        this.zzb = l2 = (long)-1;
        this.zzc = object2;
        this.zzd = object2;
        this.zze = object2;
        object = zzavn.zza((String)object);
        if (object != null) {
            Object object3;
            int n3 = 0;
            Object object4 = 0;
            Object v4 = ((HashMap)object).get(object4);
            object4 = v4 == null ? object2 : (String)((HashMap)object).get(object4);
            this.zza = object4;
            n3 = 1;
            object4 = n3;
            v4 = ((HashMap)object).get(object4);
            if (v4 != null) {
                object3 = (Long)((HashMap)object).get(object4);
                l2 = (Long)object3;
            }
            this.zzb = l2;
            int n4 = 2;
            object3 = n4;
            Object v5 = ((HashMap)object).get(object3);
            object3 = v5 == null ? object2 : (String)((HashMap)object).get(object3);
            this.zzc = object3;
            n4 = 3;
            object3 = n4;
            v5 = ((HashMap)object).get(object3);
            object3 = v5 == null ? object2 : (String)((HashMap)object).get(object3);
            this.zzd = object3;
            n4 = 4;
            object3 = n4;
            v5 = ((HashMap)object).get(object3);
            if (v5 != null) {
                object2 = object = ((HashMap)object).get(object3);
                object2 = (String)object;
            }
            this.zze = object2;
        }
    }

    public final HashMap zzb() {
        HashMap<Integer, Object> hashMap = new HashMap<Integer, Object>();
        Integer n3 = 0;
        Object object = this.zza;
        hashMap.put(n3, object);
        n3 = 4;
        object = this.zze;
        hashMap.put(n3, object);
        n3 = 3;
        object = this.zzd;
        hashMap.put(n3, object);
        n3 = 2;
        object = this.zzc;
        hashMap.put(n3, object);
        n3 = 1;
        object = this.zzb;
        hashMap.put(n3, object);
        return hashMap;
    }
}

