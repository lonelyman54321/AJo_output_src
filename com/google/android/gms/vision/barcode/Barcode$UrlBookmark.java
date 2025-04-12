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
import com.google.android.gms.vision.barcode.zzn;

public class Barcode$UrlBookmark
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String title;
    public String url;

    static {
        zzn zzn2 = new zzn();
        CREATOR = zzn2;
    }

    public Barcode$UrlBookmark() {
    }

    public Barcode$UrlBookmark(String string2, String string3) {
        this.title = string2;
        this.url = string3;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        String string2 = this.title;
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        String string3 = this.url;
        SafeParcelWriter.writeString(parcel, 3, string3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

