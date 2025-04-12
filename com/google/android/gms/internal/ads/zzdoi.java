/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzel;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbhi;
import com.google.android.gms.internal.ads.zzbho;
import com.google.android.gms.internal.ads.zzbhv;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzdlt;
import com.google.android.gms.internal.ads.zzdoj;
import com.google.android.gms.internal.ads.zzdow;
import com.google.android.gms.internal.ads.zzdpa;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class zzdoi
implements Callable {
    public final /* synthetic */ zzdoj zza;
    public final /* synthetic */ ListenableFuture zzb;
    public final /* synthetic */ ListenableFuture zzc;
    public final /* synthetic */ ListenableFuture zzd;
    public final /* synthetic */ ListenableFuture zze;
    public final /* synthetic */ ListenableFuture zzf;
    public final /* synthetic */ JSONObject zzg;
    public final /* synthetic */ ListenableFuture zzh;
    public final /* synthetic */ ListenableFuture zzi;
    public final /* synthetic */ ListenableFuture zzj;
    public final /* synthetic */ ListenableFuture zzk;

    public /* synthetic */ zzdoi(zzdoj zzdoj2, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ListenableFuture listenableFuture3, ListenableFuture listenableFuture4, ListenableFuture listenableFuture5, JSONObject jSONObject, ListenableFuture listenableFuture6, ListenableFuture listenableFuture7, ListenableFuture listenableFuture8, ListenableFuture listenableFuture9) {
        this.zza = zzdoj2;
        this.zzb = listenableFuture;
        this.zzc = listenableFuture2;
        this.zzd = listenableFuture3;
        this.zze = listenableFuture4;
        this.zzf = listenableFuture5;
        this.zzg = jSONObject;
        this.zzh = listenableFuture6;
        this.zzi = listenableFuture7;
        this.zzj = listenableFuture8;
        this.zzk = listenableFuture9;
    }

    public final Object call() {
        zzdlt zzdlt2 = (zzdlt)this.zzb.get();
        Iterator iterator = (List)this.zzc.get();
        zzdlt2.zzP((List)((Object)iterator));
        iterator = (zzbhv)this.zzd.get();
        zzdlt2.zzM((zzbhv)((Object)iterator));
        iterator = (zzbhv)this.zze.get();
        zzdlt2.zzQ((zzbhv)((Object)iterator));
        iterator = (zzbho)this.zzf.get();
        zzdlt2.zzJ((zzbho)((Object)iterator));
        iterator = this.zzg;
        Object object = zzdow.zzj((JSONObject)iterator);
        zzdlt2.zzS((List)object);
        iterator = zzdow.zzi((JSONObject)iterator);
        zzdlt2.zzL((zzel)((Object)iterator));
        iterator = (zzchd)this.zzh.get();
        if (iterator != null) {
            zzdlt2.zzad((zzchd)((Object)iterator));
            object = iterator.zzF();
            zzdlt2.zzac((View)object);
            iterator = iterator.zzq();
            zzdlt2.zzab((zzdq)((Object)iterator));
        }
        if ((iterator = (zzchd)this.zzi.get()) != null) {
            zzdlt2.zzO((zzchd)((Object)iterator));
            iterator = iterator.zzF();
            zzdlt2.zzae((View)iterator);
        }
        iterator = this.zzj;
        object = zzbep.zzfi;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            zzdlt2.zzU((ListenableFuture)((Object)iterator));
            iterator = new Iterator();
            zzdlt2.zzX((zzccn)((Object)iterator));
        } else if ((iterator = (zzchd)iterator.get()) != null) {
            zzdlt2.zzT((zzchd)((Object)iterator));
        }
        iterator = ((List)this.zzk.get()).iterator();
        while (bl2 = iterator.hasNext()) {
            object = (zzdpa)iterator.next();
            int n3 = ((zzdpa)object).zza;
            int n4 = 1;
            if (n3 != n4) {
                object2 = ((zzdpa)object).zzb;
                object = ((zzdpa)object).zzd;
                zzdlt2.zzN((String)object2, (zzbhi)object);
                continue;
            }
            object2 = ((zzdpa)object).zzb;
            object = ((zzdpa)object).zzc;
            zzdlt2.zzZ((String)object2, (String)object);
        }
        return zzdlt2;
    }
}

