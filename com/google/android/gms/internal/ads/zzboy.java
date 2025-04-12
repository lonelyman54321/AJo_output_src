/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzboo;
import com.google.android.gms.internal.ads.zzbps;
import com.google.android.gms.internal.ads.zzbpt;
import java.util.ArrayList;

public final class zzboy
implements Runnable {
    public final /* synthetic */ zzbpt zza;
    public final /* synthetic */ zzbps zzb;
    public final /* synthetic */ zzboo zzc;
    public final /* synthetic */ ArrayList zzd;
    public final /* synthetic */ long zze;

    public /* synthetic */ zzboy(zzbpt zzbpt2, zzbps zzbps2, zzboo zzboo2, ArrayList arrayList, long l2) {
        this.zza = zzbpt2;
        this.zzb = zzbps2;
        this.zzc = zzboo2;
        this.zzd = arrayList;
        this.zze = l2;
    }

    public final void run() {
        zzbpt zzbpt2 = this.zza;
        zzbps zzbps2 = this.zzb;
        zzboo zzboo2 = this.zzc;
        ArrayList arrayList = this.zzd;
        long l2 = this.zze;
        zzbpt2.zzi(zzbps2, zzboo2, arrayList, l2);
    }
}

