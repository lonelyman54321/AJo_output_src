/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbdb;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzfac;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzfad
implements zzexw {
    final zzgge zza;
    final Context zzb;
    final zzbdb zzc;

    public zzfad(zzbdb zzbdb2, zzgge zzgge2, Context context) {
        this.zzc = zzbdb2;
        this.zza = zzgge2;
        this.zzb = context;
    }

    public final int zza() {
        return 45;
    }

    public final ListenableFuture zzb() {
        zzfac zzfac2 = new zzfac(this);
        return this.zza.zzb(zzfac2);
    }
}

