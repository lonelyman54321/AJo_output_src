/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzaig;
import com.google.android.gms.internal.ads.zzaih;
import com.google.android.gms.internal.ads.zzeq;
import java.util.Arrays;
import java.util.Comparator;

public final class zzaii
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final Comparator zza;
    public final long zzb;
    public final long zzc;
    public final int zzd;

    static {
        Object object = new zzaig();
        zza = object;
        object = new zzaih();
        CREATOR = object;
    }

    public zzaii(long l2, long l3, int n3) {
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        l4 = l4 < 0 ? (long)1 : (long)0;
        zzeq.zzd((boolean)l4);
        this.zzb = l2;
        this.zzc = l3;
        this.zzd = n3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        Class<?> clazz;
        Class<zzaii> clazz2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz2 = zzaii.class) == (clazz = object.getClass())) {
            int n3;
            int n4;
            long l2;
            object = (zzaii)object;
            long l3 = this.zzb;
            long l4 = ((zzaii)object).zzb;
            long l7 = l3 - l4;
            Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object2 == false && (object2 = (l2 = (l3 = this.zzc) - (l4 = ((zzaii)object).zzc)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false && (n4 = this.zzd) == (n3 = ((zzaii)object).zzd)) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        Long l2 = this.zzb;
        Long l3 = this.zzc;
        Integer n3 = this.zzd;
        Object[] objectArray = new Object[]{l2, l3, n3};
        return Arrays.hashCode(objectArray);
    }

    public final String toString() {
        long l2 = this.zzb;
        long l3 = this.zzc;
        int n3 = this.zzd;
        StringBuilder stringBuilder = D70.c(l2, "Segment: startTimeMs=", ", endTimeMs=");
        stringBuilder.append(l3);
        stringBuilder.append(", speedDivisor=");
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        long l2 = this.zzb;
        parcel.writeLong(l2);
        l2 = this.zzc;
        parcel.writeLong(l2);
        n3 = this.zzd;
        parcel.writeInt(n3);
    }
}

