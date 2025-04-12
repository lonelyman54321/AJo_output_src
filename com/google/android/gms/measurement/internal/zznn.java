/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 */
package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.gms.measurement.internal.zzme;
import com.google.android.gms.measurement.internal.zznj;

final class zznn
implements Runnable {
    private final /* synthetic */ zznj zza;

    public zznn(zznj zznj2) {
        this.zza = zznj2;
    }

    public final void run() {
        zzme zzme2 = this.zza.zza;
        Context context = this.zza.zza.zza();
        ComponentName componentName = new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService");
        zzme.zza(zzme2, componentName);
    }
}

