/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaj;
import com.google.android.gms.internal.ads.zzbvv;
import com.google.android.gms.internal.ads.zzgfp;

final class zzah
implements zzgfp {
    final /* synthetic */ zzbvv zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzaj zzc;

    public zzah(zzaj zzaj2, zzbvv zzbvv2, boolean bl2) {
        this.zza = zzbvv2;
        this.zzb = bl2;
        this.zzc = zzaj2;
    }

    public final void zza(Throwable object) {
        zzbvv zzbvv2;
        String string2 = "Internal error: ";
        try {
            zzbvv2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return;
        }
        object = ((Throwable)object).getMessage();
        StringBuilder stringBuilder = new StringBuilder(string2);
        stringBuilder.append((String)object);
        object = stringBuilder.toString();
        zzbvv2.zze((String)object);
    }
}

