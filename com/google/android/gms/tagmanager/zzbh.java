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
import com.google.android.gms.measurement.AppMeasurement$OnEventListener;
import com.google.android.gms.tagmanager.zzbi;
import com.google.android.gms.tagmanager.zzce;

final class zzbh
implements AppMeasurement$OnEventListener {
    final /* synthetic */ zzce zza;

    public zzbh(zzbi zzbi2, zzce zzce2) {
        this.zza = zzce2;
    }

    public final void onEvent(String string2, String object, Bundle bundle, long l2) {
        zzce zzce2;
        try {
            zzce2 = this.zza;
        }
        catch (RemoteException remoteException) {
            object = new IllegalStateException(remoteException);
            throw object;
        }
        zzce2.zze(string2, (String)object, bundle, l2);
    }
}

