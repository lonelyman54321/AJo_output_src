/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdxf;
import com.google.android.gms.internal.ads.zzfmc;
import java.util.concurrent.Callable;

public final class zzdwx
implements Callable {
    public final /* synthetic */ zzdxf zza;
    public final /* synthetic */ zzfmc zzb;

    public /* synthetic */ zzdwx(zzdxf zzdxf2, zzfmc zzfmc2) {
        this.zza = zzdxf2;
        this.zzb = zzfmc2;
    }

    public final Object call() {
        zzdxf zzdxf2 = this.zza;
        zzfmc zzfmc2 = this.zzb;
        zzdxf2.zzf(zzfmc2);
        return null;
    }
}

