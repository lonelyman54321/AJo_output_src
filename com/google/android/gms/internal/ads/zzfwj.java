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
import com.google.android.gms.internal.ads.zzfwp;
import com.google.android.gms.internal.ads.zzfws;
import com.google.android.gms.internal.ads.zzfwv;
import com.google.android.gms.internal.ads.zzfww;
import com.google.android.gms.internal.ads.zzfxg;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzfwj
extends zzfww {
    final /* synthetic */ zzfwp zza;
    final /* synthetic */ zzfws zzb;
    final /* synthetic */ TaskCompletionSource zzc;
    final /* synthetic */ zzfwn zzd;

    public zzfwj(zzfwn zzfwn2, TaskCompletionSource taskCompletionSource, zzfwp zzfwp2, zzfws zzfws2, TaskCompletionSource taskCompletionSource2) {
        this.zza = zzfwp2;
        this.zzb = zzfws2;
        this.zzc = taskCompletionSource2;
        this.zzd = zzfwn2;
        super(taskCompletionSource);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        RemoteException remoteException2;
        RuntimeException runtimeException;
        boolean bl2;
        block4: {
            Object object;
            Bundle bundle;
            Object object2;
            String string2;
            Object object3;
            Object object4;
            block3: {
                bl2 = true;
                runtimeException = null;
                try {
                    object4 = this.zzd;
                    object4 = ((zzfwn)object4).zza;
                    object4 = ((zzfxg)object4).zze();
                    if (object4 == null) {
                        return;
                    }
                    object3 = this.zzd;
                    string2 = zzfwn.zzb((zzfwn)object3);
                    object2 = this.zza;
                    object3 = zzfwn.zzb((zzfwn)object3);
                    bundle = new Bundle();
                    object = "windowToken";
                    Object object5 = ((zzfwp)object2).zzf();
                    bundle.putBinder((String)object, object5);
                    object = "adFieldEnifd";
                    object5 = ((zzfwp)object2).zzg();
                    bundle.putString((String)object, (String)object5);
                    object = "layoutGravity";
                    int n3 = ((zzfwp)object2).zzc();
                    bundle.putInt((String)object, n3);
                    object = "layoutVerticalMargin";
                    float f5 = ((zzfwp)object2).zza();
                    bundle.putFloat((String)object, f5);
                    object = "displayMode";
                    bundle.putInt((String)object, 0);
                    object = "triggerMode";
                    bundle.putInt((String)object, 0);
                    object = "windowWidthPx";
                    n3 = ((zzfwp)object2).zze();
                    bundle.putInt((String)object, n3);
                    object = "deeplinkUrl";
                    n3 = 0;
                    f5 = 0.0f;
                    object5 = null;
                    bundle.putString((String)object, null);
                    object = "stableSessionToken";
                    bundle.putBoolean((String)object, bl2);
                    object = "callerPackage";
                    bundle.putString((String)object, (String)object3);
                    object3 = ((zzfwp)object2).zzh();
                    if (object3 == null) break block3;
                    object3 = "appId";
                    object2 = ((zzfwp)object2).zzh();
                    bundle.putString((String)object3, (String)object2);
                }
                catch (RemoteException remoteException2) {
                    break block4;
                }
            }
            object2 = this.zzd;
            object = this.zzb;
            object3 = new zzfwm((zzfwn)object2, (zzfws)object);
            object4.zzf(string2, bundle, (zzfvq)object3);
            return;
        }
        zzfwv zzfwv2 = zzfwn.zza();
        String string3 = zzfwn.zzb(this.zzd);
        Object object = new Object[bl2];
        object[0] = string3;
        zzfwv2.zzb(remoteException2, "show overlay display from: %s", (Object[])object);
        object = this.zzc;
        runtimeException = new RuntimeException(remoteException2);
        ((TaskCompletionSource)object).trySetException(runtimeException);
    }
}

