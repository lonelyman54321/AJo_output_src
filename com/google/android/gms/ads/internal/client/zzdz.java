/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.client.zzaz;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzea;

final class zzdz
extends zzaz {
    final /* synthetic */ zzea zza;

    public zzdz(zzea zzea2) {
        this.zza = zzea2;
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        Object object = this.zza;
        VideoController videoController = zzea.zze((zzea)object);
        object = ((zzea)object).zzi();
        videoController.zzb((zzdq)object);
        super.onAdFailedToLoad(loadAdError);
    }

    public final void onAdLoaded() {
        Object object = this.zza;
        VideoController videoController = zzea.zze((zzea)object);
        object = ((zzea)object).zzi();
        videoController.zzb((zzdq)object);
        super.onAdLoaded();
    }
}

