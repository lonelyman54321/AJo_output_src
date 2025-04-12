/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd$OnNativeAdLoadedListener;
import com.google.android.gms.internal.ads.zzbji;
import com.google.android.gms.internal.ads.zzbjs;
import com.google.android.gms.internal.ads.zzbuo;

public final class zzbuv
extends zzbji {
    private final NativeAd$OnNativeAdLoadedListener zza;

    public zzbuv(NativeAd$OnNativeAdLoadedListener nativeAd$OnNativeAdLoadedListener) {
        this.zza = nativeAd$OnNativeAdLoadedListener;
    }

    public final void zze(zzbjs zzbjs2) {
        zzbuo zzbuo2 = new zzbuo(zzbjs2);
        this.zza.onNativeAdLoaded(zzbuo2);
    }
}

