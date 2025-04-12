/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IInterface
 *  android.os.RemoteException
 */
package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.util.client.zzm;

final class zzev
implements Runnable {
    final /* synthetic */ zzew zza;

    public zzev(zzew zzew2) {
        this.zza = zzew2;
    }

    public final void run() {
        IInterface iInterface = this.zza;
        Object object = zzew.zzb((zzew)iInterface);
        if (object != null) {
            iInterface = zzew.zzb((zzew)iInterface);
            int n3 = 1;
            try {
                iInterface.zze(n3);
                return;
            }
            catch (RemoteException remoteException) {
                object = "Could not notify onAdFailedToLoad event.";
                zzm.zzk((String)object, remoteException);
            }
        }
    }
}

