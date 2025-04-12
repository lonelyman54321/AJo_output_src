/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.IAccountAccessor$Stub;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.zaw;

public final class zav
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zaa;
    final IBinder zab;
    private final ConnectionResult zac;
    private final boolean zad;
    private final boolean zae;

    static {
        zaw zaw2 = new zaw();
        CREATOR = zaw2;
    }

    public zav(int n3, IBinder iBinder, ConnectionResult connectionResult, boolean bl2, boolean bl3) {
        this.zaa = n3;
        this.zab = iBinder;
        this.zac = connectionResult;
        this.zad = bl2;
        this.zae = bl3;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        if (object == null) {
            return false;
        }
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof zav;
        if (!bl4) {
            return false;
        }
        object = (zav)object;
        Object object2 = this.zac;
        ConnectionResult connectionResult = ((zav)object).zac;
        bl4 = ((ConnectionResult)object2).equals(connectionResult);
        if (bl4 && (bl2 = Objects.equal(object2 = this.zab(), object = ((zav)object).zab()))) {
            return bl3;
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        int n7 = this.zaa;
        SafeParcelWriter.writeInt(parcel, 1, n7);
        IBinder iBinder = this.zab;
        SafeParcelWriter.writeIBinder(parcel, 2, iBinder, false);
        ConnectionResult connectionResult = this.zac;
        SafeParcelWriter.writeParcelable(parcel, 3, connectionResult, n3, false);
        boolean bl2 = this.zad;
        SafeParcelWriter.writeBoolean(parcel, 4, bl2);
        bl2 = this.zae;
        SafeParcelWriter.writeBoolean(parcel, 5, bl2);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }

    public final ConnectionResult zaa() {
        return this.zac;
    }

    public final IAccountAccessor zab() {
        IBinder iBinder = this.zab;
        if (iBinder == null) {
            return null;
        }
        return IAccountAccessor$Stub.asInterface(iBinder);
    }

    public final boolean zac() {
        return this.zad;
    }

    public final boolean zad() {
        return this.zae;
    }
}

