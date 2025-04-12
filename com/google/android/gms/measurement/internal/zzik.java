/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzgf;
import com.google.android.gms.measurement.internal.zzig;
import com.google.android.gms.measurement.internal.zzop;

public final class zzik
implements Runnable {
    private /* synthetic */ zzig zza;
    private /* synthetic */ String zzb;
    private /* synthetic */ zzop zzc;
    private /* synthetic */ zzgf zzd;

    public /* synthetic */ zzik(zzig zzig2, String string2, zzop zzop2, zzgf zzgf2) {
        this.zza = zzig2;
        this.zzb = string2;
        this.zzc = zzop2;
        this.zzd = zzgf2;
    }

    public final void run() {
        zzig zzig2 = this.zza;
        String string2 = this.zzb;
        zzop zzop2 = this.zzc;
        zzgf zzgf2 = this.zzd;
        zzig.zza(zzig2, string2, zzop2, zzgf2);
    }
}

