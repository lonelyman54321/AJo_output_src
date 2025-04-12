/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzme;
import com.google.android.gms.measurement.internal.zznj;

final class zznm
implements Runnable {
    private final /* synthetic */ zznj zza;

    public zznm(zznj zznj2) {
        this.zza = zznj2;
    }

    public final void run() {
        zzme.zza(this.zza.zza, null);
        zzme.zze(this.zza.zza);
    }
}

