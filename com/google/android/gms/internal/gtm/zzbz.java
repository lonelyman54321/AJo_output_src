/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 */
package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import com.google.android.gms.internal.gtm.zzca;
import com.google.android.gms.internal.gtm.zzcb;

final class zzbz
implements Runnable {
    final /* synthetic */ ComponentName zza;
    final /* synthetic */ zzca zzb;

    public zzbz(zzca zzca2, ComponentName componentName) {
        this.zza = componentName;
        this.zzb = zzca2;
    }

    public final void run() {
        zzcb zzcb2 = this.zzb.zza;
        ComponentName componentName = this.zza;
        zzcb.zzb(zzcb2, componentName);
    }
}

