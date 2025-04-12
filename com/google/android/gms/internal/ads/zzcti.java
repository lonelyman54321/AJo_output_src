/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcto;
import com.google.android.gms.internal.ads.zzekx;
import com.google.android.gms.internal.ads.zzeky;
import com.google.android.gms.internal.ads.zzemx;
import com.google.android.gms.internal.ads.zzemy;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzcti
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;

    public zzcti(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
        this.zzc = zzhlg4;
    }

    public final /* synthetic */ Object zzb() {
        Boolean bl2 = ((zzcto)this.zza).zza();
        boolean bl3 = bl2;
        zzekx zzekx2 = ((zzeky)this.zzb).zza();
        zzemx zzemx2 = ((zzemy)this.zzc).zza();
        boolean bl4 = true;
        if (bl4 != bl3) {
            return zzemx2;
        }
        return zzekx2;
    }
}

