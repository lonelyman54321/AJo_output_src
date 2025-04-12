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
import com.google.android.gms.internal.ads.zzfwm;
import com.google.android.gms.internal.ads.zzfwn;
import com.google.android.gms.internal.ads.zzfws;
import com.google.android.gms.internal.ads.zzfwu;
import com.google.android.gms.internal.ads.zzfwv;
import com.google.android.gms.internal.ads.zzfww;
import com.google.android.gms.internal.ads.zzfxg;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzfwl
extends zzfww {
    final /* synthetic */ zzfwu zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzfws zzc;
    final /* synthetic */ TaskCompletionSource zzd;
    final /* synthetic */ zzfwn zze;

    public zzfwl(zzfwn zzfwn2, TaskCompletionSource taskCompletionSource, zzfwu zzfwu2, int n3, zzfws zzfws2, TaskCompletionSource taskCompletionSource2) {
        this.zza = zzfwu2;
        this.zzb = n3;
        this.zzc = zzfws2;
        this.zzd = taskCompletionSource2;
        this.zze = zzfwn2;
        super(taskCompletionSource);
    }

    public final void zza() {
        Object[] objectArray;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        block20: {
            try {
                object4 = this.zze;
            }
            catch (RemoteException remoteException) {
                int n3 = this.zzb;
                object3 = zzfwn.zza();
                object2 = n3;
                object = zzfwn.zzb(this.zze);
                objectArray = new Object[]{object2, object};
                ((zzfwv)object3).zzb(remoteException, "switchDisplayMode overlay display to %d from: %s", objectArray);
                object2 = this.zzd;
                object3 = new RuntimeException(remoteException);
                ((TaskCompletionSource)object2).trySetException((Exception)object3);
                return;
            }
            object4 = ((zzfwn)object4).zza;
            object4 = ((zzfxg)object4).zze();
            if (object4 != null) break block20;
            return;
        }
        object2 = this.zza;
        object3 = this.zze;
        object3 = zzfwn.zzb((zzfwn)object3);
        int n4 = this.zzb;
        objectArray = new Bundle();
        String string2 = "sessionToken";
        String string3 = ((zzfwu)object2).zzb();
        objectArray.putString(string2, string3);
        string2 = "displayMode";
        objectArray.putInt(string2, n4);
        object = "callerPackage";
        objectArray.putString((String)object, (String)object3);
        object3 = "appId";
        object2 = ((zzfwu)object2).zza();
        objectArray.putString((String)object3, (String)object2);
        object3 = this.zze;
        object = this.zzc;
        object2 = new zzfwm((zzfwn)object3, (zzfws)object);
        object4.zzg((Bundle)objectArray, (zzfvq)object2);
    }
}

