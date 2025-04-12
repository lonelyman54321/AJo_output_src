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
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.zzan;
import com.google.android.gms.location.zzar;
import com.google.android.gms.location.zzq;

public final class LocationRequest$Builder {
    public static final long IMPLICIT_MAX_UPDATE_AGE = 255L;
    public static final long IMPLICIT_MIN_UPDATE_INTERVAL = 255L;
    private int zza;
    private long zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private int zzf;
    private float zzg;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private WorkSource zzm;
    private zze zzn;

    public LocationRequest$Builder(int n3, long l2) {
        this(l2);
        this.setPriority(n3);
    }

    public LocationRequest$Builder(long l2) {
        long l3;
        this.zza = 102;
        this.zzc = l3 = (long)-1;
        this.zzd = 0L;
        this.zze = Long.MAX_VALUE;
        this.zzf = -1 >>> 1;
        this.zzg = 0.0f;
        this.zzh = true;
        this.zzi = l3;
        this.zzj = 0;
        this.zzk = 0;
        this.zzl = false;
        this.zzm = null;
        this.zzn = null;
        this.setIntervalMillis(l2);
    }

    public LocationRequest$Builder(LocationRequest abstractSafeParcelable) {
        boolean bl2;
        boolean bl3;
        WorkSource workSource;
        boolean bl4;
        int bl32 = ((LocationRequest)abstractSafeParcelable).getPriority();
        long l2 = ((LocationRequest)abstractSafeParcelable).getIntervalMillis();
        this(bl32, l2);
        long l3 = ((LocationRequest)abstractSafeParcelable).getMinUpdateIntervalMillis();
        this.setMinUpdateIntervalMillis(l3);
        l3 = ((LocationRequest)abstractSafeParcelable).getMaxUpdateDelayMillis();
        this.setMaxUpdateDelayMillis(l3);
        l3 = ((LocationRequest)abstractSafeParcelable).getDurationMillis();
        this.setDurationMillis(l3);
        int n3 = ((LocationRequest)abstractSafeParcelable).getMaxUpdates();
        this.setMaxUpdates(n3);
        float f5 = ((LocationRequest)abstractSafeParcelable).getMinUpdateDistanceMeters();
        this.setMinUpdateDistanceMeters(f5);
        boolean bl5 = ((LocationRequest)abstractSafeParcelable).isWaitForAccurateLocation();
        this.setWaitForAccurateLocation(bl5);
        l3 = ((LocationRequest)abstractSafeParcelable).getMaxUpdateAgeMillis();
        this.setMaxUpdateAgeMillis(l3);
        int n4 = ((LocationRequest)abstractSafeParcelable).getGranularity();
        this.setGranularity(n4);
        int n7 = ((LocationRequest)abstractSafeParcelable).zza();
        zzar.zza(n7);
        this.zzk = n7;
        this.zzl = bl4 = ((LocationRequest)abstractSafeParcelable).zzb();
        this.zzm = workSource = ((LocationRequest)abstractSafeParcelable).zzc();
        abstractSafeParcelable = ((LocationRequest)abstractSafeParcelable).zzd();
        boolean bl6 = true;
        f5 = Float.MIN_VALUE;
        if (abstractSafeParcelable != null && (bl3 = ((zze)abstractSafeParcelable).zza())) {
            bl2 = false;
            f5 = 0.0f;
            workSource = null;
        }
        Preconditions.checkArgument(bl2);
        this.zzn = abstractSafeParcelable;
    }

