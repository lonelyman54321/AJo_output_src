/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzpo;

public final class zzpm
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final long zzb;
    public final Long zzc;
    public final String zzd;
    public final String zze;
    public final Double zzf;
    private final int zzg;

    static {
        zzpl zzpl2 = new zzpl();
        CREATOR = zzpl2;
    }

    public zzpm(int n3, String string2, long l2, Long l3, Float f5, String string3, String string4, Double d2) {
        this.zzg = n3;
        this.zza = string2;
        this.zzb = l2;
        this.zzc = l3;
        int n4 = 1;
        if (n3 == n4) {
            Double d5;
            if (f5 != null) {
                double d7 = f5.doubleValue();
                d5 = d7;
            } else {
                n3 = 0;
                d5 = null;
            }
            this.zzf = d5;
        } else {
            this.zzf = d2;
        }
        this.zzd = string3;
        this.zze = string4;
    }

    public zzpm(zzpo zzpo2) {
        String string2 = zzpo2.zzc;
        long l2 = zzpo2.zzd;
        Object object = zzpo2.zze;
        String string3 = zzpo2.zzb;
        this(string2, l2, object, string3);
    }

    public zzpm(String object, long l2, Object object2, String string2) {
        int n3;
        Preconditions.checkNotEmpty((String)object);
        this.zzg = n3 = 2;
        this.zza = object;
        this.zzb = l2;
        this.zze = string2;
        object = null;
        if (object2 == null) {
            this.zzc = null;
            this.zzf = null;
            this.zzd = null;
            return;
        }
        boolean bl2 = object2 instanceof Long;
        if (bl2) {
            this.zzc = object2 = (Long)object2;
            this.zzf = null;
            this.zzd = null;
            return;
        }
        bl2 = object2 instanceof String;
        if (bl2) {
            this.zzc = null;
            this.zzf = null;
            this.zzd = object2 = (String)object2;
            return;
        }
        bl2 = object2 instanceof Double;
        if (bl2) {
            this.zzc = null;
            this.zzf = object2 = (Double)object2;
            this.zzd = null;
            return;
        }
        object = new IllegalArgumentException("User attribute given of un-supported type");
        throw object;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int n4 = this.zzg;
        SafeParcelWriter.writeInt(parcel, 1, n4);
        String string2 = this.zza;
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        long l2 = this.zzb;
        SafeParcelWriter.writeLong(parcel, 3, l2);
        Object object = this.zzc;
        SafeParcelWriter.writeLongObject(parcel, 4, (Long)object, false);
        SafeParcelWriter.writeFloatObject(parcel, 5, null, false);
        object = this.zzd;
        SafeParcelWriter.writeString(parcel, 6, (String)object, false);
        object = this.zze;
        SafeParcelWriter.writeString(parcel, 7, (String)object, false);
        object = this.zzf;
        SafeParcelWriter.writeDoubleObject(parcel, 8, (Double)object, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }

    public final Object zza() {
        Object object = this.zzc;
        if (object != null) {
            return object;
        }
        object = this.zzf;
        if (object != null) {
            return object;
        }
        object = this.zzd;
        if (object != null) {
            return object;
        }
        return null;
    }
}

