/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzbl;
import com.google.android.gms.measurement.internal.zzig;
import com.google.android.gms.measurement.internal.zzou;

final class zzjc
implements Runnable {
    private final /* synthetic */ zzbl zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzig zzc;

    public zzjc(zzig zzig2, zzbl zzbl2, String string2) {
        this.zza = zzbl2;
        this.zzb = string2;
        this.zzc = zzig2;
    }

    public final void run() {
        zzig.zza(this.zzc).zzs();
        zzou zzou2 = zzig.zza(this.zzc);
        zzbl zzbl2 = this.zza;
        String string2 = this.zzb;
        zzou2.zza(zzbl2, string2);
    }
}

