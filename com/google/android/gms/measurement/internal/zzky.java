/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzju;
import com.google.android.gms.measurement.internal.zzme;
import java.util.concurrent.atomic.AtomicReference;

final class zzky
implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ zzju zze;

    public zzky(zzju zzju2, AtomicReference atomicReference, String string2, String string3, String string4) {
        this.zza = atomicReference;
        this.zzb = null;
        this.zzc = string3;
        this.zzd = string4;
        this.zze = zzju2;
    }

    public final void run() {
        zzme zzme2 = this.zze.zzu.zzt();
        AtomicReference atomicReference = this.zza;
        String string2 = this.zzc;
        String string3 = this.zzd;
        zzme2.zza(atomicReference, null, string2, string3);
    }
}

