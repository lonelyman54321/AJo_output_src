/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd$AppOpenAdLoadCallback;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbcb;
import com.google.android.gms.internal.ads.zzbcj;
import com.google.android.gms.internal.ads.zzbrb;

public final class zzbco {
    private zzbu zza;
    private final Context zzb;
    private final String zzc;
    private final zzdx zzd;
    private final int zze;
    private final AppOpenAd$AppOpenAdLoadCallback zzf;
    private final zzbrb zzg;
    private final zzp zzh;

    public zzbco(Context object, String string2, zzdx zzdx2, int n3, AppOpenAd$AppOpenAdLoadCallback appOpenAd$AppOpenAdLoadCallback) {
        zzbrb zzbrb2;
        this.zzg = zzbrb2 = new zzbrb();
        this.zzb = object;
        this.zzc = string2;
        this.zzd = zzdx2;
        this.zze = n3;
        this.zzf = appOpenAd$AppOpenAdLoadCallback;
        object = zzp.zza;
        this.zzh = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        RemoteException remoteException2;
        block4: {
            block2: {
                Object object;
                Object object2;
                Object object3;
                Object object4;
                block3: {
                    try {
                        object4 = zzq.zzb();
                        object3 = zzay.zza();
                        object2 = this.zzb;
                        object = this.zzc;
                        zzbrb zzbrb2 = this.zzg;
                        this.zza = object4 = ((zzaw)object3).zzd((Context)object2, (zzq)object4, (String)object, zzbrb2);
                        if (object4 == null) break block2;
                        int n3 = this.zze;
                        int n4 = 3;
                        if (n3 == n4) break block3;
                        n4 = this.zze;
                        object4 = new zzw(n4);
                        object3 = this.zza;
                        object3.zzI((zzw)object4);
                    }
                    catch (RemoteException remoteException2) {
                        break block4;
                    }
                }
                object4 = this.zza;
                object2 = this.zzf;
                object = this.zzc;
                object3 = new zzbcb((AppOpenAd$AppOpenAdLoadCallback)object2, (String)object);
                object4.zzH((zzbcj)object3);
                object4 = this.zza;
                object3 = this.zzh;
                object2 = this.zzb;
                object = this.zzd;
                object3 = ((zzp)object3).zza((Context)object2, (zzdx)object);
                object4.zzab((zzl)object3);
            }
            return;
        }
        zzm.zzl("#007 Could not call remote method.", remoteException2);
    }
}

