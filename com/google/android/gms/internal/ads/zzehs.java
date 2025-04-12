/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdsh;
import com.google.android.gms.internal.ads.zzehw;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzehs
implements zzgfa {
    public final /* synthetic */ zzehw zza;
    public final /* synthetic */ zzfgt zzb;
    public final /* synthetic */ zzfhf zzc;
    public final /* synthetic */ zzdsh zzd;

    public /* synthetic */ zzehs(zzehw zzehw2, zzfgt zzfgt2, zzfhf zzfhf2, zzdsh zzdsh2) {
        this.zza = zzehw2;
        this.zzb = zzfgt2;
        this.zzc = zzfhf2;
        this.zzd = zzdsh2;
    }

    public final ListenableFuture zza(Object object) {
        zzehw zzehw2 = this.zza;
        zzfgt zzfgt2 = this.zzb;
        zzfhf zzfhf2 = this.zzc;
        zzdsh zzdsh2 = this.zzd;
        return zzehw2.zzc(zzfgt2, zzfhf2, zzdsh2, object);
    }
}

