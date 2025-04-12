/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Product;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Product.Stock;
import kotlin.jvm.internal.Intrinsics;

public final class Stock$Creator
implements Parcelable.Creator {
    public final Stock createFromParcel(Parcel object) {
        Integer n3;
        Intrinsics.checkNotNullParameter(object, "parcel");
        int n4 = object.readInt();
        if (n4 == 0) {
            n4 = 0;
            n3 = null;
        } else {
            n4 = object.readInt();
            n3 = n4;
        }
        object = object.readString();
        Stock stock = new Stock(n3, (String)object);
        return stock;
    }

    public final Stock[] newArray(int n3) {
        return new Stock[n3];
    }
}

