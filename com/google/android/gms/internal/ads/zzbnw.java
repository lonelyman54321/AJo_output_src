/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.Map;

public final class zzbnw
implements InitializationStatus {
    private final Map zza;

    public zzbnw(Map map2) {
        this.zza = map2;
    }

    public final Map getAdapterStatusMap() {
        return this.zza;
    }
}

