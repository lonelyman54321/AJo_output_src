/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfdq;
import com.google.android.gms.internal.ads.zzfjv;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzfdm
implements zzgfa {
    public final /* synthetic */ zzfdq zza;

    public /* synthetic */ zzfdm(zzfdq zzfdq2) {
        this.zza = zzfdq2;
    }

    public final ListenableFuture zza(Object object) {
        zzfdq zzfdq2 = this.zza;
        object = (zzfjv)object;
        return zzfdq2.zze((zzfjv)object);
    }
}

