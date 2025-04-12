/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzelj;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzdon
implements zzgfa {
    public final /* synthetic */ ListenableFuture zza;

    public /* synthetic */ zzdon(ListenableFuture listenableFuture) {
        this.zza = listenableFuture;
    }

    public final ListenableFuture zza(Object object) {
        if ((object = (zzchd)object) != null && (object = object.zzq()) != null) {
            return this.zza;
        }
        object = new zzelj(1, "Retrieve video view in html5 ad response failed.");
        throw object;
    }
}

