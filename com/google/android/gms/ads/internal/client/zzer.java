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
import com.google.android.gms.ads.internal.client.zzet;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.android.gms.ads.internal.util.client.zzm;

final class zzer
implements Runnable {
    final /* synthetic */ zzet zza;

    public zzer(zzet zzet2) {
        this.zza = zzet2;
    }

    public final void run() {
        IInterface iInterface = this.zza.zza;
        Object object = zzeu.zzb((zzeu)iInterface);
        if (object != null) {
            iInterface = zzeu.zzb((zzeu)iInterface);
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

