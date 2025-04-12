/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzfz;
import com.google.android.gms.measurement.internal.zzlw;
import com.google.android.gms.measurement.internal.zzme;

final class zzmz
implements Runnable {
    private final /* synthetic */ zzlw zza;
    private final /* synthetic */ zzme zzb;

    public zzmz(zzme zzme2, zzlw zzlw2) {
        this.zza = zzlw2;
        this.zzb = zzme2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        RemoteException remoteException2;
        block5: {
            Object object;
            block4: {
                zzfz zzfz2;
                block3: {
                    object = this.zzb;
                    zzfz2 = zzme.zza((zzme)object);
                    if (zzfz2 == null) {
                        this.zzb.zzj().zzg().zza("Failed to send current screen to service");
                        return;
                    }
                    try {
                        object = this.zza;
                        if (object != null) break block3;
                        object = this.zzb;
                        object = ((zzme)object).zza();
                        String string2 = object.getPackageName();
                        long l2 = 0L;
                        Object var6_8 = null;
                        Object var7_10 = null;
                        zzfz2.zza(l2, null, null, string2);
                        break block4;
                    }
                    catch (RemoteException remoteException2) {
                        break block5;
                    }
                }
                long l3 = ((zzlw)object).zzc;
                String string3 = ((zzlw)object).zza;
                String string4 = ((zzlw)object).zzb;
                object = this.zzb;
                object = ((zzme)object).zza();
                String string5 = object.getPackageName();
                zzfz2.zza(l3, string3, string4, string5);
            }
            object = this.zzb;
            zzme.zzg((zzme)object);
            return;
        }
        this.zzb.zzj().zzg().zza("Failed to send current screen to the service", (Object)remoteException2);
    }
}

