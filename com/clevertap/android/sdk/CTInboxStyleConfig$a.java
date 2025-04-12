/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.clevertap.android.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.CTInboxStyleConfig;

public final class CTInboxStyleConfig$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel object) {
        CTInboxStyleConfig cTInboxStyleConfig = new Object();
        Object object2 = object.readString();
        cTInboxStyleConfig.d = object2;
        object2 = object.readString();
        cTInboxStyleConfig.e = object2;
        object2 = object.readString();
        cTInboxStyleConfig.f = object2;
        object2 = object.readString();
        cTInboxStyleConfig.c = object2;
        object2 = object.createStringArray();
        cTInboxStyleConfig.l = object2;
        cTInboxStyleConfig.a = object2 = object.readString();
        cTInboxStyleConfig.i = object2 = object.readString();
        cTInboxStyleConfig.m = object2 = object.readString();
        cTInboxStyleConfig.j = object2 = object.readString();
        cTInboxStyleConfig.k = object2 = object.readString();
        cTInboxStyleConfig.g = object2 = object.readString();
        cTInboxStyleConfig.h = object2 = object.readString();
        object = object.readString();
        cTInboxStyleConfig.b = object;
        return cTInboxStyleConfig;
    }

    public final Object[] newArray(int n3) {
        return new CTInboxStyleConfig[n3];
    }
}

