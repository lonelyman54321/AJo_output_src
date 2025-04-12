/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbpu;
import com.google.android.gms.internal.ads.zzbqt;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzbqr
implements zzgfa {
    public final /* synthetic */ zzbqt zza;
    public final /* synthetic */ Object zzb;

    public /* synthetic */ zzbqr(zzbqt zzbqt2, Object object) {
        this.zza = zzbqt2;
        this.zzb = object;
    }

    public final ListenableFuture zza(Object object) {
        zzbqt zzbqt2 = this.zza;
        Object object2 = this.zzb;
        object = (zzbpu)object;
        return zzbqt2.zzc(object2, (zzbpu)object);
    }
}

