/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzcy;
import com.google.android.gms.internal.gtm.zzfa;

final class zzey
implements zzcy {
    final /* synthetic */ Runnable zza;
    final /* synthetic */ zzfa zzb;

    public zzey(zzfa zzfa2, Runnable runnable2) {
        this.zza = runnable2;
        this.zzb = zzfa2;
    }

    public final void zza(Throwable throwable) {
        throwable = zzfa.zzb(this.zzb);
        Runnable runnable2 = this.zza;
        throwable.post(runnable2);
    }
}

