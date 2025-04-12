/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfmn;
import com.google.android.gms.internal.ads.zzgfp;

final class zzfml
implements zzgfp {
    final /* synthetic */ zzfmn zza;
    final /* synthetic */ zzfmc zzb;

    public zzfml(zzfmn zzfmn2, zzfmc zzfmc2) {
        this.zza = zzfmn2;
        this.zzb = zzfmc2;
    }

    public final void zza(Throwable throwable) {
        zzfmc zzfmc2 = this.zzb;
        zzfmc2.zzi(throwable);
        zzfmc2.zzh(false);
        this.zza.zza(zzfmc2);
    }

    public final void zzb(Object object) {
    }
}

