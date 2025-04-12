/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 */
package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

final class zzbe
implements OnCompleteListener {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ CountDownLatch zzb;

    public /* synthetic */ zzbe(AtomicReference atomicReference, CountDownLatch countDownLatch) {
        this.zza = atomicReference;
        this.zzb = countDownLatch;
    }

    public final /* synthetic */ void onComplete(Task task2) {
        boolean bl2 = task2.isSuccessful();
        if (bl2) {
            AtomicReference atomicReference = this.zza;
            task2 = (Location)task2.getResult();
            atomicReference.set(task2);
        }
        this.zzb.countDown();
    }
}

