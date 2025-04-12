/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tasks;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzk;
import com.google.android.gms.tasks.zzq;
import java.util.concurrent.Executor;

final class zzl
implements zzq {
    private final Executor zza;
    private final Object zzb;
    private OnFailureListener zzc;

    public zzl(Executor executor, OnFailureListener onFailureListener) {
        Object object;
        this.zzb = object = new Object();
        this.zza = executor;
        this.zzc = onFailureListener;
    }

    public static /* bridge */ /* synthetic */ OnFailureListener zza(zzl zzl2) {
        return zzl2.zzc;
    }

    public static /* bridge */ /* synthetic */ Object zzb(zzl zzl2) {
        return zzl2.zzb;
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
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zzd(Task task2) {
        boolean bl2 = task2.isSuccessful();
        if (bl2) return;
        bl2 = task2.isCanceled();
        if (bl2) return;
        Object object = this.zzb;
        // MONITORENTER : object
        Object object2 = this.zzc;
        if (object2 == null) {
            // MONITOREXIT : object
            return;
        }
        object = this.zza;
        object2 = new zzk(this, task2);
        object.execute((Runnable)object2);
    }
}

