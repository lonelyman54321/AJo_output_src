/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdq;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzha;
import com.google.android.gms.measurement.internal.zzhh;
import com.google.android.gms.measurement.internal.zzjj;
import com.google.android.gms.measurement.internal.zzju;
import com.google.android.gms.measurement.internal.zzme;
import com.google.android.gms.measurement.internal.zzp;
import com.google.android.gms.measurement.internal.zzpn;

final class zzmv
implements Runnable {
    private final /* synthetic */ zzp zza;
    private final /* synthetic */ zzdq zzb;
    private final /* synthetic */ zzme zzc;

    public zzmv(zzme zzme2, zzp zzp2, zzdq zzdq2) {
        this.zza = zzp2;
        this.zzb = zzdq2;
        this.zzc = zzme2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Throwable throwable2;
        Object object;
        String string2;
        block9: {
            Object object2 = "Failed to get app instance id";
            string2 = null;
            try {
                object = this.zzc;
                object = ((zzme)object).zzk();
                object = ((zzha)object).zzp();
                boolean bl2 = ((zzjj)object).zzh();
                if (!bl2) {
                    object = this.zzc;
                    object = ((zzme)object).zzj();
                    object = ((zzgo)object).zzw();
                    String string3 = "Analytics storage consent denied; will not get app instance id";
                    ((zzgq)object).zza(string3);
                    object = this.zzc;
                    object = ((zzme)object).zzm();
                    ((zzju)object).zzb((String)null);
                    object = this.zzc;
                    object = ((zzme)object).zzk();
                    object = ((zzha)object).zze;
                    ((zzhh)object).zza(null);
                    object2 = this.zzc.zzs();
                    object = this.zzb;
                    ((zzpn)object2).zza((zzdq)object, (String)null);
                    return;
                }
                object = this.zzc;
                if ((object = zzme.zza((zzme)object)) == null) {
                    object = this.zzc;
                    object = ((zzme)object).zzj();
                    object = ((zzgo)object).zzg();
                    ((zzgq)object).zza((String)object2);
                    object2 = this.zzc.zzs();
                    object = this.zzb;
                    ((zzpn)object2).zza((zzdq)object, (String)null);
                    return;
                }
                zzp zzp2 = this.zza;
                Preconditions.checkNotNull(zzp2);
                zzp2 = this.zza;
                string2 = object.zzb(zzp2);
                if (string2 != null) {
                    object = this.zzc;
                    object = ((zzme)object).zzm();
                    ((zzju)object).zzb(string2);
                    object = this.zzc;
                    object = ((zzme)object).zzk();
                    object = ((zzha)object).zze;
                    ((zzhh)object).zza(string2);
                }
                object = this.zzc;
                zzme.zzg((zzme)object);
                object2 = this.zzc.zzs();
                object = this.zzb;
                ((zzpn)object2).zza((zzdq)object, string2);
                return;
            }
            catch (Throwable throwable2) {
                break block9;
            }
            catch (RemoteException remoteException) {}
            {
                Object object3 = this.zzc;
                object3 = ((zzme)object3).zzj();
                object3 = ((zzgo)object3).zzg();
                ((zzgq)object3).zza((String)object2, (Object)remoteException);
                object2 = this.zzc.zzs();
                zzdq zzdq2 = this.zzb;
                ((zzpn)object2).zza(zzdq2, string2);
                return;
            }
        }
        object = this.zzc.zzs();
        zzdq zzdq3 = this.zzb;
        ((zzpn)object).zza(zzdq3, string2);
        throw throwable2;
    }
}

