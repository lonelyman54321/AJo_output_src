/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzchl;

public final class zzchh
implements Runnable {
    public final /* synthetic */ zzchl zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ long zzc;

    public /* synthetic */ zzchh(zzchl zzchl2, boolean bl2, long l2) {
        this.zza = zzchl2;
        this.zzb = bl2;
        this.zzc = l2;
    }

    public final void run() {
        zzchl zzchl2 = this.zza;
        boolean bl2 = this.zzb;
        long l2 = this.zzc;
        zzchl2.zzo(bl2, l2);
    }
}

