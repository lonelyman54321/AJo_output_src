/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzbb;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzbxk;
import com.google.android.gms.internal.ads.zzeea;
import com.google.android.gms.internal.ads.zzgfp;

final class zzedz
implements zzgfp {
    final /* synthetic */ zzbxk zza;

    public zzedz(zzeea zzeea2, zzbxk zzbxk2) {
        this.zza = zzbxk2;
    }

    public final void zza(Throwable object) {
        zzbxk zzbxk2;
        try {
            zzbxk2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zze.zzb("Ad service can't call client", remoteException);
            return;
        }
        object = zzbb.zzb((Throwable)object);
        zzbxk2.zze((zzbb)object);
    }
}

