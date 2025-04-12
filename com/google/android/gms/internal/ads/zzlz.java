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
import com.google.android.gms.internal.ads.zzvk;
import com.google.android.gms.internal.ads.zzvo;

public final class zzlz
implements Runnable {
    public final /* synthetic */ zzmb zza;
    public final /* synthetic */ Pair zzb;
    public final /* synthetic */ zzvk zzc;

    public /* synthetic */ zzlz(zzmb zzmb2, Pair pair, zzvk zzvk2) {
        this.zza = zzmb2;
        this.zzb = pair;
        this.zzc = zzvk2;
    }

    public final void run() {
        Object object = this.zzb;
        zzmx zzmx2 = zzmf.zze(this.zza.zza);
        int n3 = (Integer)object.first;
        object = (zzvo)object.second;
        zzvk zzvk2 = this.zzc;
        zzmx2.zzae(n3, (zzvo)object, zzvk2);
    }
}

