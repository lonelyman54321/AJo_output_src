/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.nonagon.signalgeneration.zzam;
import com.google.android.gms.ads.nonagon.signalgeneration.zzao;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcjd;
import com.google.android.gms.internal.ads.zzcyt;
import com.google.android.gms.internal.ads.zzcyv;
import com.google.android.gms.internal.ads.zzdfa;
import com.google.android.gms.internal.ads.zzexa;
import com.google.android.gms.internal.ads.zzexb;
import com.google.android.gms.internal.ads.zzexc;
import com.google.android.gms.internal.ads.zzexe;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzfhm;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzgez;
import com.google.android.gms.internal.ads.zzgfk;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzexd
implements zzexw {
    private final String zza;
    private final zzgge zzb;
    private final ScheduledExecutorService zzc;
    private final Context zzd;
    private final zzfho zze;
    private final zzcjd zzf;

    public zzexd(zzgge zzgge2, ScheduledExecutorService scheduledExecutorService, String string2, Context context, zzfho zzfho2, zzcjd zzcjd2) {
        this.zzb = zzgge2;
        this.zzc = scheduledExecutorService;
        this.zza = string2;
        this.zzd = context;
        this.zze = zzfho2;
        this.zzf = zzcjd2;
    }

    public static /* synthetic */ ListenableFuture zzc(zzexd object) {
        Object object2 = ((zzexd)object).zzf.zzp();
        Object object3 = new zzcyt();
        Object object4 = ((zzexd)object).zzd;
        ((zzcyt)object3).zze((Context)object4);
        object4 = new zzfhm();
        ((zzfhm)object4).zzt("adUnitId");
        Object object5 = ((zzexd)object).zze.zzd;
        ((zzfhm)object4).zzH((zzl)object5);
        object5 = new zzq();
        ((zzfhm)object4).zzs((zzq)object5);
        ((zzfhm)object4).zzz(true);
        object4 = ((zzfhm)object4).zzJ();
        ((zzcyt)object3).zzi((zzfho)object4);
        object3 = ((zzcyt)object3).zzj();
        object2.zza((zzcyv)object3);
        object3 = new zzam();
        object4 = ((zzexd)object).zza;
        ((zzam)object3).zza((String)object4);
        object3 = ((zzam)object3).zzb();
        object2.zzb((zzao)object3);
        new zzdfa();
        object2 = zzgfk.zzu(object2.zzc().zzb());
        object3 = zzbep.zzhp;
        long l2 = (Long)zzba.zzc().zza((zzbeg)object3);
        object5 = TimeUnit.MILLISECONDS;
        ScheduledExecutorService scheduledExecutorService = ((zzexd)object).zzc;
        object2 = (zzgfk)zzgft.zzo((ListenableFuture)object2, l2, (TimeUnit)((Object)object5), scheduledExecutorService);
        object3 = new zzexa();
        object4 = ((zzexd)object).zzb;
        object2 = zzgft.zzm((ListenableFuture)object2, (zzfxu)object3, (Executor)object4);
        object3 = new zzexb();
        object = ((zzexd)object).zzb;
        return zzgft.zze((ListenableFuture)object2, Exception.class, (zzfxu)object3, (Executor)object);
    }

    public final int zza() {
        return 33;
    }

    public final ListenableFuture zzb() {
        Object object = zzbep.zzho;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            object = this.zze;
            bl2 = ((zzfho)object).zzr;
            if (!bl2) {
                object = new zzexc(this);
                object2 = this.zzb;
                return zzgft.zzk((zzgez)object, (Executor)object2);
            }
        }
        object = new zzexe(null);
        return zzgft.zzh(object);
    }
}

