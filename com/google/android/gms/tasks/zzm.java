/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tasks;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzn;

final class zzm
implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzn zzb;

    public zzm(zzn zzn2, Task task2) {
        this.zzb = zzn2;
        this.zza = task2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Object object = zzn.zzb(this.zzb);
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        Object object2 = this.zzb;
                        Object object3 = zzn.zza((zzn)object2);
                        if (object3 == null) break block3;
                        object2 = zzn.zza((zzn)object2);
                        object3 = this.zza;
                        object3 = ((Task)object3).getResult();
                        object2.onSuccess(object3);
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

