/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzx;
import com.google.android.gms.measurement.internal.zzhm;
import com.google.android.gms.measurement.internal.zzhp;
import java.util.concurrent.Callable;

public final class zzhn
implements Callable {
    private /* synthetic */ zzhm zza;
    private /* synthetic */ String zzb;

    public /* synthetic */ zzhn(zzhm zzhm2, String string2) {
        this.zza = zzhm2;
        this.zzb = string2;
    }

    public final Object call() {
        zzhm zzhm2 = this.zza;
        String string2 = this.zzb;
        zzhp zzhp2 = new zzhp(zzhm2, string2);
        zzx zzx2 = new zzx("internal.appMetadata", zzhp2);
        return zzx2;
    }
}

