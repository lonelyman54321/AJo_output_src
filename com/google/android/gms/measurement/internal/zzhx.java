/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzhv;

final class zzhx
implements Thread.UncaughtExceptionHandler {
    private final String zza;
    private final /* synthetic */ zzhv zzb;

    public zzhx(zzhv zzhv2, String string2) {
        this.zzb = zzhv2;
        Preconditions.checkNotNull(string2);
        this.zza = string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void uncaughtException(Thread object, Throwable throwable) {
        synchronized (this) {
            object = this.zzb;
            object = ((zzhv)object).zzj();
            object = ((zzgo)object).zzg();
            String string2 = this.zza;
            ((zzgq)object).zza(string2, throwable);
            return;
        }
    }
}

