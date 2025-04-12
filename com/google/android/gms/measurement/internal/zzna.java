/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzme;
import com.google.android.gms.measurement.internal.zzp;

final class zzna
implements Runnable {
    private final /* synthetic */ zzp zza;
    private final /* synthetic */ zzme zzb;

    public zzna(zzme zzme2, zzp zzp2) {
        this.zza = zzp2;
        this.zzb = zzme2;
    }

    public final void run() {
        zzp zzp2;
        Object object = zzme.zza(this.zzb);
        if (object == null) {
            this.zzb.zzj().zzg().zza("Failed to send measurementEnabled to service");
            return;
        }
        try {
            zzp2 = this.zza;
        }
        catch (RemoteException remoteException) {
            this.zzb.zzj().zzg().zza("Failed to send measurementEnabled to the service", (Object)remoteException);
            return;
        }
        Preconditions.checkNotNull(zzp2);
        zzp2 = this.zza;
        object.zzh(zzp2);
        object = this.zzb;
        zzme.zzg((zzme)object);
    }
}

