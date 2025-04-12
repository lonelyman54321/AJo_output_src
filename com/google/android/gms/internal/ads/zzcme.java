/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcla;
import com.google.android.gms.internal.ads.zzcmd;
import com.google.android.gms.internal.ads.zzcmi;
import com.google.android.gms.internal.ads.zzdwe;
import com.google.android.gms.internal.ads.zzdwh;
import com.google.android.gms.internal.ads.zzdwo;
import com.google.android.gms.internal.ads.zzdwp;
import com.google.android.gms.internal.ads.zzdws;
import com.google.android.gms.internal.ads.zzdwt;

final class zzcme
implements zzdwe {
    private final Long zza;
    private final String zzb;
    private final zzcla zzc;
    private final zzcmi zzd;
    private final zzcme zze = this;

    public /* synthetic */ zzcme(zzcla zzcla2, zzcmi zzcmi2, Long l2, String string2, zzcmd zzcmd2) {
        this.zzc = zzcla2;
        this.zzd = zzcmi2;
        this.zza = l2;
        this.zzb = string2;
    }

    public final zzdwo zza() {
        zzcmi zzcmi2 = this.zzd;
        long l2 = this.zza;
        Context context = zzcmi.zza(zzcmi2);
        zzdwh zzdwh2 = zzcmi.zzc(zzcmi2);
        zzcla zzcla2 = this.zzc;
        String string2 = this.zzb;
        return zzdwp.zza(l2, context, zzdwh2, zzcla2, string2);
    }

    public final zzdws zzb() {
        zzcmi zzcmi2 = this.zzd;
        long l2 = this.zza;
        Context context = zzcmi.zza(zzcmi2);
        zzdwh zzdwh2 = zzcmi.zzc(zzcmi2);
        zzcla zzcla2 = this.zzc;
        String string2 = this.zzb;
        return zzdwt.zza(l2, context, zzdwh2, zzcla2, string2);
    }
}

