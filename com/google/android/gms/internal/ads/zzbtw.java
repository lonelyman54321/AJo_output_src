/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbtx;

final class zzbtw
implements Runnable {
    final /* synthetic */ AdOverlayInfoParcel zza;
    final /* synthetic */ zzbtx zzb;

    public zzbtw(zzbtx zzbtx2, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zza = adOverlayInfoParcel;
        this.zzb = zzbtx2;
    }

    public final void run() {
        zzu.zzi();
        Activity activity = zzbtx.zza(this.zzb);
        AdOverlayInfoParcel adOverlayInfoParcel = this.zza;
        zzn.zza((Context)activity, adOverlayInfoParcel, true);
    }
}

