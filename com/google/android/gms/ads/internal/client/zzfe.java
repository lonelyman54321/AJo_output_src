/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.internal.client.zzdf;
import com.google.android.gms.ads.internal.client.zzs;

public final class zzfe
extends zzdf {
    private final OnPaidEventListener zza;

    public zzfe(OnPaidEventListener onPaidEventListener) {
        this.zza = onPaidEventListener;
    }

    public final void zze(zzs object) {
        OnPaidEventListener onPaidEventListener = this.zza;
        if (onPaidEventListener != null) {
            int n3 = ((zzs)object).zzb;
            String string2 = ((zzs)object).zzc;
            long l2 = ((zzs)object).zzd;
            object = AdValue.zza(n3, string2, l2);
            onPaidEventListener.onPaidEvent((AdValue)object);
        }
    }

    public final boolean zzf() {
        OnPaidEventListener onPaidEventListener = this.zza;
        return onPaidEventListener == null;
    }
}

