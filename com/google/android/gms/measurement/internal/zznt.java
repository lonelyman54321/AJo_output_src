/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
package com.google.android.gms.measurement.internal;

import android.content.Intent;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zznr;

public final class zznt
implements Runnable {
    private /* synthetic */ zznr zza;
    private /* synthetic */ int zzb;
    private /* synthetic */ zzgo zzc;
    private /* synthetic */ Intent zzd;

    public /* synthetic */ zznt(zznr zznr2, int n3, zzgo zzgo2, Intent intent) {
        this.zza = zznr2;
        this.zzb = n3;
        this.zzc = zzgo2;
        this.zzd = intent;
    }

    public final void run() {
        zznr zznr2 = this.zza;
        int n3 = this.zzb;
        zzgo zzgo2 = this.zzc;
        Intent intent = this.zzd;
        zznr.zza(zznr2, n3, zzgo2, intent);
    }
}

