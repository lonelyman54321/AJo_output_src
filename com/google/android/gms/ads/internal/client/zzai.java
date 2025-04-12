/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzax;
import com.google.android.gms.internal.ads.zzbmy;
import com.google.android.gms.internal.ads.zzbrf;

final class zzai
extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbrf zzb;
    final /* synthetic */ OnH5AdsEventListener zzc;

    public zzai(zzaw zzaw2, Context context, zzbrf zzbrf2, OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = context;
        this.zzb = zzbrf2;
        this.zzc = onH5AdsEventListener;
    }

    public final /* synthetic */ Object zza() {
        zzbmy zzbmy2 = new zzbmy();
        return zzbmy2;
    }
}

