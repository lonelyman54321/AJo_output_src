/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.analytics.zzj;
import java.util.HashMap;

public final class zzaz
extends zzj {
    public int zza;
    public int zzb;
    private String zzc;

    public final String toString() {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        Object object = this.zzc;
        hashMap.put("language", object);
        Integer n3 = 0;
        hashMap.put("screenColors", n3);
        object = this.zza;
        hashMap.put("screenWidth", object);
        object = this.zzb;
        hashMap.put("screenHeight", object);
        hashMap.put("viewportWidth", n3);
        hashMap.put("viewportHeight", n3);
        return zzj.zza(hashMap);
    }

    public final String zzd() {
        return this.zzc;
    }

    public final void zze(String string2) {
        this.zzc = string2;
    }
}

