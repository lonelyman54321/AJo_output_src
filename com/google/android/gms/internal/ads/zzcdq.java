/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcds;

final class zzcdq
implements Runnable {
    final /* synthetic */ zzcds zza;

    public zzcdq(zzcds zzcds2) {
        this.zza = zzcds2;
    }

    public final void run() {
        zzcds zzcds2 = this.zza;
        String[] stringArray = new String[]{};
        zzcds.zzm(zzcds2, "surfaceDestroyed", stringArray);
    }
}

