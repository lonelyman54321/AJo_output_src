/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzdv;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzdu
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int zza;

    static {
        zzdv zzdv2 = new zzdv();
        CREATOR = zzdv2;
    }

    public zzdu(int n3) {
        this.zza = n3;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, n3);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

