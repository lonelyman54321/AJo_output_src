/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.clevertap.android.sdk.inapp;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.clevertap.android.sdk.inapp.CTInAppNotificationMedia;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

public final class CTInAppNotification$a
implements Parcelable.Creator {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object createFromParcel(Parcel object) {
        CustomTemplateInAppData customTemplateInAppData;
        long l2;
        int n3;
        Object object2;
        CTInAppNotification cTInAppNotification = new Object();
        Object object3 = new ArrayList();
        cTInAppNotification.e = object3;
        object3 = new ArrayList();
        cTInAppNotification.y = object3;
        boolean bl2 = false;
        object3 = null;
        cTInAppNotification.M = false;
        cTInAppNotification.N = false;
        try {
            String string2;
            object2 = object.readString();
            cTInAppNotification.p = object2;
            object2 = object.readString();
            cTInAppNotification.f = object2;
            object2 = ei_1.class;
            object2 = ((Class)object2).getClassLoader();
            object2 = object.readValue((ClassLoader)object2);
            object2 = (ei_1)((Object)object2);
            cTInAppNotification.q = object2;
            object2 = object.readString();
            cTInAppNotification.o = object2;
            n3 = object.readByte();
            if (n3 != 0) {
                n3 = 1;
            } else {
                n3 = 0;
                object2 = null;
            }
            cTInAppNotification.k = n3;
            n3 = object.readByte();
            if (n3 != 0) {
                n3 = 1;
            } else {
                n3 = 0;
                object2 = null;
            }
            cTInAppNotification.C = n3;
            n3 = object.readByte();
            if (n3 != 0) {
                n3 = 1;
            } else {
                n3 = 0;
                object2 = null;
            }
            cTInAppNotification.i = n3;
            cTInAppNotification.x = n3 = object.readInt();
            cTInAppNotification.H = n3 = object.readInt();
            cTInAppNotification.G = n3 = object.readInt();
            object2 = Character.TYPE;
            object2 = ((Class)object2).getClassLoader();
            object2 = object.readValue((ClassLoader)object2);
            object2 = (Character)object2;
            n3 = ((Character)object2).charValue();
            cTInAppNotification.B = (char)n3;
            cTInAppNotification.l = n3 = object.readInt();
            cTInAppNotification.m = n3 = object.readInt();
            cTInAppNotification.K = n3 = object.readInt();
            cTInAppNotification.L = n3 = object.readInt();
            n3 = object.readByte();
            JSONObject jSONObject = null;
            if (n3 == 0) {
                n3 = 0;
                object2 = null;
            } else {
                string2 = object.readString();
                object2 = new JSONObject(string2);
            }
            cTInAppNotification.v = object2;
            cTInAppNotification.j = object2 = object.readString();
            n3 = object.readByte();
            if (n3 == 0) {
                n3 = 0;
                object2 = null;
            } else {
                string2 = object.readString();
                object2 = new JSONObject(string2);
            }
            cTInAppNotification.g = object2;
            n3 = object.readByte();
            if (n3 != 0) {
                object2 = object.readString();
                jSONObject = new JSONObject((String)object2);
            }
            cTInAppNotification.b = jSONObject;
            cTInAppNotification.I = object2 = object.readString();
            cTInAppNotification.E = object2 = object.readString();
            cTInAppNotification.F = object2 = object.readString();
            cTInAppNotification.c = object2 = object.readString();
            cTInAppNotification.z = object2 = object.readString();
            cTInAppNotification.A = object2 = object.readString();
        }
        catch (JSONException jSONException) {
            return cTInAppNotification;
        }
        try {
            object2 = CTInAppNotificationButton.CREATOR;
            cTInAppNotification.e = object2 = object.createTypedArrayList((Parcelable.Creator)object2);
        }
        catch (Throwable throwable) {}
        try {
            object2 = CTInAppNotificationMedia.CREATOR;
            cTInAppNotification.y = object2 = object.createTypedArrayList((Parcelable.Creator)object2);
        }
        catch (Throwable throwable) {}
        n3 = object.readByte();
        if (n3 != 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object2 = null;
        }
        cTInAppNotification.n = n3;
        cTInAppNotification.d = n3 = object.readInt();
        n3 = object.readByte();
        if (n3 != 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object2 = null;
        }
        cTInAppNotification.t = n3;
        cTInAppNotification.h = object2 = object.readString();
        n3 = object.readByte();
        if (n3 != 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object2 = null;
        }
        cTInAppNotification.u = n3;
        n3 = object.readByte();
        if (n3 != 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object2 = null;
        }
        cTInAppNotification.s = n3;
        n3 = object.readByte();
        if (n3 != 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object2 = null;
        }
        cTInAppNotification.r = n3;
        n3 = object.readByte();
        if (n3 != 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object2 = null;
        }
        cTInAppNotification.M = n3;
        n3 = object.readByte();
        if (n3 != 0) {
            bl2 = true;
        }
        cTInAppNotification.N = bl2;
        cTInAppNotification.w = object3 = object.readString();
        cTInAppNotification.a = object3 = object.readString();
        cTInAppNotification.D = l2 = object.readLong();
        object3 = CustomTemplateInAppData.class;
        object3 = ((Class)object3).getClassLoader();
        Parcelable parcelable = object.readParcelable((ClassLoader)object3);
        cTInAppNotification.O = customTemplateInAppData = (CustomTemplateInAppData)parcelable;
        return cTInAppNotification;
    }

    public final Object[] newArray(int n3) {
        return new CTInAppNotification[n3];
    }
}

