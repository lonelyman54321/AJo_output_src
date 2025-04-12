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
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.location.zzah;
import java.util.Collections;
import java.util.List;

public final class LocationSettingsRequest
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final List zza;
    private final boolean zzb;
    private final boolean zzc;

    static {
        zzah zzah2 = new zzah();
        CREATOR = zzah2;
    }

    public LocationSettingsRequest(List list, boolean bl2, boolean bl3) {
        this.zza = list;
        this.zzb = bl2;
        this.zzc = bl3;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        List list = this.zza;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        list = Collections.unmodifiableList(list);
        SafeParcelWriter.writeTypedList(parcel, 1, list, false);
        boolean bl2 = this.zzb;
        SafeParcelWriter.writeBoolean(parcel, 2, bl2);
        bl2 = this.zzc;
        SafeParcelWriter.writeBoolean(parcel, 3, bl2);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

