/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzehl;
import com.google.android.gms.internal.ads.zzelm;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzelk
implements zzgfa {
    public final /* synthetic */ zzelm zza;
    public final /* synthetic */ zzfgt zzb;
    public final /* synthetic */ zzfhf zzc;
    public final /* synthetic */ zzehl zzd;

    public /* synthetic */ zzelk(zzelm zzelm2, zzfgt zzfgt2, zzfhf zzfhf2, zzehl zzehl2) {
        this.zza = zzelm2;
        this.zzb = zzfgt2;
        this.zzc = zzfhf2;
        this.zzd = zzehl2;
    }

    public final ListenableFuture zza(Object object) {
        zzelm zzelm2 = this.zza;
        zzfgt zzfgt2 = this.zzb;
        zzfhf zzfhf2 = this.zzc;
        zzehl zzehl2 = this.zzd;
        object = (Throwable)object;
        return zzelm2.zzb(zzfgt2, zzfhf2, zzehl2, (Throwable)object);
    }
}

