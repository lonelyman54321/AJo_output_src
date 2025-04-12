/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.appupdate.internal;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.appupdate.internal.zzm;
import com.google.android.play.core.appupdate.internal.zzn;
import com.google.android.play.core.appupdate.internal.zzx;
import java.util.concurrent.atomic.AtomicInteger;

final class zzq
extends zzn {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ zzn zzb;
    final /* synthetic */ zzx zzc;

    public zzq(zzx zzx2, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, zzn zzn2) {
        this.zzc = zzx2;
        this.zza = taskCompletionSource2;
        this.zzb = zzn2;
        super(taskCompletionSource);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        Object object = zzx.zzg(this.zzc);
        synchronized (object) {
            Throwable throwable2;
            block4: {
                Object object2;
                Object object3;
                block3: {
                    try {
                        object3 = this.zzc;
                        object2 = this.zza;
                        zzx.zzn((zzx)object3, (TaskCompletionSource)object2);
                        object3 = this.zzc;
                        object3 = zzx.zzi((zzx)object3);
                        int n3 = ((AtomicInteger)object3).getAndIncrement();
                        if (n3 <= 0) break block3;
                        object3 = this.zzc;
                        object3 = zzx.zzf((zzx)object3);
                        object2 = "Already connected to the service.";
                        Object[] objectArray = null;
                        objectArray = new Object[]{};
                        ((zzm)object3).zzd((String)object2, objectArray);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object3 = this.zzc;
                object2 = this.zzb;
                zzx.zzp((zzx)object3, (zzn)object2);
                return;
            }
            throw throwable2;
        }
    }
}

