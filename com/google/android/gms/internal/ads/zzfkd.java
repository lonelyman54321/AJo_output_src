/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfjw;
import com.google.android.gms.internal.ads.zzfke;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzfkd
implements zzgfa {
    public final /* synthetic */ zzfke zza;
    public final /* synthetic */ zzfjw zzb;

    public /* synthetic */ zzfkd(zzfke zzfke2, zzfjw zzfjw2) {
        this.zza = zzfke2;
        this.zzb = zzfjw2;
    }

    public final ListenableFuture zza(Object object) {
        zzfke zzfke2 = this.zza;
        zzfjw zzfjw2 = this.zzb;
        object = (Exception)object;
        return zzfke2.zzc(zzfjw2, (Exception)object);
    }
}

