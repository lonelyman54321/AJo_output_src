/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdListener;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdsLoader;

public final class JioAdsLoader$getVmap$1
extends JioAdListener {
    public final /* synthetic */ JioAdsLoader a;

    public JioAdsLoader$getVmap$1(JioAdsLoader jioAdsLoader) {
        this.a = jioAdsLoader;
    }

    public final void onAdClosed(JioAdView jioAdView, boolean bl2, boolean bl3) {
    }

    public final void onAdFailedToLoad(JioAdView jioAdView, JioAdError jioAdError) {
        this.a.getJioAdsLoaderListener().onAdsLoadingError(jioAdError);
    }

    public final void onAdMediaEnd(JioAdView jioAdView) {
    }

    public final void onAdPrepared(JioAdView jioAdView) {
        if (jioAdView != null) {
            jioAdView.onDestroy();
        }
    }

    public final void onAdRender(JioAdView jioAdView) {
    }
}

