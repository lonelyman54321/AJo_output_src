/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzeul;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhkx;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzeun
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzeun(zzhlg zzhlg2, zzhlg zzhlg3) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
    }

    public final zzeul zza() {
        Context context = (Context)this.zza.zzb();
        zzgge zzgge2 = zzcci.zza;
        zzhkx.zzb(zzgge2);
        zzeul zzeul2 = new zzeul(context, zzgge2);
        return zzeul2;
    }
}

