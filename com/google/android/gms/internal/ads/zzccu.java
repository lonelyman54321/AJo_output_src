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
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzccp;
import com.google.android.gms.internal.ads.zzccr;
import com.google.android.gms.internal.ads.zzccs;
import com.google.android.gms.internal.ads.zzcct;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public class zzccu {
    private final zzccn zza;
    private final AtomicInteger zzb;

    public zzccu() {
        zzccn zzccn2;
        this.zza = zzccn2 = new zzccn();
        Object object = new AtomicInteger(0);
        this.zzb = object;
        object = new zzccs(this);
        zzgge zzgge2 = zzcci.zzf;
        zzgft.zzr(zzccn2, (zzgfp)object, zzgge2);
    }

    public static /* bridge */ /* synthetic */ AtomicInteger zzf(zzccu zzccu2) {
        return zzccu2.zzb;
    }

    public final int zze() {
        return this.zzb.get();
    }

    public final void zzg() {
        Exception exception = new Exception();
        this.zza.zzd(exception);
    }

    public final void zzh(Throwable throwable, String string2) {
        this.zza.zzd(throwable);
        Object object = zzbep.zzhO;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            object = zzu.zzo();
            ((zzcby)object).zzv(throwable, string2);
        }
    }

    public final void zzi(Object object) {
        this.zza.zzc(object);
    }

    public final void zzj(zzccr object, zzccp object2) {
        zzcct zzcct2 = new zzcct(this, (zzccr)object, (zzccp)object2);
        object = this.zza;
        object2 = zzcci.zzf;
        zzgft.zzr((ListenableFuture)object, zzcct2, (Executor)object2);
    }
}

