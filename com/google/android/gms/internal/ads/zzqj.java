/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zziy;
import com.google.android.gms.internal.ads.zzqn;

public final class zzqj
implements Runnable {
    public final /* synthetic */ zzqn zza;
    public final /* synthetic */ zzan zzb;
    public final /* synthetic */ zziy zzc;

    public /* synthetic */ zzqj(zzqn zzqn2, zzan zzan2, zziy zziy2) {
        this.zza = zzqn2;
        this.zzb = zzan2;
        this.zzc = zziy2;
    }

    public final void run() {
        zzqn zzqn2 = this.zza;
        zzan zzan2 = this.zzb;
        zziy zziy2 = this.zzc;
        zzqn2.zzr(zzan2, zziy2);
    }
}

