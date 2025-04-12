/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzgy;
import com.google.android.gms.measurement.internal.zzou;

final class zzhb
implements Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ zzgy zzb;

    public zzhb(zzgy zzgy2, boolean bl2) {
        this.zza = bl2;
        this.zzb = zzgy2;
    }

    public final void run() {
        zzou zzou2 = zzgy.zza(this.zzb);
        boolean bl2 = this.zza;
        zzou2.zza(bl2);
    }
}

