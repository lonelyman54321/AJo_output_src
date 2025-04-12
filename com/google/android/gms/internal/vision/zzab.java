/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.vision.zzaa;

public final class zzab
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final float zze;

    static {
        zzaa zzaa2 = new zzaa();
        CREATOR = zzaa2;
    }

    public zzab(int n3, int n4, int n7, int n8, float f5) {
        this.zza = n3;
        this.zzb = n4;
        this.zzc = n7;
        this.zzd = n8;
        this.zze = f5;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int n4 = this.zza;
        SafeParcelWriter.writeInt(parcel, 2, n4);
        n4 = this.zzb;
        SafeParcelWriter.writeInt(parcel, 3, n4);
        n4 = this.zzc;
        SafeParcelWriter.writeInt(parcel, 4, n4);
        n4 = this.zzd;
        SafeParcelWriter.writeInt(parcel, 5, n4);
        float f5 = this.zze;
        SafeParcelWriter.writeFloat(parcel, 6, f5);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

