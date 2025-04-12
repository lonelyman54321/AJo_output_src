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
import com.google.android.play.core.appupdate.internal.zzn;
import com.google.android.play.core.appupdate.internal.zzx;
import com.google.android.play.core.appupdate.zzq;
import com.google.android.play.core.appupdate.zzr;

final class zzm
extends zzn {
    final /* synthetic */ String zza;
    final /* synthetic */ TaskCompletionSource zzb;
    final /* synthetic */ zzr zzc;

    public zzm(zzr zzr2, TaskCompletionSource taskCompletionSource, String string2, TaskCompletionSource taskCompletionSource2) {
        this.zzc = zzr2;
        this.zza = string2;
        this.zzb = taskCompletionSource2;
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
            object2 = this.zza;
            object = new Object[]{object2};
            ((com.google.android.play.core.appupdate.internal.zzm)object3).zzc(remoteException, "requestUpdateInfo(%s)", object);
            object3 = this.zzb;
            object2 = new RuntimeException(remoteException);
            ((TaskCompletionSource)object3).trySetException((Exception)object2);
            return;
        }
        object4 = ((zzr)object4).zza;
        object4 = ((zzx)object4).zze();
        object3 = this.zzc;
        object2 = zzr.zzh((zzr)object3);
        object = this.zza;
        object3 = zzr.zzb((zzr)object3, (String)object);
        zzr zzr2 = this.zzc;
        TaskCompletionSource taskCompletionSource = this.zzb;
        String string2 = this.zza;
        object = new zzq(zzr2, taskCompletionSource, string2);
        object4.zzd((String)object2, (Bundle)object3, (zzh)object);
    }
}

