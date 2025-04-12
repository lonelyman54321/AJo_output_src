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
import com.google.android.gms.location.zze;

public class ActivityTransition
extends AbstractSafeParcelable {
    public static final int ACTIVITY_TRANSITION_ENTER = 0;
    public static final int ACTIVITY_TRANSITION_EXIT = 1;
    public static final Parcelable.Creator CREATOR;
    private final int zza;
    private final int zzb;

    static {
        zze zze2 = new zze();
        CREATOR = zze2;
    }

    public ActivityTransition(int n3, int n4) {
        this.zza = n3;
        this.zzb = n4;
    }

    public static void zza(int n3) {
        int n4;
        boolean bl2 = false;
        if (n3 >= 0 && n3 <= (n4 = 1)) {
            bl2 = true;
        }
        n4 = String.valueOf(n3).length();
        StringBuilder stringBuilder = new StringBuilder(n4 += 30);
        stringBuilder.append("Transition type ");
        stringBuilder.append(n3);
        stringBuilder.append(" is not valid.");
        String string2 = stringBuilder.toString();
        Preconditions.checkArgument(bl2, string2);
    }

    public boolean equals(Object object) {
        int n3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n4 = object instanceof ActivityTransition;
        if (n4 == 0) {
            return false;
        }
        object = (ActivityTransition)object;
        n4 = this.zza;
        int n7 = ((ActivityTransition)object).zza;
        if (n4 == n7 && (n4 = this.zzb) == (n3 = ((ActivityTransition)object).zzb)) {
            return bl2;
        }
        return false;
    }

    public int getActivityType() {
        return this.zza;
    }

    public int getTransitionType() {
        return this.zzb;
    }

    public int hashCode() {
        Integer n3 = this.zza;
        Integer n4 = this.zzb;
        Object[] objectArray = new Object[]{n3, n4};
        return Objects.hashCode(objectArray);
    }

    public String toString() {
        int n3 = this.zza;
        int n4 = String.valueOf(n3).length();
        int n7 = this.zzb;
        int n8 = String.valueOf(n7).length();
        n4 = n4 + 52 + n8;
        StringBuilder stringBuilder = new StringBuilder(++n4);
        stringBuilder.append("ActivityTransition [mActivityType=");
        stringBuilder.append(n3);
        stringBuilder.append(", mTransitionType=");
        stringBuilder.append(n7);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n3) {
        Preconditions.checkNotNull(parcel);
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int n4 = this.getActivityType();
        SafeParcelWriter.writeInt(parcel, 1, n4);
        n4 = this.getTransitionType();
        SafeParcelWriter.writeInt(parcel, 2, n4);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

