/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.analytics;

import com.google.android.gms.internal.measurement.zzdi;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class zzb
extends ThreadPoolExecutor {
    public zzb(FirebaseAnalytics firebaseAnalytics, int n3, int n4, long l2, TimeUnit timeUnit, BlockingQueue blockingQueue) {
        super(0, 1, 30, timeUnit, blockingQueue);
    }

    public final void execute(Runnable runnable2) {
        runnable2 = zzdi.zza().zza(runnable2);
        super.execute(runnable2);
    }
}

