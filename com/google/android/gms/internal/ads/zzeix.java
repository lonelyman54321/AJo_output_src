/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzctg;
import com.google.android.gms.internal.ads.zzeiw;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzeix
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzeix(zzhlg zzhlg2, zzhlg zzhlg3) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
    }

    public final zzeiw zza() {
        Context context = (Context)this.zza.zzb();
        zzctg zzctg2 = (zzctg)this.zzb.zzb();
        zzeiw zzeiw2 = new zzeiw(context, zzctg2);
        return zzeiw2;
    }
}

