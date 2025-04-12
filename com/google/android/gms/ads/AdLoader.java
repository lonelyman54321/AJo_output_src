/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.RemoteException
 */
package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.zza;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbgi;

public class AdLoader {
    private final zzp zza;
    private final Context zzb;
    private final zzbn zzc;

    public AdLoader(Context context, zzbn zzbn2, zzp zzp2) {
        this.zzb = context;
        this.zzc = zzbn2;
        this.zza = zzp2;
    }

    private final void zzb(zzdx object) {
        Object object2;
        zzbep.zza(this.zzb);
        Object object3 = (Boolean)zzbgi.zzc.zze();
        boolean bl2 = (Boolean)object3;
        if (bl2) {
            object3 = zzbep.zzlg;
            object2 = zzba.zzc();
            object3 = (Boolean)((zzben)object2).zza((zzbeg)object3);
            bl2 = (Boolean)object3;
            if (bl2) {
                object3 = com.google.android.gms.ads.internal.util.client.zzb.zzb;
                object2 = new zza(this, (zzdx)object);
                object3.execute((Runnable)object2);
                return;
            }
        }
        try {
            object3 = this.zzc;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("Failed to load ad.", remoteException);
            return;
        }
        object2 = this.zza;
        Context context = this.zzb;
        object = ((zzp)object2).zza(context, (zzdx)object);
        object3.zzg((zzl)object);
    }

    public boolean isLoading() {
        zzbn zzbn2;
        try {
            zzbn2 = this.zzc;
        }
        catch (RemoteException remoteException) {
            zzm.zzk("Failed to check if ad is loading.", remoteException);
            return false;
        }
        return zzbn2.zzi();
    }

    public void loadAd(AdRequest object) {
        object = ((AdRequest)object).zza;
        this.zzb((zzdx)object);
    }

    public void loadAd(AdManagerAdRequest object) {
        object = ((AdRequest)object).zza;
        this.zzb((zzdx)object);
    }

    public void loadAds(AdRequest object, int n3) {
        zzbn zzbn2;
        object = ((AdRequest)object).zza;
        try {
            zzbn2 = this.zzc;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("Failed to load ads.", remoteException);
            return;
        }
        zzp zzp2 = this.zza;
        Context context = this.zzb;
        object = zzp2.zza(context, (zzdx)object);
        zzbn2.zzh((zzl)object, n3);
    }

    public final /* synthetic */ void zza(zzdx object) {
        zzbn zzbn2;
        try {
            zzbn2 = this.zzc;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("Failed to load ad.", remoteException);
            return;
        }
        zzp zzp2 = this.zza;
        Context context = this.zzb;
        object = zzp2.zza(context, (zzdx)object);
        zzbn2.zzg((zzl)object);
    }
}

