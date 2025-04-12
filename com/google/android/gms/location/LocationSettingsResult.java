/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.location.LocationSettingsStates;
import com.google.android.gms.location.zzai;

public final class LocationSettingsResult
extends AbstractSafeParcelable
implements Result {
    public static final Parcelable.Creator CREATOR;
    private final Status zza;
    private final LocationSettingsStates zzb;

    static {
        zzai zzai2 = new zzai();
        CREATOR = zzai2;
    }

    public LocationSettingsResult(Status status, LocationSettingsStates locationSettingsStates) {
        this.zza = status;
        this.zzb = locationSettingsStates;
    }

    public LocationSettingsStates getLocationSettingsStates() {
        return this.zzb;
    }

    public Status getStatus() {
        return this.zza;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        Status status = this.getStatus();
        SafeParcelWriter.writeParcelable(parcel, 1, status, n3, false);
        LocationSettingsStates locationSettingsStates = this.getLocationSettingsStates();
        SafeParcelWriter.writeParcelable(parcel, 2, locationSettingsStates, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

