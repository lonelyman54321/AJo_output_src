/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcjj;
import com.google.android.gms.internal.ads.zzehj;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzehk
implements zzhkp {
    private final zzhlg zza;

    public zzehk(zzhlg zzhlg2) {
        this.zza = zzhlg2;
    }

    public final zzehj zza() {
        Context context = ((zzcjj)this.zza).zza();
        zzehj zzehj2 = new zzehj(context);
        return zzehj2;
    }
}

