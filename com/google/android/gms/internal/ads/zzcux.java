/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcup;
import com.google.android.gms.internal.ads.zzcuw;
import com.google.android.gms.internal.ads.zzelg;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzggk;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

public final class zzcux
implements zzelg {
    public final List zza;

    public zzcux(zzcup object) {
        this.zza = object = Collections.singletonList(zzgft.zzh(object));
    }

    public zzcux(List list) {
        this.zza = list;
    }

    public final void zzq() {
        boolean bl2;
        Iterator iterator = this.zza.iterator();
        while (bl2 = iterator.hasNext()) {
            ListenableFuture listenableFuture = (ListenableFuture)iterator.next();
            zzcuw zzcuw2 = new zzcuw(this);
            Executor executor = zzggk.zzb();
            zzgft.zzr(listenableFuture, zzcuw2, executor);
        }
    }
}

