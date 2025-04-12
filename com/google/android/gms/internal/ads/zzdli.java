/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.internal.ads.zzdlo;

public final class zzdli
implements Runnable {
    public final /* synthetic */ zzdlo zza;
    public final /* synthetic */ View zzb;
    public final /* synthetic */ boolean zzc;
    public final /* synthetic */ int zzd;

    public /* synthetic */ zzdli(zzdlo zzdlo2, View view, boolean bl2, int n3) {
        this.zza = zzdlo2;
        this.zzb = view;
        this.zzc = bl2;
        this.zzd = n3;
    }

    public final void run() {
        zzdlo zzdlo2 = this.zza;
        View view = this.zzb;
        boolean bl2 = this.zzc;
        int n3 = this.zzd;
        zzdlo2.zzx(view, bl2, n3);
    }
}

