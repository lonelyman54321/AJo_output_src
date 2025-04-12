/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbkc;

final class zzbkb
implements Runnable {
    final /* synthetic */ AdManagerAdView zza;
    final /* synthetic */ zzbu zzb;
    final /* synthetic */ zzbkc zzc;

    public zzbkb(zzbkc zzbkc2, AdManagerAdView adManagerAdView, zzbu zzbu2) {
        this.zza = adManagerAdView;
        this.zzb = zzbu2;
        this.zzc = zzbkc2;
    }

    public final void run() {
        Object object = this.zza;
        Object object2 = this.zzb;
        boolean bl2 = object.zzb((zzbu)object2);
        if (bl2) {
            object = this.zzc;
            object2 = this.zza;
            zzbkc.zzc((zzbkc)object).onAdManagerAdViewLoaded((AdManagerAdView)((Object)object2));
            return;
        }
        zzm.zzj("Could not bind.");
    }
}

