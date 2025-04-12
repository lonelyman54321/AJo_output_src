/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbhs;
import com.google.android.gms.internal.ads.zzdlc;

public final class zzdlq {
    private zzbhs zza;

    public zzdlq(zzdlc zzdlc2) {
        this.zza = zzdlc2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzbhs zza() {
        synchronized (this) {
            return this.zza;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(zzbhs zzbhs2) {
        synchronized (this) {
            this.zza = zzbhs2;
            return;
        }
    }
}

