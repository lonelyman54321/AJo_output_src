/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcdi;

public final class zzccz
implements Runnable {
    public final /* synthetic */ zzcdi zza;
    public final /* synthetic */ int zzb;

    public /* synthetic */ zzccz(zzcdi zzcdi2, int n3) {
        this.zza = zzcdi2;
        this.zzb = n3;
    }

    public final void run() {
        zzcdi zzcdi2 = this.zza;
        int n3 = this.zzb;
        zzcdi2.zzm(n3);
    }
}

