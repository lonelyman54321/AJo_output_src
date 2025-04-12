/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfmg;
import com.google.android.gms.internal.ads.zzfmq;

public final class zzfmp
implements Runnable {
    public final /* synthetic */ zzfmq zza;
    public final /* synthetic */ zzfmg zzb;

    public /* synthetic */ zzfmp(zzfmq zzfmq2, zzfmg zzfmg2) {
        this.zza = zzfmq2;
        this.zzb = zzfmg2;
    }

    public final void run() {
        zzfmq zzfmq2 = this.zza;
        zzfmg zzfmg2 = this.zzb;
        zzfmq2.zzc(zzfmg2);
    }
}

