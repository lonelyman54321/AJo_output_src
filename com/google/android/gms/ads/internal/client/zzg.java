/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.internal.client.zzbg;
import com.google.android.gms.ads.internal.client.zze;

public final class zzg
extends zzbg {
    private final AdListener zza;

    public zzg(AdListener adListener) {
        this.zza = adListener;
    }

    public final AdListener zzb() {
        return this.zza;
    }

    public final void zzc() {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdClicked();
        }
    }

    public final void zzd() {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdClosed();
        }
    }

    public final void zze(int n3) {
    }

    public final void zzf(zze object) {
        AdListener adListener = this.zza;
        if (adListener != null) {
            object = ((zze)object).zzb();
            adListener.onAdFailedToLoad((LoadAdError)object);
        }
    }

    public final void zzg() {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdImpression();
        }
    }

    public final void zzh() {
    }

    public final void zzi() {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdLoaded();
        }
    }

    public final void zzj() {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdOpened();
        }
    }

    public final void zzk() {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdSwipeGestureClicked();
        }
    }
}

