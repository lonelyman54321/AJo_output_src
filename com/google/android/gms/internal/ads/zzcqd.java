/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.text.TextUtils
 *  android.view.InputEvent
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbwj;
import com.google.android.gms.internal.ads.zzbwl;
import com.google.android.gms.internal.ads.zzcpu;
import com.google.android.gms.internal.ads.zzcpv;
import com.google.android.gms.internal.ads.zzcpw;
import com.google.android.gms.internal.ads.zzcpx;
import com.google.android.gms.internal.ads.zzcpy;
import com.google.android.gms.internal.ads.zzcpz;
import com.google.android.gms.internal.ads.zzcqc;
import com.google.android.gms.internal.ads.zzdsi;
import com.google.android.gms.internal.ads.zzehh;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgfk;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzcqd {
    zzbwl zza;
    zzbwl zzb;
    private final Context zzc;
    private final zzg zzd;
    private final zzehh zze;
    private final zzdsi zzf;
    private final zzgge zzg;
    private final Executor zzh;
    private final ScheduledExecutorService zzi;

    public zzcqd(Context context, zzg zzg2, zzehh zzehh2, zzdsi zzdsi2, zzgge zzgge2, zzgge zzgge3, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = context;
        this.zzd = zzg2;
        this.zze = zzehh2;
        this.zzf = zzdsi2;
        this.zzg = zzgge2;
        this.zzh = zzgge3;
        this.zzi = scheduledExecutorService;
    }

    public static /* bridge */ /* synthetic */ Context zza(zzcqd zzcqd2) {
        return zzcqd2.zzc;
    }

    public static /* bridge */ /* synthetic */ zzgge zzf(zzcqd zzcqd2) {
        return zzcqd2.zzg;
    }

    public static boolean zzj(String string2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2) {
            return false;
        }
        Object object = zzbep.zzkh;
        object = (CharSequence)zzba.zzc().zza((zzbeg)object);
        return string2.contains((CharSequence)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final ListenableFuture zzk(String object, InputEvent object2, Random object3) {
        int n3;
        Object object4;
        Object object5;
        try {
            object5 = zzbep.zzkh;
            object4 = zzba.zzc();
            object5 = ((zzben)object4).zza((zzbeg)object5);
            object5 = (CharSequence)object5;
            boolean bl2 = ((String)object).contains((CharSequence)object5);
            if (!bl2) return zzgft.zzh(object);
            object5 = this.zzd;
            bl2 = object5.zzS();
            if (bl2) return zzgft.zzh(object);
            object5 = Uri.parse((String)object);
            object5 = object5.buildUpon();
            n3 = -1 >>> 1;
        }
        catch (Exception exception) {
            return zzgft.zzg(exception);
        }
        int n4 = ((Random)object3).nextInt(n3);
        long l2 = n4;
        object3 = zzbep.zzki;
        zzben zzben2 = zzba.zzc();
        object3 = zzben2.zza((zzbeg)object3);
        object3 = (String)object3;
        object4 = String.valueOf(l2);
        object5.appendQueryParameter((String)object3, (String)object4);
        if (object2 == null) {
            object = zzbep.zzkj;
            object2 = zzba.zzc();
            object = ((zzben)object2).zza((zzbeg)object);
            object = (String)object;
            object2 = "11";
            object5.appendQueryParameter((String)object, (String)object2);
            object = object5.toString();
            return zzgft.zzh(object);
        }
        object3 = this.zze;
        object3 = ((zzehh)object3).zza();
        object3 = zzgfk.zzu((ListenableFuture)object3);
        object4 = new zzcpx(this, (Uri.Builder)object5, (String)object, (InputEvent)object2);
        object = this.zzh;
        object = zzgft.zzn((ListenableFuture)object3, (zzgfa)object4, (Executor)object);
        object2 = Throwable.class;
        object3 = new zzcpy(this, (Uri.Builder)object5);
        object5 = this.zzg;
        return zzgft.zzf((ListenableFuture)object, (Class)object2, (zzgfa)object3, (Executor)object5);
    }

    public final ListenableFuture zzb(String object, Random object2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (bl2) {
            return zzgft.zzh(object);
        }
        Object object3 = this.zzf.zza();
        object2 = this.zzk((String)object, (InputEvent)object3, (Random)object2);
        object3 = new zzcpu(this, (String)object);
        object = this.zzg;
        return zzgft.zzf((ListenableFuture)object2, Throwable.class, (zzgfa)object3, (Executor)object);
    }

    public final /* synthetic */ ListenableFuture zzc(String string2, Throwable throwable) {
        zzcpw zzcpw2 = new zzcpw(this, throwable);
        this.zzg.zza(zzcpw2);
        return zzgft.zzh(string2);
    }

    public final /* synthetic */ ListenableFuture zzd(Uri.Builder object, String object2, InputEvent object3, Integer n3) {
        int n4;
        int n7 = n3;
        if (n7 == (n4 = 1)) {
            n3 = object.build().buildUpon();
            Object object4 = zzbep.zzkk;
            object4 = (String)zzba.zzc().zza((zzbeg)object4);
            n3.appendQueryParameter((String)object4, "1");
            object4 = zzbep.zzkj;
            object4 = (String)zzba.zzc().zza((zzbeg)object4);
            n3.appendQueryParameter((String)object4, "12");
            object4 = zzbep.zzkl;
            zzben zzben2 = zzba.zzc();
            object4 = (CharSequence)zzben2.zza((zzbeg)object4);
            boolean bl2 = ((String)object2).contains((CharSequence)object4);
            if (bl2) {
                object2 = zzbep.zzkm;
                object4 = zzba.zzc();
                object2 = (String)((zzben)object4).zza((zzbeg)object2);
                n3.authority((String)object2);
            }
            object2 = this.zze;
            n3 = n3.build();
            object2 = zzgfk.zzu(((zzehh)object2).zzb((Uri)n3, (InputEvent)object3));
            object3 = new zzcpz((Uri.Builder)object);
            object = this.zzh;
            object = zzgft.zzn((ListenableFuture)object2, (zzgfa)object3, (Executor)object);
        } else {
            object2 = zzbep.zzkj;
            object2 = (String)zzba.zzc().zza((zzbeg)object2);
            object3 = "10";
            object.appendQueryParameter((String)object2, (String)object3);
            object = zzgft.zzh(object.toString());
        }
        return object;
    }

    public final /* synthetic */ ListenableFuture zze(Uri.Builder builder, Throwable object) {
        zzcpv zzcpv2 = new zzcpv(this, (Throwable)object);
        this.zzg.zza(zzcpv2);
        object = zzbep.zzkj;
        object = (String)zzba.zzc().zza((zzbeg)object);
        builder.appendQueryParameter((String)object, "9");
        return zzgft.zzh(builder.toString());
    }

    public final /* synthetic */ void zzg(Throwable throwable) {
        Object object = zzbep.zzko;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            this.zzb = object = zzbwj.zzc(this.zzc);
            object.zzh(throwable, "AttributionReporting.getUpdatedUrlAndRegisterSource");
            return;
        }
        this.zza = object = zzbwj.zza(this.zzc);
        object.zzh(throwable, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource");
    }

    public final /* synthetic */ void zzh(Throwable throwable) {
        Object object = zzbep.zzko;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            this.zzb = object = zzbwj.zzc(this.zzc);
            object.zzh(throwable, "AttributionReporting");
            return;
        }
        this.zza = object = zzbwj.zza(this.zzc);
        object.zzh(throwable, "AttributionReportingSampled");
    }

    public final void zzi(String object, zzfoe zzfoe2, Random object2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (bl2) {
            return;
        }
        Object object3 = this.zzf.zza();
        object2 = this.zzk((String)object, (InputEvent)object3, (Random)object2);
        object3 = zzbep.zzkn;
        long l2 = ((Integer)zzba.zzc().zza((zzbeg)object3)).intValue();
        ScheduledExecutorService scheduledExecutorService = this.zzi;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        object2 = zzgft.zzo((ListenableFuture)object2, l2, timeUnit, scheduledExecutorService);
        object3 = new zzcqc(this, zzfoe2, (String)object);
        object = this.zzg;
        zzgft.zzr((ListenableFuture)object2, (zzgfp)object3, (Executor)object);
    }
}

