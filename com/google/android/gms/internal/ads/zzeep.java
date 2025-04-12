/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeen;
import java.util.concurrent.Callable;

public final class zzeep
implements Callable {
    public final /* synthetic */ zzeen zza;

    public /* synthetic */ zzeep(zzeen zzeen2) {
        this.zza = zzeen2;
    }

    public final Object call() {
        return this.zza.getWritableDatabase();
    }
}

