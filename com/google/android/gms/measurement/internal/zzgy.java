/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 */
package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzgv;
import com.google.android.gms.measurement.internal.zzhb;
import com.google.android.gms.measurement.internal.zzhv;
import com.google.android.gms.measurement.internal.zzou;

class zzgy
extends BroadcastReceiver {
    private final zzou zza;
    private boolean zzb;
    private boolean zzc;

    public zzgy(zzou zzou2) {
        Preconditions.checkNotNull(zzou2);
        this.zza = zzou2;
    }

    public static /* bridge */ /* synthetic */ zzou zza(zzgy zzgy2) {
        return zzgy2.zza;
    }

    public void onReceive(Context object, Intent object2) {
        this.zza.zzt();
        object = object2.getAction();
        object2 = this.zza.zzj().zzq();
        Object object3 = "NetworkBroadcastReceiver received action";
        ((zzgq)object2).zza((String)object3, object);
        object2 = "android.net.conn.CONNECTIVITY_CHANGE";
        boolean bl2 = ((String)object2).equals(object);
        if (bl2) {
            bl2 = this.zzc;
            object = this.zza.zzh();
            boolean bl3 = ((zzgv)object).zzr();
            if (bl2 != bl3) {
                this.zzc = bl3;
                object2 = this.zza.zzl();
                object3 = new zzhb(this, bl3);
                ((zzhv)object2).zzb((Runnable)object3);
            }
            return;
        }
        this.zza.zzj().zzr().zza("NetworkBroadcastReceiver received unknown action", object);
    }

    public final void zza() {
        this.zza.zzt();
        Object object = this.zza.zzl();
        ((zzhv)object).zzv();
        boolean bl2 = this.zzb;
        if (bl2) {
            return;
        }
        object = this.zza.zza();
        Object object2 = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        object.registerReceiver((BroadcastReceiver)this, object2);
        this.zzc = bl2 = this.zza.zzh().zzr();
        object = this.zza.zzj().zzq();
        object2 = this.zzc;
        ((zzgq)object).zza("Registering connectivity change receiver. Network connected", object2);
        this.zzb = true;
    }

    public final void zzb() {
        this.zza.zzt();
        this.zza.zzl().zzv();
        Object object = this.zza.zzl();
        ((zzhv)object).zzv();
        boolean bl2 = this.zzb;
        if (!bl2) {
            return;
        }
        object = this.zza.zzj().zzq();
        String string2 = "Unregistering connectivity change receiver";
        ((zzgq)object).zza(string2);
        bl2 = false;
        this.zzb = false;
        this.zzc = false;
        object = this.zza.zza();
        try {
            object.unregisterReceiver((BroadcastReceiver)this);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            this.zza.zzj().zzg().zza("Failed to unregister the network broadcast receiver", illegalArgumentException);
            return;
        }
    }
}

