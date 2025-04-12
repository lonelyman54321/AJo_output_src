/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.ads.h5;

import android.content.Context;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.zzbmv;

public final class H5AdsRequestHandler {
    private final zzbmv zza;

    public H5AdsRequestHandler(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        zzbmv zzbmv2;
        this.zza = zzbmv2 = new zzbmv(context, onH5AdsEventListener);
    }

    public void clearAdObjects() {
        this.zza.zza();
    }

    public boolean handleH5AdsRequest(String string2) {
        return this.zza.zzb(string2);
    }

    public boolean shouldInterceptRequest(String string2) {
        return zzbmv.zzc(string2);
    }
}

