/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzhm;
import java.util.concurrent.Callable;

public final class zzhq
implements Callable {
    private /* synthetic */ zzhm zza;

    public /* synthetic */ zzhq(zzhm zzhm2) {
        this.zza = zzhm2;
    }

    public final Object call() {
        return zzhm.zza(this.zza);
    }
}

