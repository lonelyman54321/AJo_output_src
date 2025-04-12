/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  org.json.JSONObject
 */
package com.clevertap.android.sdk.inapp;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.inapp.CTInAppAction;
import com.clevertap.android.sdk.inapp.CTInAppAction$a;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton$a;
import org.json.JSONObject;

public class CTInAppNotificationButton
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;
    public String c;
    public String d;
    public JSONObject e;
    public String f;
    public String g;
    public CTInAppAction h;

    static {
        CTInAppNotificationButton$a cTInAppNotificationButton$a = new Object();
        CREATOR = cTInAppNotificationButton$a;
    }

    public final void a(JSONObject object) {
        String string2;
        this.e = object;
        this.f = string2 = object.optString("text");
        this.g = string2 = object.optString("color", "#0000FF");
        String string3 = "#FFFFFF";
        this.a = string2 = object.optString("bg", string3);
        this.b = string2 = object.optString("border", string3);
        this.c = string2 = object.optString("radius");
        object = object.optJSONObject("actions");
        CTInAppAction.CREATOR.getClass();
        object = CTInAppAction$a.a(object);
        this.h = object;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Object object = this.f;
        parcel.writeString((String)object);
        object = this.g;
        parcel.writeString((String)object);
        object = this.a;
        parcel.writeString((String)object);
        object = this.b;
        parcel.writeString((String)object);
        object = this.c;
        parcel.writeString((String)object);
        object = this.e;
        if (object == null) {
            boolean bl2 = false;
            object = null;
            parcel.writeByte((byte)0);
        } else {
            byte by2 = 1;
            parcel.writeByte(by2);
            object = this.e.toString();
            parcel.writeString((String)object);
        }
        object = this.d;
        parcel.writeString((String)object);
        object = this.h;
        parcel.writeParcelable((Parcelable)object, n3);
    }
}

