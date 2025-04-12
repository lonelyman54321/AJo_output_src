/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzfti;
import com.google.android.gms.internal.ads.zzftk;

public final class zzftj {
    final /* synthetic */ zzftk zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    public /* synthetic */ zzftj(zzftk zzftk2, byte[] byArray, zzfti zzfti2) {
        this.zza = zzftk2;
        this.zzb = byArray;
    }

    public final zzftj zza(int n3) {
        this.zzd = n3;
        return this;
    }

    public final zzftj zzb(int n3) {
        this.zzc = n3;
        return this;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                try {
                    Object object = this.zza;
                    int n3 = ((zzftk)object).zzb;
                    if (n3 != 0) {
                        object = ((zzftk)object).zza;
                        byte[] byArray = this.zzb;
                        object.zzj(byArray);
                        object = this.zza;
                        object = ((zzftk)object).zza;
                        n3 = this.zzc;
                        object.zzi(n3);
                        object = this.zza;
                        object = ((zzftk)object).zza;
                        n3 = this.zzd;
                        object.zzg(n3);
                        object = this.zza;
                        object = ((zzftk)object).zza;
                        n3 = 0;
                        byArray = null;
                        object.zzh(null);
                        object = this.zza;
                        object = ((zzftk)object).zza;
                        object.zzf();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                catch (RemoteException remoteException) {
                    return;
                }
                return;
            }
            throw throwable2;
        }
    }
}

