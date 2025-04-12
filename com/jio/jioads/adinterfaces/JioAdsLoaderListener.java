/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.jio.jioads.adinterfaces.JioAdError;

public interface JioAdsLoaderListener {
    public void onAdsLoadingError(JioAdError var1);

    public void onAdsUrlLoaded(String var1);
}

