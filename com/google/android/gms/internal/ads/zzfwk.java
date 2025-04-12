/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzfvq;
import com.google.android.gms.internal.ads.zzfwe;
import com.google.android.gms.internal.ads.zzfwm;
import com.google.android.gms.internal.ads.zzfwn;
import com.google.android.gms.internal.ads.zzfws;
import com.google.android.gms.internal.ads.zzfwv;
import com.google.android.gms.internal.ads.zzfww;
import com.google.android.gms.internal.ads.zzfxg;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzfwk
extends zzfww {
    final /* synthetic */ zzfwe zza;
    final /* synthetic */ zzfws zzb;
    final /* synthetic */ TaskCompletionSource zzc;
    final /* synthetic */ zzfwn zzd;

    public zzfwk(zzfwn zzfwn2, TaskCompletionSource taskCompletionSource, zzfwe zzfwe2, zzfws zzfws2, TaskCompletionSource taskCompletionSource2) {
        this.zza = zzfwe2;
        this.zzb = zzfws2;
        this.zzc = taskCompletionSource2;
        this.zzd = zzfwn2;
        super(taskCompletionSource);
    }

    public final void zza() {
        Object[] objectArray;
        Object object;
        Object object2;
        Object object3;
        block18: {
            try {
                object3 = this.zzd;
            }
            catch (RemoteException remoteException) {
                object2 = this.zzd;
                object = zzfwn.zza();
                object2 = zzfwn.zzb((zzfwn)object2);
                objectArray = new Object[]{object2};
                ((zzfwv)object).zzb(remoteException, "dismiss overlay display from: %s", objectArray);
                object2 = this.zzc;
                object = new RuntimeException(remoteException);
                ((TaskCompletionSource)object2).trySetException((Exception)object);
                return;
            }
            object3 = ((zzfwn)object3).zza;
            object3 = ((zzfxg)object3).zze();
            if (object3 != null) break block18;
            return;
        }
        object2 = this.zza;
        object = this.zzd;
        object = zzfwn.zzb((zzfwn)object);
        objectArray = new Bundle();
        Object object4 = "sessionToken";
        String string2 = ((zzfwe)object2).zzb();
        objectArray.putString((String)object4, string2);
        object4 = "callerPackage";
        objectArray.putString((String)object4, (String)object);
        object = "appId";
        object2 = ((zzfwe)object2).zza();
        objectArray.putString((String)object, (String)object2);
        object = this.zzd;
        object4 = this.zzb;
        object2 = new zzfwm((zzfwn)object, (zzfws)object4);
        object3.zze((Bundle)objectArray, (zzfvq)object2);
    }
}

