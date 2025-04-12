/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzepm;
import com.google.android.gms.internal.ads.zzeps;
import com.google.android.gms.internal.ads.zzept;

public final class zzepn {
    private final zzeps zza;
    private final String zzb;
    private zzdn zzc;

    public zzepn(zzeps zzeps2, String string2) {
        this.zza = zzeps2;
        this.zzb = string2;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzepn zzepn2, zzdn zzdn2) {
        zzepn2.zzc = zzdn2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zza() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                String string2 = null;
                try {
                    zzdn zzdn2 = this.zzc;
                    if (zzdn2 == null) return string2;
                    return zzdn2.zzg();
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                catch (RemoteException remoteException) {}
                String string3 = "#007 Could not call remote method.";
                {
                    zzm.zzl(string3, remoteException);
                    return null;
                }
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzb() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                String string2 = null;
                try {
                    zzdn zzdn2 = this.zzc;
                    if (zzdn2 == null) return string2;
                    return zzdn2.zzg();
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                catch (RemoteException remoteException) {}
                String string3 = "#007 Could not call remote method.";
                {
                    zzm.zzl(string3, remoteException);
                    return null;
                }
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd(zzl zzl2, int n3) {
        synchronized (this) {
            zzept zzept2 = null;
            this.zzc = null;
            zzept2 = new zzept(n3);
            zzepm zzepm2 = new zzepm(this);
            String string2 = this.zzb;
            zzeps zzeps2 = this.zza;
            zzeps2.zzb(zzl2, string2, zzept2, zzepm2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zze() {
        synchronized (this) {
            zzeps zzeps2 = this.zza;
            return zzeps2.zza();
        }
    }
}

