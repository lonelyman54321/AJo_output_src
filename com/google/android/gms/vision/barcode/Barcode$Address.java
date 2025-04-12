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
import com.google.android.gms.vision.barcode.zza;

public class Barcode$Address
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final int HOME = 2;
    public static final int UNKNOWN = 0;
    public static final int WORK = 1;
    public String[] addressLines;
    public int type;

    static {
        zza zza2 = new zza();
        CREATOR = zza2;
    }

    public Barcode$Address() {
    }

    public Barcode$Address(int n3, String[] stringArray) {
        this.type = n3;
        this.addressLines = stringArray;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int n4 = this.type;
        SafeParcelWriter.writeInt(parcel, 2, n4);
        String[] stringArray = this.addressLines;
        SafeParcelWriter.writeStringArray(parcel, 3, stringArray, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

