/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.os.WorkSource
 */
package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.location.zzc;

public final class zzb
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final long zza;
    private final boolean zzb;
    private final WorkSource zzc;
    private final String zzd;
    private final int[] zze;
    private final boolean zzf;
    private final String zzg;
    private final long zzh;
    private String zzi;

    static {
        zzc zzc2 = new zzc();
        CREATOR = zzc2;
    }

    public zzb(long l2, boolean bl2, WorkSource workSource, String string2, int[] nArray, boolean bl3, String string3, long l3, String string4) {
        this.zza = l2;
        this.zzb = bl2;
        this.zzc = workSource;
        this.zzd = string2;
        this.zze = nArray;
        this.zzf = bl3;
        this.zzg = string3;
        this.zzh = l3;
        this.zzi = string4;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Preconditions.checkNotNull(parcel);
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        long l2 = this.zza;
        SafeParcelWriter.writeLong(parcel, 1, l2);
        boolean bl2 = this.zzb;
        SafeParcelWriter.writeBoolean(parcel, 2, bl2);
        Object object = this.zzc;
        SafeParcelWriter.writeParcelable(parcel, 3, (Parcelable)object, n3, false);
        object = this.zzd;
        SafeParcelWriter.writeString(parcel, 4, (String)object, false);
        object = this.zze;
        SafeParcelWriter.writeIntArray(parcel, 5, (int[])object, false);
        boolean bl3 = this.zzf;
        SafeParcelWriter.writeBoolean(parcel, 6, bl3);
        object = this.zzg;
        SafeParcelWriter.writeString(parcel, 7, (String)object, false);
        long l3 = this.zzh;
        SafeParcelWriter.writeLong(parcel, 8, l3);
        object = this.zzi;
        SafeParcelWriter.writeString(parcel, 9, (String)object, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }

    public final zzb zza(String string2) {
        this.zzi = string2;
        return this;
    }
}

