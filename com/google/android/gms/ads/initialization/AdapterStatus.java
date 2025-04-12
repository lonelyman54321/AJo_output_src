/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.initialization;

import com.google.android.gms.ads.initialization.AdapterStatus$State;

public interface AdapterStatus {
    public String getDescription();

    public AdapterStatus$State getInitializationState();

    public int getLatency();
}

