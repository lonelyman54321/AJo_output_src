/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.gtm.zzgl;
import com.google.android.gms.internal.gtm.zzgm;
import com.google.android.gms.internal.gtm.zzgp;
import com.google.android.gms.internal.gtm.zzgt;
import com.google.android.gms.internal.gtm.zzhi;

final class zzgg
implements Runnable {
    final /* synthetic */ zzgm zza;

    public /* synthetic */ zzgg(zzgm zzgm2, zzgl zzgl2) {
        this.zza = zzgm2;
    }

    public final void run() {
        Object object = this.zza;
        int n3 = 3;
        zzgm.zzq((zzgm)object, n3);
        object = zzgm.zzi(this.zza);
        Object object2 = "Container ";
        Object object3 = new StringBuilder((String)object2);
        ((StringBuilder)object3).append((String)object);
        ((StringBuilder)object3).append(" loading failed.");
        zzhi.zze(((StringBuilder)object3).toString());
        object = this.zza;
        object3 = zzgm.zzl((zzgm)object);
        if (object3 != null) {
            object = zzgm.zzl((zzgm)object).iterator();
            while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                Object object4;
                object3 = (zzgt)object.next();
                boolean bl2 = ((zzgt)object3).zzf();
                if (bl2) {
                    object2 = this.zza;
                    object4 = zzgm.zzd((zzgm)object2);
                    String string2 = "app";
                    String string3 = ((zzgt)object3).zzb();
                    Bundle bundle = ((zzgt)object3).zza();
                    long l2 = ((zzgt)object3).currentTimeMillis();
                    object4.zzc(string2, string3, bundle, l2);
                    object3 = ((zzgt)object3).zzb();
                    object2 = new StringBuilder();
                    object4 = "Logged event ";
                    ((StringBuilder)object2).append((String)object4);
                    ((StringBuilder)object2).append((String)object3);
                    object3 = " to Firebase (marked as passthrough).";
                    ((StringBuilder)object2).append((String)object3);
                    object3 = ((StringBuilder)object2).toString();
                    try {
                        zzhi.zzd((String)object3);
                    }
                    catch (RemoteException remoteException) {
                        object2 = zzgm.zzb(this.zza);
                        object4 = "Error logging event with measurement proxy:";
                        zzgp.zzb((String)object4, remoteException, (Context)object2);
                    }
                    continue;
                }
                object3 = ((zzgt)object3).zzb();
                object4 = "Discarded event ";
                object2 = new StringBuilder((String)object4);
                ((StringBuilder)object2).append((String)object3);
                ((StringBuilder)object2).append(" (marked as non-passthrough).");
                object3 = ((StringBuilder)object2).toString();
                zzhi.zzd((String)object3);
            }
            object = this.zza;
            n3 = 0;
            object3 = null;
            zzgm.zzo((zzgm)object, null);
        }
    }
}

