/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;

public interface MediationBannerListener {
    public void onAdClicked(MediationBannerAdapter var1);

    public void onAdClosed(MediationBannerAdapter var1);

    public void onAdFailedToLoad(MediationBannerAdapter var1, int var2);

    public void onAdFailedToLoad(MediationBannerAdapter var1, AdError var2);

    public void onAdLeftApplication(MediationBannerAdapter var1);

    public void onAdLoaded(MediationBannerAdapter var1);

    public void onAdOpened(MediationBannerAdapter var1);

    public void zzb(MediationBannerAdapter var1, String var2, String var3);
}

