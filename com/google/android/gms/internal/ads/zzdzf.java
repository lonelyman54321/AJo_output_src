/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzdzi;
import java.util.concurrent.Callable;

public final class zzdzf
implements Callable {
    public final /* synthetic */ zzdzi zza;
    public final /* synthetic */ zzbxu zzb;

    public /* synthetic */ zzdzf(zzdzi zzdzi2, zzbxu zzbxu2) {
        this.zza = zzdzi2;
        this.zzb = zzbxu2;
    }

    public final Object call() {
        zzdzi zzdzi2 = this.zza;
        zzbxu zzbxu2 = this.zzb;
        return zzdzi2.zza(zzbxu2);
    }
}

