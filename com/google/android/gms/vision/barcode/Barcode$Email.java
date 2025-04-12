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
import com.google.android.gms.vision.barcode.zzg;

public class Barcode$Email
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final int HOME = 2;
    public static final int UNKNOWN = 0;
    public static final int WORK = 1;
    public String address;
    public String body;
    public String subject;
    public int type;

    static {
        zzg zzg2 = new zzg();
        CREATOR = zzg2;
    }

    public Barcode$Email() {
    }

    public Barcode$Email(int n3, String string2, String string3, String string4) {
        this.type = n3;
        this.address = string2;
        this.subject = string3;
        this.body = string4;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int n4 = this.type;
        SafeParcelWriter.writeInt(parcel, 2, n4);
        String string2 = this.address;
        SafeParcelWriter.writeString(parcel, 3, string2, false);
        String string3 = this.subject;
        SafeParcelWriter.writeString(parcel, 4, string3, false);
        string3 = this.body;
        SafeParcelWriter.writeString(parcel, 5, string3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

