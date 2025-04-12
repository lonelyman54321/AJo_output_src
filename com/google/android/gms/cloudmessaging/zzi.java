/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.RemoteException
 */
package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.cloudmessaging.zzp;
import com.google.android.gms.cloudmessaging.zzq;

public final class zzi
implements Runnable {
    public final /* synthetic */ zzp zza;
    public final /* synthetic */ IBinder zzb;

    public /* synthetic */ zzi(zzp zzp2, IBinder iBinder) {
        this.zza = zzp2;
        this.zzb = iBinder;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        zzp zzp2 = this.zza;
        Object object = this.zzb;
        synchronized (zzp2) {
            Throwable throwable2;
            if (object == null) {
                object = "Null service connection";
                try {
                    zzp2.zza(0, (String)object);
                    return;
                }
                catch (Throwable throwable2) {}
            } else {
                try {
                    int n3;
                    zzq zzq2;
                    zzp2.zzc = zzq2 = new zzq((IBinder)object);
                    zzp2.zza = n3 = 2;
                    zzp2.zzc();
                }
                catch (RemoteException remoteException) {
                    String string2 = remoteException.getMessage();
                    zzp2.zza(0, string2);
                    return;
                }
                return;
            }
            throw throwable2;
        }
    }
}

