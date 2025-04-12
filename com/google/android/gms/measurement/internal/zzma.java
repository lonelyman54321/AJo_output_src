/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzlw;
import com.google.android.gms.measurement.internal.zzlz;

final class zzma
implements Runnable {
    private final /* synthetic */ zzlz zza;

    public zzma(zzlz zzlz2) {
        this.zza = zzlz2;
    }

    public final void run() {
        zzlw zzlw2;
        zzlz zzlz2 = this.zza;
        zzlz2.zza = zzlw2 = zzlz.zza(zzlz2);
    }
}

