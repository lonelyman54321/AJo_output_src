/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbwv;
import com.google.android.gms.internal.ads.zzecf;
import com.google.android.gms.internal.ads.zzgez;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzecb
implements zzgez {
    public final /* synthetic */ zzecf zza;
    public final /* synthetic */ zzbwv zzb;

    public /* synthetic */ zzecb(zzecf zzecf2, zzbwv zzbwv2) {
        this.zza = zzecf2;
        this.zzb = zzbwv2;
    }

    public final ListenableFuture zza() {
        zzecf zzecf2 = this.zza;
        zzbwv zzbwv2 = this.zzb;
        return zzecf2.zza(zzbwv2);
    }
}

