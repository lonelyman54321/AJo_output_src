/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcds;

public final class zzcdo
implements Runnable {
    public final /* synthetic */ zzcds zza;
    public final /* synthetic */ boolean zzb;

    public /* synthetic */ zzcdo(zzcds zzcds2, boolean bl2) {
        this.zza = zzcds2;
        this.zzb = bl2;
    }

    public final void run() {
        zzcds zzcds2 = this.zza;
        boolean bl2 = this.zzb;
        zzcds2.zzq(bl2);
    }
}

