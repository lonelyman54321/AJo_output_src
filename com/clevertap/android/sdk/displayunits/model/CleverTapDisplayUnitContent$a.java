/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.clevertap.android.sdk.displayunits.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnitContent;

public final class CleverTapDisplayUnitContent$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel object) {
        String string2;
        CleverTapDisplayUnitContent cleverTapDisplayUnitContent = new Object();
        cleverTapDisplayUnitContent.i = string2 = object.readString();
        cleverTapDisplayUnitContent.j = string2 = object.readString();
        cleverTapDisplayUnitContent.f = string2 = object.readString();
        cleverTapDisplayUnitContent.g = string2 = object.readString();
        cleverTapDisplayUnitContent.d = string2 = object.readString();
        cleverTapDisplayUnitContent.e = string2 = object.readString();
        cleverTapDisplayUnitContent.b = string2 = object.readString();
        cleverTapDisplayUnitContent.h = string2 = object.readString();
        cleverTapDisplayUnitContent.a = string2 = object.readString();
        object = object.readString();
        cleverTapDisplayUnitContent.c = object;
        return cleverTapDisplayUnitContent;
    }

    public final Object[] newArray(int n3) {
        return new CleverTapDisplayUnitContent[n3];
    }
}

