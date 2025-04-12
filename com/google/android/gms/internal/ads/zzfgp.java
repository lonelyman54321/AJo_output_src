/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.internal.ads.zzfgq;

final class zzfgp
implements OnAdMetadataChangedListener {
    final /* synthetic */ zzby zza;
    final /* synthetic */ zzfgq zzb;

    public zzfgp(zzfgq zzfgq2, zzby zzby2) {
        this.zza = zzby2;
        this.zzb = zzfgq2;
    }

    public final void onAdMetadataChanged() {
        Object object = zzfgq.zzv(this.zzb);
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

