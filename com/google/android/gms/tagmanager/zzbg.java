/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.RemoteException
 */
package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.AppMeasurement$EventInterceptor;
import com.google.android.gms.tagmanager.zzbi;
import com.google.android.gms.tagmanager.zzch;

final class zzbg
implements AppMeasurement$EventInterceptor {
    final /* synthetic */ zzch zza;

    public zzbg(zzbi zzbi2, zzch zzch2) {
        this.zza = zzch2;
    }

    public final void interceptEvent(String string2, String object, Bundle bundle, long l2) {
        zzch zzch2;
        try {
            zzch2 = this.zza;
        }
        catch (RemoteException remoteException) {
            object = new IllegalStateException(remoteException);
            throw object;
        }
        zzch2.zze(string2, (String)object, bundle, l2);
    }
}

