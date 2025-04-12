/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzctv;

public final class zzctu
implements Runnable {
    public final /* synthetic */ zzctv zza;
    public final /* synthetic */ Runnable zzb;

    public /* synthetic */ zzctu(zzctv zzctv2, Runnable runnable2) {
        this.zza = zzctv2;
        this.zzb = runnable2;
    }

    public final void run() {
        zzctv zzctv2 = this.zza;
        Runnable runnable2 = this.zzb;
        zzctv2.zzk(runnable2);
    }
}

