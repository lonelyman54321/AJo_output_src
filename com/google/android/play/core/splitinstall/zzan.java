/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.RemoteException
 */
package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.splitinstall.internal.zzaf;
import com.google.android.play.core.splitinstall.internal.zzu;
import com.google.android.play.core.splitinstall.internal.zzv;
import com.google.android.play.core.splitinstall.zzau;
import com.google.android.play.core.splitinstall.zzbc;
import java.util.Collection;
import java.util.List;

final class zzan
extends zzv {
    final /* synthetic */ List zza;
    final /* synthetic */ TaskCompletionSource zzb;
    final /* synthetic */ zzbc zzc;

    public zzan(zzbc zzbc2, TaskCompletionSource taskCompletionSource, List list, TaskCompletionSource taskCompletionSource2) {
        this.zzc = zzbc2;
        this.zza = list;
        this.zzb = taskCompletionSource2;
        super(taskCompletionSource);
    }

    public final void zzc() {
        Object[] objectArray;
        Object object;
        Object object2;
        Object object3;
        try {
            object3 = this.zzc;
        }
        catch (RemoteException remoteException) {
            object2 = zzbc.zzk();
            object = this.zza;
            objectArray = new Object[]{object};
            ((zzu)object2).zzc(remoteException, "deferredInstall(%s)", objectArray);
            object2 = this.zzb;
            object = new RuntimeException(remoteException);
            ((TaskCompletionSource)object2).trySetException((Exception)object);
            return;
        }
        object3 = ((zzbc)object3).zza;
        object3 = ((zzaf)object3).zze();
        object2 = this.zzc;
        object2 = zzbc.zzl((zzbc)object2);
        object = this.zza;
        object = zzbc.zzn((Collection)object);
        objectArray = zzbc.zza();
        zzbc zzbc2 = this.zzc;
        TaskCompletionSource taskCompletionSource = this.zzb;
        zzau zzau2 = new zzau(zzbc2, taskCompletionSource);
        object3.zzd((String)object2, (List)object, (Bundle)objectArray, zzau2);
    }
}

