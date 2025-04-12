/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

public final class zzfin {
    private final Deque zza;
    private final Callable zzb;
    private final zzgge zzc;

    public zzfin(Callable callable, zzgge zzgge2) {
        LinkedBlockingDeque linkedBlockingDeque;
        this.zza = linkedBlockingDeque = new LinkedBlockingDeque();
        this.zzb = callable;
        this.zzc = zzgge2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ListenableFuture zza() {
        synchronized (this) {
            int n3 = 1;
            this.zzc(n3);
            Object object = this.zza;
            object = object.poll();
            return (ListenableFuture)object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(ListenableFuture listenableFuture) {
        synchronized (this) {
            Deque deque = this.zza;
            deque.addFirst(listenableFuture);
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc(int n3) {
        synchronized (this) {
            int n4;
            try {
                Deque deque = this.zza;
                n4 = deque.size();
                n3 -= n4;
                n4 = 0;
                deque = null;
            }
            catch (Throwable throwable) {}
            while (true) {
                if (n4 >= n3) {
                    return;
                }
                Deque deque = this.zza;
                Object object = this.zzc;
                Callable callable = this.zzb;
                object = object.zzb(callable);
                deque.add(object);
                ++n4;
                continue;
                break;
            }
            throw throwable;
        }
    }
}

