/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.ads.nonagon.signalgeneration.zze;

public final class zza
implements Runnable {
    public final /* synthetic */ zze zza;
    public final /* synthetic */ Object zzb;
    public final /* synthetic */ Pair zzc;

    public /* synthetic */ zza(zze zze2, Object object, Pair pair) {
        this.zza = zze2;
        this.zzb = object;
        this.zzc = pair;
    }

    public final void run() {
        zze zze2 = this.zza;
        Object object = this.zzb;
        Pair pair = this.zzc;
        zze2.zze(object, pair);
    }
}

