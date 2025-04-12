/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import com.google.android.gms.internal.ads.zzbth;
import com.google.android.gms.internal.ads.zzbtr;

final class zzbtp
implements SignalCallbacks {
    final /* synthetic */ zzbth zza;

    public zzbtp(zzbtr zzbtr2, zzbth zzbth2) {
        this.zza = zzbth2;
    }

    public final void onFailure(AdError object) {
        zzbth zzbth2;
        try {
            zzbth2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return;
        }
        object = ((AdError)object).zza();
        zzbth2.zzg((zze)object);
    }

    public final void onFailure(String string2) {
        zzbth zzbth2;
        try {
            zzbth2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return;
        }
        zzbth2.zzf(string2);
    }

    public final void onSuccess(String string2) {
        zzbth zzbth2;
        try {
            zzbth2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return;
        }
        zzbth2.zze(string2);
    }
}

