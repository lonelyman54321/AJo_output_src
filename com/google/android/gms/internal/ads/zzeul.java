/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzeuk;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzeul
implements zzexw {
    private final Context zza;
    private final zzgge zzb;

    public zzeul(Context context, zzgge zzgge2) {
        this.zza = context;
        this.zzb = zzgge2;
    }

    public final int zza() {
        return 19;
    }

    public final ListenableFuture zzb() {
        zzeuk zzeuk2 = new zzeuk(this);
        return this.zzb.zzb(zzeuk2);
    }
}

