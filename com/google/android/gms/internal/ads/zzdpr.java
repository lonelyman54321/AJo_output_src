/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzdpt;

public final class zzdpr
implements Runnable {
    public final /* synthetic */ zzdpt zza;

    public /* synthetic */ zzdpr(zzdpt zzdpt2) {
        this.zza = zzdpt2;
    }

    public final void run() {
        zzdpt zzdpt2 = this.zza;
        try {
            zzdpt2.zzd();
            return;
        }
        catch (RemoteException remoteException) {
            zzm.zzl("#007 Could not call remote method.", remoteException);
            return;
        }
    }
}

