/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

public final class zzbzv
implements zzgfa {
    public final /* synthetic */ zzcaa zza;

    public /* synthetic */ zzbzv(zzcaa zzcaa2) {
        this.zza = zzcaa2;
    }

    public final ListenableFuture zza(Object object) {
        zzcaa zzcaa2 = this.zza;
        object = (Map)object;
        return zzcaa2.zzb((Map)object);
    }
}

