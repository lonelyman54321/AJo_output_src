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
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.zzf;

public class ActivityTransitionEvent
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zza;
    private final int zzb;
    private final long zzc;

    static {
        zzf zzf2 = new zzf();
        CREATOR = zzf2;
    }

    public ActivityTransitionEvent(int n3, int n4, long l2) {
        ActivityTransition.zza(n4);
        this.zza = n3;
        this.zzb = n4;
        this.zzc = l2;
    }

    public boolean equals(Object object) {
        long l2;
        long l3;
        long l4;
        long l7;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof ActivityTransitionEvent;
        if (n3 == 0) {
            return false;
        }
        object = (ActivityTransitionEvent)object;
        n3 = this.zza;
        int n4 = ((ActivityTransitionEvent)object).zza;
        if (n3 == n4 && (n3 = this.zzb) == (n4 = ((ActivityTransitionEvent)object).zzb) && (l7 = (l4 = (l3 = this.zzc) - (l2 = ((ActivityTransitionEvent)object).zzc)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) {
            return bl2;
        }
        return false;
    }

    public int getActivityType() {
        return this.zza;
    }

    public long getElapsedRealTimeNanos() {
        return this.zzc;
    }

    public int getTransitionType() {
        return this.zzb;
    }

    public int hashCode() {
        Integer n3 = this.zza;
        Integer n4 = this.zzb;
        Long l2 = this.zzc;
        Object[] objectArray = new Object[]{n3, n4, l2};
        return Objects.hashCode(objectArray);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = this.zza;
        int n4 = String.valueOf(n3).length();
        StringBuilder stringBuilder2 = new StringBuilder(n4 += 13);
        stringBuilder2.append("ActivityType ");
        stringBuilder2.append(n3);
        String string2 = stringBuilder2.toString();
        stringBuilder.append(string2);
        string2 = " ";
        stringBuilder.append(string2);
        n4 = this.zzb;
        int n7 = String.valueOf(n4).length();
        StringBuilder stringBuilder3 = new StringBuilder(n7 += 15);
        stringBuilder3.append("TransitionType ");
        stringBuilder3.append(n4);
        String string3 = stringBuilder3.toString();
        stringBuilder.append(string3);
        stringBuilder.append(string2);
        long l2 = this.zzc;
        n7 = String.valueOf(l2).length();
        stringBuilder3 = new StringBuilder(n7 += 21);
        stringBuilder3.append("ElapsedRealTimeNanos ");
        stringBuilder3.append(l2);
        string2 = stringBuilder3.toString();
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n3) {
        Preconditions.checkNotNull(parcel);
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int n4 = this.getActivityType();
        SafeParcelWriter.writeInt(parcel, 1, n4);
        n4 = this.getTransitionType();
        SafeParcelWriter.writeInt(parcel, 2, n4);
        long l2 = this.getElapsedRealTimeNanos();
        SafeParcelWriter.writeLong(parcel, 3, l2);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

