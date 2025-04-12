/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.internal.client.zzcz;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzef;
import com.google.android.gms.ads.internal.client.zzej;

final class zzeg
extends zzcz {
    private zzeg() {
        throw null;
    }

    public /* synthetic */ zzeg(zzef zzef2) {
    }

    public final void zze(zze object) {
        OnAdInspectorClosedListener onAdInspectorClosedListener = zzej.zzb(zzej.zzf());
        if (onAdInspectorClosedListener != null) {
            if (object == null) {
                object = null;
            } else {
                int n3 = ((zze)object).zza;
                String string2 = ((zze)object).zzb;
                object = ((zze)object).zzc;
                AdInspectorError adInspectorError = new AdInspectorError(n3, string2, (String)object);
                object = adInspectorError;
            }
            onAdInspectorClosedListener.onAdInspectorClosed((AdInspectorError)object);
        }
    }
}

