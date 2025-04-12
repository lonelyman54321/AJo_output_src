/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzbxa;

public final class zzbwz
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final int zzb;
    public final Bundle zzc;
    public final byte[] zzd;
    public final boolean zze;
    public final String zzf;
    public final String zzg;

    static {
        zzbxa zzbxa2 = new zzbxa();
        CREATOR = zzbxa2;
    }

    public zzbwz(String string2, int n3, Bundle bundle, byte[] byArray, boolean bl2, String string3, String string4) {
        this.zza = string2;
        this.zzb = n3;
        this.zzc = bundle;
        this.zzd = byArray;
        this.zze = bl2;
        this.zzf = string3;
        this.zzg = string4;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, string2, false);
        int bl2 = this.zzb;
        SafeParcelWriter.writeInt(parcel, 2, bl2);
        Object object = this.zzc;
        SafeParcelWriter.writeBundle(parcel, 3, object, false);
        object = this.zzd;
        SafeParcelWriter.writeByteArray(parcel, 4, (byte[])object, false);
        boolean bl3 = this.zze;
        SafeParcelWriter.writeBoolean(parcel, 5, bl3);
        object = this.zzf;
        SafeParcelWriter.writeString(parcel, 6, (String)object, false);
        object = this.zzg;
        SafeParcelWriter.writeString(parcel, 7, (String)object, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

