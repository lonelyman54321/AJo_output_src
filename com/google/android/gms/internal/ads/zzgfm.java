/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgat;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class zzgfm
extends zzgat
implements Future {
    public boolean cancel(boolean bl2) {
        return this.zzb().cancel(bl2);
    }

    public final Object get() {
        return this.zzb().get();
    }

    public final Object get(long l2, TimeUnit timeUnit) {
        return this.zzb().get(l2, timeUnit);
    }

    public final boolean isCancelled() {
        return this.zzb().isCancelled();
    }

    public final boolean isDone() {
        return this.zzb().isDone();
    }

    public abstract Future zzb();
}

