/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tasks;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzq;
import java.util.ArrayDeque;
import java.util.Queue;

final class zzr {
    private final Object zza;
    private Queue zzb;
    private boolean zzc;

    public zzr() {
        Object object;
        this.zza = object = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(zzq zzq2) {
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                ArrayDeque<zzq> arrayDeque;
                block3: {
                    try {
                        arrayDeque = this.zzb;
                        if (arrayDeque != null) break block3;
                        this.zzb = arrayDeque = new ArrayDeque<zzq>();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                arrayDeque = this.zzb;
                arrayDeque.add(zzq2);
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zzb(Task task2) {
        boolean bl2;
        Object object = this.zza;
        // MONITORENTER : object
        Object object2 = this.zzb;
        if (object2 == null || (bl2 = this.zzc)) {
            // MONITOREXIT : object
            return;
        }
        this.zzc = bl2 = true;
        // MONITOREXIT : object
        while (true) {
            object2 = this.zza;
            // MONITORENTER : object2
            object = this.zzb;
            object = object.poll();
            object = (zzq)object;
            if (object == null) {
                task2 = null;
                this.zzc = false;
                // MONITOREXIT : object2
                return;
            }
            object.zzd(task2);
        }
    }
}

