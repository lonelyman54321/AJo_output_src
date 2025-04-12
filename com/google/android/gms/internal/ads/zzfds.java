/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcys;
import com.google.android.gms.internal.ads.zzfdw;
import com.google.android.gms.internal.ads.zzfef;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzfds
implements zzgfa {
    public final /* synthetic */ zzfdw zza;
    public final /* synthetic */ zzcys zzb;

    public /* synthetic */ zzfds(zzfdw zzfdw2, zzcys zzcys2) {
        this.zza = zzfdw2;
        this.zzb = zzcys2;
    }

    public final ListenableFuture zza(Object object) {
        zzfdw zzfdw2 = this.zza;
        zzcys zzcys2 = this.zzb;
        object = (zzfef)object;
        return zzfdw2.zza(zzcys2, (zzfef)object);
    }
}

