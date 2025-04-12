/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tasks;

import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzd;
import com.google.android.gms.tasks.zzw;

final class zzc
implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzd zzb;

    public zzc(zzd zzd2, Task task2) {
        this.zzb = zzd2;
        this.zza = task2;
    }

    public final void run() {
        RuntimeExecutionException runtimeExecutionException2;
        Object object;
        block9: {
            Exception exception2;
            block8: {
                Object object2 = this.zza;
                boolean bl2 = ((Task)object2).isCanceled();
                if (bl2) {
                    zzd.zzb(this.zzb).zzc();
                    return;
                }
                object2 = this.zzb;
                object2 = zzd.zza((zzd)object2);
                object = this.zza;
                try {
                    object2 = object2.then((Task)object);
                }
                catch (Exception exception2) {
                    break block8;
                }
                catch (RuntimeExecutionException runtimeExecutionException2) {
                    break block9;
                }
                zzd.zzb(this.zzb).zzb(object2);
                return;
            }
            zzd.zzb(this.zzb).zza(exception2);
            return;
        }
        object = runtimeExecutionException2.getCause();
        boolean bl3 = object instanceof Exception;
        if (bl3) {
            object = zzd.zzb(this.zzb);
            Exception exception = (Exception)runtimeExecutionException2.getCause();
            ((zzw)object).zza(exception);
            return;
        }
        zzd.zzb(this.zzb).zza(runtimeExecutionException2);
    }
}

