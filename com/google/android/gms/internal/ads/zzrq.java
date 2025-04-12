/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioRouting
 *  android.media.AudioRouting$OnRoutingChangedListener
 */
package com.google.android.gms.internal.ads;

import android.media.AudioRouting;
import com.google.android.gms.internal.ads.zzrr;

public final class zzrq
implements AudioRouting.OnRoutingChangedListener {
    public final /* synthetic */ zzrr zza;

    public /* synthetic */ zzrq(zzrr zzrr2) {
        this.zza = zzrr2;
    }

    public final void onRoutingChanged(AudioRouting audioRouting) {
        zzrr.zza(this.zza, audioRouting);
    }
}

