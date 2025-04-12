/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzdzi;
import com.google.android.gms.internal.ads.zzebh;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzdzh
implements zzgfa {
    public final /* synthetic */ zzdzi zza;
    public final /* synthetic */ zzbxu zzb;
    public final /* synthetic */ int zzc;

    public /* synthetic */ zzdzh(zzdzi zzdzi2, zzbxu zzbxu2, int n3) {
        this.zza = zzdzi2;
        this.zzb = zzbxu2;
        this.zzc = n3;
    }

    public final ListenableFuture zza(Object object) {
        zzdzi zzdzi2 = this.zza;
        zzbxu zzbxu2 = this.zzb;
        int n3 = this.zzc;
        object = (zzebh)object;
        return zzdzi2.zzb(zzbxu2, n3, (zzebh)object);
    }
}

