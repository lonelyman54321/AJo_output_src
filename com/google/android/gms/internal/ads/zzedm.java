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
import com.google.android.gms.internal.ads.zzbxn;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzedq;
import com.google.android.gms.internal.ads.zzgfp;

final class zzedm
implements zzgfp {
    final /* synthetic */ zzbxn zza;
    final /* synthetic */ zzbxu zzb;

    public zzedm(zzedq zzedq2, zzbxn zzbxn2, zzbxu zzbxu2) {
        this.zza = zzbxn2;
        this.zzb = zzbxu2;
    }

    public final void zza(Throwable object) {
        zzbxn zzbxn2;
        try {
            zzbxn2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zze.zzb("Service can't call client", remoteException);
            return;
        }
        object = zzbb.zzb((Throwable)object);
        zzbxn2.zze((zzbb)object);
    }
}

