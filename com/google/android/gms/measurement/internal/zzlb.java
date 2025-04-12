/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzju;
import com.google.android.gms.measurement.internal.zzme;
import java.util.concurrent.atomic.AtomicReference;

final class zzlb
implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ boolean zze;
    private final /* synthetic */ zzju zzf;

    public zzlb(zzju zzju2, AtomicReference atomicReference, String string2, String string3, String string4, boolean bl2) {
        this.zza = atomicReference;
        this.zzb = null;
        this.zzc = string3;
        this.zzd = string4;
        this.zze = bl2;
        this.zzf = zzju2;
    }

    public final void run() {
        zzme zzme2 = this.zzf.zzu.zzt();
        AtomicReference atomicReference = this.zza;
        String string2 = this.zzc;
        String string3 = this.zzd;
        boolean bl2 = this.zze;
        zzme2.zza(atomicReference, null, string2, string3, bl2);
    }
}

