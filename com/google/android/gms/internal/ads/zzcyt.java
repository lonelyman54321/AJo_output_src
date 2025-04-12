/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzcyn;
import com.google.android.gms.internal.ads.zzcyv;
import com.google.android.gms.internal.ads.zzehq;
import com.google.android.gms.internal.ads.zzfhg;
import com.google.android.gms.internal.ads.zzfho;

public final class zzcyt {
    private Context zza;
    private zzfho zzb;
    private Bundle zzc;
    private zzfhg zzd;
    private zzcyn zze;
    private zzehq zzf;

    public static /* bridge */ /* synthetic */ Context zza(zzcyt zzcyt2) {
        return zzcyt2.zza;
    }

    public static /* bridge */ /* synthetic */ Bundle zzb(zzcyt zzcyt2) {
        return zzcyt2.zzc;
    }

    public static /* bridge */ /* synthetic */ zzcyn zzc(zzcyt zzcyt2) {
        return zzcyt2.zze;
    }

    public static /* bridge */ /* synthetic */ zzehq zzk(zzcyt zzcyt2) {
        return zzcyt2.zzf;
    }

    public static /* bridge */ /* synthetic */ zzfhg zzl(zzcyt zzcyt2) {
        return zzcyt2.zzd;
    }

    public static /* bridge */ /* synthetic */ zzfho zzm(zzcyt zzcyt2) {
        return zzcyt2.zzb;
    }

    public final zzcyt zzd(zzehq zzehq2) {
        this.zzf = zzehq2;
        return this;
    }

    public final zzcyt zze(Context context) {
        this.zza = context;
        return this;
    }

    public final zzcyt zzf(Bundle bundle) {
        this.zzc = bundle;
        return this;
    }

    public final zzcyt zzg(zzcyn zzcyn2) {
        this.zze = zzcyn2;
        return this;
    }

    public final zzcyt zzh(zzfhg zzfhg2) {
        this.zzd = zzfhg2;
        return this;
    }

    public final zzcyt zzi(zzfho zzfho2) {
        this.zzb = zzfho2;
        return this;
    }

    public final zzcyv zzj() {
        zzcyv zzcyv2 = new zzcyv(this, null);
        return zzcyv2;
    }
}

