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
import com.google.android.gms.vision.barcode.zzk;

public class Barcode$Sms
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String message;
    public String phoneNumber;

    static {
        zzk zzk2 = new zzk();
        CREATOR = zzk2;
    }

    public Barcode$Sms() {
    }

    public Barcode$Sms(String string2, String string3) {
        this.message = string2;
        this.phoneNumber = string3;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        String string2 = this.message;
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        String string3 = this.phoneNumber;
        SafeParcelWriter.writeString(parcel, 3, string3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

