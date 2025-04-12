/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzqn;

public final class zzqk
implements Runnable {
    public final /* synthetic */ zzqn zza;
    public final /* synthetic */ boolean zzb;

    public /* synthetic */ zzqk(zzqn zzqn2, boolean bl2) {
        this.zza = zzqn2;
        this.zzb = bl2;
    }

    public final void run() {
        zzqn zzqn2 = this.zza;
        boolean bl2 = this.zzb;
        zzqn2.zzt(bl2);
    }
}

