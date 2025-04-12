/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.google.android.gms.ads.internal.overlay;

import android.view.View;
import com.google.android.gms.ads.internal.overlay.zzm;

final class zzf
implements View.OnClickListener {
    final /* synthetic */ zzm zza;

    public zzf(zzm zzm2) {
        this.zza = zzm2;
    }

    public final void onClick(View object) {
        object = this.zza;
        object.zzn = 2;
        object.zzb.finish();
    }
}

