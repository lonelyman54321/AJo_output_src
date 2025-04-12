/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tasks;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzi;
import com.google.android.gms.tasks.zzq;
import java.util.concurrent.Executor;

final class zzj
implements zzq {
    private final Executor zza;
    private final Object zzb;
    private OnCompleteListener zzc;

    public zzj(Executor executor, OnCompleteListener onCompleteListener) {
        Object object;
        this.zzb = object = new Object();
        this.zza = executor;
        this.zzc = onCompleteListener;
    }

    public static /* bridge */ /* synthetic */ OnCompleteListener zza(zzj zzj2) {
        return zzj2.zzc;
    }

    public static /* bridge */ /* synthetic */ Object zzb(zzj zzj2) {
        return zzj2.zzb;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc() {
        Object object = this.zzb;
        synchronized (object) {
            Object var2_2 = null;
            this.zzc = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd(Task task2) {
        Object object = this.zzb;
        synchronized (object) {
            try {
                Object object2 = this.zzc;
                if (object2 == null) {
                    return;
                }
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl8 : MonitorExitStatement: MONITOREXIT : var2_3
                object = this.zza;
                object2 = new zzi(this, task2);
                object.execute((Runnable)object2);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

