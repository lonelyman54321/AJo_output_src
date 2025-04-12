/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzfsr;

public final class zzfsq
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int zza;
    public final String zzb;
    public final String zzc;

    static {
        zzfsr zzfsr2 = new zzfsr();
        CREATOR = zzfsr2;
    }

    public zzfsq(int n3, String string2, String string3) {
        this.zza = n3;
        this.zzb = string2;
        this.zzc = string3;
    }

    public zzfsq(String string2, String string3) {
        this(1, string2, string3);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, n3);
        String string2 = this.zzb;
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        String string3 = this.zzc;
        SafeParcelWriter.writeString(parcel, 3, string3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

