/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.util.client.zzm;

public final class zzcx
implements MuteThisAdReason {
    private final String zza;
    private final zzcw zzb;

    public zzcx(zzcw object) {
        this.zzb = object;
        try {
            object = object.zze();
        }
        catch (RemoteException remoteException) {
            String string2 = "";
            zzm.zzh(string2, remoteException);
            object = null;
        }
        this.zza = object;
    }

    public final String getDescription() {
        return this.zza;
    }

    public final String toString() {
        return this.zza;
    }

    public final zzcw zza() {
        return this.zzb;
    }
}

