/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzfz;
import com.google.android.gms.measurement.internal.zzgj;
import com.google.android.gms.measurement.internal.zzme;
import com.google.android.gms.measurement.internal.zzp;

final class zzmu
implements Runnable {
    private final /* synthetic */ zzp zza;
    private final /* synthetic */ zzme zzb;

    public zzmu(zzme zzme2, zzp zzp2) {
        this.zza = zzp2;
        this.zzb = zzme2;
    }

    public final void run() {
        Object object;
        Object object2 = zzme.zza(this.zzb);
        if (object2 == null) {
            this.zzb.zzj().zzg().zza("Discarding data. Failed to send app launch");
            return;
        }
        try {
            object = this.zza;
        }
        catch (RemoteException remoteException) {
            this.zzb.zzj().zzg().zza("Failed to send app launch to the service", (Object)remoteException);
            return;
        }
        Preconditions.checkNotNull(object);
        object = this.zza;
        object2.zzd((zzp)object);
        object = this.zzb;
        object = ((zzme)object).zzh();
        ((zzgj)object).zzae();
        object = this.zzb;
        zzp zzp2 = this.zza;
        ((zzme)object).zza((zzfz)object2, null, zzp2);
        object2 = this.zzb;
        zzme.zzg((zzme)object2);
    }
}

