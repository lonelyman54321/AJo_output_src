/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzbq;
import com.google.android.gms.internal.gtm.zzbu;

final class zzbt
implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ zzbu zza;

    public zzbt(zzbu zzbu2) {
        this.zza = zzbu2;
    }

    public final void uncaughtException(Thread object, Throwable throwable) {
        object = this.zza.zzn();
        if (object != null) {
            String string2 = "Job execution failed";
            ((zzbq)object).zzJ(string2, throwable);
        }
    }
}

