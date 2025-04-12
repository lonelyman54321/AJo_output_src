/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbyd;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzcjj;
import com.google.android.gms.internal.ads.zzcjs;
import com.google.android.gms.internal.ads.zzcoq;
import com.google.android.gms.internal.ads.zzedq;
import com.google.android.gms.internal.ads.zzeef;
import com.google.android.gms.internal.ads.zzeei;
import com.google.android.gms.internal.ads.zzeej;
import com.google.android.gms.internal.ads.zzfmq;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkx;
import com.google.android.gms.internal.ads.zzhlg;
import java.util.ArrayDeque;

public final class zzedr
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;
    private final zzhlg zze;
    private final zzhlg zzf;
    private final zzhlg zzg;
    private final zzhlg zzh;

    public zzedr(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4, zzhlg zzhlg5, zzhlg zzhlg6, zzhlg zzhlg7, zzhlg zzhlg8, zzhlg zzhlg9) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
        this.zzc = zzhlg4;
        this.zzd = zzhlg5;
        this.zze = zzhlg6;
        this.zzf = zzhlg7;
        this.zzg = zzhlg8;
        this.zzh = zzhlg9;
    }

    public final /* synthetic */ Object zzb() {
        Object object;
        Context context = ((zzcjj)this.zza).zza();
        zzgge zzgge2 = zzcci.zza;
        zzhkx.zzb(zzgge2);
        zzbyd zzbyd2 = new zzbyd();
        zzcoq zzcoq2 = ((zzcjs)this.zzd).zza();
        zzeei zzeei2 = ((zzeej)this.zze).zza();
        Object object2 = object = this.zzf.zzb();
        object2 = (ArrayDeque)object;
        zzeef zzeef2 = new zzeef();
        Object object3 = object = this.zzh.zzb();
        object3 = (zzfmq)object;
        object = new zzedq(context, zzgge2, zzbyd2, zzcoq2, zzeei2, (ArrayDeque)object2, zzeef2, (zzfmq)object3);
        return object;
    }
}

