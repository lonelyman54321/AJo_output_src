/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.internal.client.zzbj;
import com.google.android.gms.ads.internal.client.zze;

public final class zzh
extends zzbj {
    private final AdLoadCallback zza;
    private final Object zzb;

    public zzh(AdLoadCallback adLoadCallback, Object object) {
        this.zza = adLoadCallback;
        this.zzb = object;
    }

    public final void zzb(zze object) {
        AdLoadCallback adLoadCallback = this.zza;
        if (adLoadCallback != null) {
            object = ((zze)object).zzb();
            adLoadCallback.onAdFailedToLoad((LoadAdError)object);
        }
    }

    public final void zzc() {
        Object object;
        AdLoadCallback adLoadCallback = this.zza;
        if (adLoadCallback != null && (object = this.zzb) != null) {
            adLoadCallback.onAdLoaded(object);
        }
    }
}

