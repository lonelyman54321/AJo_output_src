/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzdih;
import com.google.android.gms.internal.ads.zzejo;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfxu;

public final class zzejk
implements zzfxu {
    public final /* synthetic */ zzejo zza;
    public final /* synthetic */ zzchd zzb;
    public final /* synthetic */ zzfgt zzc;
    public final /* synthetic */ zzdih zzd;

    public /* synthetic */ zzejk(zzejo zzejo2, zzchd zzchd2, zzfgt zzfgt2, zzdih zzdih2) {
        this.zza = zzejo2;
        this.zzb = zzchd2;
        this.zzc = zzfgt2;
        this.zzd = zzdih2;
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
        return ((zzdih)object2).zzg();
    }
}

