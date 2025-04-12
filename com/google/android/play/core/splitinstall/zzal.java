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
import com.google.android.play.core.splitinstall.internal.zzn;
import com.google.android.play.core.splitinstall.internal.zzu;
import com.google.android.play.core.splitinstall.internal.zzv;
import com.google.android.play.core.splitinstall.zzba;
import com.google.android.play.core.splitinstall.zzbc;
import java.util.ArrayList;
import java.util.Collection;

final class zzal
extends zzv {
    final /* synthetic */ Collection zza;
    final /* synthetic */ Collection zzb;
    final /* synthetic */ zzn zzc;
    final /* synthetic */ TaskCompletionSource zzd;
    final /* synthetic */ zzbc zze;

    public zzal(zzbc zzbc2, TaskCompletionSource taskCompletionSource, Collection collection, Collection collection2, zzn zzn2, TaskCompletionSource taskCompletionSource2) {
        this.zze = zzbc2;
        this.zza = collection;
        this.zzb = collection2;
        this.zzc = zzn2;
        this.zzd = taskCompletionSource2;
        super(taskCompletionSource);
    }

    public final void zzc() {
        Object object;
        Object object2;
        int n3 = 2;
        ArrayList arrayList = zzbc.zzn(this.zza);
        Object object3 = zzbc.zzm(this.zzb);
        arrayList.addAll(object3);
        try {
            object3 = this.zzc;
        }
        catch (RemoteException remoteException) {
            object3 = zzbc.zzk();
            object2 = this.zza;
            object = this.zzb;
            Object object4 = new Object[n3];
            object4[0] = object2;
            object4[1] = object;
            ((zzu)object3).zzc(remoteException, "startInstall(%s,%s)", (Object[])object4);
            object4 = this.zzd;
            object3 = new RuntimeException(remoteException);
            ((TaskCompletionSource)object4).trySetException((Exception)object3);
            return;
        }
        ((zzn)object3).zzb(n3);
        object3 = this.zze;
        object3 = ((zzbc)object3).zza;
        object3 = ((zzaf)object3).zze();
        object2 = this.zze;
        object2 = zzbc.zzl((zzbc)object2);
        object = this.zzc;
        object = zzbc.zzb((zzn)object);
        zzbc zzbc2 = this.zze;
        TaskCompletionSource taskCompletionSource = this.zzd;
        zzba zzba2 = new zzba(zzbc2, taskCompletionSource);
        object3.zzj((String)object2, arrayList, (Bundle)object, zzba2);
    }
}

