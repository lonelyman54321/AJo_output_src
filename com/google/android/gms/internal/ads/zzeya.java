/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzcjj;
import com.google.android.gms.internal.ads.zzdvc;
import com.google.android.gms.internal.ads.zzexz;
import com.google.android.gms.internal.ads.zzfmn;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkx;
import com.google.android.gms.internal.ads.zzhld;
import com.google.android.gms.internal.ads.zzhlg;
import java.util.Set;

public final class zzeya
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;
    private final zzhlg zze;

    public zzeya(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4, zzhlg zzhlg5, zzhlg zzhlg6) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
        this.zzc = zzhlg4;
        this.zzd = zzhlg5;
        this.zze = zzhlg6;
    }

    public final zzexz zza() {
        Object object;
        Context context = ((zzcjj)this.zza).zza();
        zzgge zzgge2 = zzcci.zza;
        zzhkx.zzb(zzgge2);
        Set set = ((zzhld)this.zzc).zzc();
        Object object2 = object = this.zzd.zzb();
        object2 = (zzfmn)object;
        Object object3 = object = this.zze.zzb();
        object3 = (zzdvc)object;
        object = new zzexz(context, zzgge2, set, (zzfmn)object2, (zzdvc)object3);
        return object;
    }
}

