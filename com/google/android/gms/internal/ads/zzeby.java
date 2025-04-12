/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbwz;
import com.google.android.gms.internal.ads.zzebh;
import com.google.android.gms.internal.ads.zzebz;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzeby
implements zzgfa {
    public final /* synthetic */ zzebz zza;
    public final /* synthetic */ zzbwz zzb;
    public final /* synthetic */ int zzc;

    public /* synthetic */ zzeby(zzebz zzebz2, zzbwz zzbwz2, int n3) {
        this.zza = zzebz2;
        this.zzb = zzbwz2;
        this.zzc = n3;
    }

    public final ListenableFuture zza(Object object) {
        zzebz zzebz2 = this.zza;
        zzbwz zzbwz2 = this.zzb;
        int n3 = this.zzc;
        object = (zzebh)object;
        return zzebz2.zzb(zzbwz2, n3, (zzebh)object);
    }
}

