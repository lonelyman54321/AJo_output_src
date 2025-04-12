/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzig;
import com.google.android.gms.measurement.internal.zzp;

public final class zzim
implements Runnable {
    private /* synthetic */ zzig zza;
    private /* synthetic */ Bundle zzb;
    private /* synthetic */ String zzc;
    private /* synthetic */ zzp zzd;

    public /* synthetic */ zzim(zzig zzig2, Bundle bundle, String string2, zzp zzp2) {
        this.zza = zzig2;
        this.zzb = bundle;
        this.zzc = string2;
        this.zzd = zzp2;
    }

    public final void run() {
        zzig zzig2 = this.zza;
        Bundle bundle = this.zzb;
        String string2 = this.zzc;
        zzp zzp2 = this.zzd;
        zzig.zza(zzig2, bundle, string2, zzp2);
    }
}

