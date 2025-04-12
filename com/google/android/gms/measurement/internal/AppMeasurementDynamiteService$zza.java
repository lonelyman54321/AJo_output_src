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
import com.google.android.gms.internal.measurement.zzdw;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjq;

final class AppMeasurementDynamiteService$zza
implements zzjq {
    private zzdw zza;
    private final /* synthetic */ AppMeasurementDynamiteService zzb;

    public AppMeasurementDynamiteService$zza(AppMeasurementDynamiteService appMeasurementDynamiteService, zzdw zzdw2) {
        this.zzb = appMeasurementDynamiteService;
        this.zza = zzdw2;
    }

    public final void interceptEvent(String string2, String object, Bundle object2, long l2) {
        zzdw zzdw2;
        try {
            zzdw2 = this.zza;
        }
        catch (RemoteException remoteException) {
            object = this.zzb.zza;
            if (object != null) {
                object = ((zzic)object).zzj().zzr();
                object2 = "Event interceptor threw exception";
                ((zzgq)object).zza((String)object2, (Object)remoteException);
            }
            return;
        }
        zzdw2.zza(string2, (String)object, (Bundle)object2, l2);
    }
}

