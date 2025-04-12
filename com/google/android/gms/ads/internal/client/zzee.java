/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.AdapterStatus$State;
import com.google.android.gms.ads.internal.client.zzej;

final class zzee
implements AdapterStatus {
    public zzee(zzej zzej2) {
    }

    public final String getDescription() {
        return "Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time.";
    }

    public final AdapterStatus$State getInitializationState() {
        return AdapterStatus$State.READY;
    }

    public final int getLatency() {
        return 0;
    }
}

