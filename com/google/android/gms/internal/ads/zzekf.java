/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbpw;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzcvf;
import com.google.android.gms.internal.ads.zzdkd;
import com.google.android.gms.internal.ads.zzdks;
import com.google.android.gms.internal.ads.zzdlo;
import com.google.android.gms.internal.ads.zzdlt;
import com.google.android.gms.internal.ads.zzdlu;
import com.google.android.gms.internal.ads.zzdlw;
import com.google.android.gms.internal.ads.zzdmf;
import com.google.android.gms.internal.ads.zzdoj;
import com.google.android.gms.internal.ads.zzdpn;
import com.google.android.gms.internal.ads.zzdqs;
import com.google.android.gms.internal.ads.zzdqx;
import com.google.android.gms.internal.ads.zzdqy;
import com.google.android.gms.internal.ads.zzdzd;
import com.google.android.gms.internal.ads.zzejz;
import com.google.android.gms.internal.ads.zzeka;
import com.google.android.gms.internal.ads.zzekb;
import com.google.android.gms.internal.ads.zzekc;
import com.google.android.gms.internal.ads.zzekd;
import com.google.android.gms.internal.ads.zzeke;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgy;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfin;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgfs;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzekf
implements zzejz {
    private final zzdkd zza;
    private final zzgge zzb;
    private final zzdoj zzc;
    private final zzfin zzd;
    private final zzdqy zze;

    public zzekf(zzdkd zzdkd2, zzgge zzgge2, zzdoj zzdoj2, zzfin zzfin2, zzdqy zzdqy2) {
        this.zza = zzdkd2;
        this.zzb = zzgge2;
        this.zzc = zzdoj2;
        this.zzd = zzfin2;
        this.zze = zzdqy2;
    }

    private final ListenableFuture zzg(zzfhf object, zzfgt zzfgt2, JSONObject jSONObject) {
        Object object2 = this.zzc;
        ListenableFuture listenableFuture = this.zzd.zza();
        ListenableFuture listenableFuture2 = ((zzdoj)object2).zza((zzfhf)object, zzfgt2, jSONObject);
        object2 = new ListenableFuture[]{listenableFuture, listenableFuture2};
        object2 = zzgft.zzc((ListenableFuture[])object2);
        zzeka zzeka2 = new zzeka(this, listenableFuture2, listenableFuture, (zzfhf)object, zzfgt2, jSONObject);
        object = this.zzb;
        return ((zzgfs)object2).zza(zzeka2, (Executor)object);
    }

    public final ListenableFuture zza(zzfhf object, zzfgt zzfgt2) {
        ListenableFuture listenableFuture = this.zzd.zza();
        zzgfa zzgfa2 = new zzekc(this, zzfgt2);
        zzgge zzgge2 = this.zzb;
        listenableFuture = zzgft.zzn(listenableFuture, zzgfa2, zzgge2);
        zzgfa2 = new zzekd(this, (zzfhf)object, zzfgt2);
        object = this.zzb;
        return zzgft.zzn(listenableFuture, zzgfa2, (Executor)object);
    }

    public final boolean zzb(zzfhf object, zzfgt zzfgt2) {
        object = zzfgt2.zzt;
        return object != null && (object = ((zzfgy)object).zzc) != null;
    }

    public final /* synthetic */ zzdlo zzc(ListenableFuture object, ListenableFuture object2, zzfhf object3, zzfgt object4, JSONObject jSONObject) {
        object = (zzdlt)object.get();
        object2 = (zzdqs)object2.get();
        zzcvf zzcvf2 = new zzcvf((zzfhf)object3, (zzfgt)object4, null);
        object3 = new zzdmf((zzdlt)object);
        object4 = new zzdks(jSONObject, (zzdqs)object2);
        object3 = this.zza.zzd(zzcvf2, (zzdmf)object3, (zzdks)object4);
        ((zzdlu)object3).zzh().zzb();
        ((zzdlu)object3).zzi().zza((zzdqs)object2);
        object2 = ((zzdlu)object3).zzg();
        object4 = ((zzdlt)object).zzs();
        ((zzdpn)object2).zza((zzchd)object4);
        object2 = ((zzdlu)object3).zzl();
        object = ((zzdlt)object).zzq();
        object4 = this.zze;
        ((zzdqx)object2).zza((zzdqy)object4, (zzchd)object);
        return ((zzdlw)object3).zza();
    }

    public final /* synthetic */ ListenableFuture zzd(zzdqs object, JSONObject jSONObject) {
        zzfin zzfin2 = this.zzd;
        object = zzgft.zzh(object);
        zzfin2.zzb((ListenableFuture)object);
        object = "success";
        boolean bl2 = jSONObject.optBoolean((String)object);
        if (bl2) {
            return zzgft.zzh(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        object = new zzbpw("process json failed");
        throw object;
    }

    public final /* synthetic */ ListenableFuture zze(zzfgt object, zzdqs object2) {
        Object object3 = new JSONObject();
        boolean bl2 = true;
        object3.put("isNonagon", bl2);
        Object object4 = zzbep.zziH;
        zzben zzben2 = zzba.zzc();
        object4 = (Boolean)zzben2.zza((zzbeg)object4);
        boolean bl3 = (Boolean)object4;
        if (bl3 && (bl3 = PlatformVersion.isAtLeastR())) {
            object4 = "skipDeepLinkValidation";
            object3.put((String)object4, bl2);
        }
        object4 = new JSONObject();
        object = ((zzfgt)object).zzt.zzc;
        object4.put("response", object);
        object4.put("sdk_params", object3);
        object = ((zzdqs)object2).zzg("google.afma.nativeAds.preProcessJson", (JSONObject)object4);
        object3 = new zzekb(this, (zzdqs)object2);
        object2 = this.zzb;
        return zzgft.zzn((ListenableFuture)object, (zzgfa)object3, (Executor)object2);
    }

    public final /* synthetic */ ListenableFuture zzf(zzfhf object, zzfgt object2, JSONArray object3) {
        int n3 = object3.length();
        int n4 = 3;
        if (n3 == 0) {
            object = new zzdzd(n4);
            object = zzgft.zzg((Throwable)object);
        } else {
            zzfho zzfho2 = ((zzfhf)object).zza.zza;
            n3 = zzfho2.zzk;
            int n7 = 0;
            int n8 = 1;
            if (n3 > n8) {
                n3 = object3.length();
                ArrayList<Object> arrayList = this.zzd;
                int n10 = ((zzfhf)object).zza.zza.zzk;
                n10 = Math.min(n3, n10);
                ((zzfin)((Object)arrayList)).zzc(n10);
                Object object4 = ((zzfhf)object).zza.zza;
                n10 = ((zzfho)object4).zzk;
                arrayList = new ArrayList<Object>(n10);
                while (true) {
                    object4 = ((zzfhf)object).zza.zza;
                    n10 = ((zzfho)object4).zzk;
                    if (n7 >= n10) break;
                    if (n7 < n3) {
                        object4 = object3.getJSONObject(n7);
                        object4 = this.zzg((zzfhf)object, (zzfgt)object2, (JSONObject)object4);
                        arrayList.add(object4);
                    } else {
                        object4 = new zzdzd(n4);
                        object4 = zzgft.zzg((Throwable)object4);
                        arrayList.add(object4);
                    }
                    ++n7;
                }
                object = zzgft.zzh(arrayList);
            } else {
                object3 = object3.getJSONObject(0);
                object = this.zzg((zzfhf)object, (zzfgt)object2, (JSONObject)object3);
                object2 = new zzeke();
                object3 = this.zzb;
                object = zzgft.zzm((ListenableFuture)object, (zzfxu)object2, (Executor)object3);
            }
        }
        return object;
    }
}

