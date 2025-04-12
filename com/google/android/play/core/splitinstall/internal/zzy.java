/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.internal;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.splitinstall.internal.zzaf;
import com.google.android.play.core.splitinstall.internal.zzu;
import com.google.android.play.core.splitinstall.internal.zzv;
import java.util.concurrent.atomic.AtomicInteger;

final class zzy
extends zzv {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ zzv zzb;
    final /* synthetic */ zzaf zzc;

    public zzy(zzaf zzaf2, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, zzv zzv2) {
        this.zzc = zzaf2;
        this.zza = taskCompletionSource2;
        this.zzb = zzv2;
        super(taskCompletionSource);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc() {
        Object object = zzaf.zzg(this.zzc);
        synchronized (object) {
            Throwable throwable2;
            block4: {
                Object object2;
                Object object3;
                block3: {
                    try {
                        object3 = this.zzc;
                        object2 = this.zza;
                        zzaf.zzn((zzaf)object3, (TaskCompletionSource)object2);
                        object3 = this.zzc;
                        object3 = zzaf.zzi((zzaf)object3);
                        int n3 = ((AtomicInteger)object3).getAndIncrement();
                        if (n3 <= 0) break block3;
                        object3 = this.zzc;
                        object3 = zzaf.zzf((zzaf)object3);
                        object2 = "Already connected to the service.";
                        Object[] objectArray = null;
                        objectArray = new Object[]{};
                        ((zzu)object3).zzd((String)object2, objectArray);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object3 = this.zzc;
                object2 = this.zzb;
                zzaf.zzp((zzaf)object3, (zzv)object2);
                return;
            }
            throw throwable2;
        }
    }
}

