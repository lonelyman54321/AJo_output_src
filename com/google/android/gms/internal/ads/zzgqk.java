/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgqg;
import com.google.android.gms.internal.ads.zzgqi;
import com.google.android.gms.internal.ads.zzgqj;
import com.google.android.gms.internal.ads.zzgtk;
import com.google.android.gms.internal.ads.zzgze;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class zzgqk {
    private final Map zza;
    private final List zzb;
    private final zzgqi zzc;
    private final Class zzd;
    private final zzgtk zze;

    public /* synthetic */ zzgqk(Map map2, List list, zzgqi zzgqi2, zzgtk zzgtk2, Class clazz, zzgqj zzgqj2) {
        this.zza = map2;
        this.zzb = list;
        this.zzc = zzgqi2;
        this.zzd = clazz;
        this.zze = zzgtk2;
    }

    public static zzgqg zza(Class clazz) {
        zzgqg zzgqg2 = new zzgqg(clazz, null);
        return zzgqg2;
    }

    public final zzgqi zzb() {
        return this.zzc;
    }

    public final zzgtk zzc() {
        return this.zze;
    }

    public final Class zzd() {
        return this.zzd;
    }

    public final Collection zze() {
        return this.zza.values();
    }

    public final List zzf(byte[] object) {
        Map map2 = this.zza;
        object = zzgze.zzb(object);
        if ((object = (Object)((List)map2.get(object))) != null) {
            return object;
        }
        return Collections.emptyList();
    }

    public final boolean zzg() {
        Map map2 = this.zze.zza();
        boolean bl2 = map2.isEmpty();
        return !bl2;
    }
}

