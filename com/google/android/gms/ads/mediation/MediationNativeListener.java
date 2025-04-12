/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.internal.ads.zzbiq;

public interface MediationNativeListener {
    public void onAdClicked(MediationNativeAdapter var1);

    public void onAdClosed(MediationNativeAdapter var1);

    public void onAdFailedToLoad(MediationNativeAdapter var1, int var2);

    public void onAdFailedToLoad(MediationNativeAdapter var1, AdError var2);

    public void onAdImpression(MediationNativeAdapter var1);

    public void onAdLeftApplication(MediationNativeAdapter var1);

    public void onAdLoaded(MediationNativeAdapter var1, UnifiedNativeAdMapper var2);

    public void onAdOpened(MediationNativeAdapter var1);

    public void onVideoEnd(MediationNativeAdapter var1);

    public void zzd(MediationNativeAdapter var1, zzbiq var2);

    public void zze(MediationNativeAdapter var1, zzbiq var2, String var3);
}

