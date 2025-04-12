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
import com.google.android.gms.measurement.internal.zzoj;

public final class zzog
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final long zzb;
    public final int zzc;

    static {
        zzoj zzoj2 = new zzoj();
        CREATOR = zzoj2;
    }

    public zzog(String string2, long l2, int n3) {
        this.zza = string2;
        this.zzb = l2;
        this.zzc = n3;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        String string2 = this.zza;
        SafeParcelWriter.writeString(parcel, 1, string2, false);
        long l2 = this.zzb;
        SafeParcelWriter.writeLong(parcel, 2, l2);
        int n4 = this.zzc;
        SafeParcelWriter.writeInt(parcel, 3, n4);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

