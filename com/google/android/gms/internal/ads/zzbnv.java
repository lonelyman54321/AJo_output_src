/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.AdapterStatus$State;

public final class zzbnv
implements AdapterStatus {
    private final AdapterStatus$State zza;
    private final String zzb;
    private final int zzc;

    public zzbnv(AdapterStatus$State adapterStatus$State, String string2, int n3) {
        this.zza = adapterStatus$State;
        this.zzb = string2;
        this.zzc = n3;
    }

    public final String getDescription() {
        return this.zzb;
    }

    public final AdapterStatus$State getInitializationState() {
        return this.zza;
    }

    public final int getLatency() {
        return this.zzc;
    }
}

