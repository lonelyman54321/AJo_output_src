/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzebh;
import com.google.android.gms.internal.ads.zzebt;
import com.google.android.gms.internal.ads.zzebu;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzebr
implements zzgfa {
    public final /* synthetic */ zzebu zza;
    public final /* synthetic */ zzebt zzb;
    public final /* synthetic */ zzbxu zzc;
    public final /* synthetic */ zzgfa zzd;

    public /* synthetic */ zzebr(zzebu zzebu2, zzebt zzebt2, zzbxu zzbxu2, zzgfa zzgfa2) {
        this.zza = zzebu2;
        this.zzb = zzebt2;
        this.zzc = zzbxu2;
        this.zzd = zzgfa2;
    }

    public final ListenableFuture zza(Object object) {
        zzebu zzebu2 = this.zza;
        zzebt zzebt2 = this.zzb;
        zzbxu zzbxu2 = this.zzc;
        zzgfa zzgfa2 = this.zzd;
        object = (zzebh)object;
        return zzebu2.zzc(zzebt2, zzbxu2, zzgfa2, (zzebh)object);
    }
}

