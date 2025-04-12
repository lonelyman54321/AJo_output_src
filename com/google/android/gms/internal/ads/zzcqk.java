/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcqp;

public final class zzcqk
implements Runnable {
    public final /* synthetic */ zzcqp zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ int zzc;

    public /* synthetic */ zzcqk(zzcqp zzcqp2, int n3, int n4) {
        this.zza = zzcqp2;
        this.zzb = n3;
        this.zzc = n4;
    }

    public final void run() {
        zzcqp zzcqp2 = this.zza;
        int n3 = this.zzb;
        int n4 = this.zzc;
        zzcqp2.zzo(n3, n4);
    }
}

