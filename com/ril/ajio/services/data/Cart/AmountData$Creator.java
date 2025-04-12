/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Cart;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Cart.AmountData;
import com.ril.ajio.services.data.Price;
import kotlin.jvm.internal.Intrinsics;

public final class AmountData$Creator
implements Parcelable.Creator {
    public final AmountData createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        Object object2 = AmountData.class;
        Object object3 = ((Class)object2).getClassLoader();
        object3 = (Price)object.readParcelable((ClassLoader)object3);
        object2 = ((Class)object2).getClassLoader();
        object2 = (Price)object.readParcelable((ClassLoader)object2);
        object = object.readString();
        AmountData amountData = new AmountData((Price)object3, (Price)object2, (String)object);
        return amountData;
    }

    public final AmountData[] newArray(int n3) {
        return new AmountData[n3];
    }
}

