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
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zal;

public final class zak
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zaa;
    private final ConnectionResult zab;
    private final zav zac;

    static {
        zal zal2 = new zal();
        CREATOR = zal2;
    }

    public zak(int n3, ConnectionResult connectionResult, zav zav2) {
        this.zaa = n3;
        this.zab = connectionResult;
        this.zac = zav2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        int n7 = this.zaa;
        SafeParcelWriter.writeInt(parcel, 1, n7);
        ConnectionResult connectionResult = this.zab;
        SafeParcelWriter.writeParcelable(parcel, 2, connectionResult, n3, false);
        zav zav2 = this.zac;
        SafeParcelWriter.writeParcelable(parcel, 3, zav2, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }

    public final ConnectionResult zaa() {
        return this.zab;
    }

    public final zav zab() {
        return this.zac;
    }
}

