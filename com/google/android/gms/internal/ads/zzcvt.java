/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzcvx;
import com.google.android.gms.internal.ads.zzfjj;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzcvt
implements zzgfa {
    public final /* synthetic */ zzcvx zza;
    public final /* synthetic */ zzfjj zzb;

    public /* synthetic */ zzcvt(zzcvx zzcvx2, zzfjj zzfjj2) {
        this.zza = zzcvx2;
        this.zzb = zzfjj2;
    }

    public final ListenableFuture zza(Object object) {
        zzcvx zzcvx2 = this.zza;
        zzfjj zzfjj2 = this.zzb;
        object = (zzbxu)object;
        return zzcvx2.zzf(zzfjj2, (zzbxu)object);
    }
}

