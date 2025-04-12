/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzehn;
import com.google.android.gms.internal.ads.zzehr;
import com.google.android.gms.internal.ads.zzemx;
import com.google.android.gms.internal.ads.zzflt;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzemy
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;

    public zzemy(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4, zzhlg zzhlg5) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
        this.zzc = zzhlg4;
        this.zzd = zzhlg5;
    }

    public final zzemx zza() {
        zzflt zzflt2 = (zzflt)this.zza.zzb();
        zzgge zzgge2 = (zzgge)this.zzb.zzb();
        zzehn zzehn2 = (zzehn)this.zzc.zzb();
        zzehr zzehr2 = (zzehr)this.zzd.zzb();
        zzemx zzemx2 = new zzemx(zzflt2, zzgge2, zzehn2, zzehr2);
        return zzemx2;
    }
}

