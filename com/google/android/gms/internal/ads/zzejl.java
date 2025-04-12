/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdsh;
import com.google.android.gms.internal.ads.zzejo;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzejl
implements zzgfa {
    public final /* synthetic */ zzejo zza;
    public final /* synthetic */ zzfgt zzb;
    public final /* synthetic */ zzfhf zzc;
    public final /* synthetic */ zzdsh zzd;

    public /* synthetic */ zzejl(zzejo zzejo2, zzfgt zzfgt2, zzfhf zzfhf2, zzdsh zzdsh2) {
        this.zza = zzejo2;
        this.zzb = zzfgt2;
        this.zzc = zzfhf2;
        this.zzd = zzdsh2;
    }

    public final ListenableFuture zza(Object object) {
        zzejo zzejo2 = this.zza;
        zzfgt zzfgt2 = this.zzb;
        zzfhf zzfhf2 = this.zzc;
        zzdsh zzdsh2 = this.zzd;
        return zzejo2.zzc(zzfgt2, zzfhf2, zzdsh2, object);
    }
}

