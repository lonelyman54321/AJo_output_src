/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController$VideoLifecycleCallbacks;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzdlt;

public final class zzdrc
extends VideoController$VideoLifecycleCallbacks {
    private final zzdlt zza;

    public zzdrc(zzdlt zzdlt2) {
        this.zza = zzdlt2;
    }

    private static zzdt zza(zzdlt object) {
        if ((object = ((zzdlt)object).zzj()) == null) {
            return null;
        }
        try {
            return object.zzi();
        }
        catch (RemoteException remoteException) {
            return null;
        }
    }

    public final void onVideoEnd() {
        zzdt zzdt2 = zzdrc.zza(this.zza);
        if (zzdt2 == null) {
            return;
        }
        try {
            zzdt2.zze();
            return;
        }
        catch (RemoteException remoteException) {
            zzm.zzk("Unable to call onVideoEnd()", remoteException);
            return;
        }
    }

    public final void onVideoPause() {
        zzdt zzdt2 = zzdrc.zza(this.zza);
        if (zzdt2 == null) {
            return;
        }
        try {
            zzdt2.zzg();
            return;
        }
        catch (RemoteException remoteException) {
            zzm.zzk("Unable to call onVideoEnd()", remoteException);
            return;
        }
    }

    public final void onVideoStart() {
        zzdt zzdt2 = zzdrc.zza(this.zza);
        if (zzdt2 == null) {
            return;
        }
        try {
            zzdt2.zzi();
            return;
        }
        catch (RemoteException remoteException) {
            zzm.zzk("Unable to call onVideoEnd()", remoteException);
            return;
        }
    }
}

