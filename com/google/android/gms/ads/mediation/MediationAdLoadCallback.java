/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.AdError;

public interface MediationAdLoadCallback {
    public void onFailure(AdError var1);

    public void onFailure(String var1);

    public Object onSuccess(Object var1);
}

