/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzggp;
import com.google.android.gms.internal.ads.zzggq;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;

final class zzggn
implements Runnable {
    zzggq zza;

    public zzggn(zzggq zzggq2) {
        this.zza = zzggq2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Throwable throwable3;
        Throwable throwable22;
        String string2;
        Object object;
        boolean bl2;
        ListenableFuture listenableFuture;
        zzggq zzggq2;
        block9: {
            Object object2;
            String string3;
            block8: {
                string3 = "Timed out (timeout delayed by ";
                zzggq2 = this.zza;
                if (zzggq2 == null) {
                    return;
                }
                listenableFuture = zzggq.zze(zzggq2);
                if (listenableFuture == null) return;
                this.zza = null;
                bl2 = listenableFuture.isDone();
                if (bl2) {
                    zzggq2.zzs(listenableFuture);
                    return;
                }
                bl2 = true;
                try {
                    object = zzggq.zzv(zzggq2);
                    zzggq.zzw(zzggq2, null);
                    string2 = "Timed out";
                    if (object == null) break block8;
                }
                catch (Throwable throwable22) {}
                try {
                    object2 = TimeUnit.MILLISECONDS;
                    long l2 = object.getDelay((TimeUnit)((Object)object2));
                    l2 = Math.abs(l2);
                    long l3 = 10;
                    long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                    if (l4 <= 0) break block8;
                    object = new StringBuilder(string3);
                    ((StringBuilder)object).append(l2);
                    string3 = " ms after scheduled time)";
                    ((StringBuilder)object).append(string3);
                    string2 = ((StringBuilder)object).toString();
                }
                catch (Throwable throwable3) {
                    break block9;
                }
            }
            string3 = listenableFuture.toString();
            object = new StringBuilder();
            ((StringBuilder)object).append(string2);
            object2 = ": ";
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(string3);
            string3 = ((StringBuilder)object).toString();
            object = new zzggp(string3, null);
            zzggq2.zzd((Throwable)object);
            listenableFuture.cancel(bl2);
            return;
        }
        object = new zzggp(string2, null);
        zzggq2.zzd((Throwable)object);
        throw throwable3;
        listenableFuture.cancel(bl2);
        throw throwable22;
    }
}

