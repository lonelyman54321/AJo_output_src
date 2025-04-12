/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzqn;

public final class zzqe
implements Runnable {
    public final /* synthetic */ zzqn zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ long zzd;

    public /* synthetic */ zzqe(zzqn zzqn2, int n3, long l2, long l3) {
        this.zza = zzqn2;
        this.zzb = n3;
        this.zzc = l2;
        this.zzd = l3;
    }

    public final void run() {
        zzqn zzqn2 = this.zza;
        int n3 = this.zzb;
        long l2 = this.zzc;
        long l3 = this.zzd;
        zzqn2.zzu(n3, l2, l3);
    }
}

