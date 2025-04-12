/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzcot;
import com.google.android.gms.internal.ads.zzcpb;
import com.google.android.gms.internal.ads.zzehj;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgfk;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

final class zzcpc
implements zzcot {
    ListenableFuture zza;
    private final zzehj zzb;

    public zzcpc(zzehj zzehj2) {
        this.zzb = zzehj2;
    }

    public final void zza(Map object) {
        object = zzbep.zzkt;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (!bl2) {
            return;
        }
        object = zzgfk.zzu(this.zzb.zza(true));
        object2 = new zzcpb();
        zzgge zzgge2 = zzcci.zza;
        this.zza = object = zzgft.zzf((ListenableFuture)object, Throwable.class, (zzgfa)object2, zzgge2);
    }
}

