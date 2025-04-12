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
import com.google.android.gms.internal.ads.zzbss;
import com.google.android.gms.internal.ads.zzbtr;

final class zzbtk
implements MediationAdLoadCallback {
    final /* synthetic */ zzbss zza;
    final /* synthetic */ zzbrl zzb;

    public zzbtk(zzbtr zzbtr2, zzbss zzbss2, zzbrl zzbrl2) {
        this.zza = zzbss2;
        this.zzb = zzbrl2;
    }

    public final void onFailure(AdError object) {
        zzbss zzbss2;
        try {
            zzbss2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return;
        }
        object = ((AdError)object).zza();
        zzbss2.zzf((zze)object);
    }

    public final void onFailure(String string2) {
        AdError adError = new AdError(0, string2, "undefined");
        this.onFailure(adError);
    }
}

