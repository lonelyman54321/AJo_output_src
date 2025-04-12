/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.clevertap.android.sdk.inapp;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.inapp.CTInAppAction;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import org.json.JSONException;
import org.json.JSONObject;

public final class CTInAppNotificationButton$a
implements Parcelable.Creator {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object createFromParcel(Parcel object) {
        CTInAppAction cTInAppAction;
        CTInAppNotificationButton cTInAppNotificationButton = new Object();
        Object object2 = object.readString();
        cTInAppNotificationButton.f = object2;
        object2 = object.readString();
        cTInAppNotificationButton.g = object2;
        object2 = object.readString();
        cTInAppNotificationButton.a = object2;
        object2 = object.readString();
        cTInAppNotificationButton.b = object2;
        object2 = object.readString();
        cTInAppNotificationButton.c = object2;
        try {
            byte by2 = object.readByte();
            if (by2 == 0) {
                by2 = 0;
                object2 = null;
            } else {
                String string2 = object.readString();
                object2 = new JSONObject(string2);
            }
            cTInAppNotificationButton.e = object2;
        }
        catch (JSONException jSONException) {}
        object2 = object.readString();
        cTInAppNotificationButton.d = object2;
        object2 = CTInAppAction.class.getClassLoader();
        cTInAppNotificationButton.h = cTInAppAction = (CTInAppAction)object.readParcelable((ClassLoader)object2);
        return cTInAppNotificationButton;
    }

    public final Object[] newArray(int n3) {
        return new CTInAppNotificationButton[n3];
    }
}

