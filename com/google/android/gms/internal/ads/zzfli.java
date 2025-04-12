/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfky;
import com.google.android.gms.internal.ads.zzflk;
import com.google.android.gms.internal.ads.zzfll;
import com.google.android.gms.internal.ads.zzflm;
import com.google.android.gms.internal.ads.zzgfp;

final class zzfli
implements zzgfp {
    final /* synthetic */ zzfky zza;
    final /* synthetic */ zzflk zzb;

    public zzfli(zzflk zzflk2, zzfky zzfky2) {
        this.zza = zzfky2;
        this.zzb = zzflk2;
    }

    public final void zza(Throwable throwable) {
        zzflm zzflm2 = zzfll.zzc(this.zzb.zza);
        zzfky zzfky2 = this.zza;
        zzflm2.zzb(zzfky2, throwable);
    }

    public final void zzb(Object object) {
        object = zzfll.zzc(this.zzb.zza);
        zzfky zzfky2 = this.zza;
        object.zzd(zzfky2);
    }
}

