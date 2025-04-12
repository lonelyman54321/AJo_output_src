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
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.location.zzam;

public final class zzal
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;

    static {
        zzam zzam2 = new zzam();
        CREATOR = zzam2;
    }

    public zzal(int n3, int n4, long l2, long l3) {
        this.zza = n3;
        this.zzb = n4;
        this.zzc = l2;
        this.zzd = l3;
    }

    public final boolean equals(Object object) {
        int n3 = object instanceof zzal;
        if (n3 != 0) {
            long l2;
            long l3;
            long l4;
            long l7;
            long l8;
            object = (zzal)object;
            n3 = this.zza;
            int n4 = ((zzal)object).zza;
            if (n3 == n4 && (n3 = this.zzb) == (n4 = ((zzal)object).zzb) && (n3 = (int)((l8 = (l7 = this.zzc) - (l4 = ((zzal)object).zzc)) == 0L ? 0 : (l8 < 0L ? -1 : 1))) == 0 && (l3 = (l2 = (l7 = this.zzd) - (l4 = ((zzal)object).zzd)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer n3 = this.zzb;
        Integer n4 = this.zza;
        Long l2 = this.zzd;
        Long l3 = this.zzc;
        Object[] objectArray = new Object[]{n3, n4, l2, l3};
        return Objects.hashCode(objectArray);
    }

    public final String toString() {
        int n3 = this.zza;
        int n4 = String.valueOf(n3).length();
        int n7 = this.zzb;
        int n8 = String.valueOf(n7).length();
        long l2 = this.zzd;
        int n10 = String.valueOf(l2).length();
        long l3 = this.zzc;
        int n14 = String.valueOf(l3).length();
        n4 = n4 + 50 + n8 + 18 + n10;
        n4 = n4 + 17 + n14;
        StringBuilder stringBuilder = new StringBuilder(n4);
        stringBuilder.append("NetworkLocationStatus: Wifi status: ");
        stringBuilder.append(n3);
        stringBuilder.append(" Cell status: ");
        stringBuilder.append(n7);
        fn0_2.b(stringBuilder, " elapsed time NS: ", l2, " system time ms: ");
        stringBuilder.append(l3);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, n3);
        int n7 = this.zzb;
        SafeParcelWriter.writeInt(parcel, 2, n7);
        long l2 = this.zzc;
        SafeParcelWriter.writeLong(parcel, 3, l2);
        l2 = this.zzd;
        SafeParcelWriter.writeLong(parcel, 4, l2);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