    public LocationRequest build() {
        Object object;
        boolean bl2;
        float f5;
        LocationRequest$Builder locationRequest$Builder = this;
        int n3 = this.zza;
        long l2 = this.zzb;
        long l3 = this.zzc;
        long l4 = -1;
        long l7 = l3 - l4;
        Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object2 == false) {
            l3 = l2;
        } else {
            object2 = 105;
            f5 = 1.47E-43f;
            if (n3 != object2) {
                l3 = Math.min(l3, l2);
            }
        }
        long l8 = locationRequest$Builder.zzd;
        long l12 = locationRequest$Builder.zzb;
        l12 = Math.max(l8, l12);
        long l14 = locationRequest$Builder.zze;
        int n4 = locationRequest$Builder.zzf;
        f5 = locationRequest$Builder.zzg;
        boolean bl3 = bl2 = locationRequest$Builder.zzh;
        l8 = locationRequest$Builder.zzi;
        long l15 = l8 == l4 ? 0 : (l8 < l4 ? -1 : 1);
        long l16 = l15 == false ? (l4 = locationRequest$Builder.zzb) : l8;
        int n7 = locationRequest$Builder.zzj;
        int n8 = locationRequest$Builder.zzk;
        boolean bl4 = locationRequest$Builder.zzl;
        WorkSource workSource = object;
        WorkSource workSource2 = locationRequest$Builder.zzm;
        object = new WorkSource(workSource2);
        object = locationRequest$Builder.zzn;
        l4 = l12;
        l12 = l14;
        int n10 = n4;
        n4 = (int)(bl3 ? 1 : 0);
        LocationRequest locationRequest = new LocationRequest(n3, l2, l3, l4, Long.MAX_VALUE, l14, n10, f5, bl3, l16, n7, n8, bl4, workSource, (zze)object);
        return locationRequest;
    }

    public LocationRequest$Builder setDurationMillis(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object > 0;
        Preconditions.checkArgument(bl2, "durationMillis must be greater than 0");
        this.zze = l2;
        return this;
    }

    public LocationRequest$Builder setGranularity(int n3) {
        zzq.zza(n3);
        this.zzj = n3;
        return this;
    }

    public LocationRequest$Builder setIntervalMillis(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object >= 0;
        Preconditions.checkArgument(bl2, "intervalMillis must be greater than or equal to 0");
        this.zzb = l2;
        return this;
    }

    public LocationRequest$Builder setMaxUpdateAgeMillis(long l2) {
        long l3;
        long l4 = -1;
        boolean bl2 = true;
        Object object = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
        if (object != false && (object = (l3 = l2 - (l4 = 0L)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) < 0) {
            bl2 = false;
        }
        Preconditions.checkArgument(bl2, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
        this.zzi = l2;
        return this;
    }

    public LocationRequest$Builder setMaxUpdateDelayMillis(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object >= 0;
        Preconditions.checkArgument(bl2, "maxUpdateDelayMillis must be greater than or equal to 0");
        this.zzd = l2;
        return this;
    }

    public LocationRequest$Builder setMaxUpdates(int n3) {
        boolean bl2 = n3 > 0;
        Preconditions.checkArgument(bl2, "maxUpdates must be greater than 0");
        this.zzf = n3;
        return this;
    }

    public LocationRequest$Builder setMinUpdateDistanceMeters(float f5) {
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        object = object >= 0 ? (Object)true : (Object)false;
        Preconditions.checkArgument((boolean)object, "minUpdateDistanceMeters must be greater than or equal to 0");
        this.zzg = f5;
        return this;
    }

    public LocationRequest$Builder setMinUpdateIntervalMillis(long l2) {
        long l3;
        long l4 = -1;
        boolean bl2 = true;
        Object object = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
        if (object != false && (object = (l3 = l2 - (l4 = 0L)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) < 0) {
            bl2 = false;
        }
        Preconditions.checkArgument(bl2, "minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL");
        this.zzc = l2;
        return this;
    }

    public LocationRequest$Builder setPriority(int n3) {
        zzan.zza(n3);
        this.zza = n3;
        return this;
    }

    public LocationRequest$Builder setWaitForAccurateLocation(boolean bl2) {
        this.zzh = bl2;
        return this;
    }

    public final LocationRequest$Builder zza(int n3) {
        zzar.zza(n3);
        this.zzk = n3;
        return this;
    }

    public final LocationRequest$Builder zzb(boolean bl2) {
        this.zzl = bl2;
        return this;
    }

    public final LocationRequest$Builder zzc(WorkSource workSource) {
        this.zzm = workSource;
        return this;
    }
}

