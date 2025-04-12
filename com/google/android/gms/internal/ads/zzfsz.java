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
import com.google.android.gms.internal.ads.zzazw;
import com.google.android.gms.internal.ads.zzfta;

public final class zzfsz
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int zza;
    public final int zzb;
    public final String zzc;
    public final String zzd;
    public final int zze;

    static {
        zzfta zzfta2 = new zzfta();
        CREATOR = zzfta2;
    }

    public zzfsz(int n3, int n4, int n7, String string2, String string3) {
        this.zza = n3;
        this.zzb = n4;
        this.zzc = string2;
        this.zzd = string3;
        this.zze = n7;
    }

    public zzfsz(int n3, zzazw zzazw2, String string2, String string3) {
        int n4 = zzazw2.zza();
        this(1, 1, n4, string2, string3);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, n3);
        int n7 = this.zzb;
        SafeParcelWriter.writeInt(parcel, 2, n7);
        String string2 = this.zzc;
        SafeParcelWriter.writeString(parcel, 3, string2, false);
        String string3 = this.zzd;
        SafeParcelWriter.writeString(parcel, 4, string3, false);
        n7 = this.zze;
        SafeParcelWriter.writeInt(parcel, 5, n7);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

