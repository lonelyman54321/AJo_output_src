/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzcqh;
import com.google.android.gms.internal.ads.zzcus;
import com.google.android.gms.internal.ads.zzczn;
import com.google.android.gms.internal.ads.zzdez;
import com.google.android.gms.internal.ads.zzdux;
import com.google.android.gms.internal.ads.zzehl;
import com.google.android.gms.internal.ads.zzehq;
import com.google.android.gms.internal.ads.zzekp;
import com.google.android.gms.internal.ads.zzelf;
import com.google.android.gms.internal.ads.zzelj;
import com.google.android.gms.internal.ads.zzelk;
import com.google.android.gms.internal.ads.zzell;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgv;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfiq;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzflk;
import com.google.android.gms.internal.ads.zzfll;
import com.google.android.gms.internal.ads.zzfln;
import com.google.android.gms.internal.ads.zzflt;
import com.google.android.gms.internal.ads.zzfmb;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfmm;
import com.google.android.gms.internal.ads.zzfmn;
import com.google.android.gms.internal.ads.zzfmu;
import com.google.android.gms.internal.ads.zzfoa;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzelm
implements zzgfa {
    private final zzflt zza;
    private final zzczn zzb;
    private final zzfoa zzc;
    private final zzfoe zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcus zzg;
    private final zzelf zzh;
    private final zzehq zzi;
    private final Context zzj;
    private final zzfmn zzk;
    private final zzekp zzl;
    private final zzdux zzm;

    public zzelm(Context context, zzflt zzflt2, zzelf zzelf2, zzczn zzczn2, zzfoa zzfoa2, zzfoe zzfoe2, zzcus zzcus2, Executor executor, ScheduledExecutorService scheduledExecutorService, zzehq zzehq2, zzfmn zzfmn2, zzekp zzekp2, zzdux zzdux2) {
        this.zzj = context;
        this.zza = zzflt2;
        this.zzh = zzelf2;
        this.zzb = zzczn2;
        this.zzc = zzfoa2;
        this.zzd = zzfoe2;
        this.zzg = zzcus2;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzehq2;
        this.zzk = zzfmn2;
        this.zzl = zzekp2;
        this.zzm = zzdux2;
    }

    public static String zzc(zzfhf object) {
        Object object2;
        block5: {
            Object object3;
            block3: {
                int n3;
                int n4;
                int n7;
                block4: {
                    object3 = zzbep.zzfC;
                    object3 = (Boolean)zzba.zzc().zza((zzbeg)object3);
                    int n74 = ((Boolean)object3).booleanValue();
                    object2 = "No fill.";
                    n7 = 1;
                    object3 = n7 != n74 ? "No ad config." : object2;
                    Object object4 = ((zzfhf)object).zzb.zzb;
                    n7 = ((zzfgw)object4).zze;
                    if (n7 == 0) break block3;
                    int n8 = 200;
                    n4 = 300;
                    if (n7 < n8 || n7 >= n4) break block4;
                    object4 = zzbep.zzfB;
                    zzben zzben2 = zzba.zzc();
                    object4 = (Boolean)zzben2.zza((zzbeg)object4);
                    n7 = (int)(((Boolean)object4).booleanValue() ? 1 : 0);
                    if (n7 != 0) break block3;
                    break block5;
                }
                if (n7 >= n4 && n7 < (n3 = 400)) {
                    object2 = "No location header to follow redirect or too many redirects.";
                } else {
                    object3 = "Received error HTTP response code: ";
                    object2 = hj0_0.a(n7, (String)object3);
                }
                break block5;
            }
            object2 = object3;
        }
        object = ((zzfhf)object).zzb.zzb.zzi;
        if (object != null) {
            return ((zzfgv)object).zza();
        }
        return object2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final /* synthetic */ ListenableFuture zza(Object object) {
        int n3;
        Object object2;
        Object object3;
        boolean bl2;
        Object object4;
        int n4;
        object = (zzfhf)object;
        Object object5 = zzbep.zzcd;
        Object object6 = zzba.zzc();
        object5 = (Boolean)((zzben)object6).zza((zzbeg)object5);
        int n7 = ((Boolean)object5).booleanValue();
        if (n7 != 0 && (object5 = ((zzfhf)object).zzb.zzd) != null && (object5 = ((zzbxu)object5).zzm) != null) {
            object6 = this.zzm.zza();
            object6.putAll((Bundle)object5);
        }
        object5 = zzelm.zzc((zzfhf)object);
        object6 = this.zzi;
        Object object7 = ((zzfhf)object).zzb.zzb;
        ((zzehq)object6).zzi((zzfgw)object7);
        object6 = zzbep.zzis;
        object7 = zzba.zzc();
        object6 = (Boolean)((zzben)object7).zza((zzbeg)object6);
        int n8 = ((Boolean)object6).booleanValue();
        int n10 = 3;
        if (n8 != 0) {
            object6 = ((zzfhf)object).zzb.zzb;
            n8 = ((zzfgw)object6).zze;
            if (n8 != 0 && (n8 < (n4 = 200) || n8 >= (n4 = 300))) {
                object = new zzelj(n10, (String)object5);
                return zzgft.zzg((Throwable)object);
            }
        }
        object5 = ((zzfhf)object).zzb.zzb;
        object6 = zzbep.zzdA;
        zzben zzben2 = zzba.zzc();
        object6 = (Boolean)zzben2.zza((zzbeg)object6);
        n8 = (int)(((Boolean)object6).booleanValue() ? 1 : 0);
        n4 = 1;
        if (n8 != 0 && (n8 = (int)(TextUtils.isEmpty((CharSequence)(object5 = ((zzfgw)object5).zzp)) ? 1 : 0)) == 0) {
            object6 = this.zzi;
            object4 = ((zzfhf)object).zzb.zza;
            ((zzehq)object6).zzh((String)object5, (List)object4);
        } else {
            object5 = ((zzfhf)object).zzb.zza.iterator();
            block0: while ((n8 = (int)(object5.hasNext() ? 1 : 0)) != 0) {
                object6 = (zzfgt)object5.next();
                this.zzi.zzd((zzfgt)object6);
                object4 = ((zzfgt)object6).zza.iterator();
                while (bl2 = object4.hasNext()) {
                    object3 = (String)object4.next();
                    object2 = this.zzg;
                    n3 = ((zzfgt)object6).zzb;
                    if ((object3 = object2.zza(n3, (String)object3)) == null || !(bl2 = object3.zzb((zzfhf)object, (zzfgt)object6))) continue;
                    continue block0;
                }
                object4 = this.zzi;
                long l2 = 0L;
                n3 = 0;
                zze zze2 = zzfiq.zzd(n4, null, null);
                ((zzehq)object4).zzf((zzfgt)object6, l2, zze2);
            }
        }
        object5 = this.zzb;
        object6 = this.zzd;
        object4 = this.zzc;
        object3 = new zzcqh((zzfhf)object, (zzfoe)object6, (zzfoa)object4);
        object6 = this.zze;
        ((zzdez)object5).zzo(object3, (Executor)object6);
        object5 = ((zzfhf)object).zzb.zzb;
        n7 = ((zzfgw)object5).zzq;
        if (n7 > n4) {
            object5 = this.zzl;
            return ((zzekp)object5).zzb((zzfhf)object);
        }
        object5 = zzelm.zzc((zzfhf)object);
        object6 = this.zza;
        zzfln zzfln2 = zzfln.zzn;
        object4 = new zzelj(n10, (String)object5);
        object5 = zzfld.zzc(zzgft.zzg((Throwable)object4), (Object)zzfln2, (zzfll)object6).zza();
        this.zzh.zzl();
        object6 = ((zzfhf)object).zzb.zza.iterator();
        n10 = 0;
        object7 = null;
        while ((n4 = (int)(object6.hasNext() ? 1 : 0)) != 0) {
            zzfgt zzfgt2 = (zzfgt)object6.next();
            object4 = zzfgt2.zza.iterator();
            while (bl2 = object4.hasNext()) {
                object3 = (String)object4.next();
                object2 = this.zzg;
                n3 = zzfgt2.zzb;
                if ((object2 = object2.zza(n3, (String)object3)) == null || (n3 = (int)(object2.zzb((zzfhf)object, zzfgt2) ? 1 : 0)) == 0) continue;
                object4 = this.zza;
                zzfln zzfln3 = zzfln.zzo;
                object5 = ((zzfll)object4).zzb((Object)zzfln3, (ListenableFuture)object5);
                object4 = new StringBuilder("render-config-");
                ((StringBuilder)object4).append(n10);
                String string2 = "-";
                ((StringBuilder)object4).append(string2);
                ((StringBuilder)object4).append((String)object3);
                object4 = ((StringBuilder)object4).toString();
                object5 = ((zzflk)object5).zzh((String)object4);
                object4 = new zzelk(this, zzfgt2, (zzfhf)object, (zzehl)object2);
                Class<Throwable> clazz = Throwable.class;
                object5 = ((zzflk)object5).zzc(clazz, (zzgfa)object4).zza();
                break;
            }
            ++n10;
        }
        object = this.zzh;
        Objects.requireNonNull(object);
        object6 = new zzell((zzelf)object);
        object = this.zze;
        object5.addListener((Runnable)object6, (Executor)object);
        return object5;
    }

    public final /* synthetic */ ListenableFuture zzb(zzfgt object, zzfhf zzfhf2, zzehl object2, Throwable object3) {
        object3 = this.zzj;
        Object object4 = zzfmu.zzu;
        object3 = zzfmb.zza((Context)object3, (zzfmu)object4);
        object4 = ((zzfgt)object).zzF;
        object3.zze((String)object4);
        object3.zzj();
        object2 = object2.zza(zzfhf2, (zzfgt)object);
        long l2 = ((zzfgt)object).zzS;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ScheduledExecutorService scheduledExecutorService = this.zzf;
        object2 = zzgft.zzo((ListenableFuture)object2, l2, timeUnit, scheduledExecutorService);
        object4 = this.zzc;
        this.zzh.zzf(zzfhf2, (zzfgt)object, (ListenableFuture)object2, (zzfoa)object4);
        object = this.zzk;
        zzfmm.zzb((ListenableFuture)object2, (zzfmn)object, (zzfmc)object3);
        return object2;
    }
}

