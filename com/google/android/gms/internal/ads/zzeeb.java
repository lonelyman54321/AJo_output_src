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
import com.google.android.gms.internal.ads.zzeea;
import com.google.android.gms.internal.ads.zzeef;
import com.google.android.gms.internal.ads.zzeei;
import com.google.android.gms.internal.ads.zzeej;
import com.google.android.gms.internal.ads.zzezj;
import com.google.android.gms.internal.ads.zzezl;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkx;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzeeb
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;
    private final zzhlg zze;
    private final zzhlg zzf;
    private final zzhlg zzg;

    public zzeeb(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4, zzhlg zzhlg5, zzhlg zzhlg6, zzhlg zzhlg7, zzhlg zzhlg8) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
        this.zzc = zzhlg4;
        this.zzd = zzhlg5;
        this.zze = zzhlg6;
        this.zzf = zzhlg7;
        this.zzg = zzhlg8;
    }

    public final /* synthetic */ Object zzb() {
        Context context = ((zzcjj)this.zza).zza();
        Object object = this.zzc;
        Object object2 = this.zzb.zzb();
        Object object3 = object.zzb();
        zzeef zzeef2 = new zzeef();
        zzeei zzeei2 = ((zzeej)this.zze).zza();
        zzgge zzgge2 = zzcci.zza;
        zzhkx.zzb(zzgge2);
        zzbyd zzbyd2 = new zzbyd();
        object = new zzeea(context, (zzezl)object2, (zzezj)object3, zzeef2, zzeei2, zzgge2, zzbyd2);
        return object;
    }
}

