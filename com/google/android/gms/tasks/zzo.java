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
import com.google.android.gms.tasks.zzp;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

final class zzo
implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzp zzb;

    public zzo(zzp zzp2, Task task2) {
        this.zzb = zzp2;
        this.zza = task2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        RuntimeExecutionException runtimeExecutionException2222;
        block7: {
            Exception exception2222;
            block6: {
                Object object;
                Object object2;
                block5: {
                    try {
                        object2 = this.zzb;
                        object2 = zzp.zza((zzp)object2);
                        object = this.zza;
                        object = ((Task)object).getResult();
                        object2 = object2.then(object);
                        if (object2 != null) break block5;
                        object2 = this.zzb;
                    }
                    catch (Exception exception2222) {
                        break block6;
                    }
                    catch (RuntimeExecutionException runtimeExecutionException2222) {
                        break block7;
                    }
                    catch (CancellationException cancellationException) {
                        this.zzb.onCanceled();
                        return;
                    }
                    object = new NullPointerException("Continuation returned null");
                    ((zzp)object2).onFailure((Exception)object);
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
            this.zzb.onFailure(exception2222);
            return;
        }
        Object object = runtimeExecutionException2222.getCause();
        boolean bl2 = object instanceof Exception;
        if (bl2) {
            object = this.zzb;
            Exception exception = (Exception)runtimeExecutionException2222.getCause();
            ((zzp)object).onFailure(exception);
            return;
        }
        this.zzb.onFailure(runtimeExecutionException2222);
    }
}

