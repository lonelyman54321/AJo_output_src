/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzczc;
import com.google.android.gms.internal.ads.zzemy;
import com.google.android.gms.internal.ads.zzfhb;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzdrn
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;

    public zzdrn(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
        this.zzc = zzhlg4;
    }

    public final /* synthetic */ Object zzb() {
        Object object = ((zzczc)this.zzc).zza().zzo;
        int n3 = ((zzfhb)object).zza;
        if (n3 != 0) {
            object = (n3 += -1) != 0 ? ((zzemy)this.zzb).zza() : ((zzemy)this.zza).zza();
            return object;
        }
        throw null;
    }
}

