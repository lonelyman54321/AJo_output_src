/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.nonagon.signalgeneration.zzk;
import com.google.android.gms.internal.ads.zzdux;
import java.util.ArrayDeque;

public final class zzi
implements Runnable {
    public final /* synthetic */ zzk zza;
    public final /* synthetic */ zzdux zzb;
    public final /* synthetic */ ArrayDeque zzc;
    public final /* synthetic */ ArrayDeque zzd;

    public /* synthetic */ zzi(zzk zzk2, zzdux zzdux2, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        this.zza = zzk2;
        this.zzb = zzdux2;
        this.zzc = arrayDeque;
        this.zzd = arrayDeque2;
    }

    public final void run() {
        zzk zzk2 = this.zza;
        zzdux zzdux2 = this.zzb;
        ArrayDeque arrayDeque = this.zzc;
        ArrayDeque arrayDeque2 = this.zzd;
        zzk2.zze(zzdux2, arrayDeque, arrayDeque2);
    }
}

