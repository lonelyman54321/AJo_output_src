/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcqd;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzcpu
implements zzgfa {
    public final /* synthetic */ zzcqd zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzcpu(zzcqd zzcqd2, String string2) {
        this.zza = zzcqd2;
        this.zzb = string2;
    }

    public final ListenableFuture zza(Object object) {
        zzcqd zzcqd2 = this.zza;
        String string2 = this.zzb;
        object = (Throwable)object;
        return zzcqd2.zzc(string2, (Throwable)object);
    }
}

