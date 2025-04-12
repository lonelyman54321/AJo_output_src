/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzepk;
import com.google.android.gms.internal.ads.zzepr;

final class zzepj
implements zzepr {
    final /* synthetic */ zzepk zza;

    public zzepj(zzepk zzepk2) {
        this.zza = zzepk2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        zzepk zzepk2 = this.zza;
        synchronized (zzepk2) {
            zzepk zzepk3 = this.zza;
            zzepk.zzc(zzepk3, null);
            return;
        }
    }
}

