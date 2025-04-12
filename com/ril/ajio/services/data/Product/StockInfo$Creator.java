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
import com.ril.ajio.services.data.Product.StockInfo;
import kotlin.jvm.internal.Intrinsics;

public final class StockInfo$Creator
implements Parcelable.Creator {
    public final StockInfo createFromParcel(Parcel object) {
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
        String string2 = object.readString();
        object = object.readString();
        StockInfo stockInfo = new StockInfo(n3, string2, (String)object);
        return stockInfo;
    }

    public final StockInfo[] newArray(int n3) {
        return new StockInfo[n3];
    }
}

