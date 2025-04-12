/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Message
 *  android.os.RemoteException
 *  android.util.Log
 */
package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzn;
import com.google.android.gms.cloudmessaging.zzp;
import com.google.android.gms.cloudmessaging.zzq;
import com.google.android.gms.cloudmessaging.zzs;
import com.google.android.gms.cloudmessaging.zzv;
import java.util.concurrent.TimeUnit;

public final class zzj
implements Runnable {
    public final /* synthetic */ zzp zza;

    public /* synthetic */ zzj(zzp zzp2) {
        this.zza = zzp2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Throwable throwable2;
        while (true) {
            Object object;
            Object object2;
            int n3;
            Object object3;
            Object object4;
            int n4;
            zzp zzp2 = this.zza;
            synchronized (zzp2) {
                int n7;
                try {
                    n7 = zzp2.zza;
                    n4 = 2;
                    if (n7 != n4) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break;
                }
                object4 = zzp2.zzd;
                n7 = (int)(object4.isEmpty() ? 1 : 0);
                if (n7 != 0) {
                    zzp2.zzf();
                    return;
                }
                object4 = zzp2.zzd;
                object4 = object4.poll();
                object4 = (zzs)object4;
                object3 = zzp2.zze;
                n3 = ((zzs)object4).zza;
                object3.put(n3, object4);
                object3 = zzp2.zzf;
                object3 = zzv.zze((zzv)object3);
                object2 = new zzn(zzp2, (zzs)object4);
                object = TimeUnit.SECONDS;
                long l2 = 30;
                object3.schedule((Runnable)object2, l2, (TimeUnit)((Object)object));
            }
            object3 = "MessengerIpcClient";
            n3 = 3;
            boolean bl2 = Log.isLoggable((String)object3, (int)n3);
            if (bl2) {
                object3 = String.valueOf(object4);
                object2 = "Sending ";
                ((String)object2).concat((String)object3);
            }
            object3 = zzp2.zzf;
            object2 = zzp2.zzb;
            boolean bl3 = ((zzs)object4).zzc;
            object3 = zzv.zza((zzv)object3);
            Message message = Message.obtain();
            message.what = bl3;
            bl3 = ((zzs)object4).zza;
            message.arg1 = bl3;
            message.replyTo = object2;
            object2 = new Bundle();
            bl3 = ((zzs)object4).zzb();
            String string2 = "oneWay";
            object2.putBoolean(string2, bl3);
            object3 = object3.getPackageName();
            object = "pkg";
            object2.putString((String)object, (String)object3);
            object4 = ((zzs)object4).zzd;
            object3 = "data";
            object2.putBundle((String)object3, (Bundle)object4);
            message.setData((Bundle)object2);
            try {
                object4 = zzp2.zzc;
                ((zzq)object4).zza(message);
            }
            catch (RemoteException remoteException) {
                object4 = remoteException.getMessage();
                zzp2.zza(n4, (String)object4);
            }
        }
        {
            throw throwable2;
        }
    }
}

