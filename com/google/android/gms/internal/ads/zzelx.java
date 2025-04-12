/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzdrm;
import com.google.android.gms.internal.ads.zzelw;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzelx
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzelx(zzhlg zzhlg2, zzhlg zzhlg3) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
    }

    public final zzelw zza() {
        Context context = (Context)this.zza.zzb();
        zzdrm zzdrm2 = (zzdrm)this.zzb.zzb();
        zzelw zzelw2 = new zzelw(context, zzdrm2);
        return zzelw2;
    }
}

