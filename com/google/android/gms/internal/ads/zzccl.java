/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzccj;
import com.google.android.gms.internal.ads.zzcck;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

public final class zzccl {
    public static void zza(ListenableFuture listenableFuture, String object) {
        zzccj zzccj2 = new zzccj((String)object);
        object = zzcci.zzf;
        zzgft.zzr(listenableFuture, zzccj2, (Executor)object);
    }

    public static void zzb(ListenableFuture listenableFuture, String object) {
        zzcck zzcck2 = new zzcck((String)object);
        object = zzcci.zzf;
        zzgft.zzr(listenableFuture, zzcck2, (Executor)object);
    }
}

