/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzepr;
import com.google.android.gms.internal.ads.zzfcz;

final class zzfcy
implements zzepr {
    final /* synthetic */ zzfcz zza;

    public zzfcy(zzfcz zzfcz2) {
        this.zza = zzfcz2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        zzfcz zzfcz2 = this.zza;
        synchronized (zzfcz2) {
            zzfcz zzfcz3 = this.zza;
            zzfcz3.zza = null;
            return;
        }
    }
}

