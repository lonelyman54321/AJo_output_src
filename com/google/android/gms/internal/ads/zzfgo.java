/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzepr;
import com.google.android.gms.internal.ads.zzfgq;

final class zzfgo
implements zzepr {
    final /* synthetic */ zzfgq zza;

    public zzfgo(zzfgq zzfgq2) {
        this.zza = zzfgq2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        zzfgq zzfgq2 = this.zza;
        synchronized (zzfgq2) {
            zzfgq zzfgq3 = this.zza;
            zzfgq.zzx(zzfgq3, null);
            return;
        }
    }
}

