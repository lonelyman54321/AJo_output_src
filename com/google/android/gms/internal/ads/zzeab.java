/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzeac;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzeab
implements zzgfa {
    public final /* synthetic */ zzeac zza;
    public final /* synthetic */ zzbxu zzb;
    public final /* synthetic */ int zzc;

    public /* synthetic */ zzeab(zzeac zzeac2, zzbxu zzbxu2, int n3) {
        this.zza = zzeac2;
        this.zzb = zzbxu2;
        this.zzc = n3;
    }

    public final ListenableFuture zza(Object object) {
        zzeac zzeac2 = this.zza;
        zzbxu zzbxu2 = this.zzb;
        int n3 = this.zzc;
        object = (Throwable)object;
        return zzeac2.zzb(zzbxu2, n3, (Throwable)object);
    }
}

