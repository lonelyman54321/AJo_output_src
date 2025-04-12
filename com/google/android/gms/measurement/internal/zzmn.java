/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.RemoteException
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdq;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzme;
import com.google.android.gms.measurement.internal.zzp;
import com.google.android.gms.measurement.internal.zzpn;
import java.util.List;

final class zzmn
implements Runnable {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzp zzc;
    private final /* synthetic */ boolean zzd;
    private final /* synthetic */ zzdq zze;
    private final /* synthetic */ zzme zzf;

    public zzmn(zzme zzme2, String string2, String string3, zzp zzp2, boolean bl2, zzdq zzdq2) {
        this.zza = string2;
        this.zzb = string3;
        this.zzc = zzp2;
        this.zzd = bl2;
        this.zze = zzdq2;
        this.zzf = zzme2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Throwable throwable2;
        Bundle bundle;
        block6: {
            bundle = new Bundle();
            try {
                Object object = this.zzf;
                object = zzme.zza((zzme)object);
                if (object == null) {
                    object = this.zzf;
                    object = ((zzme)object).zzj();
                    object = ((zzgo)object).zzg();
                    Object object2 = "Failed to get user properties; not connected to service";
                    String string2 = this.zza;
                    String string3 = this.zzb;
                    ((zzgq)object).zza((String)object2, string2, string3);
                    object = this.zzf.zzs();
                    object2 = this.zze;
                    ((zzpn)object).zza((zzdq)object2, bundle);
                    return;
                }
                Object object3 = this.zzc;
                Preconditions.checkNotNull(object3);
                object3 = this.zza;
                String string4 = this.zzb;
                boolean bl2 = this.zzd;
                zzp zzp2 = this.zzc;
                object = object.zza((String)object3, string4, bl2, zzp2);
                bundle = zzpn.zza((List)object);
                object = this.zzf;
                zzme.zzg((zzme)object);
                object = this.zzf.zzs();
                object3 = this.zze;
                ((zzpn)object).zza((zzdq)object3, bundle);
                return;
            }
            catch (Throwable throwable2) {
                break block6;
            }
            catch (RemoteException remoteException) {}
            {
                Object object = this.zzf;
                object = ((zzme)object).zzj();
                object = ((zzgo)object).zzg();
                String string5 = "Failed to get user properties; remote exception";
                String string6 = this.zza;
                ((zzgq)object).zza(string5, string6, (Object)remoteException);
                zzpn zzpn2 = this.zzf.zzs();
                object = this.zze;
                zzpn2.zza((zzdq)object, bundle);
                return;
            }
        }
        zzpn zzpn3 = this.zzf.zzs();
        zzdq zzdq2 = this.zze;
        zzpn3.zza(zzdq2, bundle);
        throw throwable2;
    }
}

