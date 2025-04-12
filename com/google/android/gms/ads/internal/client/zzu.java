/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzv;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzu
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public long zzb;
    public zze zzc;
    public final Bundle zzd;
    public final String zze;
    public final String zzf;
    public final String zzg;
    public final String zzh;

    static {
        zzv zzv2 = new zzv();
        CREATOR = zzv2;
    }

    public zzu(String string2, long l2, zze zze2, Bundle bundle, String string3, String string4, String string5, String string6) {
        this.zza = string2;
        this.zzb = l2;
        this.zzc = zze2;
        this.zzd = bundle;
        this.zze = string3;
        this.zzf = string4;
        this.zzg = string5;
        this.zzh = string6;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, string2, false);
        long l2 = this.zzb;
        SafeParcelWriter.writeLong(parcel, 2, l2);
        zze zze2 = this.zzc;
        SafeParcelWriter.writeParcelable(parcel, 3, zze2, n3, false);
        string2 = this.zzd;
        SafeParcelWriter.writeBundle(parcel, 4, (Bundle)string2, false);
        string2 = this.zze;
        SafeParcelWriter.writeString(parcel, 5, string2, false);
        string2 = this.zzf;
        SafeParcelWriter.writeString(parcel, 6, string2, false);
        string2 = this.zzg;
        SafeParcelWriter.writeString(parcel, 7, string2, false);
        string2 = this.zzh;
        SafeParcelWriter.writeString(parcel, 8, string2, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

