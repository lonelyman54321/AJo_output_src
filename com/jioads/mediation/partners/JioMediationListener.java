/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.jioads.mediation.partners;

import android.view.View;
import com.jioads.mediation.partners.videoutils.JioMediationVideoController;

public interface JioMediationListener {
    public void addMediationUrl(String var1, JioMediationVideoController var2, int var3, int var4, Integer var5, Integer var6, String var7);

    public int getCurrentPosition();

    public Integer getLeftoverAdCount();

    public Integer getLeftoverAdDuration();

    public int getVideoAdDuration();

    public int getVolume();

    public void logMediationImpression();

    public void onAdClicked();

    public void onAdCollapsed();

    public void onAdDismissed(boolean var1, boolean var2);

    public void onAdExpand();

    public void onAdFailed(String var1, String var2);

    public void onAdLoaded();

    public void onAdMediaStart();

    public void onAdRender();

    public void onAdShown();

    public void onAdSkippable();

    public void onBannerAdLoaded(View var1);

    public void onNativeAdLoaded(Object[] var1);

    public void onVideoAdEnd(boolean var1);

    public void pauseAdFromMediation(boolean var1);

    public void resumeFromMediation(boolean var1);

    public void stopAds(boolean var1);
}

