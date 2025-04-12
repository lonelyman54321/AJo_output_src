/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.location.zzab;
import com.google.android.gms.location.zzal;
import java.util.Arrays;

public final class LocationAvailability
extends AbstractSafeParcelable
implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final LocationAvailability zza;
    public static final LocationAvailability zzb;
    final int zzc;
    private final int zzd;
    private final int zze;
    private final long zzf;
    private final zzal[] zzg;

    static {
        LocationAvailability locationAvailability;
        Object object = locationAvailability;
        zza = locationAvailability = new LocationAvailability(0, 1, 1, 0L, null, true);
        object = new LocationAvailability(1000, 1, 1, 0L, null, false);
        zzb = object;
        object = new zzab();
        CREATOR = object;
    }

    public LocationAvailability(int n3, int n4, int n7, long l2, zzal[] zzalArray, boolean n8) {
        n8 = 1000;
        if (n3 < n8) {
            n8 = 0;
        }
        this.zzc = n8;
        this.zzd = n4;
        this.zze = n7;
        this.zzf = l2;
        this.zzg = zzalArray;
    }

    public static LocationAvailability extractLocationAvailability(Intent intent) {
        boolean bl2 = LocationAvailability.hasLocationAvailability(intent);
        if (!bl2) {
            return null;
        }
        String string2 = "com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY";
        try {
            intent = intent.getParcelableExtra(string2);
        }
        catch (ClassCastException classCastException) {
            return null;
        }
        return (LocationAvailability)intent;
    }

    public static boolean hasLocationAvailability(Intent intent) {
        String string2;
        boolean bl2;
        return intent != null && (bl2 = intent.hasExtra(string2 = "com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY"));
    }

    public boolean equals(Object objectArray) {
        int n3 = objectArray instanceof LocationAvailability;
        if (n3 != 0) {
            Object[] objectArray2;
            boolean bl2;
            long l2;
            long l3;
            long l4;
            objectArray = (LocationAvailability)objectArray;
            n3 = this.zzd;
            int n4 = objectArray.zzd;
            if (n3 == n4 && (n3 = this.zze) == (n4 = objectArray.zze) && (n3 = (int)((l4 = (l3 = this.zzf) - (l2 = objectArray.zzf)) == 0L ? 0 : (l4 < 0L ? -1 : 1))) == 0 && (n3 = this.zzc) == (n4 = objectArray.zzc) && (bl2 = Arrays.equals(objectArray2 = this.zzg, objectArray = objectArray.zzg))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Integer n3 = this.zzc;
        Object[] objectArray = new Object[]{n3};
        return Objects.hashCode(objectArray);
    }

    public boolean isLocationAvailable() {
        int n3 = this.zzc;
        int n4 = 1000;
        return n3 < n4;
    }

    public String toString() {
        boolean bl2 = this.isLocationAvailable();
        int n3 = String.valueOf(bl2).length();
        StringBuilder stringBuilder = new StringBuilder(n3 += 22);
        stringBuilder.append("LocationAvailability[");
        stringBuilder.append(bl2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int bl2 = this.zzd;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, bl2);
        int n7 = this.zze;
        SafeParcelWriter.writeInt(parcel, 2, n7);
        long l2 = this.zzf;
        SafeParcelWriter.writeLong(parcel, 3, l2);
        n7 = this.zzc;
        SafeParcelWriter.writeInt(parcel, 4, n7);
        Parcelable[] parcelableArray = this.zzg;
        SafeParcelWriter.writeTypedArray(parcel, 5, parcelableArray, n3, false);
        boolean bl3 = this.isLocationAvailable();
        SafeParcelWriter.writeBoolean(parcel, 6, bl3);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

