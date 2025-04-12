/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzdhi;

public final class zzepg
implements zza,
zzdhi {
    private zzbe zza;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onAdClicked() {
        synchronized (this) {
            try {
                zzbe zzbe2 = this.zza;
                if (zzbe2 == null) {
                    return;
                }
                try {
                    zzbe2.zzb();
                    return;
                }
                catch (RemoteException remoteException) {
                    String string2 = "Remote Exception at onAdClicked.";
                    zzm.zzk(string2, remoteException);
                    return;
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(zzbe zzbe2) {
        synchronized (this) {
            this.zza = zzbe2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzdG() {
        synchronized (this) {
            try {
                zzbe zzbe2 = this.zza;
                if (zzbe2 == null) {
                    return;
                }
                try {
                    zzbe2.zzb();
                    return;
                }
                catch (RemoteException remoteException) {
                    String string2 = "Remote Exception at onPhysicalClick.";
                    zzm.zzk(string2, remoteException);
                    return;
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zzdf() {
        // MONITORENTER : this
        // MONITOREXIT : this
    }
}

