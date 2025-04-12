/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzl;

final class zzk
implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzl zzb;

    public zzk(zzl zzl2, Task task2) {
        this.zzb = zzl2;
        this.zza = task2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Object object = zzl.zzb(this.zzb);
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        Object object2 = this.zzb;
                        Object object3 = zzl.zza((zzl)object2);
                        if (object3 == null) break block3;
                        object2 = zzl.zza((zzl)object2);
                        object3 = this.zza;
                        object3 = ((Task)object3).getException();
                        object3 = Preconditions.checkNotNull(object3);
                        object3 = (Exception)object3;
                        object2.onFailure((Exception)object3);
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

