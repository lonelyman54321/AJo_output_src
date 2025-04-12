/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdCallback;
import com.google.android.gms.ads.rewarded.RewardItem;

public interface MediationRewardedAdCallback
extends MediationAdCallback {
    public void onAdFailedToShow(AdError var1);

    public void onAdFailedToShow(String var1);

    public void onUserEarnedReward(RewardItem var1);

    public void onVideoComplete();

    public void onVideoStart();
}

