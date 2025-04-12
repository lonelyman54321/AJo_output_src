/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Order.orderhistory;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Order.orderhistory.DateRangeItem;
import kotlin.jvm.internal.Intrinsics;

public final class DateRangeItem$Creator
implements Parcelable.Creator {
    public final DateRangeItem createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        String string2 = object.readString();
        object = object.readString();
        DateRangeItem dateRangeItem = new DateRangeItem(string2, (String)object);
        return dateRangeItem;
    }

    public final DateRangeItem[] newArray(int n3) {
        return new DateRangeItem[n3];
    }
}

