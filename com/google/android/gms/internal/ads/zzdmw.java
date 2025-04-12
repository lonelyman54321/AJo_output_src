/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbjp;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzdmx;
import java.util.Map;

public final class zzdmw
implements zzblp {
    public final /* synthetic */ zzdmx zza;
    public final /* synthetic */ zzbjp zzb;

    public /* synthetic */ zzdmw(zzdmx zzdmx2, zzbjp zzbjp2) {
        this.zza = zzdmx2;
        this.zzb = zzbjp2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(Object object, Map map2) {
        String string2;
        object = this.zza;
        Object object2 = "timestamp";
        try {
            object2 = map2.get(object2);
            long l2 = Long.parseLong((String)object2);
            ((zzdmx)object).zzb = object2 = Long.valueOf(l2);
        }
        catch (NumberFormatException numberFormatException) {
            object2 = "Failed to call parse unconfirmedClickTimestamp.";
            zzm.zzg((String)object2);
        }
        object2 = this.zzb;
        ((zzdmx)object).zza = string2 = (String)map2.get("id");
        object = (String)map2.get("asset_id");
        if (object2 == null) {
            zzm.zze("Received unconfirmed click but UnconfirmedClickListener is null.");
            return;
        }
        try {
            object2.zzf((String)object);
            return;
        }
        catch (RemoteException remoteException) {
            zzm.zzl("#007 Could not call remote method.", remoteException);
            return;
        }
    }
}

