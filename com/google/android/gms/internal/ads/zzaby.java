/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzach;
import com.google.android.gms.internal.ads.zzdv;

public final class zzaby
implements Runnable {
    public final /* synthetic */ zzach zza;
    public final /* synthetic */ zzdv zzb;

    public /* synthetic */ zzaby(zzach zzach2, zzdv zzdv2) {
        this.zza = zzach2;
        this.zzb = zzdv2;
    }

    public final void run() {
        zzach zzach2 = this.zza;
        zzdv zzdv2 = this.zzb;
        zzach2.zzp(zzdv2);
    }
}

