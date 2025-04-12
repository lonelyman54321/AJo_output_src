/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tasks;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzj;

final class zzi
implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzj zzb;

    public zzi(zzj zzj2, Task task2) {
        this.zzb = zzj2;
        this.zza = task2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Object object = zzj.zzb(this.zzb);
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        Object object2 = this.zzb;
                        Object object3 = zzj.zza((zzj)object2);
                        if (object3 == null) break block3;
                        object2 = zzj.zza((zzj)object2);
                        object3 = this.zza;
                        object2.onComplete((Task)object3);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

