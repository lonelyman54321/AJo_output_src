/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.clevertap.android.sdk.inapp;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.inapp.CTInAppNotificationMedia;

public final class CTInAppNotificationMedia$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int n3;
        String string2;
        CTInAppNotificationMedia cTInAppNotificationMedia = new Object();
        cTInAppNotificationMedia.d = string2 = parcel.readString();
        cTInAppNotificationMedia.c = string2 = parcel.readString();
        cTInAppNotificationMedia.b = string2 = parcel.readString();
        cTInAppNotificationMedia.a = n3 = parcel.readInt();
        return cTInAppNotificationMedia;
    }

    public final Object[] newArray(int n3) {
        return new CTInAppNotificationMedia[n3];
    }
}

