/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcbm;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzfak;
import com.google.android.gms.internal.ads.zzgfs;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class zzfal
implements zzexw {
    final zzgge zza;
    final String zzb;
    final zzcbm zzc;

    public zzfal(zzcbm zzcbm2, zzgge zzgge2, String string2) {
        this.zzc = zzcbm2;
        this.zza = zzgge2;
        this.zzb = string2;
    }

    public final int zza() {
        return 47;
    }

    public final ListenableFuture zzb() {
        Object object = null;
        ListenableFuture listenableFuture = zzgft.zzh(null);
        Object object2 = zzbep.zzfX;
        Object object3 = zzba.zzc();
        object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
        boolean bl2 = (Boolean)object2;
        if (bl2) {
            listenableFuture = zzgft.zzh(null);
        }
        object = zzgft.zzh(null);
        object2 = new ListenableFuture[]{listenableFuture, object};
        object2 = zzgft.zzc((ListenableFuture[])object2);
        object3 = new zzfak(listenableFuture, (ListenableFuture)object);
        object = zzcci.zza;
        return ((zzgfs)object2).zza((Callable)object3, (Executor)object);
    }
}

