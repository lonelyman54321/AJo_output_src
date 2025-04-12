/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzfkz;
import com.google.android.gms.internal.ads.zzfla;
import com.google.android.gms.internal.ads.zzflk;
import com.google.android.gms.internal.ads.zzfll;
import com.google.android.gms.internal.ads.zzgfs;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class zzflb {
    final /* synthetic */ zzfll zza;
    private final Object zzb;
    private final List zzc;

    public /* synthetic */ zzflb(zzfll zzfll2, Object object, List list, zzfla zzfla2) {
        this.zza = zzfll2;
        this.zzb = object;
        this.zzc = list;
    }

    public final zzflk zza(Callable callable) {
        zzgfs zzgfs2 = zzgft.zzb(this.zzc);
        Object object = new zzfkz();
        Object object2 = zzcci.zzf;
        ListenableFuture listenableFuture = zzgfs2.zza((Callable)object, (Executor)object2);
        object = this.zza;
        object = zzfll.zze((zzfll)object);
        ListenableFuture listenableFuture2 = zzgfs2.zza(callable, (Executor)object);
        List list = this.zzc;
        zzfll zzfll2 = this.zza;
        Object object3 = this.zzb;
        object2 = new zzflk(zzfll2, object3, null, listenableFuture, list, listenableFuture2, null);
        return object2;
    }
}

