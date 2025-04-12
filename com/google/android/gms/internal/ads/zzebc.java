/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzdzd;
import com.google.android.gms.internal.ads.zzebg;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzhlg;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzebc
implements zzgfa {
    public final /* synthetic */ zzhlg zza;
    public final /* synthetic */ zzbxu zzb;

    public /* synthetic */ zzebc(zzhlg zzhlg2, zzbxu zzbxu2) {
        this.zza = zzhlg2;
        this.zzb = zzbxu2;
    }

    public final ListenableFuture zza(Object object) {
        object = (zzdzd)object;
        object = (zzebg)this.zza.zzb();
        zzbxu zzbxu2 = this.zzb;
        return object.zzb(zzbxu2);
    }
}

