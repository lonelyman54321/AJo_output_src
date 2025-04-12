/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tasks;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzg;
import com.google.android.gms.tasks.zzq;
import java.util.concurrent.Executor;

final class zzh
implements zzq {
    private final Executor zza;
    private final Object zzb;
    private OnCanceledListener zzc;

    public zzh(Executor executor, OnCanceledListener onCanceledListener) {
        Object object;
        this.zzb = object = new Object();
        this.zza = executor;
        this.zzc = onCanceledListener;
    }

    public static /* bridge */ /* synthetic */ OnCanceledListener zza(zzh zzh2) {
        return zzh2.zzc;
    }

    public static /* bridge */ /* synthetic */ Object zzb(zzh zzh2) {
        return zzh2.zzb;
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
    public final void zzd(Task object) {
        boolean bl2 = ((Task)object).isCanceled();
        if (!bl2) {
            return;
        }
        object = this.zzb;
        synchronized (object) {
            try {
                Object object2 = this.zzc;
                if (object2 == null) {
                    return;
                }
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl11 : MonitorExitStatement: MONITOREXIT : var1_1
                object = this.zza;
                object2 = new zzg(this);
                object.execute((Runnable)object2);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

