/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tasks;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzm;
import com.google.android.gms.tasks.zzq;
import java.util.concurrent.Executor;

final class zzn
implements zzq {
    private final Executor zza;
    private final Object zzb;
    private OnSuccessListener zzc;

    public zzn(Executor executor, OnSuccessListener onSuccessListener) {
        Object object;
        this.zzb = object = new Object();
        this.zza = executor;
        this.zzc = onSuccessListener;
    }

    public static /* bridge */ /* synthetic */ OnSuccessListener zza(zzn zzn2) {
        return zzn2.zzc;
    }

    public static /* bridge */ /* synthetic */ Object zzb(zzn zzn2) {
        return zzn2.zzb;
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
        boolean bl2 = task2.isSuccessful();
        if (!bl2) {
            return;
        }
        Object object = this.zzb;
        synchronized (object) {
            try {
                Object object2 = this.zzc;
                if (object2 == null) {
                    return;
                }
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl11 : MonitorExitStatement: MONITOREXIT : var3_4
                object = this.zza;
                object2 = new zzm(this, task2);
                object.execute((Runnable)object2);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

