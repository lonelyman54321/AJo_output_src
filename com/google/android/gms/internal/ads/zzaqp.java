/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaqq;
import com.google.android.gms.internal.ads.zzare;

final class zzaqp
implements Runnable {
    final /* synthetic */ zzare zza;
    final /* synthetic */ zzaqq zzb;

    public zzaqp(zzaqq zzaqq2, zzare zzare2) {
        this.zza = zzare2;
        this.zzb = zzaqq2;
    }

    public final void run() {
        Object object;
        try {
            object = this.zzb;
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
            return;
        }
        object = zzaqq.zza((zzaqq)object);
        zzare zzare2 = this.zza;
        object.put(zzare2);
    }
}

