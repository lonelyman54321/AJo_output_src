/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzap;
import com.google.android.gms.measurement.internal.zzig;
import com.google.android.gms.measurement.internal.zzou;
import com.google.android.gms.measurement.internal.zzp;
import java.util.concurrent.Callable;

final class zzja
implements Callable {
    private final /* synthetic */ zzp zza;
    private final /* synthetic */ zzig zzb;

    public zzja(zzig zzig2, zzp zzp2) {
        this.zza = zzp2;
        this.zzb = zzig2;
    }

    public final /* synthetic */ Object call() {
        zzig.zza(this.zzb).zzs();
        zzou zzou2 = zzig.zza(this.zzb);
        String string2 = this.zza.zza;
        zzou2 = zzou2.zza(string2);
        zzap zzap2 = new zzap((Bundle)zzou2);
        return zzap2;
    }
}

