/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdow;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzdol
implements zzgfa {
    public final /* synthetic */ zzdow zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzdol(zzdow zzdow2, String string2) {
        this.zza = zzdow2;
        this.zzb = string2;
    }

    public final ListenableFuture zza(Object object) {
        zzdow zzdow2 = this.zza;
        String string2 = this.zzb;
        return zzdow2.zzc(string2, object);
    }
}

