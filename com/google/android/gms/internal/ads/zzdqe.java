/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbip;
import com.google.android.gms.internal.ads.zzbiz;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzdlt;
import com.google.android.gms.internal.ads.zzdme;
import com.google.android.gms.internal.ads.zzdqs;
import com.google.android.gms.internal.ads.zzhkj;
import java.util.Map;

public final class zzdqe
implements zzblp {
    private final zzbiz zza;
    private final zzdqs zzb;
    private final zzhkj zzc;

    public zzdqe(zzdme object, zzdlt object2, zzdqs zzdqs2, zzhkj zzhkj2) {
        object2 = ((zzdlt)object2).zzA();
        this.zza = object = ((zzdme)object).zzc((String)object2);
        this.zzb = zzdqs2;
        this.zzc = zzhkj2;
    }

    public final void zza(Object object, Map object2) {
        Object object3;
        object = (String)object2.get("asset");
        try {
            object2 = this.zza;
        }
        catch (RemoteException remoteException) {
            object3 = new StringBuilder("Failed to call onCustomClick for asset ");
            ((StringBuilder)object3).append((String)object);
            ((StringBuilder)object3).append(".");
            zzm.zzk(((StringBuilder)object3).toString(), remoteException);
            return;
        }
        object3 = this.zzc;
        object3 = object3.zzb();
        object3 = (zzbip)object3;
        object2.zze((zzbip)object3, (String)object);
    }

    public final void zzb() {
        zzbiz zzbiz2 = this.zza;
        if (zzbiz2 == null) {
            return;
        }
        this.zzb.zzl("/nativeAdCustomClick", this);
    }
}

