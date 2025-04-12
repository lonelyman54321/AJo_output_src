/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.clevertap.android.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.CTInboxStyleConfig$a;

public class CTInboxStyleConfig
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String[] l;
    public String m;

    static {
        CTInboxStyleConfig$a cTInboxStyleConfig$a = new Object();
        CREATOR = cTInboxStyleConfig$a;
    }

    public CTInboxStyleConfig() {
        String string2;
        String[] stringArray = "#FFFFFF";
        this.d = stringArray;
        this.e = "App Inbox";
        this.f = string2 = "#333333";
        this.c = "#D3D4DA";
        this.a = string2;
        this.i = string2 = "#1C84FE";
        this.m = "#808080";
        this.j = string2;
        this.k = stringArray;
        stringArray = new String[]{};
        this.l = stringArray;
        this.g = "No Message(s) to show";
        this.h = "#000000";
        this.b = "ALL";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Object object = this.d;
        parcel.writeString((String)object);
        object = this.e;
        parcel.writeString((String)object);
        object = this.f;
        parcel.writeString((String)object);
        object = this.c;
        parcel.writeString((String)object);
        object = this.l;
        parcel.writeStringArray(object);
        object = this.a;
        parcel.writeString((String)object);
        object = this.i;
        parcel.writeString((String)object);
        object = this.m;
        parcel.writeString((String)object);
        object = this.j;
        parcel.writeString((String)object);
        object = this.k;
        parcel.writeString((String)object);
        object = this.g;
        parcel.writeString((String)object);
        object = this.h;
        parcel.writeString((String)object);
        object = this.b;
        parcel.writeString((String)object);
    }
}

