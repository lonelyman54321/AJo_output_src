/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbgq;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzbxx;
import com.google.android.gms.internal.ads.zzcor;
import com.google.android.gms.internal.ads.zzcvo;
import com.google.android.gms.internal.ads.zzcvp;
import com.google.android.gms.internal.ads.zzcvq;
import com.google.android.gms.internal.ads.zzcvr;
import com.google.android.gms.internal.ads.zzcvs;
import com.google.android.gms.internal.ads.zzcvt;
import com.google.android.gms.internal.ads.zzcvu;
import com.google.android.gms.internal.ads.zzcvv;
import com.google.android.gms.internal.ads.zzcvw;
import com.google.android.gms.internal.ads.zzcyp;
import com.google.android.gms.internal.ads.zzdeq;
import com.google.android.gms.internal.ads.zzeam;
import com.google.android.gms.internal.ads.zzebe;
import com.google.android.gms.internal.ads.zzebu;
import com.google.android.gms.internal.ads.zzeck;
import com.google.android.gms.internal.ads.zzecr;
import com.google.android.gms.internal.ads.zzehq;
import com.google.android.gms.internal.ads.zzelm;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfiq;
import com.google.android.gms.internal.ads.zzfjj;
import com.google.android.gms.internal.ads.zzfkw;
import com.google.android.gms.internal.ads.zzflb;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzflk;
import com.google.android.gms.internal.ads.zzfll;
import com.google.android.gms.internal.ads.zzfln;
import com.google.android.gms.internal.ads.zzflt;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class zzcvx {
    private final zzeam zza;
    private final zzfho zzb;
    private final zzflt zzc;
    private final zzcor zzd;
    private final zzelm zze;
    private final zzdeq zzf;
    private zzfhf zzg;
    private final zzebu zzh;
    private final zzcyp zzi;
    private final Executor zzj;
    private final zzebe zzk;
    private final zzehq zzl;
    private final zzeck zzm;
    private final zzecr zzn;

    public zzcvx(zzeam zzeam2, zzfho zzfho2, zzflt zzflt2, zzcor zzcor2, zzelm zzelm2, zzdeq zzdeq2, zzfhf zzfhf2, zzebu zzebu2, zzcyp zzcyp2, Executor executor, zzebe zzebe2, zzehq zzehq2, zzeck zzeck2, zzecr zzecr2) {
        this.zza = zzeam2;
        this.zzb = zzfho2;
        this.zzc = zzflt2;
        this.zzd = zzcor2;
        this.zze = zzelm2;
        this.zzf = zzdeq2;
        this.zzg = zzfhf2;
        this.zzh = zzebu2;
        this.zzi = zzcyp2;
        this.zzj = executor;
        this.zzk = zzebe2;
        this.zzl = zzehq2;
        this.zzm = zzeck2;
        this.zzn = zzecr2;
    }

    public static /* bridge */ /* synthetic */ zzdeq zzb(zzcvx zzcvx2) {
        return zzcvx2.zzf;
    }

    public final zze zza(Throwable throwable) {
        zzehq zzehq2 = this.zzl;
        return zzfiq.zzb(throwable, zzehq2);
    }

    public final zzdeq zzc() {
        return this.zzf;
    }

    public final /* synthetic */ zzfhf zzd(zzfhf zzfhf2) {
        this.zzd.zza(zzfhf2);
        return zzfhf2;
    }

    public final ListenableFuture zze(zzfjj object) {
        Object object2 = this.zzi;
        Object object3 = this.zzc;
        zzfln zzfln2 = zzfln.zzx;
        object2 = ((zzcyp)object2).zzc();
        object2 = ((zzfll)object3).zzb((Object)zzfln2, (ListenableFuture)object2);
        object3 = new zzcvt(this, (zzfjj)object);
        object = ((zzflk)object2).zzf((zzgfa)object3).zza();
        object2 = new zzcvv(this);
        object3 = this.zzj;
        zzgft.zzr((ListenableFuture)object, (zzgfp)object2, (Executor)object3);
        return object;
    }

    public final /* synthetic */ ListenableFuture zzf(zzfjj zzfjj2, zzbxu zzbxu2) {
        zzbxu2.zzi = zzfjj2;
        return this.zzh.zza(zzbxu2);
    }

    public final /* synthetic */ ListenableFuture zzg(ListenableFuture object, ListenableFuture listenableFuture, ListenableFuture object2) {
        object = (zzbxu)object.get();
        listenableFuture = (JSONObject)listenableFuture.get();
        object2 = (zzbxx)object2.get();
        return this.zzn.zzc((zzbxu)object, (JSONObject)listenableFuture, (zzbxx)object2);
    }

    public final ListenableFuture zzh(zzbxu object) {
        Object object2 = this.zzh;
        Object object3 = this.zzc;
        zzfln zzfln2 = zzfln.zzy;
        object = ((zzebu)object2).zzg((zzbxu)object);
        object = ((zzfll)object3).zzb((Object)zzfln2, (ListenableFuture)object).zza();
        object2 = new zzcvw(this);
        object3 = this.zzj;
        zzgft.zzr((ListenableFuture)object, (zzgfp)object2, (Executor)object3);
        return object;
    }

    public final ListenableFuture zzi(ListenableFuture object) {
        Object object2 = this.zzc;
        Object object3 = zzfln.zzd;
        object = ((zzfll)object2).zzb(object3, (ListenableFuture)object);
        object2 = new zzcvo(this);
        object = ((zzflk)object).zze((zzfkw)object2);
        object2 = this.zze;
        object = ((zzflk)object).zzf((zzgfa)object2);
        object2 = zzbep.zzfD;
        object3 = zzba.zzc();
        object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
        boolean n3 = (Boolean)object2;
        if (!n3) {
            object2 = zzbep.zzfF;
            object3 = zzba.zzc();
            object2 = (Integer)((zzben)object3).zza((zzbeg)object2);
            int n4 = (Integer)object2;
            long l2 = n4;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            object = ((zzflk)object).zzi(l2, timeUnit);
        }
        return ((zzflk)object).zza();
    }

    public final ListenableFuture zzj() {
        Object object = this.zzb.zzd;
        Object object2 = ((zzl)object).zzx;
        if (object2 == null && (object = ((zzl)object).zzs) == null) {
            object = this.zzi.zzc();
            return this.zzk((ListenableFuture)object);
        }
        object = this.zzc;
        object2 = this.zza;
        zzfln zzfln2 = zzfln.zzA;
        return zzfld.zzc(((zzeam)object2).zza(), (Object)zzfln2, (zzfll)object).zza();
    }

    public final ListenableFuture zzk(ListenableFuture object) {
        Object object2 = this.zzg;
        if (object2 != null) {
            object = this.zzc;
            zzfln zzfln2 = zzfln.zzc;
            return zzfld.zzc(zzgft.zzh(object2), (Object)zzfln2, (zzfll)object).zza();
        }
        zzu.zzc().zzj();
        object2 = zzbep.zzlB;
        Object object3 = zzba.zzc();
        object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
        boolean bl2 = (Boolean)object2;
        if (bl2 && !(bl2 = ((Boolean)(object2 = (Boolean)zzbgq.zzc.zze())).booleanValue())) {
            object2 = this.zzm;
            Objects.requireNonNull(object2);
            object3 = new zzcvp((zzeck)object2);
            object2 = this.zzj;
            object2 = zzgft.zzn((ListenableFuture)object, (zzgfa)object3, (Executor)object2);
            object3 = this.zzc;
            Object object4 = zzfln.zzg;
            object3 = ((zzfll)object3).zzb(object4, (ListenableFuture)object2);
            object4 = this.zzh;
            Objects.requireNonNull(object4);
            Object object5 = new zzcvq((zzebu)object4);
            object3 = ((zzflk)object3).zzf((zzgfa)object5).zza();
            object4 = this.zzc;
            object5 = zzfln.zzc;
            ListenableFuture[] listenableFutureArray = new ListenableFuture[]{object, object2, object3};
            object4 = ((zzfll)object4).zza(object5, listenableFutureArray);
            object5 = new zzcvr(this, (ListenableFuture)object, (ListenableFuture)object2, (ListenableFuture)object3);
            object = ((zzflb)object4).zza((Callable)object5);
            object2 = new zzcvs();
            return ((zzflk)object).zzf((zzgfa)object2).zza();
        }
        object2 = this.zzc;
        object3 = zzfln.zzc;
        object = ((zzfll)object2).zzb(object3, (ListenableFuture)object);
        object2 = this.zzk;
        Objects.requireNonNull(object2);
        object3 = new zzcvu((zzebe)object2);
        return ((zzflk)object).zzf((zzgfa)object3).zza();
    }

    public final void zzl(zzfhf zzfhf2) {
        this.zzg = zzfhf2;
    }
}

