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
import com.google.android.gms.internal.auth.zzaw;

public final class zzav
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zza;
    public final String zzb;
    public final int zzc;

    static {
        zzaw zzaw2 = new zzaw();
        CREATOR = zzaw2;
    }

    public zzav(int n3, String string2, int n4) {
        String string3;
        this.zza = 1;
        this.zzb = string3 = (String)Preconditions.checkNotNull(string2);
        this.zzc = n4;
    }

    public zzav(String string2, int n3) {
        this(1, string2, n3);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int n4 = this.zza;
        SafeParcelWriter.writeInt(parcel, 1, n4);
        String string2 = this.zzb;
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        n4 = this.zzc;
        SafeParcelWriter.writeInt(parcel, 3, n4);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

