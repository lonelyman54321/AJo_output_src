/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package com.google.android.gms.tasks;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.android.gms.tasks.zzd;
import com.google.android.gms.tasks.zzf;
import com.google.android.gms.tasks.zzh;
import com.google.android.gms.tasks.zzj;
import com.google.android.gms.tasks.zzl;
import com.google.android.gms.tasks.zzn;
import com.google.android.gms.tasks.zzp;
import com.google.android.gms.tasks.zzr;
import com.google.android.gms.tasks.zzv;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

final class zzw
extends Task {
    private final Object zza;
    private final zzr zzb;
    private boolean zzc;
    private volatile boolean zzd;
    private Object zze;
    private Exception zzf;

    public zzw() {
        Object object;
        this.zza = object = new Object();
        this.zzb = object = new zzr();
    }

    private final void zzf() {
        Preconditions.checkState(this.zzc, "Task is not yet complete");
    }

    private final void zzg() {
        boolean bl2 = this.zzd;
        if (!bl2) {
            return;
        }
        CancellationException cancellationException = new CancellationException("Task is already canceled.");
        throw cancellationException;
    }

    private final void zzh() {
        boolean bl2 = this.zzc;
        if (!bl2) {
            return;
        }
        throw DuplicateTaskCompletionException.of(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzi() {
        Object object = this.zza;
        synchronized (object) {
            try {
                boolean bl2 = this.zzc;
                if (!bl2) {
                    return;
                }
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl8 : MonitorExitStatement: MONITOREXIT : var1_1
                this.zzb.zzb(this);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final Task addOnCanceledListener(Activity activity, OnCanceledListener onCanceledListener) {
        Executor executor = TaskExecutors.MAIN_THREAD;
        zzh zzh2 = new zzh(executor, onCanceledListener);
        this.zzb.zza(zzh2);
        zzv.zza(activity).zzb(zzh2);
        this.zzi();
        return this;
    }

    public final Task addOnCanceledListener(OnCanceledListener onCanceledListener) {
        Executor executor = TaskExecutors.MAIN_THREAD;
        this.addOnCanceledListener(executor, onCanceledListener);
        return this;
    }

    public final Task addOnCanceledListener(Executor executor, OnCanceledListener onCanceledListener) {
        zzh zzh2 = new zzh(executor, onCanceledListener);
        this.zzb.zza(zzh2);
        this.zzi();
        return this;
    }

    public final Task addOnCompleteListener(Activity activity, OnCompleteListener onCompleteListener) {
        Executor executor = TaskExecutors.MAIN_THREAD;
        zzj zzj2 = new zzj(executor, onCompleteListener);
        this.zzb.zza(zzj2);
        zzv.zza(activity).zzb(zzj2);
        this.zzi();
        return this;
    }

    public final Task addOnCompleteListener(OnCompleteListener onCompleteListener) {
        Executor executor = TaskExecutors.MAIN_THREAD;
        zzj zzj2 = new zzj(executor, onCompleteListener);
        this.zzb.zza(zzj2);
        this.zzi();
        return this;
    }

    public final Task addOnCompleteListener(Executor executor, OnCompleteListener onCompleteListener) {
        zzj zzj2 = new zzj(executor, onCompleteListener);
        this.zzb.zza(zzj2);
        this.zzi();
        return this;
    }

    public final Task addOnFailureListener(Activity activity, OnFailureListener onFailureListener) {
        Executor executor = TaskExecutors.MAIN_THREAD;
        zzl zzl2 = new zzl(executor, onFailureListener);
        this.zzb.zza(zzl2);
        zzv.zza(activity).zzb(zzl2);
        this.zzi();
        return this;
    }

    public final Task addOnFailureListener(OnFailureListener onFailureListener) {
        Executor executor = TaskExecutors.MAIN_THREAD;
        this.addOnFailureListener(executor, onFailureListener);
        return this;
    }

    public final Task addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        zzl zzl2 = new zzl(executor, onFailureListener);
        this.zzb.zza(zzl2);
        this.zzi();
        return this;
    }

    public final Task addOnSuccessListener(Activity activity, OnSuccessListener onSuccessListener) {
        Executor executor = TaskExecutors.MAIN_THREAD;
        zzn zzn2 = new zzn(executor, onSuccessListener);
        this.zzb.zza(zzn2);
        zzv.zza(activity).zzb(zzn2);
        this.zzi();
        return this;
    }

    public final Task addOnSuccessListener(OnSuccessListener onSuccessListener) {
        Executor executor = TaskExecutors.MAIN_THREAD;
        this.addOnSuccessListener(executor, onSuccessListener);
        return this;
    }

    public final Task addOnSuccessListener(Executor executor, OnSuccessListener onSuccessListener) {
        zzn zzn2 = new zzn(executor, onSuccessListener);
        this.zzb.zza(zzn2);
        this.zzi();
        return this;
    }

    public final Task continueWith(Continuation continuation) {
        Executor executor = TaskExecutors.MAIN_THREAD;
        return this.continueWith(executor, continuation);
    }

    public final Task continueWith(Executor executor, Continuation continuation) {
        zzw zzw2 = new zzw();
        zzd zzd2 = new zzd(executor, continuation, zzw2);
        this.zzb.zza(zzd2);
        this.zzi();
        return zzw2;
    }

    public final Task continueWithTask(Continuation continuation) {
        Executor executor = TaskExecutors.MAIN_THREAD;
        return this.continueWithTask(executor, continuation);
    }

    public final Task continueWithTask(Executor executor, Continuation continuation) {
        zzw zzw2 = new zzw();
        zzf zzf2 = new zzf(executor, continuation, zzw2);
        this.zzb.zza(zzf2);
        this.zzi();
        return zzw2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Exception getException() {
        Object object = this.zza;
        synchronized (object) {
            return this.zzf;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object getResult() {
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                Exception exception;
                try {
                    this.zzf();
                    this.zzg();
                    exception = this.zzf;
                    if (exception == null) {
                        return this.zze;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                RuntimeExecutionException runtimeExecutionException = new RuntimeExecutionException(exception);
                throw runtimeExecutionException;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object getResult(Class object) {
        Object object2 = this.zza;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                Exception exception;
                try {
                    this.zzf();
                    this.zzg();
                    exception = this.zzf;
                    boolean bl2 = ((Class)object).isInstance(exception);
                    if (bl2) {
                        exception = this.zzf;
                        object = ((Class)object).cast(exception);
                        object = (Throwable)object;
                        throw object;
                    }
                    object = this.zzf;
                    if (object == null) {
                        return this.zze;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                exception = new RuntimeExecutionException((Throwable)object);
                throw exception;
            }
            throw throwable2;
        }
    }

    public final boolean isCanceled() {
        return this.zzd;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean isComplete() {
        Object object = this.zza;
        synchronized (object) {
            return this.zzc;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean isSuccessful() {
        Object object = this.zza;
        synchronized (object) {
            try {
                boolean bl2 = this.zzc;
                boolean bl3 = false;
                if (!bl2) return bl3;
                bl2 = this.zzd;
                if (bl2) return bl3;
                Exception exception = this.zzf;
                if (exception != null) return bl3;
                return true;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final Task onSuccessTask(SuccessContinuation successContinuation) {
        Executor executor = TaskExecutors.MAIN_THREAD;
        zzw zzw2 = new zzw();
        zzp zzp2 = new zzp(executor, successContinuation, zzw2);
        this.zzb.zza(zzp2);
        this.zzi();
        return zzw2;
    }

    public final Task onSuccessTask(Executor executor, SuccessContinuation successContinuation) {
        zzw zzw2 = new zzw();
        zzp zzp2 = new zzp(executor, successContinuation, zzw2);
        this.zzb.zza(zzp2);
        this.zzi();
        return zzw2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(Exception exception) {
        Preconditions.checkNotNull(exception, "Exception must not be null");
        Object object = this.zza;
        synchronized (object) {
            boolean bl2;
            this.zzh();
            this.zzc = bl2 = true;
            this.zzf = exception;
        }
        this.zzb.zzb(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(Object object) {
        Object object2 = this.zza;
        synchronized (object2) {
            boolean bl2;
            this.zzh();
            this.zzc = bl2 = true;
            this.zze = object;
        }
        this.zzb.zzb(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzc() {
        Object object = this.zza;
        synchronized (object) {
            try {
                boolean bl2 = this.zzc;
                if (bl2) {
                    return false;
                }
                this.zzc = bl2 = true;
                this.zzd = bl2;
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl10 : MonitorExitStatement: MONITOREXIT : var1_1
                this.zzb.zzb(this);
                return bl2;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzd(Exception exception) {
        Preconditions.checkNotNull(exception, "Exception must not be null");
        Object object = this.zza;
        synchronized (object) {
            try {
                boolean bl2 = this.zzc;
                if (bl2) {
                    return false;
                }
                this.zzc = bl2 = true;
                this.zzf = exception;
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl12 : MonitorExitStatement: MONITOREXIT : var2_3
                this.zzb.zzb(this);
                return bl2;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zze(Object object) {
        Object object2 = this.zza;
        synchronized (object2) {
            try {
                boolean bl2 = this.zzc;
                if (bl2) {
                    return false;
                }
                this.zzc = bl2 = true;
                this.zze = object;
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl10 : MonitorExitStatement: MONITOREXIT : var2_3
                this.zzb.zzb(this);
                return bl2;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

