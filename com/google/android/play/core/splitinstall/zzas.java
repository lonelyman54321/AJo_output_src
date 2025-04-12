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
import com.google.android.play.core.splitinstall.zzat;
import com.google.android.play.core.splitinstall.zzbc;
import java.io.Serializable;

final class zzas
extends zzv {
    final /* synthetic */ int zza;
    final /* synthetic */ TaskCompletionSource zzb;
    final /* synthetic */ zzbc zzc;

    public zzas(zzbc zzbc2, TaskCompletionSource taskCompletionSource, int n3, TaskCompletionSource taskCompletionSource2) {
        this.zzc = zzbc2;
        this.zza = n3;
        this.zzb = taskCompletionSource2;
        super(taskCompletionSource);
    }

    public final void zzc() {
        Object[] objectArray;
        Object object;
        Object object2;
        try {
            object2 = this.zzc;
        }
        catch (RemoteException remoteException) {
            object = zzbc.zzk();
            Serializable serializable = this.zza;
            objectArray = new Object[]{serializable};
            ((zzu)object).zzc(remoteException, "cancelInstall(%d)", objectArray);
            object = this.zzb;
            serializable = new RuntimeException(remoteException);
            ((TaskCompletionSource)object).trySetException((Exception)serializable);
            return;
        }
        object2 = ((zzbc)object2).zza;
        object2 = ((zzaf)object2).zze();
        object = this.zzc;
        object = zzbc.zzl((zzbc)object);
        int n3 = this.zza;
        objectArray = zzbc.zza();
        zzbc zzbc2 = this.zzc;
        TaskCompletionSource taskCompletionSource = this.zzb;
        zzat zzat2 = new zzat(zzbc2, taskCompletionSource);
        object2.zzc((String)object, n3, (Bundle)objectArray, zzat2);
    }
}

