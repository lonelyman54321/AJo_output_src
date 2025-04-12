/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzar;
import com.google.android.gms.measurement.internal.zzig;
import java.util.concurrent.Callable;

final class zziu
implements Callable {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ zzig zzd;

    public zziu(zzig zzig2, String string2, String string3, String string4) {
        this.zza = string2;
        this.zzb = string3;
        this.zzc = string4;
        this.zzd = zzig2;
    }

    public final /* synthetic */ Object call() {
        zzig.zza(this.zzd).zzs();
        zzar zzar2 = zzig.zza(this.zzd).zzf();
        String string2 = this.zza;
        String string3 = this.zzb;
        String string4 = this.zzc;
        return zzar2.zzb(string2, string3, string4);
    }
}

