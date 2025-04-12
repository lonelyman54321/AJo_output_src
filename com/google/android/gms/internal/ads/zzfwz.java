/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfwv;
import com.google.android.gms.internal.ads.zzfww;
import com.google.android.gms.internal.ads.zzfxg;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicInteger;

final class zzfwz
extends zzfww {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ zzfww zzb;
    final /* synthetic */ zzfxg zzc;

    public zzfwz(zzfxg zzfxg2, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, zzfww zzfww2) {
        this.zza = taskCompletionSource2;
        this.zzb = zzfww2;
        this.zzc = zzfxg2;
        super(taskCompletionSource);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        Object object = zzfxg.zzg(this.zzc);
        synchronized (object) {
            Throwable throwable2;
            block4: {
                Object object2;
                Object object3;
                block3: {
                    try {
                        object3 = this.zzc;
                        object2 = this.zza;
                        zzfxg.zzn((zzfxg)object3, (TaskCompletionSource)object2);
                        object3 = this.zzc;
                        object3 = zzfxg.zzi((zzfxg)object3);
                        int n3 = ((AtomicInteger)object3).getAndIncrement();
                        if (n3 <= 0) break block3;
                        object3 = this.zzc;
                        object3 = zzfxg.zzf((zzfxg)object3);
                        object2 = "Already connected to the service.";
                        Object[] objectArray = null;
                        objectArray = new Object[]{};
                        ((zzfwv)object3).zzc((String)object2, objectArray);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object3 = this.zzc;
                object2 = this.zzb;
                zzfxg.zzp((zzfxg)object3, (zzfww)object2);
                return;
            }
            throw throwable2;
        }
    }
}

