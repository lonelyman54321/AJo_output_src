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
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzme;
import com.google.android.gms.measurement.internal.zzp;

final class zzmt
implements Runnable {
    private final /* synthetic */ zzp zza;
    private final /* synthetic */ zzme zzb;

    public zzmt(zzme zzme2, zzp zzp2) {
        this.zza = zzp2;
        this.zzb = zzme2;
    }

    public final void run() {
        zzfz zzfz2 = zzme.zza(this.zzb);
        if (zzfz2 == null) {
            this.zzb.zzj().zzg().zza("Failed to reset data on the service: not connected to service");
            return;
        }
        Object object = this.zza;
        Preconditions.checkNotNull(object);
        object = this.zza;
        try {
            zzfz2.zze((zzp)object);
        }
        catch (RemoteException remoteException) {
            object = this.zzb.zzj().zzg();
            String string2 = "Failed to reset data on the service: remote exception";
            ((zzgq)object).zza(string2, (Object)remoteException);
        }
        zzme.zzg(this.zzb);
    }
}

