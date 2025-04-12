/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.measurement.zzec;

public final class zzdz
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final long zza;
    public final long zzb;
    public final boolean zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public final Bundle zzg;
    public final String zzh;

    static {
        zzec zzec2 = new zzec();
        CREATOR = zzec2;
    }

    public zzdz(long l2, long l3, boolean bl2, String string2, String string3, String string4, Bundle bundle, String string5) {
        this.zza = l2;
        this.zzb = l3;
        this.zzc = bl2;
        this.zzd = string2;
        this.zze = string3;
        this.zzf = string4;
        this.zzg = bundle;
        this.zzh = string5;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        long l2 = this.zza;
        SafeParcelWriter.writeLong(parcel, 1, l2);
        l2 = this.zzb;
        SafeParcelWriter.writeLong(parcel, 2, l2);
        boolean bl2 = this.zzc;
        SafeParcelWriter.writeBoolean(parcel, 3, bl2);
        String string2 = this.zzd;
        SafeParcelWriter.writeString(parcel, 4, string2, false);
        String string3 = this.zze;
        SafeParcelWriter.writeString(parcel, 5, string3, false);
        string3 = this.zzf;
        SafeParcelWriter.writeString(parcel, 6, string3, false);
        string3 = this.zzg;
        SafeParcelWriter.writeBundle(parcel, 7, (Bundle)string3, false);
        string3 = this.zzh;
        SafeParcelWriter.writeString(parcel, 8, string3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

