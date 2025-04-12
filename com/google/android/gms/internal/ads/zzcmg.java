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
import com.google.android.gms.internal.ads.zzcmf;
import com.google.android.gms.internal.ads.zzcmi;
import com.google.android.gms.internal.ads.zzdwl;
import com.google.android.gms.internal.ads.zzdwm;
import com.google.android.gms.internal.ads.zzhkx;

final class zzcmg
implements zzdwl {
    private final zzcla zza;
    private Context zzb;
    private zzbmo zzc;

    public /* synthetic */ zzcmg(zzcla zzcla2, zzcmf zzcmf2) {
        this.zza = zzcla2;
    }

    public final /* synthetic */ zzdwl zza(zzbmo zzbmo2) {
        zzbmo2.getClass();
        this.zzc = zzbmo2;
        return this;
    }

    public final /* synthetic */ zzdwl zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    public final zzdwm zzc() {
        zzhkx.zzc(this.zzb, Context.class);
        zzhkx.zzc(this.zzc, zzbmo.class);
        zzcla zzcla2 = this.zza;
        Context context = this.zzb;
        zzbmo zzbmo2 = this.zzc;
        zzcmi zzcmi2 = new zzcmi(zzcla2, context, zzbmo2, null);
        return zzcmi2;
    }
}

