/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.Spatializer
 *  android.media.Spatializer$OnSpatializerStateChangedListener
 */
package com.google.android.gms.internal.ads;

import android.media.Spatializer;
import com.google.android.gms.internal.ads.zzyx;
import com.google.android.gms.internal.ads.zzze;

final class zzyw
implements Spatializer.OnSpatializerStateChangedListener {
    final /* synthetic */ zzze zza;

    public zzyw(zzyx zzyx2, zzze zzze2) {
        this.zza = zzze2;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean bl2) {
        zzze.zzi(this.zza);
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean bl2) {
        zzze.zzi(this.zza);
    }
}

