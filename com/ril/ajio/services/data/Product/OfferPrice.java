/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Product;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.OfferPrice$Creator;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class OfferPrice
extends Price
implements Parcelable,
Serializable {
    public static final Parcelable.Creator CREATOR;

    static {
        OfferPrice$Creator offerPrice$Creator = new OfferPrice$Creator();
        CREATOR = offerPrice$Creator;
    }

    public OfferPrice() {
        super(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeInt(1);
    }
}

