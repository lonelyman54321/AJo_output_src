/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.location.zzk;
import com.google.android.gms.location.zzl;
import java.util.Comparator;

public class DetectedActivity
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final int IN_VEHICLE = 0;
    public static final int ON_BICYCLE = 1;
    public static final int ON_FOOT = 2;
    public static final int RUNNING = 8;
    public static final int STILL = 3;
    public static final int TILTING = 5;
    public static final int UNKNOWN = 4;
    public static final int WALKING = 7;
    public static final Comparator zza;
    final int zzb;
    final int zzc;

    static {
        Object object = new zzk();
        zza = object;
        object = new zzl();
        CREATOR = object;
    }

    public DetectedActivity(int n3, int n4) {
        this.zzb = n3;
        this.zzc = n4;
    }

    public final boolean equals(Object object) {
        int n3 = object instanceof DetectedActivity;
        if (n3 != 0) {
            int n4;
            object = (DetectedActivity)object;
            n3 = this.zzb;
            int n7 = ((DetectedActivity)object).zzb;
            if (n3 == n7 && (n3 = this.zzc) == (n4 = ((DetectedActivity)object).zzc)) {
                return true;
            }
        }
        return false;
    }

    public int getConfidence() {
        return this.zzc;
    }

    public int getType() {
        int n3 = this.zzb;
        int n4 = 22;
        if (n3 <= n4 && n3 >= 0) {
            return n3;
        }
        return 4;
    }

    public final int hashCode() {
        Integer n3 = this.zzb;
        Integer n4 = this.zzc;
        Object[] objectArray = new Object[]{n3, n4};
        return Objects.hashCode(objectArray);
    }

    public String toString() {
        int n3;
        int n4 = this.getType();
        int n7 = 1;
        String string2 = n4 != 0 ? (n4 != n7 ? (n4 != (n3 = 2) ? (n4 != (n3 = 3) ? (n4 != (n3 = 4) ? (n4 != (n3 = 5) ? (n4 != (n3 = 7) ? (n4 != (n3 = 8) ? (n4 != (n3 = 16) ? (n4 != (n3 = 17) ? Integer.toString(n4) : "IN_RAIL_VEHICLE") : "IN_ROAD_VEHICLE") : "RUNNING") : "WALKING") : "TILTING") : "UNKNOWN") : "STILL") : "ON_FOOT") : "ON_BICYCLE") : "IN_VEHICLE";
        n3 = this.zzc;
        int n8 = String.valueOf(string2).length();
        String string3 = String.valueOf(n3);
        int n10 = string3.length() + (n8 += 36);
        StringBuilder stringBuilder = new StringBuilder(n10 += n7);
        stringBuilder.append("DetectedActivity [type=");
        stringBuilder.append(string2);
        stringBuilder.append(", confidence=");
        stringBuilder.append(n3);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n3) {
        Preconditions.checkNotNull(parcel);
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int n4 = this.zzb;
        SafeParcelWriter.writeInt(parcel, 1, n4);
        n4 = this.zzc;
        SafeParcelWriter.writeInt(parcel, 2, n4);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

