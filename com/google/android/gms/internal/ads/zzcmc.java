/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcla;
import com.google.android.gms.internal.ads.zzcmb;
import com.google.android.gms.internal.ads.zzcme;
import com.google.android.gms.internal.ads.zzcmi;
import com.google.android.gms.internal.ads.zzdwd;
import com.google.android.gms.internal.ads.zzdwe;
import com.google.android.gms.internal.ads.zzhkx;

final class zzcmc
implements zzdwd {
    private final zzcla zza;
    private final zzcmi zzb;
    private Long zzc;
    private String zzd;

    public /* synthetic */ zzcmc(zzcla zzcla2, zzcmi zzcmi2, zzcmb zzcmb2) {
        this.zza = zzcla2;
        this.zzb = zzcmi2;
    }

    public final /* synthetic */ zzdwd zza(String string2) {
        string2.getClass();
        this.zzd = string2;
        return this;
    }

    public final zzdwe zzc() {
        zzhkx.zzc(this.zzc, Long.class);
        zzhkx.zzc(this.zzd, String.class);
        zzcla zzcla2 = this.zza;
        zzcmi zzcmi2 = this.zzb;
        Long l2 = this.zzc;
        String string2 = this.zzd;
        zzcme zzcme2 = new zzcme(zzcla2, zzcmi2, l2, string2, null);
        return zzcme2;
    }
}

