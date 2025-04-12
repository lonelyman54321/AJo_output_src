/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzehl;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzehm
implements zzehl {
    public final zzehl zza;
    private final zzfxu zzb;

    public zzehm(zzehl zzehl2, zzfxu zzfxu2) {
        this.zza = zzehl2;
        this.zzb = zzfxu2;
    }

    public final ListenableFuture zza(zzfhf object, zzfgt object2) {
        object = this.zza.zza((zzfhf)object, (zzfgt)object2);
        object2 = this.zzb;
        zzgge zzgge2 = zzcci.zza;
        return zzgft.zzm((ListenableFuture)object, (zzfxu)object2, zzgge2);
    }

    public final boolean zzb(zzfhf zzfhf2, zzfgt zzfgt2) {
        return this.zza.zzb(zzfhf2, zzfgt2);
    }
}

