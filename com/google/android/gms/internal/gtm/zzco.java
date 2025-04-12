/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.gtm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.gtm.zzcn;

public final class zzco
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String zza;
    private String zzb;
    private String zzc;

    static {
        zzcn zzcn2 = new zzcn();
        CREATOR = zzcn2;
    }

    public zzco() {
    }

    public zzco(Parcel object) {
        String string2;
        this.zza = string2 = object.readString();
        this.zzb = string2 = object.readString();
        object = object.readString();
        this.zzc = object;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.zza;
        parcel.writeString(string2);
        string2 = this.zzb;
        parcel.writeString(string2);
        string2 = this.zzc;
        parcel.writeString(string2);
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzc;
    }
}

