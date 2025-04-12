/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zznx;

final class zznw
implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zznx zzb;

    public zznw(zznx zznx2, long l2) {
        this.zza = l2;
        this.zzb = zznx2;
    }

    public final void run() {
        zznx zznx2 = this.zzb;
        long l2 = this.zza;
        zznx.zzb(zznx2, l2);
    }
}

