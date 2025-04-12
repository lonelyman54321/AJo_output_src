/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzexv;
import com.google.android.gms.internal.ads.zzfho;

public final class zzeqj
implements zzexv {
    final zzfho zza;
    private final long zzb;

    public zzeqj(zzfho zzfho2, long l2) {
        Preconditions.checkNotNull(zzfho2, "the targeting must not be null");
        this.zza = zzfho2;
        this.zzb = l2;
    }
}

