/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.vision.barcode.zzj;

public class Barcode$GeoPoint
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public double lat;
    public double lng;

    static {
        zzj zzj2 = new zzj();
        CREATOR = zzj2;
    }

    public Barcode$GeoPoint() {
    }

    public Barcode$GeoPoint(double d2, double d5) {
        this.lat = d2;
        this.lng = d5;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        double d2 = this.lat;
        SafeParcelWriter.writeDouble(parcel, 2, d2);
        d2 = this.lng;
        SafeParcelWriter.writeDouble(parcel, 3, d2);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

