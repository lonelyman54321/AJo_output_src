/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appset.zzb;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zza
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final String zza;
    private final String zzb;

    static {
        zzb zzb2 = new zzb();
        CREATOR = zzb2;
    }

    public zza(String string2, String string3) {
        this.zza = string2;
        this.zzb = string3;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        String string2 = this.zza;
        SafeParcelWriter.writeString(parcel, 1, string2, false);
        String string3 = this.zzb;
        SafeParcelWriter.writeString(parcel, 2, string3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

