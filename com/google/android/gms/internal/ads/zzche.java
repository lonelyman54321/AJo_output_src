/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzchl;

public final class zzche
implements Runnable {
    public final /* synthetic */ zzchl zza;
    public final /* synthetic */ View zzb;
    public final /* synthetic */ zzcaf zzc;
    public final /* synthetic */ int zzd;

    public /* synthetic */ zzche(zzchl zzchl2, View view, zzcaf zzcaf2, int n3) {
        this.zza = zzchl2;
        this.zzb = view;
        this.zzc = zzcaf2;
        this.zzd = n3;
    }

    public final void run() {
        zzchl zzchl2 = this.zza;
        View view = this.zzb;
        zzcaf zzcaf2 = this.zzc;
        int n3 = this.zzd;
        zzchl2.zzp(view, zzcaf2, n3);
    }
}

