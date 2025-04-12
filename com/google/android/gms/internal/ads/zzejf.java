/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbjm;
import com.google.android.gms.internal.ads.zzcsf;
import com.google.android.gms.internal.ads.zzctg;
import com.google.android.gms.internal.ads.zzctx;
import com.google.android.gms.internal.ads.zzcvf;
import com.google.android.gms.internal.ads.zzczn;
import com.google.android.gms.internal.ads.zzdux;
import com.google.android.gms.internal.ads.zzehl;
import com.google.android.gms.internal.ads.zzeim;
import com.google.android.gms.internal.ads.zzejc;
import com.google.android.gms.internal.ads.zzejd;
import com.google.android.gms.internal.ads.zzeje;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzejf
implements zzehl {
    private final zzctg zza;
    private final zzeim zzb;
    private final zzgge zzc;
    private final zzczn zzd;
    private final ScheduledExecutorService zze;
    private final zzdux zzf;

    public zzejf(zzctg zzctg2, zzeim zzeim2, zzczn zzczn2, ScheduledExecutorService scheduledExecutorService, zzgge zzgge2, zzdux zzdux2) {
        this.zza = zzctg2;
        this.zzb = zzeim2;
        this.zzd = zzczn2;
        this.zze = scheduledExecutorService;
        this.zzc = zzgge2;
        this.zzf = zzdux2;
    }

    public static /* bridge */ /* synthetic */ zzctg zzd(zzejf zzejf2) {
        return zzejf2.zza;
    }

    public static /* bridge */ /* synthetic */ zzczn zze(zzejf zzejf2) {
        return zzejf2.zzd;
    }

    public final ListenableFuture zza(zzfhf zzfhf2, zzfgt zzfgt2) {
        zzejd zzejd2 = new zzejd(this, zzfhf2, zzfgt2);
        return this.zzc.zzb(zzejd2);
    }

    public final boolean zzb(zzfhf zzfhf2, zzfgt object) {
        zzbjm zzbjm2 = zzfhf2.zza.zza.zza();
        boolean bl2 = this.zzb.zzb(zzfhf2, (zzfgt)object);
        object = zzbep.zzlV;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl3 = (Boolean)object;
        boolean bl4 = true;
        if (bl3) {
            object = this.zzf;
            String string2 = "0";
            String string3 = "1";
            String string4 = zzbjm2 != null ? string3 : string2;
            object = ((zzdux)object).zzb();
            String string5 = "has_dbl";
            object.put(string5, string4);
            object = this.zzf;
            if (bl4 == bl2) {
                string2 = string3;
            }
            object = ((zzdux)object).zzb();
            string3 = "crdb";
            object.put(string3, string2);
        }
        if (zzbjm2 != null && bl2) {
            return bl4;
        }
        return false;
    }

    public final /* synthetic */ zzcsf zzc(zzfhf zzfhf2, zzfgt zzfgt2) {
        zzcvf zzcvf2 = new zzcvf(zzfhf2, zzfgt2, null);
        zzbjm zzbjm2 = zzfhf2.zza.zza.zza();
        zzejc zzejc2 = new zzejc(this, zzfhf2, zzfgt2);
        zzctx zzctx2 = new zzctx(zzbjm2, zzejc2);
        return this.zza.zzb(zzcvf2, zzctx2).zza();
    }

    public final /* synthetic */ void zzf(zzfhf object, zzfgt object2) {
        object = this.zzb.zza((zzfhf)object, (zzfgt)object2);
        long l2 = object2.zzS;
        object2 = TimeUnit.SECONDS;
        ScheduledExecutorService scheduledExecutorService = this.zze;
        object = zzgft.zzo((ListenableFuture)object, l2, (TimeUnit)((Object)object2), scheduledExecutorService);
        object2 = new zzeje(this);
        zzgge zzgge2 = this.zzc;
        zzgft.zzr((ListenableFuture)object, (zzgfp)object2, zzgge2);
    }
}

