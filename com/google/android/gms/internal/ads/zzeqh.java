/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.ViewGroup
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzcjj;
import com.google.android.gms.internal.ads.zzcsd;
import com.google.android.gms.internal.ads.zzczc;
import com.google.android.gms.internal.ads.zzeqf;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkx;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzeqh
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;
    private final zzhlg zze;

    public zzeqh(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4, zzhlg zzhlg5, zzhlg zzhlg6) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
        this.zzc = zzhlg4;
        this.zzd = zzhlg5;
        this.zze = zzhlg6;
    }

    public final zzeqf zza() {
        Object object;
        Object object2 = object = this.zza.zzb();
        object2 = (zzgge)object;
        zzgge zzgge2 = zzcci.zza;
        zzhkx.zzb(zzgge2);
        Context context = ((zzcjj)this.zzc).zza();
        zzfho zzfho2 = ((zzczc)this.zzd).zza();
        ViewGroup viewGroup = ((zzcsd)this.zze).zza();
        object = new zzeqf((zzgge)object2, zzgge2, context, zzfho2, viewGroup);
        return object;
    }
}

