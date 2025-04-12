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
import com.ril.ajio.services.data.Product.OfferPrice;
import kotlin.jvm.internal.Intrinsics;

public final class OfferPrice$Creator
implements Parcelable.Creator {
    public final OfferPrice createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        object.readInt();
        object = new OfferPrice();
        return object;
    }

    public final OfferPrice[] newArray(int n3) {
        return new OfferPrice[n3];
    }
}

