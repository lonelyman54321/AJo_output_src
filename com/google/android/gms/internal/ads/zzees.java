/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeen;
import com.google.android.gms.internal.ads.zzeeo;
import com.google.android.gms.internal.ads.zzeer;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzees
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzees(zzhlg zzhlg2, zzhlg zzhlg3) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
    }

    public final zzeer zza() {
        zzeen zzeen2 = ((zzeeo)this.zza).zza();
        zzgge zzgge2 = (zzgge)this.zzb.zzb();
        zzeer zzeer2 = new zzeer(zzeen2, zzgge2);
        return zzeer2;
    }
}

