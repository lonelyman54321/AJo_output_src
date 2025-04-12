/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzdst;
import java.util.concurrent.ConcurrentHashMap;

public final class zzenu {
    private final ConcurrentHashMap zza;
    private final zzdst zzb;

    public zzenu(zzdst zzdst2) {
        ConcurrentHashMap concurrentHashMap;
        this.zza = concurrentHashMap = new ConcurrentHashMap();
        this.zzb = zzdst2;
    }

    public final zzbte zza(String string2) {
        ConcurrentHashMap concurrentHashMap = this.zza;
        boolean bl2 = concurrentHashMap.containsKey(string2);
        if (bl2) {
            return (zzbte)this.zza.get(string2);
        }
        return null;
    }

    public final void zzb(String string2) {
        Object object;
        try {
            object = this.zzb;
        }
        catch (RemoteException remoteException) {
            zze.zzb("Couldn't create RTB adapter : ", remoteException);
            return;
        }
        object = ((zzdst)object).zzb(string2);
        ConcurrentHashMap concurrentHashMap = this.zza;
        concurrentHashMap.put(string2, object);
    }
}

