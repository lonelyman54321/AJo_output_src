/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcvx;
import com.google.android.gms.internal.ads.zzcys;
import com.google.android.gms.internal.ads.zzfdj;
import com.google.android.gms.internal.ads.zzfdk;
import com.google.android.gms.internal.ads.zzfei;
import com.google.android.gms.internal.ads.zzfej;
import com.google.android.gms.internal.ads.zzfek;
import com.google.android.gms.internal.ads.zzfel;
import com.google.android.gms.internal.ads.zzfeo;
import com.google.android.gms.internal.ads.zzfjl;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzgfk;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzggk;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

public final class zzfdl
implements zzfek {
    private zzcys zza;
    private final Executor zzb;

    public zzfdl() {
        Executor executor;
        this.zzb = executor = zzggk.zzb();
    }

    public final zzcys zza() {
        return this.zza;
    }

    public final ListenableFuture zzb(zzfel object, zzfej object2, zzcys object3) {
        object = ((zzfel)object).zzb;
        object = object2.zza((zzfei)object);
        object2 = new zzfeo(true);
        object.zzb((zzfeo)object2);
        this.zza = object = (zzcys)object.zzh();
        object = object.zzb();
        object2 = new zzfjl();
        object3 = zzgfk.zzu(((zzcvx)object).zzj());
        zzfdj zzfdj2 = new zzfdj(this, (zzfjl)object2, (zzcvx)object);
        object = this.zzb;
        object = zzgft.zzn((ListenableFuture)object3, zzfdj2, (Executor)object);
        object3 = new zzfdk((zzfjl)object2);
        object2 = this.zzb;
        return zzgft.zzm((ListenableFuture)object, (zzfxu)object3, (Executor)object2);
    }

    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}

