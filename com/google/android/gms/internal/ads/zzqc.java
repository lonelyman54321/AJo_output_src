/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzix;
import com.google.android.gms.internal.ads.zzqn;

public final class zzqc
implements Runnable {
    public final /* synthetic */ zzqn zza;
    public final /* synthetic */ zzix zzb;

    public /* synthetic */ zzqc(zzqn zzqn2, zzix zzix2) {
        this.zza = zzqn2;
        this.zzb = zzix2;
    }

    public final void run() {
        zzqn zzqn2 = this.zza;
        zzix zzix2 = this.zzb;
        zzqn2.zzp(zzix2);
    }
}

