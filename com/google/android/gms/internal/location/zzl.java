/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.location.zzm;

public final class zzl
extends AbstractSafeParcelable
implements Result {
    public static final Parcelable.Creator CREATOR;
    public static final zzl zza;
    private final Status zzb;

    static {
        Status status = Status.RESULT_SUCCESS;
        Object object = new zzl(status);
        zza = object;
        object = new zzm();
        CREATOR = object;
    }

    public zzl(Status status) {
        this.zzb = status;
    }

    public final Status getStatus() {
        return this.zzb;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        Status status = this.zzb;
        SafeParcelWriter.writeParcelable(parcel, 1, status, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

