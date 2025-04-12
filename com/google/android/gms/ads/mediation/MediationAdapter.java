/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.mediation.MediationExtrasReceiver;

public interface MediationAdapter
extends MediationExtrasReceiver {
    public void onDestroy();

    public void onPause();

    public void onResume();
}

