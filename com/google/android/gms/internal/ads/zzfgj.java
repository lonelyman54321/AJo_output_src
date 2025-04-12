/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzepr;
import com.google.android.gms.internal.ads.zzfgk;

final class zzfgj
implements zzepr {
    final /* synthetic */ zzfgk zza;

    public zzfgj(zzfgk zzfgk2) {
        this.zza = zzfgk2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        zzfgk zzfgk2 = this.zza;
        synchronized (zzfgk2) {
            zzfgk zzfgk3 = this.zza;
            zzfgk.zzt(zzfgk3, null);
            return;
        }
    }
}

