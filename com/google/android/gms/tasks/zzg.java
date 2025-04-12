/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tasks;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.zzh;

final class zzg
implements Runnable {
    final /* synthetic */ zzh zza;

    public zzg(zzh zzh2) {
        this.zza = zzh2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Object object = zzh.zzb(this.zza);
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        Object object2 = this.zza;
                        OnCanceledListener onCanceledListener = zzh.zza((zzh)object2);
                        if (onCanceledListener == null) break block3;
                        object2 = zzh.zza((zzh)object2);
                        object2.onCanceled();
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

