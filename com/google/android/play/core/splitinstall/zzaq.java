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
import com.google.android.play.core.splitinstall.zzay;
import com.google.android.play.core.splitinstall.zzbc;

final class zzaq
extends zzv {
    final /* synthetic */ int zza;
    final /* synthetic */ TaskCompletionSource zzb;
    final /* synthetic */ zzbc zzc;

    public zzaq(zzbc zzbc2, TaskCompletionSource taskCompletionSource, int n3, TaskCompletionSource taskCompletionSource2) {
        this.zzc = zzbc2;
        this.zza = n3;
        this.zzb = taskCompletionSource2;
        super(taskCompletionSource);
    }

    public final void zzc() {
        Object object;
        Object object2;
        Object object3;
        try {
            object3 = this.zzc;
        }
        catch (RemoteException remoteException) {
            object2 = zzbc.zzk();
            object = this.zza;
            Object[] objectArray = new Object[]{object};
            ((zzu)object2).zzc(remoteException, "getSessionState(%d)", objectArray);
            object2 = this.zzb;
            object = new RuntimeException(remoteException);
            ((TaskCompletionSource)object2).trySetException((Exception)object);
            return;
        }
        object3 = ((zzbc)object3).zza;
        object3 = ((zzaf)object3).zze();
        object2 = this.zzc;
        object = zzbc.zzl((zzbc)object2);
        int n3 = this.zza;
        TaskCompletionSource taskCompletionSource = this.zzb;
        zzay zzay2 = new zzay((zzbc)object2, taskCompletionSource);
        object3.zzh((String)object, n3, zzay2);
    }
}

