/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzga;
import com.google.android.gms.measurement.internal.zzig;
import com.google.android.gms.measurement.internal.zzp;

public final class zzii
implements Runnable {
    private /* synthetic */ zzig zza;
    private /* synthetic */ zzp zzb;
    private /* synthetic */ Bundle zzc;
    private /* synthetic */ zzga zzd;
    private /* synthetic */ String zze;

    public /* synthetic */ zzii(zzig zzig2, zzp zzp2, Bundle bundle, zzga zzga2, String string2) {
        this.zza = zzig2;
        this.zzb = zzp2;
        this.zzc = bundle;
        this.zzd = zzga2;
        this.zze = string2;
    }

    public final void run() {
        zzig zzig2 = this.zza;
        zzp zzp2 = this.zzb;
        Bundle bundle = this.zzc;
        zzga zzga2 = this.zzd;
        String string2 = this.zze;
        zzig.zza(zzig2, zzp2, bundle, zzga2, string2);
    }
}

