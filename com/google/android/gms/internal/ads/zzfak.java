/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfam;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

public final class zzfak
implements Callable {
    public final /* synthetic */ ListenableFuture zza;
    public final /* synthetic */ ListenableFuture zzb;

    public /* synthetic */ zzfak(ListenableFuture listenableFuture, ListenableFuture listenableFuture2) {
        this.zza = listenableFuture;
        this.zzb = listenableFuture2;
    }

    public final Object call() {
        Object object = this.zza;
        object = (String)object.get();
        String string2 = (String)this.zzb.get();
        zzfam zzfam2 = new zzfam((String)object, string2);
        return zzfam2;
    }
}

