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
import com.google.android.gms.vision.barcode.zzm;

public class Barcode$WiFi
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final int OPEN = 1;
    public static final int WEP = 3;
    public static final int WPA = 2;
    public int encryptionType;
    public String password;
    public String ssid;

    static {
        zzm zzm2 = new zzm();
        CREATOR = zzm2;
    }

    public Barcode$WiFi() {
    }

    public Barcode$WiFi(String string2, String string3, int n3) {
        this.ssid = string2;
        this.password = string3;
        this.encryptionType = n3;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        String string2 = this.ssid;
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        String string3 = this.password;
        SafeParcelWriter.writeString(parcel, 3, string3, false);
        int n4 = this.encryptionType;
        SafeParcelWriter.writeInt(parcel, 4, n4);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

