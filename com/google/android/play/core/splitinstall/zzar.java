/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.play.core.splitinstall;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.splitinstall.internal.zzaf;
import com.google.android.play.core.splitinstall.internal.zzu;
import com.google.android.play.core.splitinstall.internal.zzv;
import com.google.android.play.core.splitinstall.zzaz;
import com.google.android.play.core.splitinstall.zzbc;

final class zzar
extends zzv {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ zzbc zzb;

    public zzar(zzbc zzbc2, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2) {
        this.zzb = zzbc2;
        this.zza = taskCompletionSource2;
        super(taskCompletionSource);
    }

    public final void zzc() {
        Object object;
        Object object2;
        Object object3;
        try {
            object3 = this.zzb;
        }
        catch (RemoteException remoteException) {
            object2 = zzbc.zzk();
            object = new Object[]{};
            ((zzu)object2).zzc(remoteException, "getSessionStates", object);
            object2 = this.zza;
            object = new RuntimeException(remoteException);
            ((TaskCompletionSource)object2).trySetException((Exception)object);
            return;
        }
        object3 = ((zzbc)object3).zza;
        object3 = ((zzaf)object3).zze();
        object2 = this.zzb;
        object = zzbc.zzl((zzbc)object2);
        TaskCompletionSource taskCompletionSource = this.zza;
        zzaz zzaz2 = new zzaz((zzbc)object2, taskCompletionSource);
        object3.zzi((String)object, zzaz2);
    }
}

