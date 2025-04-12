/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzju;

final class zzkt
implements Runnable {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ Object zzc;
    private final /* synthetic */ long zzd;
    private final /* synthetic */ zzju zze;

    public zzkt(zzju zzju2, String string2, String string3, Object object, long l2) {
        this.zza = string2;
        this.zzb = string3;
        this.zzc = object;
        this.zzd = l2;
        this.zze = zzju2;
    }

    public final void run() {
        zzju zzju2 = this.zze;
        String string2 = this.zza;
        String string3 = this.zzb;
        Object object = this.zzc;
        long l2 = this.zzd;
        zzju2.zza(string2, string3, object, l2);
    }
}

