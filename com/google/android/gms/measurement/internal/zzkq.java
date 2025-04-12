/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzju;

final class zzkq
implements Runnable {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ long zzc;
    private final /* synthetic */ Bundle zzd;
    private final /* synthetic */ boolean zze;
    private final /* synthetic */ boolean zzf;
    private final /* synthetic */ boolean zzg;
    private final /* synthetic */ String zzh;
    private final /* synthetic */ zzju zzi;

    public zzkq(zzju zzju2, String string2, String string3, long l2, Bundle bundle, boolean bl2, boolean bl3, boolean bl4, String string4) {
        this.zza = string2;
        this.zzb = string3;
        this.zzc = l2;
        this.zzd = bundle;
        this.zze = bl2;
        this.zzf = bl3;
        this.zzg = bl4;
        this.zzh = string4;
        this.zzi = zzju2;
    }

    public final void run() {
        zzju zzju2 = this.zzi;
        String string2 = this.zza;
        String string3 = this.zzb;
        long l2 = this.zzc;
        Bundle bundle = this.zzd;
        boolean bl2 = this.zze;
        boolean bl3 = this.zzf;
        boolean bl4 = this.zzg;
        String string4 = this.zzh;
        zzju2.zza(string2, string3, l2, bundle, bl2, bl3, bl4, string4);
    }
}

