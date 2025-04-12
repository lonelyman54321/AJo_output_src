/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.internal.ads.zzbyx;

public final class zzbzk
implements RewardItem {
    private final zzbyx zza;

    public zzbzk(zzbyx zzbyx2) {
        this.zza = zzbyx2;
    }

    public final int getAmount() {
        zzbyx zzbyx2 = this.zza;
        if (zzbyx2 != null) {
            try {
                return zzbyx2.zze();
            }
            catch (RemoteException remoteException) {
                String string2 = "Could not forward getAmount to RewardItem";
                zzm.zzk(string2, remoteException);
            }
        }
        return 0;
    }

    public final String getType() {
        zzbyx zzbyx2 = this.zza;
        if (zzbyx2 != null) {
            try {
                return zzbyx2.zzf();
            }
            catch (RemoteException remoteException) {
                String string2 = "Could not forward getType to RewardItem";
                zzm.zzk(string2, remoteException);
            }
        }
        return null;
    }
}

