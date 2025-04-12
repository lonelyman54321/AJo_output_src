/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.zzf;
import com.google.android.gms.internal.ads.zzdvc;

public final class zze
implements Runnable {
    public final /* synthetic */ zzf zza;
    public final /* synthetic */ zzdvc zzb;
    public final /* synthetic */ Long zzc;

    public /* synthetic */ zze(zzf zzf2, zzdvc zzdvc2, Long l2) {
        this.zza = zzf2;
        this.zzb = zzdvc2;
        this.zzc = l2;
    }

    public final void run() {
        zzdvc zzdvc2 = this.zzb;
        Long l2 = this.zzc;
        zzf.zze(zzdvc2, l2);
    }
}

