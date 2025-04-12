/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzflb;
import com.google.android.gms.internal.ads.zzflk;
import com.google.android.gms.internal.ads.zzflm;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

public abstract class zzfll {
    private static final ListenableFuture zza = zzgft.zzh(null);
    private final zzgge zzb;
    private final ScheduledExecutorService zzc;
    private final zzflm zzd;

    public zzfll(zzgge zzgge2, ScheduledExecutorService scheduledExecutorService, zzflm zzflm2) {
        this.zzb = zzgge2;
        this.zzc = scheduledExecutorService;
        this.zzd = zzflm2;
    }

    public static /* bridge */ /* synthetic */ zzflm zzc(zzfll zzfll2) {
        return zzfll2.zzd;
    }

    public static /* bridge */ /* synthetic */ ListenableFuture zzd() {
        return zza;
    }

    public static /* bridge */ /* synthetic */ zzgge zze(zzfll zzfll2) {
        return zzfll2.zzb;
    }

    public static /* bridge */ /* synthetic */ ScheduledExecutorService zzg(zzfll zzfll2) {
        return zzfll2.zzc;
    }

    public final zzflb zza(Object object, ListenableFuture ... object2) {
        object2 = Arrays.asList(object2);
        zzflb zzflb2 = new zzflb(this, object, (List)object2, null);
        return zzflb2;
    }

    public final zzflk zzb(Object object, ListenableFuture listenableFuture) {
        List<ListenableFuture> list = Collections.singletonList(listenableFuture);
        zzflk zzflk2 = new zzflk(this, object, null, listenableFuture, list, listenableFuture, null);
        return zzflk2;
    }

    public abstract String zzf(Object var1);
}

