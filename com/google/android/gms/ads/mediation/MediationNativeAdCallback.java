/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.mediation.MediationAdCallback;

public interface MediationNativeAdCallback
extends MediationAdCallback {
    public void onAdLeftApplication();

    public void onVideoComplete();

    public void onVideoMute();

    public void onVideoPause();

    public void onVideoPlay();

    public void onVideoUnmute();
}

