/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzcyp;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

public final class zzcyo
implements Callable {
    public final /* synthetic */ zzcyp zza;
    public final /* synthetic */ ListenableFuture zzb;
    public final /* synthetic */ Bundle zzc;

    public /* synthetic */ zzcyo(zzcyp zzcyp2, ListenableFuture listenableFuture, Bundle bundle) {
        this.zza = zzcyp2;
        this.zzb = listenableFuture;
        this.zzc = bundle;
    }

    public final Object call() {
        zzcyp zzcyp2 = this.zza;
        ListenableFuture listenableFuture = this.zzb;
        Bundle bundle = this.zzc;
        return zzcyp2.zza(listenableFuture, bundle);
    }
}

