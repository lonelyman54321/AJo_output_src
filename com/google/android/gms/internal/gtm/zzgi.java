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
import com.google.android.gms.internal.gtm.zzgm;
import com.google.android.gms.internal.gtm.zzgp;
import com.google.android.gms.internal.gtm.zzgt;
import com.google.android.gms.internal.gtm.zzhi;

final class zzgi
implements Runnable {
    final /* synthetic */ zzgm zza;
    private final zzgt zzb;

    public zzgi(zzgm zzgm2, zzgt zzgt2) {
        this.zza = zzgm2;
        this.zzb = zzgt2;
    }

    public final void run() {
        int n3;
        Object object = "Logged passthrough event ";
        Object object2 = this.zza;
        int n4 = zzgm.zza((zzgm)object2);
        if (n4 == (n3 = 2)) {
            object = String.valueOf(this.zzb.zzb());
            zzhi.zzd("Evaluating tags for event ".concat((String)object));
            object = this.zza;
            object2 = this.zzb;
            zzgm.zzf((zzgm)object).zzf((zzgt)object2);
            return;
        }
        object2 = this.zza;
        n4 = zzgm.zza((zzgm)object2);
        if (n4 == (n3 = 1)) {
            object = this.zza;
            object2 = this.zzb;
            zzgm.zzl((zzgm)object).add(object2);
            object = this.zzb.zzb();
            object2 = new StringBuilder("Added event ");
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(" to pending queue.");
            zzhi.zzd(((StringBuilder)object2).toString());
            return;
        }
        object2 = this.zza;
        n4 = zzgm.zza((zzgm)object2);
        if (n4 == (n3 = 3)) {
            object2 = this.zzb.zzb();
            Object object3 = "Failed to evaluate tags for event ";
            Object object4 = new StringBuilder((String)object3);
            ((StringBuilder)object4).append((String)object2);
            ((StringBuilder)object4).append(" (container failed to load)");
            zzhi.zzd(((StringBuilder)object4).toString());
            object2 = this.zzb;
            n3 = (int)(((zzgt)object2).zzf() ? 1 : 0);
            if (n3 != 0) {
                try {
                    object4 = this.zza;
                }
                catch (RemoteException remoteException) {
                    object2 = zzgm.zzb(this.zza);
                    zzgp.zzb("Error logging event with measurement proxy:", remoteException, (Context)object2);
                    return;
                }
                object3 = zzgm.zzd((zzgm)object4);
                String string2 = "app";
                String string3 = ((zzgt)object2).zzb();
                Bundle bundle = ((zzgt)object2).zza();
                long l2 = ((zzgt)object2).currentTimeMillis();
                object3.zzc(string2, string3, bundle, l2);
                object2 = this.zzb;
                object2 = ((zzgt)object2).zzb();
                object4 = new StringBuilder((String)object);
                ((StringBuilder)object4).append((String)object2);
                object = " to Firebase.";
                ((StringBuilder)object4).append((String)object);
                object = ((StringBuilder)object4).toString();
                zzhi.zzd((String)object);
                return;
            }
            object = String.valueOf(((zzgt)object2).zzb());
            object2 = "Discarded non-passthrough event ";
            object = ((String)object2).concat((String)object);
            zzhi.zzd((String)object);
        }
    }
}

