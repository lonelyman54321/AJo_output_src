/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.ServiceConnection
 *  android.os.IBinder
 */
package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.zzby;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zzhl;
import com.google.android.gms.measurement.internal.zzhv;
import com.google.android.gms.measurement.internal.zzic;

public final class zzhi
implements ServiceConnection {
    final /* synthetic */ zzhj zza;
    private final String zzb;

    public zzhi(zzhj zzhj2, String string2) {
        this.zza = zzhj2;
        this.zzb = string2;
    }

    public static /* bridge */ /* synthetic */ String zza(zzhi zzhi2) {
        return zzhi2.zzb;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onServiceConnected(ComponentName object, IBinder object2) {
        RuntimeException runtimeException2;
        block4: {
            if (object2 == null) {
                this.zza.zza.zzj().zzr().zza("Install Referrer connection returned with null binder");
                return;
            }
            try {
                object = zzby.zza((IBinder)object2);
                if (object == null) {
                    object = this.zza;
                    object = ((zzhj)object).zza;
                    object = ((zzic)object).zzj();
                    object = ((zzgo)object).zzr();
                    object2 = "Install Referrer Service implementation was not found";
                    ((zzgq)object).zza((String)object2);
                    return;
                }
            }
            catch (RuntimeException runtimeException2) {
                break block4;
            }
            object2 = this.zza;
            object2 = ((zzhj)object2).zza;
            object2 = ((zzic)object2).zzj();
            object2 = ((zzgo)object2).zzq();
            Object object3 = "Install Referrer Service connected";
            ((zzgq)object2).zza((String)object3);
            object2 = this.zza;
            object2 = ((zzhj)object2).zza;
            object2 = ((zzic)object2).zzl();
            object3 = new zzhl(this, (zzbz)object, this);
            ((zzhv)object2).zzb((Runnable)object3);
            return;
        }
        this.zza.zza.zzj().zzr().zza("Exception occurred while calling Install Referrer API", runtimeException2);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.zza.zza.zzj().zzq().zza("Install Referrer Service disconnected");
    }
}

