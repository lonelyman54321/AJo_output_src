/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbdr;
import com.google.android.gms.internal.ads.zzbds;
import com.google.android.gms.internal.ads.zzbdu;

public final class zzbdt {
    final /* synthetic */ zzbdu zza;
    private final byte[] zzb;
    private int zzc;

    public /* synthetic */ zzbdt(zzbdu zzbdu2, byte[] byArray, zzbds zzbds2) {
        this.zza = zzbdu2;
        this.zzb = byArray;
    }

    public static /* synthetic */ void zzb(zzbdt zzbdt2) {
        zzbdt2.zzd();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzd() {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                RemoteException remoteException2;
                block6: {
                    try {
                        Object object = this.zza;
                        int n3 = ((zzbdu)object).zzb;
                        if (n3 != 0) {
                            object = ((zzbdu)object).zza;
                            byte[] byArray = this.zzb;
                            object.zzj(byArray);
                            object = this.zza;
                            object = ((zzbdu)object).zza;
                            n3 = 0;
                            byArray = null;
                            object.zzi(0);
                            object = this.zza;
                            object = ((zzbdu)object).zza;
                            n3 = this.zzc;
                            object.zzg(n3);
                            object = this.zza;
                            object = ((zzbdu)object).zza;
                            n3 = 0;
                            byArray = null;
                            object.zzh(null);
                            object = this.zza;
                            object = ((zzbdu)object).zza;
                            object.zzf();
                            return;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    catch (RemoteException remoteException2) {
                        break block6;
                    }
                    return;
                }
                String string2 = "Clearcut log failed";
                {
                    zzm.zzf(string2, remoteException2);
                    return;
                }
            }
            throw throwable2;
        }
    }

    public final zzbdt zza(int n3) {
        this.zzc = n3;
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc() {
        synchronized (this) {
            Object object = this.zza;
            object = zzbdu.zza((zzbdu)object);
            zzbdr zzbdr2 = new zzbdr(this);
            object.execute(zzbdr2);
            return;
        }
    }
}

