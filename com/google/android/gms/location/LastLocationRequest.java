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
import com.google.android.gms.internal.location.zzeo;
import com.google.android.gms.location.zzaa;
import com.google.android.gms.location.zzq;

public final class LastLocationRequest
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final long zza;
    private final int zzb;
    private final boolean zzc;
    private final zze zzd;

    static {
        zzaa zzaa2 = new zzaa();
        CREATOR = zzaa2;
    }

    public LastLocationRequest(long l2, int n3, boolean bl2, zze zze2) {
        this.zza = l2;
        this.zzb = n3;
        this.zzc = bl2;
        this.zzd = zze2;
    }

    public boolean equals(Object object) {
        zze zze2;
        boolean bl2;
        int n3;
        Object object2 = object instanceof LastLocationRequest;
        if (object2 == 0) {
            return false;
        }
        object = (LastLocationRequest)object;
        long l2 = this.zza;
        long l3 = ((LastLocationRequest)object).zza;
        long l4 = l2 - l3;
        object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        return object2 == 0 && (object2 = this.zzb) == (n3 = ((LastLocationRequest)object).zzb) && (object2 = (Object)this.zzc) == (n3 = (int)(((LastLocationRequest)object).zzc ? 1 : 0)) && (bl2 = Objects.equal(zze2 = this.zzd, object = ((LastLocationRequest)object).zzd));
    }

    public int getGranularity() {
        return this.zzb;
    }

    public long getMaxUpdateAgeMillis() {
        return this.zza;
    }

    public int hashCode() {
        Long l2 = this.zza;
        Integer n3 = this.zzb;
        Boolean bl2 = this.zzc;
        Object[] objectArray = new Object[]{l2, n3, bl2};
        return Objects.hashCode(objectArray);
    }

    public String toString() {
        int n3;
        Object object;
        StringBuilder stringBuilder = Ex0.a("LastLocationRequest[");
        long l2 = this.zza;
        long l3 = Long.MAX_VALUE;
        long l4 = l2 - l3;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 != false) {
            object = "maxAge=";
            stringBuilder.append((String)object);
            l2 = this.zza;
            zzeo.zzc(l2, stringBuilder);
        }
        if ((n3 = this.zzb) != 0) {
            stringBuilder.append(", ");
            n3 = this.zzb;
            object = zzq.zzb(n3);
            stringBuilder.append((String)object);
        }
        if ((n3 = (int)(this.zzc ? 1 : 0)) != 0) {
            object = ", bypass";
            stringBuilder.append((String)object);
        }
        if ((object = this.zzd) != null) {
            stringBuilder.append(", impersonation=");
            object = this.zzd;
            stringBuilder.append(object);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        long l2 = this.getMaxUpdateAgeMillis();
        SafeParcelWriter.writeLong(parcel, 1, l2);
        int bl2 = this.getGranularity();
        SafeParcelWriter.writeInt(parcel, 2, bl2);
        boolean bl3 = this.zzc;
        SafeParcelWriter.writeBoolean(parcel, 3, bl3);
        zze zze2 = this.zzd;
        SafeParcelWriter.writeParcelable(parcel, 5, zze2, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final zze zzb() {
        return this.zzd;
    }
}

