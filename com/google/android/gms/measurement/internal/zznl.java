/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 */
package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import com.google.android.gms.measurement.internal.zzme;
import com.google.android.gms.measurement.internal.zznj;

final class zznl
implements Runnable {
    private final /* synthetic */ ComponentName zza;
    private final /* synthetic */ zznj zzb;

    public zznl(zznj zznj2, ComponentName componentName) {
        this.zza = componentName;
        this.zzb = zznj2;
    }

    public final void run() {
        zzme zzme2 = this.zzb.zza;
        ComponentName componentName = this.zza;
        zzme.zza(zzme2, componentName);
    }
}

