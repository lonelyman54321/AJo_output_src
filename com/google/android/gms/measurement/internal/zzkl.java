/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzju;
import java.util.concurrent.Executor;

final class zzkl
implements Executor {
    private final /* synthetic */ zzju zza;

    public zzkl(zzju zzju2) {
        this.zza = zzju2;
    }

    public final void execute(Runnable runnable2) {
        this.zza.zzl().zzb(runnable2);
    }
}

