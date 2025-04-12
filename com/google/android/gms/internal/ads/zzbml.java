/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.zzbmn;

public final class zzbml
extends zzbmn {
    private final OnH5AdsEventListener zza;

    public zzbml(OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = onH5AdsEventListener;
    }

    public final void zzb(String string2) {
        this.zza.onH5AdsEvent(string2);
    }
}

