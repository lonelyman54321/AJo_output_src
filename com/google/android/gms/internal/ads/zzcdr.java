/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcds;

final class zzcdr
implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcds zzb;

    public zzcdr(zzcds zzcds2, boolean bl2) {
        this.zza = bl2;
        this.zzb = zzcds2;
    }

    public final void run() {
        String[] stringArray = String.valueOf(this.zza);
        stringArray = new String[]{"isVisible", stringArray};
        zzcds.zzm(this.zzb, "windowVisibilityChanged", stringArray);
    }
}

