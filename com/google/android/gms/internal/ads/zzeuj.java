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
import com.google.android.gms.internal.ads.zzeui;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkx;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzeuj
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzeuj(zzhlg zzhlg2, zzhlg zzhlg3) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
    }

    public final zzeui zza() {
        Context context = ((zzcjj)this.zza).zza();
        zzgge zzgge2 = zzcci.zza;
        zzhkx.zzb(zzgge2);
        zzeui zzeui2 = new zzeui(context, zzgge2);
        return zzeui2;
    }
}

