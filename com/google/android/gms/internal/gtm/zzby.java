/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzca;
import com.google.android.gms.internal.gtm.zzcb;
import com.google.android.gms.internal.gtm.zzel;

final class zzby
implements Runnable {
    final /* synthetic */ zzca zza;
    final /* synthetic */ zzel zzb;

    public zzby(zzca zzca2, zzel zzel2) {
        this.zzb = zzel2;
        this.zza = zzca2;
    }

    public final void run() {
        Object object = this.zza.zza;
        boolean bl2 = ((zzcb)object).zzg();
        if (!bl2) {
            this.zza.zza.zzE("Connected to service after a timeout");
            object = this.zza;
            zzel zzel2 = this.zzb;
            object = ((zzca)object).zza;
            zzcb.zzi((zzcb)object, zzel2);
        }
    }
}

