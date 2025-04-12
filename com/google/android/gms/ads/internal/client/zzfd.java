/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.client.zzdc;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

public final class zzfd
extends zzdc {
    private final OnAdMetadataChangedListener zza;

    public zzfd(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zza = onAdMetadataChangedListener;
    }

    public final void zze() {
        OnAdMetadataChangedListener onAdMetadataChangedListener = this.zza;
        if (onAdMetadataChangedListener != null) {
            onAdMetadataChangedListener.onAdMetadataChanged();
        }
    }
}

