/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.review.internal;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.review.internal.zzi;
import com.google.android.play.core.review.internal.zzj;
import com.google.android.play.core.review.internal.zzt;
import java.util.concurrent.atomic.AtomicInteger;

final class zzm
extends zzj {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ zzj zzb;
    final /* synthetic */ zzt zzc;

    public zzm(zzt zzt2, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, zzj zzj2) {
        this.zza = taskCompletionSource2;
        this.zzb = zzj2;
        this.zzc = zzt2;
        super(taskCompletionSource);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        Object object = zzt.zzg(this.zzc);
        synchronized (object) {
            Throwable throwable2;
            block4: {
                Object object2;
                Object object3;
                block3: {
                    try {
                        object3 = this.zzc;
                        object2 = this.zza;
                        zzt.zzn((zzt)object3, (TaskCompletionSource)object2);
                        object3 = this.zzc;
                        object3 = zzt.zzi((zzt)object3);
                        int n3 = ((AtomicInteger)object3).getAndIncrement();
                        if (n3 <= 0) break block3;
                        object3 = this.zzc;
                        object3 = zzt.zzf((zzt)object3);
                        object2 = "Already connected to the service.";
                        Object[] objectArray = null;
                        objectArray = new Object[]{};
                        ((zzi)object3).zzc((String)object2, objectArray);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object3 = this.zzc;
                object2 = this.zzb;
                zzt.zzp((zzt)object3, (zzj)object2);
                return;
            }
            throw throwable2;
        }
    }
}

