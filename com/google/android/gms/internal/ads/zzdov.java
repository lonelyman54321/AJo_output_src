/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzelj;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzdov
implements zzgfa {
    public final /* synthetic */ ListenableFuture zza;

    public /* synthetic */ zzdov(ListenableFuture listenableFuture) {
        this.zza = listenableFuture;
    }

    public final ListenableFuture zza(Object object) {
        if (object != null) {
            return this.zza;
        }
        object = new zzelj(1, "Retrieve required value in native ad response failed.");
        return zzgft.zzg((Throwable)object);
    }
}

