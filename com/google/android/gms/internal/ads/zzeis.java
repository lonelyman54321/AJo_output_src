/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzcun;
import com.google.android.gms.internal.ads.zzeho;
import com.google.android.gms.internal.ads.zzfhv;

public final class zzeis
implements zzcun {
    public final /* synthetic */ zzeho zza;

    public /* synthetic */ zzeis(zzeho zzeho2) {
        this.zza = zzeho2;
    }

    public final zzdq zza() {
        Object object = this.zza;
        try {
            object = ((zzeho)object).zzb;
        }
        catch (RemoteException remoteException) {
            zzfhv zzfhv2 = new zzfhv(remoteException);
            throw zzfhv2;
        }
        object = (zzbte)object;
        return object.zze();
    }
}

