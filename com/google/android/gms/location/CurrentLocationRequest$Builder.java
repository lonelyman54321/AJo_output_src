/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.WorkSource
 */
package com.google.android.gms.location;

import android.os.WorkSource;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.location.zze;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.zzan;
import com.google.android.gms.location.zzq;

public final class CurrentLocationRequest$Builder {
    private long zza;
    private int zzb;
    private int zzc;
    private long zzd;
    private final boolean zze;
    private final int zzf;
    private final WorkSource zzg;
    private final zze zzh;

    public CurrentLocationRequest$Builder() {
        this.zza = 10000L;
        this.zzb = 0;
        this.zzc = 102;
        this.zzd = Long.MAX_VALUE;
        this.zze = false;
        this.zzf = 0;
        this.zzg = null;
        this.zzh = null;
    }

    public CurrentLocationRequest$Builder(CurrentLocationRequest abstractSafeParcelable) {
        WorkSource workSource;
        int n3;
        long l2;
        this.zza = l2 = abstractSafeParcelable.getMaxUpdateAgeMillis();
        this.zzb = n3 = abstractSafeParcelable.getGranularity();
        this.zzc = n3 = abstractSafeParcelable.getPriority();
        this.zzd = l2 = abstractSafeParcelable.getDurationMillis();
        n3 = (int)(abstractSafeParcelable.zza() ? 1 : 0);
        this.zze = n3;
        this.zzf = n3 = abstractSafeParcelable.zzb();
        WorkSource workSource2 = abstractSafeParcelable.zzc();
        this.zzg = workSource = new WorkSource(workSource2);
        abstractSafeParcelable = abstractSafeParcelable.zzd();
        this.zzh = abstractSafeParcelable;
    }

    public CurrentLocationRequest build() {
        CurrentLocationRequest currentLocationRequest;
        long l2 = this.zza;
        int n3 = this.zzb;
        int n4 = this.zzc;
        long l3 = this.zzd;
        Object object = this.zzg;
        WorkSource workSource = new WorkSource(object);
        boolean bl2 = this.zze;
        int n7 = this.zzf;
        zze zze2 = this.zzh;
        object = currentLocationRequest;
        currentLocationRequest = new CurrentLocationRequest(l2, n3, n4, l3, bl2, n7, workSource, zze2);
        return currentLocationRequest;
    }

    public CurrentLocationRequest$Builder setDurationMillis(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object > 0;
        Preconditions.checkArgument(bl2, "durationMillis must be greater than 0");
        this.zzd = l2;
        return this;
    }

    public CurrentLocationRequest$Builder setGranularity(int n3) {
        zzq.zza(n3);
        this.zzb = n3;
        return this;
    }

    public CurrentLocationRequest$Builder setMaxUpdateAgeMillis(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object >= 0;
        Preconditions.checkArgument(bl2, "maxUpdateAgeMillis must be greater than or equal to 0");
        this.zza = l2;
        return this;
    }

    public CurrentLocationRequest$Builder setPriority(int n3) {
        zzan.zza(n3);
        this.zzc = n3;
        return this;
    }
}

