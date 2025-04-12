/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Order;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Order.OrderCancellation;
import com.ril.ajio.services.data.returnexchange.TotalPrice;
import kotlin.jvm.internal.Intrinsics;

public final class OrderCancellation$Creator
implements Parcelable.Creator {
    public final OrderCancellation createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        String string2 = object.readString();
        String string3 = object.readString();
        TotalPrice totalPrice = (TotalPrice)object.readSerializable();
        object = (TotalPrice)object.readSerializable();
        OrderCancellation orderCancellation = new OrderCancellation(string2, string3, totalPrice, (TotalPrice)object);
        return orderCancellation;
    }

    public final OrderCancellation[] newArray(int n3) {
        return new OrderCancellation[n3];
    }
}

