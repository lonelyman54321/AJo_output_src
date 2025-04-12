/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.internal.ads.zzcqd;
import com.google.android.gms.internal.ads.zzczj;
import com.google.android.gms.internal.ads.zzdas;
import com.google.android.gms.internal.ads.zzdbf;
import com.google.android.gms.internal.ads.zzdbr;
import com.google.android.gms.internal.ads.zzdef;
import com.google.android.gms.internal.ads.zzdqf;
import com.google.android.gms.internal.ads.zzdqn;
import com.google.android.gms.internal.ads.zzdqs;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgw;
import java.util.Objects;

public final class zzdqo {
    private final zzczj zza;
    private final zzdas zzb;
    private final zzdbf zzc;
    private final zzdbr zzd;
    private final zzdef zze;
    private final zzfgt zzf;
    private final zzfgw zzg;
    private final zzcqd zzh;

    public zzdqo(zzczj zzczj2, zzdas zzdas2, zzdbf zzdbf2, zzdbr zzdbr2, zzdef zzdef2, zzfgt zzfgt2, zzfgw zzfgw2, zzcqd zzcqd2) {
        this.zza = zzczj2;
        this.zzb = zzdas2;
        this.zzc = zzdbf2;
        this.zzd = zzdbr2;
        this.zze = zzdef2;
        this.zzf = zzfgt2;
        this.zzg = zzfgw2;
        this.zzh = zzcqd2;
    }

    public final void zza(zzdqs zzdqs2) {
        Object object = this.zzb;
        Object object2 = zzdqs.zzb(zzdqs2);
        Objects.requireNonNull(object);
        zzdqn zzdqn2 = new zzdqn((zzdas)object);
        Object object3 = this.zza;
        zzdbf zzdbf2 = this.zzc;
        zzdbr zzdbr2 = this.zzd;
        zzdef zzdef2 = this.zze;
        ((zzdqf)object2).zzh((zza)object3, zzdbf2, zzdbr2, zzdef2, zzdqn2);
        object = this.zzf;
        object2 = this.zzg;
        object3 = this.zzh;
        zzdqs2.zzh((zzfgt)object, (zzfgw)object2, (zzcqd)object3);
    }
}

