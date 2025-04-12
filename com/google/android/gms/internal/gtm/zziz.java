/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzgm;
import com.google.android.gms.internal.gtm.zzgt;
import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzjb;

final class zziz
implements Runnable {
    final /* synthetic */ zzgt zza;
    final /* synthetic */ zzjb zzb;

    public zziz(zzjb zzjb2, zzgt zzgt2) {
        this.zza = zzgt2;
        this.zzb = zzjb2;
    }

    public final void run() {
        boolean bl2;
        Object object = zzjb.zzj(this.zzb);
        boolean bl3 = object.isEmpty();
        if (bl3) {
            zzhi.zza("TagManagerBackend emit called without loaded container.");
            return;
        }
        object = zzjb.zzj(this.zzb).values().iterator();
        while (bl2 = object.hasNext()) {
            zzgm zzgm2 = (zzgm)object.next();
            zzgt zzgt2 = this.zza;
            zzgm2.zzt(zzgt2);
        }
    }
}

