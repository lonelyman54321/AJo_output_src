/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzdri;
import com.google.android.gms.internal.ads.zzemi;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfxu;

public final class zzeme
implements zzfxu {
    public final /* synthetic */ zzemi zza;
    public final /* synthetic */ zzchd zzb;
    public final /* synthetic */ zzfgt zzc;
    public final /* synthetic */ zzdri zzd;

    public /* synthetic */ zzeme(zzemi zzemi2, zzchd zzchd2, zzfgt zzfgt2, zzdri zzdri2) {
        this.zza = zzemi2;
        this.zzb = zzchd2;
        this.zzc = zzfgt2;
        this.zzd = zzdri2;
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
        return ((zzdri)object2).zzi();
    }
}

