/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.signin.internal.zaj;

public final class zai
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zaa;
    final zat zab;

    static {
        zaj zaj2 = new zaj();
        CREATOR = zaj2;
    }

    public zai(int n3, zat zat2) {
        this.zaa = n3;
        this.zab = zat2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        int n7 = this.zaa;
        SafeParcelWriter.writeInt(parcel, 1, n7);
        zat zat2 = this.zab;
        SafeParcelWriter.writeParcelable(parcel, 2, zat2, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

