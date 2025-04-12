/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.mediation.rtb;

import com.google.android.gms.ads.AdError;

public interface SignalCallbacks {
    public void onFailure(AdError var1);

    public void onFailure(String var1);

    public void onSuccess(String var1);
}

