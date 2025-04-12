/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzfjl;
import com.google.android.gms.internal.ads.zzfjw;
import com.google.android.gms.internal.ads.zzfjx;
import com.google.android.gms.internal.ads.zzfke;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzfkc
implements zzgfa {
    public final /* synthetic */ zzfke zza;
    public final /* synthetic */ zzfjw zzb;
    public final /* synthetic */ zzfjc zzc;
    public final /* synthetic */ zzfjx zzd;

    public /* synthetic */ zzfkc(zzfke zzfke2, zzfjw zzfjw2, zzfjc zzfjc2, zzfjx zzfjx2) {
        this.zza = zzfke2;
        this.zzb = zzfjw2;
        this.zzc = zzfjc2;
        this.zzd = zzfjx2;
    }

    public final ListenableFuture zza(Object object) {
        zzfke zzfke2 = this.zza;
        zzfjw zzfjw2 = this.zzb;
        zzfjc zzfjc2 = this.zzc;
        zzfjx zzfjx2 = this.zzd;
        object = (zzfjl)object;
        return zzfke2.zzb(zzfjw2, zzfjc2, zzfjx2, (zzfjl)object);
    }
}

