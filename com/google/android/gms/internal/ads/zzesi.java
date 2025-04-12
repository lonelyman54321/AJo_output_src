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
import com.google.android.gms.internal.ads.zzesg;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkx;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzesi
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzesi(zzhlg zzhlg2, zzhlg zzhlg3) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
    }

    public final zzesg zza() {
        zzgge zzgge2 = zzcci.zza;
        zzhkx.zzb(zzgge2);
        Context context = ((zzcjj)this.zzb).zza();
        zzesg zzesg2 = new zzesg(zzgge2, context);
        return zzesg2;
    }
}

