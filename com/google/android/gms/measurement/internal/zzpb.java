/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
package com.google.android.gms.measurement.internal;

import android.content.Intent;
import com.google.android.gms.measurement.internal.zzbb;
import com.google.android.gms.measurement.internal.zzjh;
import com.google.android.gms.measurement.internal.zzou;

final class zzpb
extends zzbb {
    private final /* synthetic */ zzou zza;

    public zzpb(zzou zzou2, zzjh zzjh2) {
        this.zza = zzou2;
        super(zzjh2);
    }

    public final void zzb() {
        this.zza.zzr();
        String string2 = (String)zzou.zzb(this.zza).pollFirst();
        if (string2 != null) {
            zzou zzou2 = this.zza;
            long l2 = zzou2.zzb().elapsedRealtime();
            zzou.zza(zzou2, l2);
            this.zza.zzj().zzq().zza("Sending trigger URI notification to app", string2);
            zzou2 = new Intent();
            String string3 = "com.google.android.gms.measurement.TRIGGERS_AVAILABLE";
            zzou2.setAction(string3);
            zzou2.setPackage(string2);
            string2 = this.zza.zza();
            string2.sendBroadcast((Intent)zzou2);
        }
        zzou.zzc(this.zza);
    }
}

