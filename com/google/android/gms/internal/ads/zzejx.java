/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzdjh;
import com.google.android.gms.internal.ads.zzejw;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzejx
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzejx(zzhlg zzhlg2, zzhlg zzhlg3) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
    }

    public final zzejw zza() {
        Context context = (Context)this.zza.zzb();
        zzdjh zzdjh2 = (zzdjh)this.zzb.zzb();
        zzejw zzejw2 = new zzejw(context, zzdjh2);
        return zzejw2;
    }
}

