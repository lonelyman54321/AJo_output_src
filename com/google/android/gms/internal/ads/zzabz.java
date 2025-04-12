/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzach;

public final class zzabz
implements Runnable {
    public final /* synthetic */ zzach zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ long zzc;

    public /* synthetic */ zzabz(zzach zzach2, int n3, long l2) {
        this.zza = zzach2;
        this.zzb = n3;
        this.zzc = l2;
    }

    public final void run() {
        zzach zzach2 = this.zza;
        int n3 = this.zzb;
        long l2 = this.zzc;
        zzach2.zzj(n3, l2);
    }
}

