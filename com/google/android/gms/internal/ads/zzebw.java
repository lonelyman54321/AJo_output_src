/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbwz;
import com.google.android.gms.internal.ads.zzebz;
import com.google.android.gms.internal.ads.zzgez;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzebw
implements zzgez {
    public final /* synthetic */ zzebz zza;
    public final /* synthetic */ zzbwz zzb;

    public /* synthetic */ zzebw(zzebz zzebz2, zzbwz zzbwz2) {
        this.zza = zzebz2;
        this.zzb = zzbwz2;
    }

    public final ListenableFuture zza() {
        zzebz zzebz2 = this.zza;
        zzbwz zzbwz2 = this.zzb;
        return zzebz2.zza(zzbwz2);
    }
}

