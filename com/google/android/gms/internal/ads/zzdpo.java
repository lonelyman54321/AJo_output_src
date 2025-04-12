/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbkn;
import com.google.android.gms.internal.ads.zzblo;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzblv;
import com.google.android.gms.internal.ads.zzbmb;
import com.google.android.gms.internal.ads.zzccm;
import com.google.android.gms.internal.ads.zzcfq;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzcif;
import com.google.android.gms.internal.ads.zzcit;
import com.google.android.gms.internal.ads.zzcix;
import com.google.android.gms.internal.ads.zzdpd;
import com.google.android.gms.internal.ads.zzdpe;
import com.google.android.gms.internal.ads.zzdpf;
import com.google.android.gms.internal.ads.zzdpg;
import com.google.android.gms.internal.ads.zzdph;
import com.google.android.gms.internal.ads.zzdpi;
import com.google.android.gms.internal.ads.zzdqv;
import com.google.android.gms.internal.ads.zzdqy;
import com.google.android.gms.internal.ads.zzdsd;
import com.google.android.gms.internal.ads.zzdvc;
import com.google.android.gms.internal.ads.zzefz;
import com.google.android.gms.internal.ads.zzelj;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class zzdpo {
    private final zzfho zza;
    private final Executor zzb;
    private final zzdsd zzc;
    private final zzdqy zzd;
    private final Context zze;
    private final zzdvc zzf;
    private final zzfoe zzg;
    private final zzefz zzh;

    public zzdpo(zzfho zzfho2, Executor executor, zzdsd zzdsd2, Context context, zzdvc zzdvc2, zzfoe zzfoe2, zzefz zzefz2, zzdqy zzdqy2) {
        this.zza = zzfho2;
        this.zzb = executor;
        this.zzc = zzdsd2;
        this.zze = context;
        this.zzf = zzdvc2;
        this.zzg = zzfoe2;
        this.zzh = zzefz2;
        this.zzd = zzdqy2;
    }

    private final void zzh(zzchd zzchd2) {
        Context context;
        zzdpo.zzj(zzchd2);
        Object object = zzblo.zzl;
        zzchd2.zzag("/video", (zzblp)object);
        object = zzblo.zzm;
        zzchd2.zzag("/videoMeta", (zzblp)object);
        Object object2 = new zzcfq();
        zzchd2.zzag("/precache", (zzblp)object2);
        object = zzblo.zzp;
        zzchd2.zzag("/delayPageLoaded", (zzblp)object);
        object = zzblo.zzn;
        zzchd2.zzag("/instrument", (zzblp)object);
        object = zzblo.zzg;
        zzchd2.zzag("/log", (zzblp)object);
        boolean bl2 = false;
        object2 = new zzbkn(null, null);
        object = "/click";
        zzchd2.zzag((String)object, (zzblp)object2);
        object2 = this.zza.zzb;
        if (object2 != null) {
            object2 = zzchd2.zzN();
            bl2 = true;
            object2.zzE(bl2);
            context = object2;
            object2 = new zzbmb(null, null, null, null, null);
            object = "/open";
            zzchd2.zzag((String)object, (zzblp)object2);
        } else {
            object2 = zzchd2.zzN();
            bl2 = false;
            object = null;
            object2.zzE(false);
        }
        object2 = zzu.zzn();
        object = zzchd2.getContext();
        boolean bl3 = object2.zzp((Context)object);
        if (bl3) {
            object2 = new HashMap();
            object = zzchd2.zzD();
            if (object != null) {
                object2 = zzchd2.zzD().zzax;
            }
            context = zzchd2.getContext();
            object = new zzblv(context, (Map)object2);
            object2 = "/logScionEvent";
            zzchd2.zzag((String)object2, (zzblp)object);
        }
    }

    private final void zzi(zzchd object, zzccm zzccm2) {
        Object object2 = this.zza.zza;
        if (object2 != null && (object2 = object.zzq()) != null) {
            object = object.zzq();
            object2 = this.zza.zza;
            ((zzcif)object).zzs((zzfk)object2);
        }
        zzccm2.zzb();
    }

    private static final void zzj(zzchd zzchd2) {
        zzblp zzblp2 = zzblo.zzh;
        zzchd2.zzag("/videoClicked", zzblp2);
        zzchd2.zzN().zzG(true);
        zzblp2 = zzblo.zzs;
        zzchd2.zzag("/getNativeAdViewSignals", zzblp2);
        zzblp2 = zzblo.zzt;
        zzchd2.zzag("/getNativeClickMeta", zzblp2);
    }

    public final ListenableFuture zza(JSONObject object) {
        ListenableFuture listenableFuture = zzgft.zzh(null);
        zzgfa zzgfa2 = new zzdpf(this);
        Executor executor = this.zzb;
        listenableFuture = zzgft.zzn(listenableFuture, zzgfa2, executor);
        zzgfa2 = new zzdpe(this, (JSONObject)object);
        object = this.zzb;
        return zzgft.zzn(listenableFuture, zzgfa2, (Executor)object);
    }

    public final ListenableFuture zzb(String object, String string2, zzfgt zzfgt2, zzfgw zzfgw2, zzq zzq2) {
        ListenableFuture listenableFuture = zzgft.zzh(null);
        zzdpd zzdpd2 = new zzdpd(this, zzq2, zzfgt2, zzfgw2, (String)object, string2);
        object = this.zzb;
        return zzgft.zzn(listenableFuture, zzdpd2, (Executor)object);
    }

    public final /* synthetic */ ListenableFuture zzc(JSONObject jSONObject, zzchd zzchd2) {
        zzccm zzccm2 = zzccm.zza(zzchd2);
        Object object = this.zza.zzb;
        if (object != null) {
            object = zzcix.zzd();
            zzchd2.zzaj((zzcix)object);
        } else {
            object = zzcix.zze();
            zzchd2.zzaj((zzcix)object);
        }
        object = zzchd2.zzN();
        zzdpg zzdpg2 = new zzdpg(this, zzchd2, zzccm2);
        object.zzB(zzdpg2);
        zzchd2.zzl("google.afma.nativeAds.renderVideo", jSONObject);
        return zzccm2;
    }

    public final /* synthetic */ ListenableFuture zzd(zzq zzq2, zzfgt zzfgt2, zzfgw zzfgw2, String string2, String string3, Object object) {
        Object object2;
        zzdpo zzdpo2 = this;
        Object object3 = this.zzc;
        Object object4 = zzq2;
        Object object5 = zzfgt2;
        object3 = ((zzdsd)object3).zza(zzq2, zzfgt2, zzfgw2);
        object4 = zzccm.zza(object3);
        object5 = this.zza.zzb;
        if (object5 != null) {
            this.zzh((zzchd)object3);
            object5 = zzcix.zzd();
            object3.zzaj((zzcix)object5);
        } else {
            zzb zzb2;
            zzdqv zzdqv2 = this.zzd.zzb();
            object2 = object3.zzN();
            object5 = this.zze;
            zzb zzb3 = zzb2;
            zzb2 = new zzb((Context)object5, null, null);
            zzefz zzefz2 = this.zzh;
            zzfoe zzfoe2 = this.zzg;
            object5 = this.zzf;
            zzb2 = null;
            object2.zzR(zzdqv2, zzdqv2, zzdqv2, zzdqv2, zzdqv2, false, null, zzb3, null, null, zzefz2, zzfoe2, (zzdvc)object5, null, zzdqv2, null, null, null, null);
            zzdpo.zzj((zzchd)object3);
        }
        object5 = object3.zzN();
        object2 = new zzdph(zzdpo2, (zzchd)object3, (zzccm)object4);
        object5.zzB((zzcit)object2);
        object5 = string2;
        object2 = string3;
        object3.zzae(string2, string3, null);
        return object4;
    }

    public final /* synthetic */ ListenableFuture zze(Object object) {
        object = this.zzc;
        Object object2 = zzq.zzc();
        object = ((zzdsd)object).zza((zzq)object2, null, null);
        object2 = zzccm.zza(object);
        this.zzh((zzchd)object);
        Object object3 = object.zzN();
        zzdpi zzdpi2 = new zzdpi((zzccm)object2);
        object3.zzH(zzdpi2);
        object3 = zzbep.zzdM;
        object3 = (String)zzba.zzc().zza((zzbeg)object3);
        object.loadUrl((String)object3);
        return object2;
    }

    public final /* synthetic */ void zzf(zzchd object, zzccm zzccm2, boolean bl2, int n3, String string2, String string3) {
        Object object2 = zzbep.zzdU;
        zzben zzben2 = zzba.zzc();
        object2 = (Boolean)zzben2.zza((zzbeg)object2);
        boolean bl3 = (Boolean)object2;
        if (bl3) {
            if (bl2) {
                this.zzi((zzchd)object, zzccm2);
                return;
            }
            CharSequence charSequence = Fh3.a(n3, "Native Video WebView failed to load. Error code: ", ", Description: ", string2, ", Failing URL: ");
            charSequence.append(string3);
            charSequence = charSequence.toString();
            object = new zzelj(1, (String)charSequence);
            zzccm2.zzd((Throwable)object);
            return;
        }
        this.zzi((zzchd)object, zzccm2);
    }

    public final /* synthetic */ void zzg(zzchd object, zzccm zzccm2, boolean bl2, int n3, String string2, String string3) {
        if (bl2) {
            Object object2 = this.zza.zza;
            if (object2 != null && (object2 = object.zzq()) != null) {
                object = object.zzq();
                object2 = this.zza.zza;
                ((zzcif)object).zzs((zzfk)object2);
            }
            zzccm2.zzb();
            return;
        }
        CharSequence charSequence = Fh3.a(n3, "Html video Web View failed to load. Error code: ", ", Description: ", string2, ", Failing URL: ");
        charSequence.append(string3);
        charSequence = charSequence.toString();
        object = new zzelj(1, (String)charSequence);
        zzccm2.zzd((Throwable)object);
    }
}

