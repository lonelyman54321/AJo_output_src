/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.internal.gtm.zzb;
import com.google.android.gms.tagmanager.zzal;
import com.google.android.gms.tagmanager.zzbp;
import com.google.android.gms.tagmanager.zzfp;
import java.util.HashMap;
import java.util.Map;

final class zzam
extends zzbp {
    private static final String zza = com.google.android.gms.internal.gtm.zza.zzs.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.zzbp.toString();
    private static final String zzc = com.google.android.gms.internal.gtm.zzb.zze.toString();
    private final zzal zzd;

    public zzam(zzal zzal2) {
        String string2 = zza;
        String[] stringArray = zzb;
        stringArray = new String[]{stringArray};
        super(string2, stringArray);
        this.zzd = zzal2;
    }

    public final zzap zza(Map iterator) {
        String string2 = zzb;
        string2 = zzfp.zzm(zzfp.zzk((zzap)iterator.get(string2)));
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        Object object = zzc;
        if ((iterator = (zzap)iterator.get(object)) != null) {
            boolean bl2 = (iterator = zzfp.zzk((zzap)((Object)iterator))) instanceof Map;
            if (!bl2) {
                return zzfp.zza();
            }
            iterator = ((Map)((Object)iterator)).entrySet().iterator();
            while (bl2 = iterator.hasNext()) {
                object = iterator.next();
                String string3 = object.getKey().toString();
                object = object.getValue();
                hashMap.put(string3, object);
            }
        }
        try {
            iterator = this.zzd;
        }
        catch (Exception exception) {
            exception.getMessage();
            return zzfp.zza();
        }
        iterator = iterator.zza(string2, hashMap);
        return zzfp.zzb(iterator);
    }

    public final boolean zzb() {
        return false;
    }
}

