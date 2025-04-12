/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Point
 *  android.graphics.Rect
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.vision.barcode;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.vision.barcode.Barcode$CalendarEvent;
import com.google.android.gms.vision.barcode.Barcode$ContactInfo;
import com.google.android.gms.vision.barcode.Barcode$DriverLicense;
import com.google.android.gms.vision.barcode.Barcode$Email;
import com.google.android.gms.vision.barcode.Barcode$GeoPoint;
import com.google.android.gms.vision.barcode.Barcode$Phone;
import com.google.android.gms.vision.barcode.Barcode$Sms;
import com.google.android.gms.vision.barcode.Barcode$UrlBookmark;
import com.google.android.gms.vision.barcode.Barcode$WiFi;
import com.google.android.gms.vision.barcode.zzb;

public class Barcode
extends AbstractSafeParcelable {
    public static final int ALL_FORMATS = 0;
    public static final int AZTEC = 4096;
    public static final int CALENDAR_EVENT = 11;
    public static final int CODABAR = 8;
    public static final int CODE_128 = 1;
    public static final int CODE_39 = 2;
    public static final int CODE_93 = 4;
    public static final int CONTACT_INFO = 1;
    public static final Parcelable.Creator CREATOR;
    public static final int DATA_MATRIX = 16;
    public static final int DRIVER_LICENSE = 12;
    public static final int EAN_13 = 32;
    public static final int EAN_8 = 64;
    public static final int EMAIL = 2;
    public static final int GEO = 10;
    public static final int ISBN = 3;
    public static final int ITF = 128;
    public static final int PDF417 = 2048;
    public static final int PHONE = 4;
    public static final int PRODUCT = 5;
    public static final int QR_CODE = 256;
    public static final int SMS = 6;
    public static final int TEXT = 7;
    public static final int UPC_A = 512;
    public static final int UPC_E = 1024;
    public static final int URL = 8;
    public static final int WIFI = 9;
    public Barcode$CalendarEvent calendarEvent;
    public Barcode$ContactInfo contactInfo;
    public Point[] cornerPoints;
    public String displayValue;
    public Barcode$DriverLicense driverLicense;
    public Barcode$Email email;
    public int format;
    public Barcode$GeoPoint geoPoint;
    public boolean isRecognized;
    public Barcode$Phone phone;
    public byte[] rawBytes;
    public String rawValue;
    public Barcode$Sms sms;
    public Barcode$UrlBookmark url;
    public int valueFormat;
    public Barcode$WiFi wifi;

    static {
        zzb zzb2 = new zzb();
        CREATOR = zzb2;
    }

    public Barcode() {
    }

    public Barcode(int n3, String string2, String string3, int n4, Point[] pointArray, Barcode$Email barcode$Email, Barcode$Phone barcode$Phone, Barcode$Sms barcode$Sms, Barcode$WiFi barcode$WiFi, Barcode$UrlBookmark barcode$UrlBookmark, Barcode$GeoPoint barcode$GeoPoint, Barcode$CalendarEvent barcode$CalendarEvent, Barcode$ContactInfo barcode$ContactInfo, Barcode$DriverLicense barcode$DriverLicense, byte[] byArray, boolean bl2) {
        this.format = n3;
        this.rawValue = string2;
        this.rawBytes = byArray;
        this.displayValue = string3;
        this.valueFormat = n4;
        this.cornerPoints = pointArray;
        this.isRecognized = bl2;
        this.email = barcode$Email;
        this.phone = barcode$Phone;
        this.sms = barcode$Sms;
        this.wifi = barcode$WiFi;
        this.url = barcode$UrlBookmark;
        this.geoPoint = barcode$GeoPoint;
        this.calendarEvent = barcode$CalendarEvent;
        this.contactInfo = barcode$ContactInfo;
        this.driverLicense = barcode$DriverLicense;
    }

    public Rect getBoundingBox() {
        Point point;
        int n3;
        int n4 = -1 >>> 1;
        int n7 = -1 >>> 1;
        int n8 = -1 << -1;
        int n10 = -1 << -1;
        Rect rect = null;
        for (int i3 = 0; i3 < (n3 = ((Point[])(point = this.cornerPoints)).length); ++i3) {
            point = point[i3];
            n3 = point.x;
            n4 = Math.min(n4, n3);
            n3 = point.x;
            n8 = Math.max(n8, n3);
            n3 = point.y;
            n7 = Math.min(n7, n3);
            int n14 = point.y;
            n10 = Math.max(n10, n14);
        }
        rect = new Rect(n4, n7, n8, n10);
        return rect;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        int n7 = this.format;
        SafeParcelWriter.writeInt(parcel, 2, n7);
        Object object = this.rawValue;
        SafeParcelWriter.writeString(parcel, 3, (String)object, false);
        Object object2 = this.displayValue;
        SafeParcelWriter.writeString(parcel, 4, (String)object2, false);
        n7 = this.valueFormat;
        SafeParcelWriter.writeInt(parcel, 5, n7);
        object2 = this.cornerPoints;
        SafeParcelWriter.writeTypedArray(parcel, 6, (Parcelable[])object2, n3, false);
        object2 = this.email;
        SafeParcelWriter.writeParcelable(parcel, 7, (Parcelable)object2, n3, false);
        object2 = this.phone;
        SafeParcelWriter.writeParcelable(parcel, 8, (Parcelable)object2, n3, false);
        object2 = this.sms;
        SafeParcelWriter.writeParcelable(parcel, 9, (Parcelable)object2, n3, false);
        object2 = this.wifi;
        SafeParcelWriter.writeParcelable(parcel, 10, (Parcelable)object2, n3, false);
        object2 = this.url;
        SafeParcelWriter.writeParcelable(parcel, 11, (Parcelable)object2, n3, false);
        object2 = this.geoPoint;
        SafeParcelWriter.writeParcelable(parcel, 12, (Parcelable)object2, n3, false);
        object2 = this.calendarEvent;
        SafeParcelWriter.writeParcelable(parcel, 13, (Parcelable)object2, n3, false);
        object2 = this.contactInfo;
        SafeParcelWriter.writeParcelable(parcel, 14, (Parcelable)object2, n3, false);
        object2 = this.driverLicense;
        SafeParcelWriter.writeParcelable(parcel, 15, (Parcelable)object2, n3, false);
        object = this.rawBytes;
        SafeParcelWriter.writeByteArray(parcel, 16, (byte[])object, false);
        boolean bl2 = this.isRecognized;
        SafeParcelWriter.writeBoolean(parcel, 17, bl2);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

