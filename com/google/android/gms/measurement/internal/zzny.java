/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzbn;
import com.google.android.gms.measurement.internal.zzfx;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzju;
import com.google.android.gms.measurement.internal.zznx;
import com.google.android.gms.measurement.internal.zzob;

final class zzny {
    final /* synthetic */ zznx zza;
    private zzob zzb;

    public zzny(zznx zznx2) {
        this.zza = zznx2;
    }

    public final void zza() {
        Object object;
        this.zza.zzv();
        Object object2 = this.zzb;
        if (object2 != null) {
            object2 = zznx.zza(this.zza);
            object = this.zzb;
            object2.removeCallbacks((Runnable)object);
        }
        this.zza.zzk().zzn.zza(false);
        this.zza.zza(false);
        object2 = this.zza.zze();
        object = zzbn.zzct;
        boolean bl2 = ((zzai)object2).zza((zzfx)object);
        if (bl2 && (bl2 = ((zzju)(object2 = this.zza.zzm())).zzax())) {
            object2 = this.zza.zzj().zzq();
            object = "Retrying trigger URI registration in foreground";
            ((zzgq)object2).zza((String)object);
            object2 = this.zza.zzm();
            ((zzju)object2).zzav();
        }
    }

    public final void zza(long l2) {
        zzob zzob2;
        long l3 = this.zza.zzb().currentTimeMillis();
        this.zzb = zzob2 = new zzob(this, l3, l2);
        Handler handler = zznx.zza(this.zza);
        zzob zzob3 = this.zzb;
        handler.postDelayed((Runnable)zzob3, 2000L);
    }
}

