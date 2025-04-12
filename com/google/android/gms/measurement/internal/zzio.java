/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzar;
import com.google.android.gms.measurement.internal.zzig;
import java.util.concurrent.Callable;

final class zzio
implements Callable {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzig zzb;

    public zzio(zzig zzig2, String string2) {
        this.zza = string2;
        this.zzb = zzig2;
    }

    public final /* synthetic */ Object call() {
        zzig.zza(this.zzb).zzs();
        zzar zzar2 = zzig.zza(this.zzb).zzf();
        String string2 = this.zza;
        return zzar2.zzk(string2);
    }
}

