/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzlw;
import com.google.android.gms.measurement.internal.zzlz;

final class zzmb
implements Runnable {
    private final /* synthetic */ zzlw zza;
    private final /* synthetic */ zzlw zzb;
    private final /* synthetic */ long zzc;
    private final /* synthetic */ boolean zzd;
    private final /* synthetic */ zzlz zze;

    public zzmb(zzlz zzlz2, zzlw zzlw2, zzlw zzlw3, long l2, boolean bl2) {
        this.zza = zzlw2;
        this.zzb = zzlw3;
        this.zzc = l2;
        this.zzd = bl2;
        this.zze = zzlz2;
    }

    public final void run() {
        zzlz zzlz2 = this.zze;
        zzlw zzlw2 = this.zza;
        zzlw zzlw3 = this.zzb;
        long l2 = this.zzc;
        boolean bl2 = this.zzd;
        zzlz.zza(zzlz2, zzlw2, zzlw3, l2, bl2, null);
    }
}

