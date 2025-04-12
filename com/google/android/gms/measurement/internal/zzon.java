/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.measurement.internal.zzom;

public final class zzon
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final long zza;
    public byte[] zzb;
    public final String zzc;
    public final Bundle zzd;
    public final long zze;
    public String zzf;
    private final int zzg;

    static {
        zzom zzom2 = new zzom();
        CREATOR = zzom2;
    }

    public zzon(long l2, byte[] byArray, String string2, Bundle bundle, int n3, long l3) {
        this(l2, byArray, string2, bundle, n3, l3, "");
    }

    public zzon(long l2, byte[] byArray, String string2, Bundle bundle, int n3, long l3, String string3) {
        this.zza = l2;
        this.zzb = byArray;
        this.zzc = string2;
        this.zzd = bundle;
        this.zzg = n3;
        this.zze = l3;
        this.zzf = string3;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        long l2 = this.zza;
        SafeParcelWriter.writeLong(parcel, 1, l2);
        byte[] byArray = this.zzb;
        SafeParcelWriter.writeByteArray(parcel, 2, byArray, false);
        String string2 = this.zzc;
        SafeParcelWriter.writeString(parcel, 3, string2, false);
        string2 = this.zzd;
        SafeParcelWriter.writeBundle(parcel, 4, (Bundle)string2, false);
        int n4 = this.zzg;
        SafeParcelWriter.writeInt(parcel, 5, n4);
        long l3 = this.zze;
        SafeParcelWriter.writeLong(parcel, 6, l3);
        string2 = this.zzf;
        SafeParcelWriter.writeString(parcel, 7, string2, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

