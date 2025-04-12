/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcup;
import com.google.android.gms.internal.ads.zzcve;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzcvb
implements zzgfa {
    public final /* synthetic */ zzcve zza;
    public final /* synthetic */ zzgfp zzb;
    public final /* synthetic */ ListenableFuture zzc;

    public /* synthetic */ zzcvb(zzcve zzcve2, zzgfp zzgfp2, ListenableFuture listenableFuture) {
        this.zza = zzcve2;
        this.zzb = zzgfp2;
        this.zzc = listenableFuture;
    }

    public final ListenableFuture zza(Object object) {
        zzcve zzcve2 = this.zza;
        zzgfp zzgfp2 = this.zzb;
        ListenableFuture listenableFuture = this.zzc;
        object = (zzcup)object;
        return zzcve2.zza(zzgfp2, listenableFuture, (zzcup)object);
    }
}

