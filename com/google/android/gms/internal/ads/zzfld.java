/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfkx;
import com.google.android.gms.internal.ads.zzflc;
import com.google.android.gms.internal.ads.zzflk;
import com.google.android.gms.internal.ads.zzfll;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

public final class zzfld {
    public static final zzflk zza(Callable callable, Object object, zzfll zzfll2) {
        zzgge zzgge2 = zzfll.zze(zzfll2);
        return zzfld.zzb(callable, zzgge2, object, zzfll2);
    }

    public static final zzflk zzb(Callable callable, zzgge zzgge2, Object object, zzfll zzfll2) {
        ListenableFuture listenableFuture = zzfll.zzd();
        List list = Collections.emptyList();
        ListenableFuture listenableFuture2 = zzgge2.zzb(callable);
        zzflk zzflk2 = new zzflk(zzfll2, object, null, listenableFuture, list, listenableFuture2, null);
        return zzflk2;
    }

    public static final zzflk zzc(ListenableFuture listenableFuture, Object object, zzfll zzfll2) {
        ListenableFuture listenableFuture2 = zzfll.zzd();
        List list = Collections.emptyList();
        zzflk zzflk2 = new zzflk(zzfll2, object, null, listenableFuture2, list, listenableFuture, null);
        return zzflk2;
    }

    public static final zzflk zzd(zzfkx zzfkx2, zzgge zzgge2, Object object, zzfll zzfll2) {
        zzflc zzflc2 = new zzflc(zzfkx2);
        return zzfld.zzb(zzflc2, zzgge2, object, zzfll2);
    }
}

