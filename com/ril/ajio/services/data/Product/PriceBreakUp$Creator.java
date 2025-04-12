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
import com.ril.ajio.services.data.Product.PriceBreakUp;
import kotlin.jvm.internal.Intrinsics;

public final class PriceBreakUp$Creator
implements Parcelable.Creator {
    public final PriceBreakUp createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        String string2 = object.readString();
        String string3 = object.readString();
        String string4 = object.readString();
        object = object.readString();
        PriceBreakUp priceBreakUp = new PriceBreakUp(string2, string3, string4, (String)object);
        return priceBreakUp;
    }

    public final PriceBreakUp[] newArray(int n3) {
        return new PriceBreakUp[n3];
    }
}

