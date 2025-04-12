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
import com.google.android.gms.internal.location.zze;
import com.google.android.gms.location.zzae;

public final class zzad
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final boolean zza;
    private final zze zzb;

    static {
        zzae zzae2 = new zzae();
        CREATOR = zzae2;
    }

    public zzad(boolean bl2, zze zze2) {
        this.zza = bl2;
        this.zzb = zze2;
    }

    public final boolean equals(Object object) {
        zze zze2;
        boolean bl2;
        boolean bl3 = object instanceof zzad;
        if (!bl3) {
            return false;
        }
        object = (zzad)object;
        bl3 = this.zza;
        boolean bl4 = ((zzad)object).zza;
        return bl3 == bl4 && (bl2 = Objects.equal(zze2 = this.zzb, object = ((zzad)object).zzb));
    }

    public final int hashCode() {
        Boolean bl2 = this.zza;
        Object[] objectArray = new Object[]{bl2};
        return Objects.hashCode(objectArray);
    }

    public final String toString() {
        Object object;
        StringBuilder stringBuilder = Ex0.a("LocationAvailabilityRequest[");
        int n3 = this.zza;
        if (n3 != 0) {
            object = "bypass, ";
            stringBuilder.append((String)object);
        }
        if ((object = this.zzb) != null) {
            stringBuilder.append("impersonation=");
            object = this.zzb;
            stringBuilder.append(object);
            object = ", ";
            stringBuilder.append((String)object);
        }
        n3 = stringBuilder.length() + -2;
        stringBuilder.setLength(n3);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        boolean bl2 = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, bl2);
        zze zze2 = this.zzb;
        SafeParcelWriter.writeParcelable(parcel, 2, zze2, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

