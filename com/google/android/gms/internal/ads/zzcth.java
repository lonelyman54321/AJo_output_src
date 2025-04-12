/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzczc;
import com.google.android.gms.internal.ads.zzeim;
import com.google.android.gms.internal.ads.zzein;
import com.google.android.gms.internal.ads.zzejf;
import com.google.android.gms.internal.ads.zzejg;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;

public final class zzcth
implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;

    public zzcth(zzhlg zzhlg2, zzhlg zzhlg3, zzhlg zzhlg4) {
        this.zza = zzhlg2;
        this.zzb = zzhlg3;
        this.zzc = zzhlg4;
    }

    public final /* synthetic */ Object zzb() {
        Object object = ((zzczc)this.zza).zza();
        zzejf zzejf2 = ((zzejg)this.zzb).zza();
        zzeim zzeim2 = ((zzein)this.zzc).zza();
        if ((object = ((zzfho)object).zza()) == null) {
            return zzeim2;
        }
        return zzejf2;
    }
}

