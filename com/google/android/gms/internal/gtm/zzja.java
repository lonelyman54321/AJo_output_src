/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzgm;
import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzjb;

final class zzja
implements Runnable {
    final /* synthetic */ zzjb zza;

    public zzja(zzjb zzjb2) {
        this.zza = zzjb2;
    }

    public final void run() {
        boolean bl2;
        Object object = zzjb.zzj(this.zza);
        boolean bl3 = object.isEmpty();
        if (bl3) {
            zzhi.zze("TagManagerBackend dispatch called without loaded container.");
            return;
        }
        object = zzjb.zzj(this.zza).values().iterator();
        while (bl2 = object.hasNext()) {
            zzgm zzgm2 = (zzgm)object.next();
            zzgm2.zzs();
        }
    }
}

