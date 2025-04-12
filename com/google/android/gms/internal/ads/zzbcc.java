/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzfe;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcd;
import com.google.android.gms.internal.ads.zzbcg;

public final class zzbcc
extends AppOpenAd {
    FullScreenContentCallback zza;
    private final zzbcg zzb;
    private final String zzc;
    private final zzbcd zzd;
    private OnPaidEventListener zze;

    public zzbcc(zzbcg zzbcg2, String string2) {
        zzbcd zzbcd2;
        this.zzd = zzbcd2 = new zzbcd();
        this.zzb = zzbcg2;
        this.zzc = string2;
    }

    public final String getAdUnitId() {
        return this.zzc;
    }

    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zza;
    }

    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zze;
    }

    public final ResponseInfo getResponseInfo() {
        Object object = this.zzb;
        try {
            object = object.zzf();
        }
        catch (RemoteException remoteException) {
            String string2 = "#007 Could not call remote method.";
            zzm.zzl(string2, remoteException);
            object = null;
        }
        return ResponseInfo.zzb((zzdn)object);
    }

    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.zza = fullScreenContentCallback;
        this.zzd.zzg(fullScreenContentCallback);
    }

    public final void setImmersiveMode(boolean bl2) {
        zzbcg zzbcg2;
        try {
            zzbcg2 = this.zzb;
        }
        catch (RemoteException remoteException) {
            zzm.zzl("#007 Could not call remote method.", remoteException);
            return;
        }
        zzbcg2.zzg(bl2);
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        zzbcg zzbcg2;
        this.zze = onPaidEventListener;
        try {
            zzbcg2 = this.zzb;
        }
        catch (RemoteException remoteException) {
            zzm.zzl("#007 Could not call remote method.", remoteException);
            return;
        }
        zzfe zzfe2 = new zzfe(onPaidEventListener);
        zzbcg2.zzh(zzfe2);
    }

    public final void show(Activity object) {
        zzbcg zzbcg2;
        try {
            zzbcg2 = this.zzb;
        }
        catch (RemoteException remoteException) {
            zzm.zzl("#007 Could not call remote method.", remoteException);
            return;
        }
        object = ObjectWrapper.wrap(object);
        zzbcd zzbcd2 = this.zzd;
        zzbcg2.zzi((IObjectWrapper)object, zzbcd2);
    }
}

