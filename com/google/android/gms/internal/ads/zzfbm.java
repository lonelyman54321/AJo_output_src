/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbgy;
import com.google.android.gms.internal.ads.zzcbn;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzfbk;
import com.google.android.gms.internal.ads.zzfbl;
import com.google.android.gms.internal.ads.zzfbn;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzfbm
implements zzexw {
    private final zzcby zza;
    private final boolean zzb;
    private final boolean zzc;
    private final ScheduledExecutorService zzd;
    private final zzgge zze;
    private final String zzf;
    private final zzcbn zzg;

    public zzfbm(zzcby zzcby2, boolean bl2, boolean bl3, zzcbn zzcbn2, zzgge zzgge2, String string2, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzcby2;
        this.zzb = bl2;
        this.zzc = bl3;
        this.zzg = zzcbn2;
        this.zze = zzgge2;
        this.zzf = string2;
        this.zzd = scheduledExecutorService;
    }

    public final int zza() {
        return 50;
    }

    public final ListenableFuture zzb() {
        Object object = zzbep.zzhq;
        object = (Boolean)zzba.zzc().zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        zzfxu zzfxu2 = null;
        if (bl2 && (bl2 = this.zzc)) {
            return zzgft.zzh(null);
        }
        bl2 = this.zzb;
        if (!bl2) {
            return zzgft.zzh(null);
        }
        object = zzgft.zzh(null);
        zzfxu2 = new zzfbk();
        zzgge zzgge2 = this.zze;
        object = zzgft.zzm((ListenableFuture)object, zzfxu2, zzgge2);
        long l2 = (Long)zzbgy.zzc.zze();
        ScheduledExecutorService scheduledExecutorService = this.zzd;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        object = zzgft.zzo((ListenableFuture)object, l2, timeUnit, scheduledExecutorService);
        zzfxu2 = new zzfbl(this);
        zzgge2 = this.zze;
        return zzgft.zze((ListenableFuture)object, Exception.class, zzfxu2, zzgge2);
    }

    public final /* synthetic */ zzfbn zzc(Exception exception) {
        this.zza.zzw(exception, "TrustlessTokenSignal");
        return null;
    }
}

