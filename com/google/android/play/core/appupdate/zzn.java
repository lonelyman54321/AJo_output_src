/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.RemoteException
 */
package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.appupdate.internal.zzh;
import com.google.android.play.core.appupdate.internal.zzm;
import com.google.android.play.core.appupdate.internal.zzx;
import com.google.android.play.core.appupdate.zzp;
import com.google.android.play.core.appupdate.zzr;

final class zzn
extends com.google.android.play.core.appupdate.internal.zzn {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzr zzc;

    public zzn(zzr zzr2, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, String string2) {
        this.zzc = zzr2;
        this.zza = taskCompletionSource2;
        this.zzb = string2;
        super(taskCompletionSource);
    }

    public final void zza() {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        try {
            object4 = this.zzc;
        }
        catch (RemoteException remoteException) {
            object3 = zzr.zzg();
            object2 = this.zzb;
            object = new Object[]{object2};
            ((zzm)object3).zzc(remoteException, "completeUpdate(%s)", object);
            object3 = this.zza;
            object2 = new RuntimeException(remoteException);
            ((TaskCompletionSource)object3).trySetException((Exception)object2);
            return;
        }
        object4 = ((zzr)object4).zza;
        object4 = ((zzx)object4).zze();
        object3 = this.zzc;
        object3 = zzr.zzh((zzr)object3);
        object2 = zzr.zzc();
        zzr zzr2 = this.zzc;
        TaskCompletionSource taskCompletionSource = this.zza;
        object = new zzp(zzr2, taskCompletionSource);
        object4.zzc((String)object3, (Bundle)object2, (zzh)object);
    }
}

