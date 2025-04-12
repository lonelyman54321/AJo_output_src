/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzcbl;

public final class zzcbk
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String zza;
    public final String zzb;
    public final zzq zzc;
    public final zzl zzd;

    static {
        zzcbl zzcbl2 = new zzcbl();
        CREATOR = zzcbl2;
    }

    public zzcbk(String string2, String string3, zzq zzq2, zzl zzl2) {
        this.zza = string2;
        this.zzb = string3;
        this.zzc = zzq2;
        this.zzd = zzl2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, string2, false);
        Object object = this.zzb;
        SafeParcelWriter.writeString(parcel, 2, (String)object, false);
        object = this.zzc;
        SafeParcelWriter.writeParcelable(parcel, 3, (Parcelable)object, n3, false);
        object = this.zzd;
        SafeParcelWriter.writeParcelable(parcel, 4, (Parcelable)object, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

