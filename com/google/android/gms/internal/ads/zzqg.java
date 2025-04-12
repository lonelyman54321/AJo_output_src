/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzqn;
import com.google.android.gms.internal.ads.zzqp;

public final class zzqg
implements Runnable {
    public final /* synthetic */ zzqn zza;
    public final /* synthetic */ zzqp zzb;

    public /* synthetic */ zzqg(zzqn zzqn2, zzqp zzqp2) {
        this.zza = zzqn2;
        this.zzb = zzqp2;
    }

    public final void run() {
        zzqn zzqn2 = this.zza;
        zzqp zzqp2 = this.zzb;
        zzqn2.zzm(zzqp2);
    }
}

