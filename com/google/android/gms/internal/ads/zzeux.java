/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.signalgeneration.zzp;
import com.google.android.gms.internal.ads.zzeuw;
import com.google.android.gms.internal.ads.zzeuy;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzeux
implements zzexw {
    private final zzgge zza;
    private final zzfho zzb;

    public zzeux(zzgge zzgge2, zzfho zzfho2) {
        this.zza = zzgge2;
        this.zzb = zzfho2;
    }

    public final int zza() {
        return 21;
    }

    public final ListenableFuture zzb() {
        zzeuw zzeuw2 = new zzeuw(this);
        return this.zza.zzb(zzeuw2);
    }

    public final /* synthetic */ zzeuy zzc() {
        String string2 = zzp.zzc(this.zzb.zzd);
        boolean bl2 = "requester_type_2".equals(string2);
        zzeuy zzeuy2 = new zzeuy(bl2);
        return zzeuy2;
    }
}

