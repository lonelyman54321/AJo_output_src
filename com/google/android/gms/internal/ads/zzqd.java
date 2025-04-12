/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzqn;

public final class zzqd
implements Runnable {
    public final /* synthetic */ zzqn zza;
    public final /* synthetic */ long zzb;

    public /* synthetic */ zzqd(zzqn zzqn2, long l2) {
        this.zza = zzqn2;
        this.zzb = l2;
    }

    public final void run() {
        zzqn zzqn2 = this.zza;
        long l2 = this.zzb;
        zzqn2.zzs(l2);
    }
}

