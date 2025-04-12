/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzefz;
import java.util.concurrent.Callable;

public final class zzefv
implements Callable {
    public final /* synthetic */ zzefz zza;

    public /* synthetic */ zzefv(zzefz zzefz2) {
        this.zza = zzefz2;
    }

    public final Object call() {
        return this.zza.getWritableDatabase();
    }
}

