/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzbl;
import com.google.android.gms.measurement.internal.zzig;
import com.google.android.gms.measurement.internal.zzp;

final class zziz
implements Runnable {
    private final /* synthetic */ zzbl zza;
    private final /* synthetic */ zzp zzb;
    private final /* synthetic */ zzig zzc;

    public zziz(zzig zzig2, zzbl zzbl2, zzp zzp2) {
        this.zza = zzbl2;
        this.zzb = zzp2;
        this.zzc = zzig2;
    }

    public final void run() {
        Object object = this.zzc;
        Object object2 = this.zza;
        zzp zzp2 = this.zzb;
        object = ((zzig)object).zzb((zzbl)object2, zzp2);
        object2 = this.zzc;
        zzp2 = this.zzb;
        ((zzig)object2).zzc((zzbl)object, zzp2);
    }
}

