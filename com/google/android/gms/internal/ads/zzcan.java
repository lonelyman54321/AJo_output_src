/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzcam;
import com.google.android.gms.internal.ads.zzcap;
import com.google.android.gms.internal.ads.zzcau;
import com.google.android.gms.internal.ads.zzcav;
import com.google.android.gms.internal.ads.zzhkx;

final class zzcan {
    private Context zza;
    private Clock zzb;
    private zzg zzc;
    private zzcau zzd;

    private zzcan() {
        throw null;
    }

    public /* synthetic */ zzcan(zzcam zzcam2) {
    }

    public final zzcan zza(zzg zzg2) {
        this.zzc = zzg2;
        return this;
    }

    public final zzcan zzb(Context context) {
        context.getClass();
        this.zza = context;
        return this;
    }

    public final zzcan zzc(Clock clock) {
        clock.getClass();
        this.zzb = clock;
        return this;
    }

    public final zzcan zzd(zzcau zzcau2) {
        this.zzd = zzcau2;
        return this;
    }

    public final zzcav zze() {
        zzhkx.zzc(this.zza, Context.class);
        zzhkx.zzc(this.zzb, Clock.class);
        zzhkx.zzc(this.zzc, zzg.class);
        zzhkx.zzc(this.zzd, zzcau.class);
        Context context = this.zza;
        Clock clock = this.zzb;
        zzg zzg2 = this.zzc;
        zzcau zzcau2 = this.zzd;
        zzcap zzcap2 = new zzcap(context, clock, zzg2, zzcau2, null);
        return zzcap2;
    }
}

