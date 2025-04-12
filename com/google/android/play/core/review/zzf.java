/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.RemoteException
 */
package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.review.internal.zzt;
import com.google.android.play.core.review.zzh;
import com.google.android.play.core.review.zzi;
import com.google.android.play.core.review.zzj;

final class zzf
extends com.google.android.play.core.review.internal.zzj {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ zzi zzb;

    public zzf(zzi zzi2, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2) {
        this.zza = taskCompletionSource2;
        this.zzb = zzi2;
        super(taskCompletionSource);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        RemoteException remoteException2;
        Object object;
        block4: {
            int n3;
            String string2;
            Object object2;
            Bundle bundle;
            Object object3;
            Object object4;
            Object object5;
            block3: {
                object5 = "unity";
                object = "native";
                try {
                    object4 = this.zzb;
                    object4 = ((zzi)object4).zza;
                    object4 = ((zzt)object4).zze();
                    object4 = (com.google.android.play.core.review.internal.zzf)object4;
                    object3 = this.zzb;
                    object3 = zzi.zzc((zzi)object3);
                    bundle = new Bundle();
                    object2 = zzj.zza();
                    string2 = "playcore_version_code";
                    Object object6 = "java";
                    object6 = object2.get(object6);
                    object6 = (Integer)object6;
                    int n4 = (Integer)object6;
                    bundle.putInt(string2, n4);
                    boolean bl2 = object2.containsKey(object);
                    if (!bl2) break block3;
                    string2 = "playcore_native_version";
                    object = object2.get(object);
                    object = (Integer)object;
                    n3 = (Integer)object;
                    bundle.putInt(string2, n3);
                }
                catch (RemoteException remoteException2) {
                    break block4;
                }
            }
            if ((n3 = object2.containsKey(object5)) != 0) {
                object = "playcore_unity_version";
                object5 = object2.get(object5);
                object5 = (Integer)object5;
                int n7 = (Integer)object5;
                bundle.putInt((String)object, n7);
            }
            object = this.zzb;
            object2 = this.zza;
            string2 = zzi.zzc((zzi)object);
            object5 = new zzh((zzi)object, (TaskCompletionSource)object2, string2);
            object4.zzc((String)object3, bundle, (com.google.android.play.core.review.internal.zzh)object5);
            return;
        }
        object = this.zzb;
        Object object7 = zzi.zzb();
        object = zzi.zzc((zzi)object);
        Object[] objectArray = new Object[]{object};
        ((com.google.android.play.core.review.internal.zzi)object7).zzb(remoteException2, "error requesting in-app review for %s", objectArray);
        object = this.zza;
        object7 = new RuntimeException(remoteException2);
        ((TaskCompletionSource)object).trySetException((Exception)object7);
    }
}

