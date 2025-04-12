/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.internal.ads.zzbnr;
import com.google.android.gms.internal.ads.zzbsg;

final class zzbrz
implements InitializationCompleteCallback {
    final /* synthetic */ zzbnr zza;

    public zzbrz(zzbsg zzbsg2, zzbnr zzbnr2) {
        this.zza = zzbnr2;
    }

    public final void onInitializationFailed(String string2) {
        zzbnr zzbnr2;
        try {
            zzbnr2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return;
        }
        zzbnr2.zze(string2);
    }

    public final void onInitializationSucceeded() {
        zzbnr zzbnr2;
        try {
            zzbnr2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return;
        }
        zzbnr2.zzf();
    }
}

