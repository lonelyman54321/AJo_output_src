/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAd$OnNativeAdLoadedListener;
import com.google.android.gms.internal.ads.zzdyx;

public final class zzdym
implements NativeAd$OnNativeAdLoadedListener {
    public final /* synthetic */ zzdyx zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;

    public /* synthetic */ zzdym(zzdyx zzdyx2, String string2, String string3) {
        this.zza = zzdyx2;
        this.zzb = string2;
        this.zzc = string3;
    }

    public final void onNativeAdLoaded(NativeAd nativeAd) {
        zzdyx zzdyx2 = this.zza;
        String string2 = this.zzb;
        String string3 = this.zzc;
        zzdyx2.zzg(string2, nativeAd, string3);
    }
}

