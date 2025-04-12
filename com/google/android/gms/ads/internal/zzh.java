/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.zzj;

public final class zzh
implements Runnable {
    public final /* synthetic */ zzj zza;
    public final /* synthetic */ boolean zzb;

    public /* synthetic */ zzh(zzj zzj2, boolean bl2) {
        this.zza = zzj2;
        this.zzb = bl2;
    }

    public final void run() {
        zzj zzj2 = this.zza;
        boolean bl2 = this.zzb;
        zzj2.zzb(bl2);
    }
}

