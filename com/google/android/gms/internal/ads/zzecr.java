/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbpy;
import com.google.android.gms.internal.ads.zzbpz;
import com.google.android.gms.internal.ads.zzbqa;
import com.google.android.gms.internal.ads.zzbqe;
import com.google.android.gms.internal.ads.zzbqh;
import com.google.android.gms.internal.ads.zzbwz;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzbxx;
import com.google.android.gms.internal.ads.zzdce;
import com.google.android.gms.internal.ads.zzebz;
import com.google.android.gms.internal.ads.zzecm;
import com.google.android.gms.internal.ads.zzecn;
import com.google.android.gms.internal.ads.zzeco;
import com.google.android.gms.internal.ads.zzecp;
import com.google.android.gms.internal.ads.zzecq;
import com.google.android.gms.internal.ads.zzedp;
import com.google.android.gms.internal.ads.zzeec;
import com.google.android.gms.internal.ads.zzeeg;
import com.google.android.gms.internal.ads.zzeeh;
import com.google.android.gms.internal.ads.zzfhc;
import com.google.android.gms.internal.ads.zzfhe;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfkw;
import com.google.android.gms.internal.ads.zzflk;
import com.google.android.gms.internal.ads.zzfll;
import com.google.android.gms.internal.ads.zzfln;
import com.google.android.gms.internal.ads.zzflt;
import com.google.android.gms.internal.ads.zzfmb;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfmn;
import com.google.android.gms.internal.ads.zzfmq;
import com.google.android.gms.internal.ads.zzfmu;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class zzecr {
    public ListenableFuture zza;
    private final zzdce zzb;
    private final zzebz zzc;
    private final zzflt zzd;
    private final zzfho zze;
    private final VersionInfoParcel zzf;
    private final zzfmq zzg;
    private final zzfmn zzh;
    private final Context zzi;
    private final zzgge zzj;

    public zzecr(zzdce zzdce2, zzebz zzebz2, zzflt zzflt2, zzfho zzfho2, VersionInfoParcel versionInfoParcel, zzfmq zzfmq2, zzfmn zzfmn2, Context context, zzgge zzgge2) {
        this.zzb = zzdce2;
        this.zzc = zzebz2;
        this.zzd = zzflt2;
        this.zze = zzfho2;
        this.zzf = versionInfoParcel;
        this.zzg = zzfmq2;
        this.zzh = zzfmn2;
        this.zzi = context;
        this.zzj = zzgge2;
    }

    public static /* bridge */ /* synthetic */ zzdce zzb(zzecr zzecr2) {
        return zzecr2.zzb;
    }

    public final /* synthetic */ zzbwz zza(zzbxu zzbxu2, zzeec zzeec2) {
        Object object;
        boolean bl2;
        Object object2 = zzeec2.zzc;
        Object object3 = zzeec2.zze;
        object2.put("Content-Type", object3);
        object2 = zzu.zzp();
        Iterator<Map.Entry<String, Object>> iterator = zzbxu2.zzb.afmaVersion;
        object3 = this.zzi;
        object2 = ((zzt)object2).zzc((Context)object3, (String)((Object)iterator));
        iterator = zzeec2.zzc;
        object3 = "User-Agent";
        iterator.put(object3, object2);
        Bundle bundle = new Bundle();
        iterator = zzeec2.zzc.entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            object3 = iterator.next();
            object = (String)object3.getKey();
            object3 = (String)object3.getValue();
            bundle.putString((String)object, (String)object3);
        }
        int n3 = zzeec2.zzb;
        String string2 = zzeec2.zza;
        byte[] byArray = zzeec2.zzd;
        boolean bl3 = zzeec2.zzf;
        String string3 = zzbxu2.zzd;
        String string4 = zzbxu2.zzh;
        object = object2;
        object2 = new zzbwz(string2, n3, bundle, byArray, bl3, string3, string4);
        return object2;
    }

    public final ListenableFuture zzc(zzbxu object, JSONObject object2, zzbxx object3) {
        this.zzb.zzdn((zzbxu)object);
        Object object4 = this.zzi;
        Object object5 = zzfmu.zzp;
        object4 = zzfmb.zza((Context)object4, (zzfmu)object5);
        Object object6 = ((zzbxu)object).zzg;
        Object object7 = this.zzh;
        object5 = new zzeeh((String)object6, (zzfmn)object7, (zzfmc)object4);
        object4 = zzfln.zzh;
        object6 = new zzeeg((JSONObject)object2, (zzbxx)object3);
        object6 = zzgft.zzh(object6);
        object4 = this.zzd.zzb(object4, (ListenableFuture)object6).zze((zzfkw)object5).zza();
        object5 = new zzecn(this, (zzbxu)object);
        object6 = this.zzj;
        object4 = zzgft.zzm((ListenableFuture)object4, (zzfxu)object5, (Executor)object6);
        object5 = this.zzd;
        object6 = zzfln.zzj;
        object4 = ((zzfll)object5).zzb(object6, (ListenableFuture)object4);
        object5 = this.zzc;
        Objects.requireNonNull(object5);
        object6 = new zzeco((zzebz)object5);
        this.zza = object4 = ((zzflk)object4).zzf((zzgfa)object6).zza();
        object5 = zzu.zzf();
        object6 = this.zzi;
        object7 = this.zzf;
        zzfmq zzfmq2 = this.zzg;
        object5 = ((zzbpy)object5).zza((Context)object6, (VersionInfoParcel)object7, zzfmq2);
        object6 = zzedp.zza;
        object7 = zzbqe.zzb;
        object5 = ((zzbqh)object5).zza("google.afma.response.normalize", (zzbqa)object6, (zzbpz)object7);
        object6 = this.zzd;
        object7 = zzfln.zzk;
        object4 = ((zzfll)object6).zzb(object7, (ListenableFuture)object4);
        object6 = new zzecm((JSONObject)object2, (zzbxx)object3);
        object2 = ((zzflk)object4).zze((zzfkw)object6).zzf((zzgfa)object5).zza();
        object3 = new zzecp(this, (zzbxu)object);
        object = this.zzj;
        object = zzgft.zzn((ListenableFuture)object2, (zzgfa)object3, (Executor)object);
        object2 = new zzecq(this);
        object3 = this.zzj;
        zzgft.zzr((ListenableFuture)object, (zzgfp)object2, (Executor)object3);
        return object;
    }

    public final /* synthetic */ ListenableFuture zzd(zzbxu object, InputStream inputStream) {
        Object object2 = this.zze;
        zzfhc zzfhc2 = new zzfhc((zzfho)object2);
        object2 = new InputStreamReader(inputStream);
        object = zzfhe.zza((Reader)object2, (zzbxu)object);
        zzfhf zzfhf2 = new zzfhf(zzfhc2, (zzfhe)object);
        return zzgft.zzh(zzfhf2);
    }
}

