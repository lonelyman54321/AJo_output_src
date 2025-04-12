/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.PackageInfo
 */
package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzfyv;
import java.util.List;

public final class zzfay {
    private final zzbxu zza;
    private final int zzb;

    public zzfay(zzbxu zzbxu2, int n3) {
        this.zza = zzbxu2;
        this.zzb = n3;
    }

    public final int zza() {
        return this.zzb;
    }

    public final PackageInfo zzb() {
        return this.zza.zzf;
    }

    public final String zzc() {
        return this.zza.zzd;
    }

    public final String zzd() {
        return zzfyv.zzc(this.zza.zza.getString("ms"));
    }

    public final String zze() {
        return this.zza.zzh;
    }

    public final List zzf() {
        return this.zza.zze;
    }

    public final boolean zzg() {
        return this.zza.zzl;
    }

    public final boolean zzh() {
        return this.zza.zza.getBoolean("is_gbid");
    }

    public final boolean zzi() {
        return this.zza.zzk;
    }
}

