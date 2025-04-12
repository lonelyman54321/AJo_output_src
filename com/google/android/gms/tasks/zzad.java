/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tasks;

import com.google.android.gms.tasks.zzac;
import com.google.android.gms.tasks.zzae;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class zzad
implements zzae {
    private final CountDownLatch zza;

    private zzad() {
        CountDownLatch countDownLatch;
        this.zza = countDownLatch = new CountDownLatch(1);
    }

    public /* synthetic */ zzad(zzac object) {
        this.zza = object = new CountDownLatch(1);
    }

    public final void onCanceled() {
        this.zza.countDown();
    }

    public final void onFailure(Exception exception) {
        this.zza.countDown();
    }

    public final void onSuccess(Object object) {
        this.zza.countDown();
    }

    public final void zza() {
        this.zza.await();
    }

    public final boolean zzb(long l2, TimeUnit timeUnit) {
        return this.zza.await(l2, timeUnit);
    }
}

