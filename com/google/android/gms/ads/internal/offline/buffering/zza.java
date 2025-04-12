/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.ads.internal.offline.buffering;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.offline.buffering.zzb;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zza
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final String zzb;
    public final String zzc;

    static {
        zzb zzb2 = new zzb();
        CREATOR = zzb2;
    }

    public zza(String string2, String string3, String string4) {
        this.zza = string2;
        this.zzb = string3;
        this.zzc = string4;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, string2, false);
        String string3 = this.zzb;
        SafeParcelWriter.writeString(parcel, 2, string3, false);
        string3 = this.zzc;
        SafeParcelWriter.writeString(parcel, 3, string3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

