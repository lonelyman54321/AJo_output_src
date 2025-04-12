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
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.auth.zzbx;

public final class zzbw
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zza;
    String zzb;

    static {
        zzbx zzbx2 = new zzbx();
        CREATOR = zzbx2;
    }

    public zzbw() {
        this.zza = 1;
    }

    public zzbw(int n3, String string2) {
        this.zza = n3;
        this.zzb = string2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int n4 = this.zza;
        SafeParcelWriter.writeInt(parcel, 1, n4);
        String string2 = this.zzb;
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }

    public final zzbw zza(String string2) {
        this.zzb = string2;
        return this;
    }
}

