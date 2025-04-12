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
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.internal.ads.zzbrl;
import com.google.android.gms.internal.ads.zzbsp;
import com.google.android.gms.internal.ads.zzbtr;

final class zzbto
implements MediationAdLoadCallback {
    final /* synthetic */ zzbsp zza;
    final /* synthetic */ zzbrl zzb;
    final /* synthetic */ zzbtr zzc;

    public zzbto(zzbtr zzbtr2, zzbsp zzbsp2, zzbrl zzbrl2) {
        this.zza = zzbsp2;
        this.zzb = zzbrl2;
        this.zzc = zzbtr2;
    }

    public final void onFailure(AdError object) {
        zzbsp zzbsp2;
        try {
            zzbsp2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return;
        }
        object = ((AdError)object).zza();
        zzbsp2.zzf((zze)object);
    }

    public final void onFailure(String string2) {
        AdError adError = new AdError(0, string2, "undefined");
        this.onFailure(adError);
    }
}

