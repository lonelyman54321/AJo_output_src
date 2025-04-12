/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbnu;
import com.google.android.gms.internal.ads.zzdxf;
import java.util.List;

public final class zzdwz
implements Runnable {
    public final /* synthetic */ zzdxf zza;
    public final /* synthetic */ zzbnu zzb;

    public /* synthetic */ zzdwz(zzdxf zzdxf2, zzbnu zzbnu2) {
        this.zza = zzdxf2;
        this.zzb = zzbnu2;
    }

    public final void run() {
        Object object = this.zza;
        zzbnu zzbnu2 = this.zzb;
        try {
            object = ((zzdxf)object).zzg();
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return;
        }
        zzbnu2.zzb((List)object);
    }
}

