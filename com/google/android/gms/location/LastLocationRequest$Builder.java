/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.location.zze;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.zzq;

public final class LastLocationRequest$Builder {
    private long zza;
    private int zzb;
    private final boolean zzc;
    private final zze zzd;

    public LastLocationRequest$Builder() {
        this.zza = Long.MAX_VALUE;
        this.zzb = 0;
        this.zzc = false;
        this.zzd = null;
    }

    public LastLocationRequest$Builder(LastLocationRequest abstractSafeParcelable) {
        int n3;
        long l2;
        this.zza = l2 = abstractSafeParcelable.getMaxUpdateAgeMillis();
        this.zzb = n3 = abstractSafeParcelable.getGranularity();
        n3 = (int)(abstractSafeParcelable.zza() ? 1 : 0);
        this.zzc = n3;
        abstractSafeParcelable = abstractSafeParcelable.zzb();
        this.zzd = abstractSafeParcelable;
    }

    public LastLocationRequest build() {
        long l2 = this.zza;
        int n3 = this.zzb;
        boolean bl2 = this.zzc;
        zze zze2 = this.zzd;
        LastLocationRequest lastLocationRequest = new LastLocationRequest(l2, n3, bl2, zze2);
        return lastLocationRequest;
    }

    public LastLocationRequest$Builder setGranularity(int n3) {
        zzq.zza(n3);
        this.zzb = n3;
        return this;
    }

    public LastLocationRequest$Builder setMaxUpdateAgeMillis(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object > 0;
        Preconditions.checkArgument(bl2, "maxUpdateAgeMillis must be greater than 0");
        this.zza = l2;
        return this;
    }
}

