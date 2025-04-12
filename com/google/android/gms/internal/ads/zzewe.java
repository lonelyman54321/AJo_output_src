/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzewd;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzewe
implements zzexw {
    private final zzexw zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzewe(zzexw zzexw2, long l2, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzexw2;
        this.zzb = l2;
        this.zzc = scheduledExecutorService;
    }

    public final int zza() {
        return this.zza.zza();
    }

    public final ListenableFuture zzb() {
        long l2;
        long l3;
        long l4;
        long l7;
        ListenableFuture listenableFuture = this.zza.zzb();
        Object object = TimeUnit.MILLISECONDS;
        Object object2 = zzbep.zzci;
        zzben zzben2 = zzba.zzc();
        object2 = (Boolean)zzben2.zza((zzbeg)object2);
        boolean bl2 = (Boolean)object2;
        if (bl2) {
            object = TimeUnit.MICROSECONDS;
        }
        if ((l7 = (l4 = (l3 = this.zzb) - (l2 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) > 0) {
            ScheduledExecutorService scheduledExecutorService = this.zzc;
            listenableFuture = zzgft.zzo(listenableFuture, l3, object, scheduledExecutorService);
        }
        object = new zzewd(this);
        object2 = zzcci.zzf;
        return zzgft.zzf(listenableFuture, Throwable.class, (zzgfa)object, (Executor)object2);
    }

    public final /* synthetic */ ListenableFuture zzc(Throwable throwable) {
        Object object = zzbep.zzch;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean n3 = (Boolean)object;
        if (n3) {
            object = this.zza;
            object2 = zzu.zzo();
            int n4 = object.zza();
            String string2 = "OptionalSignalTimeout:";
            StringBuilder stringBuilder = new StringBuilder(string2);
            stringBuilder.append(n4);
            object = stringBuilder.toString();
            ((zzcby)object2).zzw(throwable, (String)object);
        }
        return zzgft.zzh(null);
    }
}

