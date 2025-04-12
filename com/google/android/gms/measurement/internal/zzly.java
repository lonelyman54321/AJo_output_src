/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzlw;
import com.google.android.gms.measurement.internal.zzlz;

final class zzly
implements Runnable {
    private final /* synthetic */ Bundle zza;
    private final /* synthetic */ zzlw zzb;
    private final /* synthetic */ zzlw zzc;
    private final /* synthetic */ long zzd;
    private final /* synthetic */ zzlz zze;

    public zzly(zzlz zzlz2, Bundle bundle, zzlw zzlw2, zzlw zzlw3, long l2) {
        this.zza = bundle;
        this.zzb = zzlw2;
        this.zzc = zzlw3;
        this.zzd = l2;
        this.zze = zzlz2;
    }

    public final void run() {
        zzlz zzlz2 = this.zze;
        Bundle bundle = this.zza;
        zzlw zzlw2 = this.zzb;
        zzlw zzlw3 = this.zzc;
        long l2 = this.zzd;
        zzlz.zza(zzlz2, bundle, zzlw2, zzlw3, l2);
    }
}

