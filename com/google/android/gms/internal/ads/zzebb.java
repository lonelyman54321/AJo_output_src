/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcau;
import com.google.android.gms.internal.ads.zzcjj;
import com.google.android.gms.internal.ads.zzeba;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzebb
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzebb(zzhlg zzhlg2, zzhlg zzhlg3) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
    }

    public final zzeba zza() {
        Context context = ((zzcjj)this.zza).zza();
        zzcau zzcau2 = (zzcau)this.zzb.zzb();
        zzeba zzeba2 = new zzeba(context, zzcau2);
        return zzeba2;
    }
}

