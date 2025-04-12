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
import com.google.android.gms.location.zzat;

public final class zzas
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;

    static {
        zzat zzat2 = new zzat();
        CREATOR = zzat2;
    }

    public zzas(int n3, int n4, int n7, int n8) {
        boolean bl2;
        String string2;
        int n10;
        int n14 = 23;
        boolean bl3 = true;
        if (n3 >= 0 && n3 <= n14) {
            n10 = 1;
        } else {
            n10 = 0;
            string2 = null;
        }
        String string3 = "Start hour must be in range [0, 23].";
        Preconditions.checkState(n10 != 0, string3);
        n10 = 59;
        if (n4 >= 0 && n4 <= n10) {
            bl2 = true;
        } else {
            bl2 = false;
            string3 = null;
        }
        String string4 = "Start minute must be in range [0, 59].";
        Preconditions.checkState(bl2, string4);
        n14 = n7 >= 0 && n7 <= n14 ? 1 : 0;
        string3 = "End hour must be in range [0, 23].";
        Preconditions.checkState(n14 != 0, string3);
        n14 = n8 >= 0 && n8 <= n10 ? 1 : 0;
        string2 = "End minute must be in range [0, 59].";
        Preconditions.checkState(n14 != 0, string2);
        n14 = n3 + n4 + n7 + n8;
        if (n14 <= 0) {
            bl3 = false;
        }
        Preconditions.checkState(bl3, "Parameters can't be all 0.");
        this.zza = n3;
        this.zzb = n4;
        this.zzc = n7;
        this.zzd = n8;
    }

    public final boolean equals(Object object) {
        int n3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n4 = object instanceof zzas;
        if (n4 == 0) {
            return false;
        }
        object = (zzas)object;
        n4 = this.zza;
        int n7 = ((zzas)object).zza;
        if (n4 == n7 && (n4 = this.zzb) == (n7 = ((zzas)object).zzb) && (n4 = this.zzc) == (n7 = ((zzas)object).zzc) && (n4 = this.zzd) == (n3 = ((zzas)object).zzd)) {
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        Integer n3 = this.zza;
        Integer n4 = this.zzb;
        Integer n7 = this.zzc;
        Integer n8 = this.zzd;
        Object[] objectArray = new Object[]{n3, n4, n7, n8};
        return Objects.hashCode(objectArray);
    }

    public final String toString() {
        int n3 = this.zza;
        int n4 = String.valueOf(n3).length();
        int n7 = this.zzb;
        int n8 = String.valueOf(n7).length();
        int n10 = this.zzc;
        int n14 = String.valueOf(n10).length();
        int n15 = this.zzd;
        int n16 = String.valueOf(n15).length();
        n4 = n4 + 50 + n8 + 10 + n14 + 12 + n16;
        StringBuilder stringBuilder = new StringBuilder(++n4);
        stringBuilder.append("UserPreferredSleepWindow [startHour=");
        stringBuilder.append(n3);
        stringBuilder.append(", startMinute=");
        stringBuilder.append(n7);
        stringBuilder.append(", endHour=");
        stringBuilder.append(n10);
        stringBuilder.append(", endMinute=");
        stringBuilder.append(n15);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Preconditions.checkNotNull(parcel);
        n3 = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, n3);
        int n7 = this.zzb;
        SafeParcelWriter.writeInt(parcel, 2, n7);
        n7 = this.zzc;
        SafeParcelWriter.writeInt(parcel, 3, n7);
        n7 = this.zzd;
        SafeParcelWriter.writeInt(parcel, 4, n7);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

