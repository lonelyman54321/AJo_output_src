/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbzh;

public final class zzfb
implements Runnable {
    public final /* synthetic */ zzbzh zza;

    public /* synthetic */ zzfb(zzbzh zzbzh2) {
        this.zza = zzbzh2;
    }

    public final void run() {
        zzbzh zzbzh2 = this.zza;
        if (zzbzh2 != null) {
            int n3 = 1;
            try {
                zzbzh2.zze(n3);
                return;
            }
            catch (RemoteException remoteException) {
                String string2 = "#007 Could not call remote method.";
                zzm.zzl(string2, remoteException);
            }
        }
    }
}

