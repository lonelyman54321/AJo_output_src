/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgeh;
import com.google.android.gms.internal.ads.zzgeh$zza;
import com.google.common.util.concurrent.ListenableFuture;

final class zzgeh$zzf
implements Runnable {
    final zzgeh zza;
    final ListenableFuture zzb;

    public zzgeh$zzf(zzgeh zzgeh2, ListenableFuture listenableFuture) {
        this.zza = zzgeh2;
        this.zzb = listenableFuture;
    }

    public final void run() {
        Object object = zzgeh.zzj(this.zza);
        if (object == this) {
            object = this.zzb;
            zzgeh zzgeh2 = this.zza;
            object = zzgeh.zzk((ListenableFuture)object);
            zzgeh$zza zzgeh$zza = zzgeh.zzg();
            boolean bl2 = zzgeh$zza.zzf(zzgeh2, this, object);
            if (bl2) {
                object = this.zza;
                zzgeh2 = null;
                zzgeh.zzp((zzgeh)object, false);
            }
        }
    }
}

