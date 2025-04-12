/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzara;
import com.google.android.gms.internal.ads.zzdof;
import com.google.android.gms.internal.ads.zzfxu;

public final class zzdoe
implements zzfxu {
    public final /* synthetic */ zzdof zza;
    public final /* synthetic */ double zzb;
    public final /* synthetic */ boolean zzc;

    public /* synthetic */ zzdoe(zzdof zzdof2, double d2, boolean bl2) {
        this.zza = zzdof2;
        this.zzb = d2;
        this.zzc = bl2;
    }

    public final Object apply(Object object) {
        zzdof zzdof2 = this.zza;
        double d2 = this.zzb;
        boolean bl2 = this.zzc;
        object = (zzara)object;
        return zzdof2.zza(d2, bl2, (zzara)object);
    }
}

