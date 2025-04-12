/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzig;
import com.google.android.gms.measurement.internal.zzou;
import com.google.android.gms.measurement.internal.zzp;
import java.util.concurrent.Callable;

final class zzjg
implements Callable {
    private final /* synthetic */ zzp zza;
    private final /* synthetic */ Bundle zzb;
    private final /* synthetic */ zzig zzc;

    public zzjg(zzig zzig2, zzp zzp2, Bundle bundle) {
        this.zza = zzp2;
        this.zzb = bundle;
        this.zzc = zzig2;
    }

    public final /* synthetic */ Object call() {
        zzig.zza(this.zzc).zzs();
        zzou zzou2 = zzig.zza(this.zzc);
        zzp zzp2 = this.zza;
        Bundle bundle = this.zzb;
        return zzou2.zza(zzp2, bundle);
    }
}

