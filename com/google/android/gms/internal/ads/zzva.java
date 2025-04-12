/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaea;
import com.google.android.gms.internal.ads.zzalt;
import com.google.android.gms.internal.ads.zzha;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

final class zzva {
    private final zzaea zza;
    private final Map zzb;
    private final Set zzc;
    private final Map zzd;
    private zzha zze;
    private final zzalt zzf;

    public zzva(zzaea hashMap, zzalt zzalt2) {
        this.zza = hashMap;
        this.zzf = zzalt2;
        hashMap = new HashMap();
        this.zzb = hashMap;
        this.zzc = hashMap;
        this.zzd = hashMap = new HashMap();
    }

    public final void zza(zzha object) {
        zzha zzha2 = this.zze;
        if (object != zzha2) {
            this.zze = object;
            this.zzb.clear();
            object = this.zzd;
            object.clear();
        }
    }
}

