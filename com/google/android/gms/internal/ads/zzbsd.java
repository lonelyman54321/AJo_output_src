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
import com.google.android.gms.internal.ads.zzbsg;

final class zzbsd
implements MediationAdLoadCallback {
    final /* synthetic */ zzbrl zza;
    final /* synthetic */ zzbsg zzb;

    public zzbsd(zzbsg zzbsg2, zzbrl zzbrl2) {
        this.zza = zzbrl2;
        this.zzb = zzbsg2;
    }

    public final void onFailure(AdError adError) {
        Object object;
        try {
            object = this.zzb;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return;
        }
        object = zzbsg.zzb((zzbsg)object);
        object = object.getClass();
        object = ((Class)object).getCanonicalName();
        int n3 = adError.getCode();
        String string2 = adError.getMessage();
        String string3 = adError.getDomain();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object);
        object = "failed to load mediation ad: ErrorCode = ";
        stringBuilder.append((String)object);
        stringBuilder.append(n3);
        object = ". ErrorMessage = ";
        stringBuilder.append((String)object);
        stringBuilder.append(string2);
        object = ". ErrorDomain = ";
        stringBuilder.append((String)object);
        stringBuilder.append(string3);
        object = stringBuilder.toString();
        zzm.zze((String)object);
        object = this.zza;
        zze zze2 = adError.zza();
        object.zzh(zze2);
        object = this.zza;
        n3 = adError.getCode();
        string2 = adError.getMessage();
        object.zzi(n3, string2);
        object = this.zza;
        int n4 = adError.getCode();
        object.zzg(n4);
    }

    public final void onFailure(String string2) {
        AdError adError = new AdError(0, string2, "undefined");
        this.onFailure(adError);
    }
}

