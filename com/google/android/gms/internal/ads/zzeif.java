/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcrt;
import com.google.android.gms.internal.ads.zzeie;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzeif
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzeif(zzhlg zzhlg2, zzhlg zzhlg3) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
    }

    public final zzeie zza() {
        Context context = (Context)this.zza.zzb();
        zzcrt zzcrt2 = (zzcrt)this.zzb.zzb();
        zzeie zzeie2 = new zzeie(context, zzcrt2);
        return zzeie2;
    }
}

