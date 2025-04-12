/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzg;
import com.google.android.gms.internal.ads.zzdih;
import com.google.android.gms.internal.ads.zzens;

final class zzenr
implements zzg {
    final /* synthetic */ zzdih zza;

    public zzenr(zzens zzens2, zzdih zzdih2) {
        this.zza = zzdih2;
    }

    public final void zza(View view) {
    }

    public final void zzb() {
        this.zza.zzb().onAdClicked();
    }

    public final void zzc() {
        this.zza.zzc().zza();
        this.zza.zzf().zza();
    }
}

