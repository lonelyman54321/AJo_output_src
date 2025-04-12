/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.internal.ads.zzcjh;
import com.google.android.gms.internal.ads.zzeer;
import com.google.android.gms.internal.ads.zzees;
import com.google.android.gms.internal.ads.zzeez;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzefa
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzefa(zzhlg zzhlg2, zzhlg zzhlg3) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
    }

    public final zzeez zza() {
        zzeer zzeer2 = ((zzees)this.zza).zza();
        zzg zzg2 = ((zzcjh)this.zzb).zza();
        zzeez zzeez2 = new zzeez(zzeer2, zzg2);
        return zzeez2;
    }
}

