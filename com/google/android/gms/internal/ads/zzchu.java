/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzchs;
import com.google.android.gms.internal.ads.zzchv;
import com.google.android.gms.internal.ads.zzehe;

public final class zzchu
implements Runnable {
    public final /* synthetic */ zzchv zza;
    public final /* synthetic */ zzehe zzb;

    public /* synthetic */ zzchu(zzchv zzchv2, zzehe zzehe2) {
        this.zza = zzchv2;
        this.zzb = zzehe2;
    }

    public final void run() {
        zzchv zzchv2 = this.zza;
        zzchs zzchs2 = new zzchs(zzchv2);
        this.zzb.zzf(zzchs2);
    }
}

