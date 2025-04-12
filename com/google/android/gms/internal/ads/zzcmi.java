/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzcla;
import com.google.android.gms.internal.ads.zzcmc;
import com.google.android.gms.internal.ads.zzcmh;
import com.google.android.gms.internal.ads.zzdwd;
import com.google.android.gms.internal.ads.zzdwh;
import com.google.android.gms.internal.ads.zzdwi;
import com.google.android.gms.internal.ads.zzdwj;
import com.google.android.gms.internal.ads.zzdwm;
import com.google.android.gms.internal.ads.zzhko;
import com.google.android.gms.internal.ads.zzhkq;
import com.google.android.gms.internal.ads.zzhky;
import com.google.android.gms.internal.ads.zzhlg;

final class zzcmi
implements zzdwm {
    private final Context zza;
    private final zzbmo zzb;
    private final zzcla zzc;
    private final zzcmi zzd = this;
    private final zzhky zze;
    private final zzhky zzf;
    private final zzhky zzg;
    private final zzhky zzh;

    public /* synthetic */ zzcmi(zzcla object, Context object2, zzbmo object3, zzcmh zzcmh2) {
        this.zzc = object;
        this.zza = object2;
        this.zzb = object3;
        this.zze = object = zzhkq.zza(this);
        object2 = zzhkq.zza(object3);
        this.zzf = object2;
        this.zzg = object3 = new zzdwi((zzhlg)object2);
        super((zzhlg)object, (zzhlg)object3);
        this.zzh = object = zzhko.zzc((zzhky)object2);
    }

    public static /* bridge */ /* synthetic */ Context zza(zzcmi zzcmi2) {
        return zzcmi2.zza;
    }

    public static /* synthetic */ zzdwh zzc(zzcmi zzcmi2) {
        return zzdwi.zzc(zzcmi2.zzb);
    }

    public final zzdwd zzb() {
        zzcla zzcla2 = this.zzc;
        zzcmi zzcmi2 = this.zzd;
        zzcmc zzcmc2 = new zzcmc(zzcla2, zzcmi2, null);
        return zzcmc2;
    }

    public final zzdwj zzd() {
        return (zzdwj)this.zzh.zzb();
    }
}

