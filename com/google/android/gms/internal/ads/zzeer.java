/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeen;
import com.google.android.gms.internal.ads.zzeep;
import com.google.android.gms.internal.ads.zzeeq;
import com.google.android.gms.internal.ads.zzfkw;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class zzeer {
    private final zzeen zza;
    private final zzgge zzb;

    public zzeer(zzeen zzeen2, zzgge zzgge2) {
        this.zza = zzeen2;
        this.zzb = zzgge2;
    }

    public final void zza(zzfkw object) {
        Object object2 = this.zza;
        Objects.requireNonNull(object2);
        Object object3 = new zzeep((zzeen)((Object)object2));
        object2 = this.zzb.zzb((Callable)object3);
        object3 = new zzeeq(this, (zzfkw)object);
        object = this.zzb;
        zzgft.zzr((ListenableFuture)object2, (zzgfp)object3, (Executor)object);
    }
}

