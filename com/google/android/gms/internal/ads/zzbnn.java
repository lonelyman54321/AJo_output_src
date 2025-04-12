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
import com.google.android.gms.internal.ads.zzbno;

public final class zzbnn
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final boolean zzb;
    public final int zzc;
    public final String zzd;

    static {
        zzbno zzbno2 = new zzbno();
        CREATOR = zzbno2;
    }

    public zzbnn(String string2, boolean bl2, int n3, String string3) {
        this.zza = string2;
        this.zzb = bl2;
        this.zzc = n3;
        this.zzd = string3;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, string2, false);
        int n7 = this.zzb;
        SafeParcelWriter.writeBoolean(parcel, 2, n7 != 0);
        n7 = this.zzc;
        SafeParcelWriter.writeInt(parcel, 3, n7);
        String string3 = this.zzd;
        SafeParcelWriter.writeString(parcel, 4, string3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

