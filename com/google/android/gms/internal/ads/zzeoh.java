/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeoi;
import com.google.android.gms.internal.ads.zzepr;

final class zzeoh
implements zzepr {
    final /* synthetic */ zzeoi zza;

    public zzeoh(zzeoi zzeoi2) {
        this.zza = zzeoi2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        zzeoi zzeoi2 = this.zza;
        synchronized (zzeoi2) {
            zzeoi zzeoi3 = this.zza;
            zzeoi.zzc(zzeoi3, null);
            return;
        }
    }
}

