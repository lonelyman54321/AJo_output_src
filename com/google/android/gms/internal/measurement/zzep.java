/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzed;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

final class zzep
implements ThreadFactory {
    private ThreadFactory zza;

    public zzep(zzed object) {
        this.zza = object = Executors.defaultThreadFactory();
    }

    public final Thread newThread(Runnable runnable2) {
        runnable2 = this.zza.newThread(runnable2);
        ((Thread)runnable2).setName("ScionFrontendApi");
        return runnable2;
    }
}

