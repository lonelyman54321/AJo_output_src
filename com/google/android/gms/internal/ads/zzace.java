/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzach;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zziy;

public final class zzace
implements Runnable {
    public final /* synthetic */ zzach zza;
    public final /* synthetic */ zzan zzb;
    public final /* synthetic */ zziy zzc;

    public /* synthetic */ zzace(zzach zzach2, zzan zzan2, zziy zziy2) {
        this.zza = zzach2;
        this.zzb = zzan2;
        this.zzc = zziy2;
    }

    public final void run() {
        zzach zzach2 = this.zza;
        zzan zzan2 = this.zzb;
        zziy zziy2 = this.zzc;
        zzach2.zzl(zzan2, zziy2);
    }
}

