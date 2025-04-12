/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.internal.util;

import com.google.android.gms.ads.internal.util.zzb;

final class zza
implements Runnable {
    final /* synthetic */ zzb zza;

    public zza(zzb zzb2) {
        this.zza = zzb2;
    }

    public final void run() {
        zzb zzb2 = this.zza;
        Thread thread2 = Thread.currentThread();
        zzb.zzc(zzb2, thread2);
        this.zza.zza();
    }
}

