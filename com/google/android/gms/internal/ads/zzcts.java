/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzctb;
import com.google.android.gms.internal.ads.zzctr;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;
import java.util.concurrent.Executor;

public final class zzcts
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzcts(zzhlg zzhlg2, zzhlg zzhlg3) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
    }

    public final zzctr zza() {
        zzchd zzchd2 = ((zzctb)this.zza).zza();
        Executor executor = (Executor)this.zzb.zzb();
        zzctr zzctr2 = new zzctr(zzchd2, executor);
        return zzctr2;
    }
}

