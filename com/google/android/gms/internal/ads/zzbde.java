/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzccn;
import java.util.concurrent.Future;

public final class zzbde
implements Runnable {
    public final /* synthetic */ zzccn zza;
    public final /* synthetic */ Future zzb;

    public /* synthetic */ zzbde(zzccn zzccn2, Future future) {
        this.zza = zzccn2;
        this.zzb = future;
    }

    public final void run() {
        Future future = this.zza;
        boolean bl2 = ((zzccn)future).isCancelled();
        if (bl2) {
            future = this.zzb;
            boolean bl3 = true;
            future.cancel(bl3);
        }
    }
}

