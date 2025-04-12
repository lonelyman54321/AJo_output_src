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
import com.google.android.gms.internal.ads.zzbnb;

public final class zzbna
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final String[] zzb;
    public final String[] zzc;

    static {
        zzbnb zzbnb2 = new zzbnb();
        CREATOR = zzbnb2;
    }

    public zzbna(String string2, String[] stringArray, String[] stringArray2) {
        this.zza = string2;
        this.zzb = stringArray;
        this.zzc = stringArray2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, string2, false);
        String[] stringArray = this.zzb;
        SafeParcelWriter.writeStringArray(parcel, 2, stringArray, false);
        stringArray = this.zzc;
        SafeParcelWriter.writeStringArray(parcel, 3, stringArray, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

