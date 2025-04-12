/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.internal.ads.zzcjh;
import com.google.android.gms.internal.ads.zzcjj;
import com.google.android.gms.internal.ads.zzcyp;
import com.google.android.gms.internal.ads.zzcyq;
import com.google.android.gms.internal.ads.zzeer;
import com.google.android.gms.internal.ads.zzees;
import com.google.android.gms.internal.ads.zzeev;
import com.google.android.gms.internal.ads.zzefd;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzeff
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;
    private final zzhlg zze;

    public zzeff(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4, zzhlg zzhlg5, zzhlg zzhlg6) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
        this.zzc = zzhlg4;
        this.zzd = zzhlg5;
        this.zze = zzhlg6;
    }

    public final zzefd zza() {
        Object object;
        Context context = ((zzcjj)this.zza).zza();
        zzcyp zzcyp2 = ((zzcyq)this.zzb).zza();
        Object object2 = object = this.zzc.zzb();
        object2 = (zzeev)object;
        zzeer zzeer2 = ((zzees)this.zzd).zza();
        zzg zzg2 = ((zzcjh)this.zze).zza();
        object = new zzefd(context, zzcyp2, (zzeev)object2, zzeer2, zzg2);
        return object;
    }
}

