/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbtx;

final class zzbtv
implements zzp {
    final /* synthetic */ zzbtx zza;

    public zzbtv(zzbtx zzbtx2) {
        this.zza = zzbtx2;
    }

    public final void zzdH() {
        zzm.zze("AdMobCustomTabsAdapter overlay is resumed.");
    }

    public final void zzdk() {
        zzm.zze("AdMobCustomTabsAdapter overlay is paused.");
    }

    public final void zzdq() {
        zzm.zze("Delay close AdMobCustomTabsAdapter overlay.");
    }

    public final void zzdr() {
        zzm.zze("Opening AdMobCustomTabsAdapter overlay.");
        zzbtx zzbtx2 = this.zza;
        zzbtx.zzb(zzbtx2).onAdOpened(zzbtx2);
    }

    public final void zzdt() {
    }

    public final void zzdu(int n3) {
        zzm.zze("AdMobCustomTabsAdapter overlay is closed.");
        zzbtx zzbtx2 = this.zza;
        zzbtx.zzb(zzbtx2).onAdClosed(zzbtx2);
    }
}

