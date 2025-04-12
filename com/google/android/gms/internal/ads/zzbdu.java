/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.ads.zzbai;
import com.google.android.gms.internal.ads.zzbdp;
import java.util.concurrent.ExecutorService;

public final class zzbdu {
    zzbai zza;
    boolean zzb;
    private final ExecutorService zzc;

    public zzbdu() {
        ExecutorService executorService;
        this.zzc = executorService = com.google.android.gms.ads.internal.util.client.zzb.zzb;
    }

    public zzbdu(Context context) {
        ExecutorService executorService;
        this.zzc = executorService = com.google.android.gms.ads.internal.util.client.zzb.zzb;
        zzbdp zzbdp2 = new zzbdp(this, context);
        executorService.execute(zzbdp2);
    }

    public static /* bridge */ /* synthetic */ ExecutorService zza(zzbdu zzbdu2) {
        return zzbdu2.zzc;
    }
}

