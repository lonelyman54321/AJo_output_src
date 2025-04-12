/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzcjj;
import com.google.android.gms.internal.ads.zzczc;
import com.google.android.gms.internal.ads.zzeqx;
import com.google.android.gms.internal.ads.zzesu;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzeqz
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;

    public zzeqz(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4, zzhlg zzhlg5) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
        this.zzc = zzhlg4;
        this.zzd = zzhlg5;
    }

    public final zzeqx zza() {
        zzesu zzesu2 = (zzesu)this.zza.zzb();
        zzfho zzfho2 = ((zzczc)this.zzb).zza();
        Context context = ((zzcjj)this.zzc).zza();
        zzcby zzcby2 = (zzcby)this.zzd.zzb();
        zzeqx zzeqx2 = new zzeqx(zzesu2, zzfho2, context, zzcby2);
        return zzeqx2;
    }
}

