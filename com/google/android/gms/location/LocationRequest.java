/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.os.SystemClock
 *  android.os.WorkSource
 */
package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.internal.location.zze;
import com.google.android.gms.internal.location.zzeo;
import com.google.android.gms.location.zzaf;
import com.google.android.gms.location.zzan;
import com.google.android.gms.location.zzar;
import com.google.android.gms.location.zzq;

public final class LocationRequest
extends AbstractSafeParcelable
implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
    public static final int PRIORITY_HIGH_ACCURACY = 100;
    public static final int PRIORITY_LOW_POWER = 104;
    public static final int PRIORITY_NO_POWER = 105;
    private int zza;
    private long zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private int zzf;
    private float zzg;
    private boolean zzh;
    private long zzi;
    private final int zzj;
    private final int zzk;
    private final boolean zzl;
    private final WorkSource zzm;
    private final zze zzn;

    static {
        zzaf zzaf2 = new zzaf();
        CREATOR = zzaf2;
    }

    public LocationRequest() {
        WorkSource workSource = new WorkSource();
        long l2 = Long.MAX_VALUE;
        this(102, 3600000L, 600000L, 0L, l2, l2, -1 >>> 1, 0.0f, true, 3600000L, 0, 0, false, workSource, null);
    }

    public LocationRequest(int n3, long l2, long l3, long l4, long l7, long l8, int n4, float f5, boolean bl2, long l12, int n7, int n8, boolean bl3, WorkSource workSource, zze zze2) {
        long l14;
        LocationRequest locationRequest = this;
        this.zza = n3;
        int n10 = 105;
        long l15 = Long.MAX_VALUE;
        if (n3 == n10) {
            this.zzb = l15;
            l14 = l2;
        } else {
            l14 = l2;
            this.zzb = l2;
        }
        locationRequest.zzc = l3;
        locationRequest.zzd = l4;
        long l16 = l7 == l15 ? 0 : (l7 < l15 ? -1 : 1);
        if (l16 == false) {
            l15 = l8;
        } else {
            l15 = SystemClock.elapsedRealtime();
            l15 = l7 - l15;
            l15 = Math.min(Math.max(1L, l15), l8);
        }
        locationRequest.zze = l15;
        locationRequest.zzf = n4;
        locationRequest.zzg = f5;
        locationRequest.zzh = bl2;
        l15 = -1;
        l16 = l12 == l15 ? 0 : (l12 < l15 ? -1 : 1);
        if (l16 != false) {
            l14 = l12;
        }
        locationRequest.zzi = l14;
        locationRequest.zzj = n7;
        locationRequest.zzk = n8;
        locationRequest.zzl = bl3;
        locationRequest.zzm = workSource;
        locationRequest.zzn = zze2;
    }

    public static LocationRequest create() {
        WorkSource workSource = new WorkSource();
        long l2 = Long.MAX_VALUE;
        LocationRequest locationRequest = new LocationRequest(102, 3600000L, 600000L, 0L, l2, l2, -1 >>> 1, 0.0f, true, 3600000L, 0, 0, false, workSource, null);
        return locationRequest;
    }

    private static String zze(long l2) {
        long l3 = Long.MAX_VALUE;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            return "\u221e";
        }
        return zzeo.zzb(l2);
    }

    public boolean equals(Object object) {
        int n3 = object instanceof LocationRequest;
        if (n3 != 0) {
            boolean bl2;
            WorkSource workSource;
            Object object2;
            float f5;
            float f6;
            float f7;
            long l2;
            long l3;
            long l4;
            long l7;
            long l8;
            long l12;
            object = (LocationRequest)object;
            n3 = this.zza;
            int n4 = ((LocationRequest)object).zza;
            if (!(n3 != n4 || (n3 = (int)(this.isPassive() ? 1 : 0)) == 0 && (n3 = (int)((l12 = (l8 = this.zzb) - (l7 = ((LocationRequest)object).zzb)) == 0L ? 0 : (l12 < 0L ? -1 : 1))) != 0 || (n3 = (int)((l4 = (l8 = this.zzc) - (l7 = ((LocationRequest)object).zzc)) == 0L ? 0 : (l4 < 0L ? -1 : 1))) != 0 || (n3 = (int)(this.isBatched() ? 1 : 0)) != (n4 = (int)(((LocationRequest)object).isBatched() ? 1 : 0)) || (n3 = (int)(this.isBatched() ? 1 : 0)) != 0 && (n3 = (int)((l3 = (l8 = this.zzd) - (l7 = ((LocationRequest)object).zzd)) == 0L ? 0 : (l3 < 0L ? -1 : 1))) != 0 || (n3 = (int)((l2 = (l8 = this.zze) - (l7 = ((LocationRequest)object).zze)) == 0L ? 0 : (l2 < 0L ? -1 : 1))) != 0 || (n3 = this.zzf) != (n4 = ((LocationRequest)object).zzf) || (n3 = (int)((f7 = (f6 = this.zzg) - (f5 = ((LocationRequest)object).zzg)) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1))) != 0 || (n3 = (int)(this.zzh ? 1 : 0)) != (n4 = (int)(((LocationRequest)object).zzh ? 1 : 0)) || (n3 = this.zzj) != (n4 = ((LocationRequest)object).zzj) || (n3 = this.zzk) != (n4 = ((LocationRequest)object).zzk) || (n3 = (int)(this.zzl ? 1 : 0)) != (n4 = (int)(((LocationRequest)object).zzl ? 1 : 0)) || (n3 = (int)((object2 = this.zzm).equals((Object)(workSource = ((LocationRequest)object).zzm)) ? 1 : 0)) == 0 || !(bl2 = Objects.equal(object2 = this.zzn, object = ((LocationRequest)object).zzn)))) {
                return true;
            }
        }
        return false;
    }

    public long getDurationMillis() {
        return this.zze;
    }

    public long getExpirationTime() {
        long l2 = SystemClock.elapsedRealtime();
        long l3 = this.zze;
        long l4 = l2 + l3;
        l2 ^= l4;
        l3 ^= l4;
        long l7 = (l2 &= l3) - (l3 = 0L);
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object < 0) {
            return Long.MAX_VALUE;
        }
        return l4;
    }

    public long getFastestInterval() {
        return this.getMinUpdateIntervalMillis();
    }

    public int getGranularity() {
        return this.zzj;
    }

    public long getInterval() {
        return this.getIntervalMillis();
    }

    public long getIntervalMillis() {
        return this.zzb;
    }

    public long getMaxUpdateAgeMillis() {
        return this.zzi;
    }

    public long getMaxUpdateDelayMillis() {
        return this.zzd;
    }

    public int getMaxUpdates() {
        return this.zzf;
    }

    public long getMaxWaitTime() {
        long l2 = this.zzd;
        long l3 = this.zzb;
        return Math.max(l2, l3);
    }

    public float getMinUpdateDistanceMeters() {
        return this.zzg;
    }

    public long getMinUpdateIntervalMillis() {
        return this.zzc;
    }

    public int getNumUpdates() {
        return this.getMaxUpdates();
    }

    public int getPriority() {
        return this.zza;
    }

    public float getSmallestDisplacement() {
        return this.getMinUpdateDistanceMeters();
    }

    public int hashCode() {
        Integer n3 = this.zza;
        Long l2 = this.zzb;
        Long l3 = this.zzc;
        WorkSource workSource = this.zzm;
        Object[] objectArray = new Object[]{n3, l2, l3, workSource};
        return Objects.hashCode(objectArray);
    }

    public boolean isBatched() {
        long l2;
        boolean bl2;
        long l3;
        long l4;
        long l7 = this.zzd;
        long l8 = 0L;
        long l12 = l7 - l8;
        Object object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object > 0 && (l4 = (l3 = (l7 >>= (bl2 = true)) - (l2 = this.zzb)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) >= 0) {
            return bl2;
        }
        return false;
    }

    public boolean isFastestIntervalExplicitlySet() {
        return true;
    }

    public boolean isPassive() {
        int n3 = this.zza;
        int n4 = 105;
        return n3 == n4;
    }

    public boolean isWaitForAccurateLocation() {
        return this.zzh;
    }

    public LocationRequest setExpirationDuration(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object > 0;
        Preconditions.checkArgument(bl2, "durationMillis must be greater than 0");
        this.zze = l2;
        return this;
    }

    public LocationRequest setExpirationTime(long l2) {
        long l3 = SystemClock.elapsedRealtime();
        l2 -= l3;
        this.zze = l2 = Math.max(1L, l2);
        return this;
    }

    public LocationRequest setFastestInterval(long l2) {
        Long l3 = l2;
        boolean bl2 = true;
        Object[] objectArray = new Object[bl2];
        objectArray[0] = l3;
        long l4 = 0L;
        long l7 = l2 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object < 0) {
            bl2 = false;
        }
        Preconditions.checkArgument(bl2, "illegal fastest interval: %d", objectArray);
        this.zzc = l2;
        return this;
    }

    public LocationRequest setInterval(long l2) {
        long l3;
        long l4;
        long l7 = 0L;
        long l8 = l2 - l7;
        Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        boolean bl2 = object >= 0;
        String string2 = "intervalMillis must be greater than or equal to 0";
        Preconditions.checkArgument(bl2, string2);
        l7 = this.zzc;
        long l12 = this.zzb;
        long l14 = 6;
        long l15 = l12 / l14;
        long l16 = l7 == l15 ? 0 : (l7 < l15 ? -1 : 1);
        if (l16 == false) {
            this.zzc = l7 = l2 / l14;
        }
        if ((l4 = (l3 = (l7 = this.zzi) - l12) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) {
            this.zzi = l2;
        }
        this.zzb = l2;
        return this;
    }

    public LocationRequest setMaxWaitTime(long l2) {
        Long l3 = l2;
        boolean bl2 = true;
        Object[] objectArray = new Object[bl2];
        objectArray[0] = l3;
        long l4 = 0L;
        long l7 = l2 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object < 0) {
            bl2 = false;
        }
        Preconditions.checkArgument(bl2, "illegal max wait time: %d", objectArray);
        this.zzd = l2;
        return this;
    }

    public LocationRequest setNumUpdates(int n3) {
        if (n3 > 0) {
            this.zzf = n3;
            return this;
        }
        int n4 = String.valueOf(n3).length();
        StringBuilder stringBuilder = new StringBuilder(n4 += 20);
        stringBuilder.append("invalid numUpdates: ");
        stringBuilder.append(n3);
        String string2 = stringBuilder.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public LocationRequest setPriority(int n3) {
        zzan.zza(n3);
        this.zza = n3;
        return this;
    }

    public LocationRequest setSmallestDisplacement(float f5) {
        IllegalArgumentException illegalArgumentException = null;
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
        if (object >= 0) {
            this.zzg = f5;
            return this;
        }
        int n3 = String.valueOf(f5).length();
        StringBuilder stringBuilder = new StringBuilder(n3 += 22);
        stringBuilder.append("invalid displacement: ");
        stringBuilder.append(f5);
        String string2 = stringBuilder.toString();
        illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public LocationRequest setWaitForAccurateLocation(boolean bl2) {
        this.zzh = bl2;
        return this;
    }

    public String toString() {
        int n3;
        long l2;
        long l3;
        long l4;
        long l7;
        long l8;
        long l12;
        long l14;
        long l15;
        long l16;
        Object object;
        StringBuilder stringBuilder = Ex0.a("Request[");
        int n4 = this.isPassive();
        String string2 = "/";
        if (n4 != 0) {
            object = zzan.zzb(this.zza);
            stringBuilder.append((String)object);
            l16 = this.zzd;
            long l17 = 0L;
            n4 = l16 == l17 ? 0 : (l16 < l17 ? -1 : 1);
            if (n4 > 0) {
                stringBuilder.append(string2);
                l15 = this.zzd;
                zzeo.zzc(l15, stringBuilder);
            }
        } else {
            object = "@";
            stringBuilder.append((String)object);
            n4 = this.isBatched();
            if (n4 != 0) {
                l16 = this.zzb;
                zzeo.zzc(l16, stringBuilder);
                stringBuilder.append(string2);
                l15 = this.zzd;
                zzeo.zzc(l15, stringBuilder);
            } else {
                l15 = this.zzb;
                zzeo.zzc(l15, stringBuilder);
            }
            stringBuilder.append(" ");
            n4 = this.zza;
            object = zzan.zzb(n4);
            stringBuilder.append((String)object);
        }
        if ((n4 = (int)(this.isPassive() ? 1 : 0)) != 0 || (l14 = (l12 = (l15 = this.zzc) - (l16 = this.zzb)) == 0L ? 0 : (l12 < 0L ? -1 : 1)) != false) {
            stringBuilder.append(", minUpdateInterval=");
            l15 = this.zzc;
            object = LocationRequest.zze(l15);
            stringBuilder.append((String)object);
        }
        float f5 = this.zzg;
        double d2 = f5;
        l16 = 0L;
        double d5 = 0.0;
        double d7 = d2 - d5;
        l14 = (long)(d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1));
        if (l14 > 0) {
            object = ", minUpdateDistance=";
            stringBuilder.append((String)object);
            f5 = this.zzg;
            stringBuilder.append(f5);
        }
        n4 = (int)(this.isPassive() ? 1 : 0);
        long l18 = Long.MAX_VALUE;
        if (n4 != 0 ? (n4 = (int)((l8 = (l7 = this.zzi) - l18) == 0L ? 0 : (l8 < 0L ? -1 : 1))) != 0 : (n4 = (int)((l4 = (l7 = this.zzi) - (l3 = this.zzb)) == 0L ? 0 : (l4 < 0L ? -1 : 1))) != 0) {
            stringBuilder.append(", maxUpdateAge=");
            l7 = this.zzi;
            object = LocationRequest.zze(l7);
            stringBuilder.append((String)object);
        }
        if ((n4 = (int)((l2 = (l7 = this.zze) - l18) == 0L ? 0 : (l2 < 0L ? -1 : 1))) != 0) {
            object = ", duration=";
            stringBuilder.append((String)object);
            l15 = this.zze;
            zzeo.zzc(l15, stringBuilder);
        }
        if ((n4 = this.zzf) != (n3 = -1 >>> 1)) {
            object = ", maxUpdates=";
            stringBuilder.append((String)object);
            n4 = this.zzf;
            stringBuilder.append(n4);
        }
        n4 = this.zzk;
        string2 = ", ";
        if (n4 != 0) {
            stringBuilder.append(string2);
            n4 = this.zzk;
            object = zzar.zzb(n4);
            stringBuilder.append((String)object);
        }
        if ((n4 = this.zzj) != 0) {
            stringBuilder.append(string2);
            n4 = this.zzj;
            object = zzq.zzb(n4);
            stringBuilder.append((String)object);
        }
        if ((n4 = (int)(this.zzh ? 1 : 0)) != 0) {
            object = ", waitForAccurateLocation";
            stringBuilder.append((String)object);
        }
        if ((n4 = (int)(this.zzl ? 1 : 0)) != 0) {
            object = ", bypass";
            stringBuilder.append((String)object);
        }
        if ((n4 = (int)(WorkSourceUtil.isEmpty((WorkSource)(object = this.zzm)) ? 1 : 0)) == 0) {
            stringBuilder.append(string2);
            object = this.zzm;
            stringBuilder.append(object);
        }
        if ((object = this.zzn) != null) {
            stringBuilder.append(", impersonation=");
            object = this.zzn;
            stringBuilder.append(object);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        int bl2 = this.getPriority();
        SafeParcelWriter.writeInt(parcel, 1, bl2);
        long l2 = this.getIntervalMillis();
        SafeParcelWriter.writeLong(parcel, 2, l2);
        l2 = this.getMinUpdateIntervalMillis();
        SafeParcelWriter.writeLong(parcel, 3, l2);
        int n7 = this.getMaxUpdates();
        SafeParcelWriter.writeInt(parcel, 6, n7);
        float f5 = this.getMinUpdateDistanceMeters();
        SafeParcelWriter.writeFloat(parcel, 7, f5);
        l2 = this.getMaxUpdateDelayMillis();
        SafeParcelWriter.writeLong(parcel, 8, l2);
        boolean bl3 = this.isWaitForAccurateLocation();
        SafeParcelWriter.writeBoolean(parcel, 9, bl3);
        l2 = this.getDurationMillis();
        SafeParcelWriter.writeLong(parcel, 10, l2);
        l2 = this.getMaxUpdateAgeMillis();
        SafeParcelWriter.writeLong(parcel, 11, l2);
        int n8 = this.getGranularity();
        SafeParcelWriter.writeInt(parcel, 12, n8);
        int n10 = this.zzk;
        SafeParcelWriter.writeInt(parcel, 13, n10);
        boolean bl4 = this.zzl;
        SafeParcelWriter.writeBoolean(parcel, 15, bl4);
        WorkSource workSource = this.zzm;
        SafeParcelWriter.writeParcelable(parcel, 16, (Parcelable)workSource, n3, false);
        zze zze2 = this.zzn;
        SafeParcelWriter.writeParcelable(parcel, 17, zze2, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }

    public final int zza() {
        return this.zzk;
    }

    public final boolean zzb() {
        return this.zzl;
    }

    public final WorkSource zzc() {
        return this.zzm;
    }

    public final zze zzd() {
        return this.zzn;
    }
}

