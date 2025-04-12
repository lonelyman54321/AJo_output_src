/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzmb;
import com.google.android.gms.internal.ads.zzmf;
import com.google.android.gms.internal.ads.zzmx;
import com.google.android.gms.internal.ads.zzvf;
import com.google.android.gms.internal.ads.zzvk;
import com.google.android.gms.internal.ads.zzvo;

public final class zzma
implements Runnable {
    public final /* synthetic */ zzmb zza;
    public final /* synthetic */ Pair zzb;
    public final /* synthetic */ zzvf zzc;
    public final /* synthetic */ zzvk zzd;

    public /* synthetic */ zzma(zzmb zzmb2, Pair pair, zzvf zzvf2, zzvk zzvk2) {
        this.zza = zzmb2;
        this.zzb = pair;
        this.zzc = zzvf2;
        this.zzd = zzvk2;
    }

    public final void run() {
        Object object = this.zzb;
        zzmx zzmx2 = zzmf.zze(this.zza.zza);
        int n3 = (Integer)object.first;
        object = (zzvo)object.second;
        zzvf zzvf2 = this.zzc;
        zzvk zzvk2 = this.zzd;
        zzmx2.zzag(n3, (zzvo)object, zzvf2, zzvk2);
    }
}

