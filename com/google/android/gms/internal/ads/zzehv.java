/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzcrq;
import com.google.android.gms.internal.ads.zzehw;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfxu;

public final class zzehv
implements zzfxu {
    public final /* synthetic */ zzehw zza;
    public final /* synthetic */ zzchd zzb;
    public final /* synthetic */ zzfgt zzc;
    public final /* synthetic */ zzcrq zzd;

    public /* synthetic */ zzehv(zzehw zzehw2, zzchd zzchd2, zzfgt zzfgt2, zzcrq zzcrq2) {
        this.zza = zzehw2;
        this.zzb = zzchd2;
        this.zzc = zzfgt2;
        this.zzd = zzcrq2;
    }

    public final Object apply(Object object) {
        object = this.zzb;
        Object object2 = this.zzc;
        boolean bl2 = ((zzfgt)object2).zzN;
        if (bl2) {
            object.zzah();
        }
        object2 = this.zzd;
        object.zzab();
        object.onPause();
        return ((zzcrq)object2).zza();
    }
}

