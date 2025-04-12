/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.internal.ads.zzbbm;

final class zzbbi
implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzbbm zzb;

    public zzbbi(zzbbm zzbbm2, View view) {
        this.zza = view;
        this.zzb = zzbbm2;
    }

    public final void run() {
        zzbbm zzbbm2 = this.zzb;
        View view = this.zza;
        zzbbm2.zzc(view);
    }
}

