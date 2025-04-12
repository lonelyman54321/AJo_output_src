/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzm;
import com.google.android.gms.measurement.internal.zzhm;
import com.google.android.gms.measurement.internal.zzhu;
import java.util.concurrent.Callable;

public final class zzho
implements Callable {
    private /* synthetic */ zzhm zza;
    private /* synthetic */ String zzb;

    public /* synthetic */ zzho(zzhm zzhm2, String string2) {
        this.zza = zzhm2;
        this.zzb = string2;
    }

    public final Object call() {
        zzhm zzhm2 = this.zza;
        String string2 = this.zzb;
        zzhu zzhu2 = new zzhu(zzhm2, string2);
        zzm zzm2 = new zzm("internal.remoteConfig", zzhu2);
        return zzm2;
    }
}

