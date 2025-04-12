/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.auth.zzba;

public final class zzaz
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zza;
    public final String zzb;
    public final byte[] zzc;

    static {
        zzba zzba2 = new zzba();
        CREATOR = zzba2;
    }

    public zzaz(int n3, String string2, byte[] byArray) {
        this.zza = 1;
        Object object = (String)Preconditions.checkNotNull(string2);
        this.zzb = object;
        object = (byte[])Preconditions.checkNotNull(byArray);
        this.zzc = (byte[])object;
    }

    public zzaz(String string2, byte[] byArray) {
        this(1, string2, byArray);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int n4 = this.zza;
        SafeParcelWriter.writeInt(parcel, 1, n4);
        String string2 = this.zzb;
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        byte[] byArray = this.zzc;
        SafeParcelWriter.writeByteArray(parcel, 3, byArray, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

