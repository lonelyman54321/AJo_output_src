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
import com.google.android.gms.internal.ads.zzboa;

public final class zzbnz
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int zza;
    public final int zzb;
    public final String zzc;
    public final int zzd;

    static {
        zzboa zzboa2 = new zzboa();
        CREATOR = zzboa2;
    }

    public zzbnz(int n3, int n4, String string2, int n7) {
        this.zza = n3;
        this.zzb = n4;
        this.zzc = string2;
        this.zzd = n7;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = this.zzb;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, n3);
        String string2 = this.zzc;
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        int n7 = this.zzd;
        SafeParcelWriter.writeInt(parcel, 3, n7);
        n7 = this.zza;
        SafeParcelWriter.writeInt(parcel, 1000, n7);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

