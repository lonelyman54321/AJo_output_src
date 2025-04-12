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
import com.google.android.gms.internal.ads.zzfso;

public final class zzfsn
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int zza;
    public final byte[] zzb;

    static {
        zzfso zzfso2 = new zzfso();
        CREATOR = zzfso2;
    }

    public zzfsn(int n3, byte[] byArray) {
        this.zza = n3;
        this.zzb = byArray;
    }

    public zzfsn(byte[] byArray) {
        this(1, byArray);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, n3);
        byte[] byArray = this.zzb;
        SafeParcelWriter.writeByteArray(parcel, 2, byArray, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

