/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzdq;
import com.google.android.gms.measurement.internal.zzbl;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzme;
import com.google.android.gms.measurement.internal.zzpn;

final class zznb
implements Runnable {
    private final /* synthetic */ zzbl zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzdq zzc;
    private final /* synthetic */ zzme zzd;

    public zznb(zzme zzme2, zzbl zzbl2, String string2, zzdq zzdq2) {
        this.zza = zzbl2;
        this.zzb = string2;
        this.zzc = zzdq2;
        this.zzd = zzme2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Throwable throwable2;
        byte[] byArray;
        block6: {
            byArray = null;
            try {
                Object object = this.zzd;
                object = zzme.zza((zzme)object);
                if (object == null) {
                    object = this.zzd;
                    object = ((zzme)object).zzj();
                    object = ((zzgo)object).zzg();
                    Object object2 = "Discarding data. Failed to send event to service to bundle";
                    ((zzgq)object).zza((String)object2);
                    object = this.zzd.zzs();
                    object2 = this.zzc;
                    ((zzpn)object).zza((zzdq)object2, (byte[])null);
                    return;
                }
                Object object3 = this.zza;
                String string2 = this.zzb;
                byArray = object.zza((zzbl)object3, string2);
                object = this.zzd;
                zzme.zzg((zzme)object);
                object = this.zzd.zzs();
                object3 = this.zzc;
                ((zzpn)object).zza((zzdq)object3, byArray);
                return;
            }
            catch (Throwable throwable2) {
                break block6;
            }
            catch (RemoteException remoteException) {}
            {
                Object object = this.zzd;
                object = ((zzme)object).zzj();
                object = ((zzgo)object).zzg();
                String string3 = "Failed to send event to the service to bundle";
                ((zzgq)object).zza(string3, (Object)remoteException);
                zzpn zzpn2 = this.zzd.zzs();
                object = this.zzc;
                zzpn2.zza((zzdq)object, byArray);
                return;
            }
        }
        zzpn zzpn3 = this.zzd.zzs();
        zzdq zzdq2 = this.zzc;
        zzpn3.zza(zzdq2, byArray);
        throw throwable2;
    }
}

