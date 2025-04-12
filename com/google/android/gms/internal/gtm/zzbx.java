/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.analytics.zzr;
import com.google.android.gms.internal.gtm.zzbu;
import com.google.android.gms.internal.gtm.zzcb;
import com.google.android.gms.internal.gtm.zzcv;

final class zzbx
extends zzcv {
    final /* synthetic */ zzcb zza;

    public zzbx(zzcb zzcb2, zzbu zzbu2) {
        this.zza = zzcb2;
        super(zzbu2);
    }

    public final void zza() {
        zzr.zzh();
        zzcb zzcb2 = this.zza;
        boolean bl2 = zzcb2.zzg();
        if (!bl2) {
            return;
        }
        zzcb2.zzN("Inactivity, disconnecting from device AnalyticsService");
        zzcb2.zzc();
    }
}

