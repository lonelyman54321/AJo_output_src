/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.ads.nonagon.signalgeneration.zzp;
import com.google.android.gms.internal.ads.zzdux;
import com.google.android.gms.internal.ads.zzdvh;

public final class zzo
implements Runnable {
    public final /* synthetic */ zzdvh zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ Pair[] zzc;

    public /* synthetic */ zzo(zzdvh zzdvh2, zzdux zzdux2, String string2, Pair[] pairArray) {
        this.zza = zzdvh2;
        this.zzb = string2;
        this.zzc = pairArray;
    }

    public final void run() {
        zzdvh zzdvh2 = this.zza;
        String string2 = this.zzb;
        Pair[] pairArray = this.zzc;
        zzp.zze(zzdvh2, null, string2, pairArray);
    }
}

