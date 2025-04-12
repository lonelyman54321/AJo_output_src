/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcee;

public final class zzcfw
implements Runnable {
    public final /* synthetic */ zzcee zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ long zzc;

    public /* synthetic */ zzcfw(zzcee zzcee2, boolean bl2, long l2) {
        this.zza = zzcee2;
        this.zzb = bl2;
        this.zzc = l2;
    }

    public final void run() {
        zzcee zzcee2 = this.zza;
        boolean bl2 = this.zzb;
        long l2 = this.zzc;
        zzcee2.zzv(bl2, l2);
    }
}

