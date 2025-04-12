/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzig;

final class zzib
implements Runnable {
    final /* synthetic */ zzig zza;

    public zzib(zzig zzig2) {
        this.zza = zzig2;
    }

    public final void run() {
        zzig.zzh(this.zza, false);
        zzig.zzd(this.zza).zza();
    }
}

