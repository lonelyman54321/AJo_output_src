/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcqd;

public final class zzcpw
implements Runnable {
    public final /* synthetic */ zzcqd zza;
    public final /* synthetic */ Throwable zzb;

    public /* synthetic */ zzcpw(zzcqd zzcqd2, Throwable throwable) {
        this.zza = zzcqd2;
        this.zzb = throwable;
    }

    public final void run() {
        zzcqd zzcqd2 = this.zza;
        Throwable throwable = this.zzb;
        zzcqd2.zzg(throwable);
    }
}

