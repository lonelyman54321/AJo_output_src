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
import com.google.android.gms.vision.barcode.zzd;

public class Barcode$CalendarDateTime
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public int day;
    public int hours;
    public boolean isUtc;
    public int minutes;
    public int month;
    public String rawValue;
    public int seconds;
    public int year;

    static {
        zzd zzd2 = new zzd();
        CREATOR = zzd2;
    }

    public Barcode$CalendarDateTime() {
    }

    public Barcode$CalendarDateTime(int n3, int n4, int n7, int n8, int n10, int n14, boolean bl2, String string2) {
        this.year = n3;
        this.month = n4;
        this.day = n7;
        this.hours = n8;
        this.minutes = n10;
        this.seconds = n14;
        this.isUtc = bl2;
        this.rawValue = string2;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int bl2 = this.year;
        SafeParcelWriter.writeInt(parcel, 2, bl2);
        int n4 = this.month;
        SafeParcelWriter.writeInt(parcel, 3, n4);
        int n7 = this.day;
        SafeParcelWriter.writeInt(parcel, 4, n7);
        int n8 = this.hours;
        SafeParcelWriter.writeInt(parcel, 5, n8);
        int n10 = this.minutes;
        SafeParcelWriter.writeInt(parcel, 6, n10);
        int n14 = this.seconds;
        SafeParcelWriter.writeInt(parcel, 7, n14);
        boolean bl3 = this.isUtc;
        SafeParcelWriter.writeBoolean(parcel, 8, bl3);
        String string2 = this.rawValue;
        SafeParcelWriter.writeString(parcel, 9, string2, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

