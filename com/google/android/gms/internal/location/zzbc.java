/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

final class zzbc
implements OnCompleteListener {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ CountDownLatch zzb;

    public /* synthetic */ zzbc(AtomicReference atomicReference, CountDownLatch countDownLatch) {
        this.zza = atomicReference;
        this.zzb = countDownLatch;
    }

    public final /* synthetic */ void onComplete(Task object) {
        boolean bl2 = ((Task)object).isSuccessful();
        if (bl2) {
            AtomicReference atomicReference = this.zza;
            object = (LocationAvailability)((Task)object).getResult();
            atomicReference.set(object);
        }
        this.zzb.countDown();
    }
}

