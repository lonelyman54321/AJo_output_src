/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tasks;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.android.gms.tasks.zzf;
import com.google.android.gms.tasks.zzw;
import java.util.concurrent.Executor;

final class zze
implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzf zzb;

    public zze(zzf zzf2, Task task2) {
        this.zzb = zzf2;
        this.zza = task2;
    }

    public final void run() {
        RuntimeExecutionException runtimeExecutionException2;
        Object object;
        block10: {
            Exception exception2;
            block9: {
                Object object2;
                block8: {
                    object2 = this.zzb;
                    object2 = zzf.zza((zzf)object2);
                    object = this.zza;
                    object2 = object2.then((Task)object);
                    try {
                        object2 = (Task)object2;
                        if (object2 != null) break block8;
                        object2 = this.zzb;
                    }
                    catch (Exception exception2) {
                        break block9;
                    }
                    catch (RuntimeExecutionException runtimeExecutionException2) {
                        break block10;
                    }
                    object = new NullPointerException("Continuation returned null");
                    ((zzf)object2).onFailure((Exception)object);
                    return;
                }
                object = this.zzb;
                Executor executor = TaskExecutors.zza;
                ((Task)object2).addOnSuccessListener(executor, (OnSuccessListener)object);
                object = this.zzb;
                ((Task)object2).addOnFailureListener(executor, (OnFailureListener)object);
                object = this.zzb;
                ((Task)object2).addOnCanceledListener(executor, (OnCanceledListener)object);
                return;
            }
            zzf.zzb(this.zzb).zza(exception2);
            return;
        }
        object = runtimeExecutionException2.getCause();
        boolean bl2 = object instanceof Exception;
        if (bl2) {
            object = zzf.zzb(this.zzb);
            Exception exception = (Exception)runtimeExecutionException2.getCause();
            ((zzw)object).zza(exception);
            return;
        }
        zzf.zzb(this.zzb).zza(runtimeExecutionException2);
    }
}

