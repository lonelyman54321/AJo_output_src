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
import com.google.android.gms.internal.gtm.zzgp;
import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzik;
import com.google.android.gms.internal.gtm.zzix;

final class zzij
implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ Bundle zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ zzik zzf;
    private boolean zzg = false;

    public zzij(zzik zzik2, String string2, Bundle bundle, String string3, long l2, String string4) {
        this.zza = string2;
        this.zzb = bundle;
        this.zzc = string3;
        this.zzd = l2;
        this.zze = string4;
        this.zzf = zzik2;
    }

    public final void run() {
        int n3;
        int n4;
        Object object = this.zzf.zza;
        int n7 = zzix.zza((zzix)object);
        if (n7 == (n4 = 3)) {
            String string2 = this.zza;
            Bundle bundle = this.zzb;
            String string3 = this.zzc;
            long l2 = this.zzd;
            zzix.zzg((zzix)object).zzb(string2, bundle, string3, l2, true);
            return;
        }
        n7 = zzix.zza((zzix)object);
        n4 = 4;
        String string4 = ".";
        String string5 = ", params = ";
        String string6 = ", origin = ";
        if (n7 == n4) {
            object = this.zza;
            Object object2 = this.zzc;
            Object object3 = this.zzb;
            String string7 = "Container failed to load: skipping  event interceptor by logging event back to Firebase directly: name = ";
            object = og_1.a(string7, (String)object, string6, (String)object2, string5);
            ((StringBuilder)object).append(object3);
            ((StringBuilder)object).append(string4);
            object = ((StringBuilder)object).toString();
            zzhi.zzd((String)object);
            try {
                object = this.zzf;
            }
            catch (RemoteException remoteException) {
                object2 = zzix.zzb(this.zzf.zza);
                zzgp.zzb("Error logging event on measurement proxy: ", remoteException, (Context)object2);
                return;
            }
            object = ((zzik)object).zza;
            object2 = zzix.zzd((zzix)object);
            object3 = this.zzc;
            string4 = this.zza;
            string5 = this.zzb;
            long l3 = this.zzd;
            object2.zzc((String)object3, string4, (Bundle)string5, l3);
            return;
        }
        n7 = zzix.zza((zzix)object);
        if (n7 != (n4 = 1) && (n7 = zzix.zza((zzix)object)) != (n3 = 2)) {
            object = hj0_0.a(zzix.zza((zzix)object), "Unexpected state:");
            Context context = zzix.zzb(this.zzf.zza);
            zzgp.zzc((String)object, context);
            return;
        }
        n7 = (int)(this.zzg ? 1 : 0);
        if (n7 == 0) {
            object = this.zza;
            String string8 = this.zze;
            Bundle bundle = this.zzb;
            object = og_1.a("Container not loaded yet: deferring event interceptor by enqueuing the event: name = ", (String)object, string6, string8, string5);
            ((StringBuilder)object).append(bundle);
            ((StringBuilder)object).append(string4);
            zzhi.zzd(((StringBuilder)object).toString());
            this.zzg = n4;
            zzix.zzi(this.zzf.zza).add(this);
            return;
        }
        object = zzix.zzb((zzix)object);
        zzgp.zzc("Invalid state - not expecting to see a deferredevent during container loading.", (Context)object);
    }
}

