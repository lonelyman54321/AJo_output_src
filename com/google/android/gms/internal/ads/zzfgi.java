/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.internal.ads.zzfgk;

final class zzfgi
implements OnAdMetadataChangedListener {
    final /* synthetic */ zzdd zza;
    final /* synthetic */ zzfgk zzb;

    public zzfgi(zzfgk zzfgk2, zzdd zzdd2) {
        this.zza = zzdd2;
        this.zzb = zzfgk2;
    }

    public final void onAdMetadataChanged() {
        Object object = zzfgk.zzr(this.zzb);
        if (object != null) {
            object = this.zza;
            try {
                object.zze();
                return;
            }
            catch (RemoteException remoteException) {
                String string2 = "#007 Could not call remote method.";
                zzm.zzl(string2, remoteException);
            }
        }
    }
}

