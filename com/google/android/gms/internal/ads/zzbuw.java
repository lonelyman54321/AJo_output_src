/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd$UnconfirmedClickListener;
import com.google.android.gms.internal.ads.zzbjo;

public final class zzbuw
extends zzbjo {
    private final NativeAd$UnconfirmedClickListener zza;

    public zzbuw(NativeAd$UnconfirmedClickListener nativeAd$UnconfirmedClickListener) {
        this.zza = nativeAd$UnconfirmedClickListener;
    }

    public final void zze() {
        this.zza.onUnconfirmedClickCancelled();
    }

    public final void zzf(String string2) {
        this.zza.onUnconfirmedClickReceived(string2);
    }
}

