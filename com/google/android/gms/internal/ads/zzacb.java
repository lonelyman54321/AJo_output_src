/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzach;

public final class zzacb
implements Runnable {
    public final /* synthetic */ zzach zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ int zzc;

    public /* synthetic */ zzacb(zzach zzach2, long l2, int n3) {
        this.zza = zzach2;
        this.zzb = l2;
        this.zzc = n3;
    }

    public final void run() {
        zzach zzach2 = this.zza;
        long l2 = this.zzb;
        int n3 = this.zzc;
        zzach2.zzn(l2, n3);
    }
}

