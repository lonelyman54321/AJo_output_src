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
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.measurement.internal.zzah;

public final class zzae
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final long zza;
    public final int zzb;
    public final long zzc;

    static {
        zzah zzah2 = new zzah();
        CREATOR = zzah2;
    }

    public zzae(long l2, int n3, long l3) {
        this.zza = l2;
        this.zzb = n3;
        this.zzc = l3;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        long l2 = this.zza;
        SafeParcelWriter.writeLong(parcel, 1, l2);
        int n4 = this.zzb;
        SafeParcelWriter.writeInt(parcel, 2, n4);
        l2 = this.zzc;
        SafeParcelWriter.writeLong(parcel, 3, l2);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

