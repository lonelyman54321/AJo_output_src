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
import com.google.android.gms.internal.vision.zzfy;

public final class zzfz
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final long zze;

    static {
        zzfy zzfy2 = new zzfy();
        CREATOR = zzfy2;
    }

    public zzfz(int n3, int n4, int n7, int n8, long l2) {
        this.zza = n3;
        this.zzb = n4;
        this.zzc = n7;
        this.zzd = n8;
        this.zze = l2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int n4 = this.zza;
        SafeParcelWriter.writeInt(parcel, 1, n4);
        n4 = this.zzb;
        SafeParcelWriter.writeInt(parcel, 2, n4);
        n4 = this.zzc;
        SafeParcelWriter.writeInt(parcel, 3, n4);
        n4 = this.zzd;
        SafeParcelWriter.writeInt(parcel, 4, n4);
        long l2 = this.zze;
        SafeParcelWriter.writeLong(parcel, 5, l2);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zzd;
    }

    public final long zze() {
        return this.zze;
    }
}

