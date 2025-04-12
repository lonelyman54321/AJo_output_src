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
import com.google.android.gms.internal.auth.zzar;

public final class zzaq
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zza;
    public final String zzb;

    static {
        zzar zzar2 = new zzar();
        CREATOR = zzar2;
    }

    public zzaq(int n3, String string2) {
        String string3;
        this.zza = 1;
        this.zzb = string3 = (String)Preconditions.checkNotNull(string2);
    }

    public zzaq(String string2) {
        this(1, string2);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int n4 = this.zza;
        SafeParcelWriter.writeInt(parcel, 1, n4);
        String string2 = this.zzb;
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

