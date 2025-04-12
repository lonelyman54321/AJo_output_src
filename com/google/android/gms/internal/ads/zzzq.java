/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzzr;
import com.google.android.gms.internal.ads.zzzt;

public final class zzzq
implements Runnable {
    public final /* synthetic */ zzzr zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ long zzd;

    public /* synthetic */ zzzq(zzzr zzzr2, int n3, long l2, long l3) {
        this.zza = zzzr2;
        this.zzb = n3;
        this.zzc = l2;
        this.zzd = l3;
    }

    public final void run() {
        zzzt zzzt2 = zzzr.zzb(this.zza);
        int n3 = this.zzb;
        long l2 = this.zzc;
        long l3 = this.zzd;
        zzzt2.zzX(n3, l2, l3);
    }
}

