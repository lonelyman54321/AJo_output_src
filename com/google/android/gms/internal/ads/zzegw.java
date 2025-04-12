/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzchs;
import com.google.android.gms.internal.ads.zzfou;

public final class zzegw
implements Runnable {
    public final /* synthetic */ zzfou zza;
    public final /* synthetic */ zzchs zzb;

    public /* synthetic */ zzegw(zzfou zzfou2, zzchs zzchs2) {
        this.zza = zzfou2;
        this.zzb = zzchs2;
    }

    public final void run() {
        zzfou zzfou2 = this.zza;
        zzchs zzchs2 = this.zzb;
        zzfou2.zzf(zzchs2);
    }
}

