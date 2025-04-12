/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaba;
import com.google.android.gms.internal.ads.zzack;
import com.google.android.gms.internal.ads.zzdv;

public final class zzaax
implements Runnable {
    public final /* synthetic */ zzaba zza;
    public final /* synthetic */ zzack zzb;
    public final /* synthetic */ zzdv zzc;

    public /* synthetic */ zzaax(zzaba zzaba2, zzack zzack2, zzdv zzdv2) {
        this.zza = zzaba2;
        this.zzb = zzack2;
        this.zzc = zzdv2;
    }

    public final void run() {
        zzack zzack2 = this.zzb;
        zzaba zzaba2 = this.zza;
        zzdv zzdv2 = this.zzc;
        zzack2.zzc(zzaba2, zzdv2);
    }
}

