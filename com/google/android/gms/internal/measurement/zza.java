/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzb;
import java.util.concurrent.Callable;

public final class zza
implements Callable {
    private /* synthetic */ zzb zza;

    public /* synthetic */ zza(zzb zzb2) {
        this.zza = zzb2;
    }

    public final Object call() {
        return zzb.zzb(this.zza);
    }
}

