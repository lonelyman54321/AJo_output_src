/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 */
package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzchl;

final class zzchi
implements View.OnAttachStateChangeListener {
    final /* synthetic */ zzcaf zza;
    final /* synthetic */ zzchl zzb;

    public zzchi(zzchl zzchl2, zzcaf zzcaf2) {
        this.zza = zzcaf2;
        this.zzb = zzchl2;
    }

    public final void onViewAttachedToWindow(View view) {
        zzcaf zzcaf2 = this.zza;
        zzchl.zzf(this.zzb, view, zzcaf2, 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}

