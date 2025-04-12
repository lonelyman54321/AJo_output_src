/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfjx;
import com.google.android.gms.internal.ads.zzfjy;
import com.google.android.gms.internal.ads.zzgfp;

final class zzfju
implements zzgfp {
    final /* synthetic */ zzfjx zza;
    final /* synthetic */ zzfjy zzb;

    public zzfju(zzfjy zzfjy2, zzfjx zzfjx2) {
        this.zza = zzfjx2;
        this.zzb = zzfjy2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(Throwable object) {
        object = this.zzb;
        synchronized (object) {
            zzfjy zzfjy2 = this.zzb;
            zzfjy.zzc(zzfjy2, null);
            return;
        }
    }
}

