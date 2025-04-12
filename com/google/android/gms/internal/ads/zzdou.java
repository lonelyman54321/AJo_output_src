/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzdou
implements zzgfa {
    public /* synthetic */ zzdou(Object object) {
    }

    public final ListenableFuture zza(Object object) {
        object = (Exception)object;
        zze.zzb("Error during loading assets.", (Throwable)object);
        return zzgft.zzh(null);
    }
}

