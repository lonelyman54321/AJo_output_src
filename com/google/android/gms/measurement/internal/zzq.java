/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 */
package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzbn;
import com.google.android.gms.measurement.internal.zzfx;
import com.google.android.gms.measurement.internal.zzhv;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzls;
import com.google.android.gms.measurement.internal.zzs;
import com.google.android.gms.measurement.internal.zzv;

public final class zzq
extends BroadcastReceiver {
    private final zzic zza;

    public zzq(zzic zzic2) {
        this.zza = zzic2;
    }

    public static /* synthetic */ void zza(zzq object) {
        object = ((zzq)((Object)object)).zza.zzr();
        long l2 = (Long)zzbn.zzy.zza(null);
        ((zzls)object).zza(l2);
    }

    public final void onReceive(Context object, Intent object2) {
        zzfx zzfx2;
        if (object2 == null) {
            this.zza.zzj().zzr().zza("App receiver called with null intent");
            return;
        }
        object = object2.getAction();
        if (object == null) {
            this.zza.zzj().zzr().zza("App receiver called with null action");
            return;
        }
        boolean bl2 = false;
        object2 = null;
        Object object3 = "com.google.android.gms.measurement.TRIGGERS_AVAILABLE";
        boolean bl3 = ((String)object).equals(object3);
        if (!bl3) {
            object3 = "com.google.android.gms.measurement.BATCHES_AVAILABLE";
            boolean bl4 = ((String)object).equals(object3);
            if (!bl4) {
                this.zza.zzj().zzr().zza("App receiver called with unknown action");
                return;
            }
            object = this.zza.zzf();
            bl4 = ((zzai)object).zzf(null, (zzfx)(object3 = zzbn.zzcl));
            if (bl4) {
                this.zza.zzj().zzq().zza("[sgtm] App Receiver notified batches are available");
                object = this.zza.zzl();
                object2 = new zzv(this);
                ((zzhv)object).zzb((Runnable)object2);
            }
            return;
        }
        object = this.zza;
        bl3 = zzoy.zza();
        if (bl3 && (bl2 = ((zzai)(object3 = ((zzic)object).zzf())).zzf(null, zzfx2 = zzbn.zzcq))) {
            ((zzic)object).zzj().zzq().zza("App receiver notified triggers are available");
            object2 = ((zzic)object).zzl();
            object3 = new zzs((zzic)object);
            ((zzhv)object2).zzb((Runnable)object3);
        }
    }
}

