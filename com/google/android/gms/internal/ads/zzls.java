/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgaz;
import com.google.android.gms.internal.ads.zzlt;
import com.google.android.gms.internal.ads.zzvo;

public final class zzls
implements Runnable {
    public final /* synthetic */ zzlt zza;
    public final /* synthetic */ zzgaz zzb;
    public final /* synthetic */ zzvo zzc;

    public /* synthetic */ zzls(zzlt zzlt2, zzgaz zzgaz2, zzvo zzvo2) {
        this.zza = zzlt2;
        this.zzb = zzgaz2;
        this.zzc = zzvo2;
    }

    public final void run() {
        zzlt zzlt2 = this.zza;
        zzgaz zzgaz2 = this.zzb;
        zzvo zzvo2 = this.zzc;
        zzlt2.zzk(zzgaz2, zzvo2);
    }
}

