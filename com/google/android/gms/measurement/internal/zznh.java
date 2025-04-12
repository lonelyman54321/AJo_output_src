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
import com.google.android.gms.measurement.internal.zzme;
import com.google.android.gms.measurement.internal.zzp;
import com.google.android.gms.measurement.internal.zzpn;
import java.util.ArrayList;
import java.util.List;

final class zznh
implements Runnable {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzp zzc;
    private final /* synthetic */ zzdq zzd;
    private final /* synthetic */ zzme zze;

    public zznh(zzme zzme2, String string2, String string3, zzp zzp2, zzdq zzdq2) {
        this.zza = string2;
        this.zzb = string3;
        this.zzc = zzp2;
        this.zzd = zzdq2;
        this.zze = zzme2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Throwable throwable2;
        ArrayList arrayList;
        block6: {
            arrayList = new ArrayList();
            try {
                Object object = this.zze;
                object = zzme.zza((zzme)object);
                if (object == null) {
                    object = this.zze;
                    object = ((zzme)object).zzj();
                    object = ((zzgo)object).zzg();
                    Object object2 = "Failed to get conditional properties; not connected to service";
                    String string2 = this.zza;
                    String string3 = this.zzb;
                    ((zzgq)object).zza((String)object2, string2, string3);
                    object = this.zze.zzs();
                    object2 = this.zzd;
                    ((zzpn)object).zza((zzdq)object2, arrayList);
                    return;
                }
                Object object3 = this.zzc;
                Preconditions.checkNotNull(object3);
                object3 = this.zza;
                String string4 = this.zzb;
                zzp zzp2 = this.zzc;
                object = object.zza((String)object3, string4, zzp2);
                arrayList = zzpn.zzb((List)object);
                object = this.zze;
                zzme.zzg((zzme)object);
                object = this.zze.zzs();
                object3 = this.zzd;
                ((zzpn)object).zza((zzdq)object3, arrayList);
                return;
            }
            catch (Throwable throwable2) {
                break block6;
            }
            catch (RemoteException remoteException) {}
            {
                Object object = this.zze;
                object = ((zzme)object).zzj();
                object = ((zzgo)object).zzg();
                String string5 = "Failed to get conditional properties; remote exception";
                String string6 = this.zza;
                String string7 = this.zzb;
                ((zzgq)object).zza(string5, string6, string7, (Object)remoteException);
                zzpn zzpn2 = this.zze.zzs();
                object = this.zzd;
                zzpn2.zza((zzdq)object, arrayList);
                return;
            }
        }
        zzpn zzpn3 = this.zze.zzs();
        zzdq zzdq2 = this.zzd;
        zzpn3.zza(zzdq2, arrayList);
        throw throwable2;
    }
}

