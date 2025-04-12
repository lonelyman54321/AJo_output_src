/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.internal.client.zzcr;

public final class zzct
extends zzcr {
    private final MuteThisAdListener zza;

    public zzct(MuteThisAdListener muteThisAdListener) {
        this.zza = muteThisAdListener;
    }

    public final void zze() {
        this.zza.onAdMuted();
    }
}

