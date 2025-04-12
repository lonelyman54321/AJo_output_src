/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.RemoteException
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzfz;
import com.google.android.gms.measurement.internal.zzme;
import com.google.android.gms.measurement.internal.zzp;

final class zzmy
implements Runnable {
    private final /* synthetic */ zzp zza;
    private final /* synthetic */ Bundle zzb;
    private final /* synthetic */ zzme zzc;

    public zzmy(zzme zzme2, zzp zzp2, Bundle bundle) {
        this.zza = zzp2;
        this.zzb = bundle;
        this.zzc = zzme2;
    }

    public final void run() {
        zzp zzp2;
        zzfz zzfz2 = zzme.zza(this.zzc);
        String string2 = "Failed to send default event parameters to service";
        if (zzfz2 == null) {
            this.zzc.zzj().zzg().zza(string2);
            return;
        }
        try {
            zzp2 = this.zza;
        }
        catch (RemoteException remoteException) {
            this.zzc.zzj().zzg().zza(string2, (Object)remoteException);
            return;
        }
        Preconditions.checkNotNull(zzp2);
        zzp2 = this.zzb;
        zzp zzp3 = this.zza;
        zzfz2.zza((Bundle)zzp2, zzp3);
    }
}

