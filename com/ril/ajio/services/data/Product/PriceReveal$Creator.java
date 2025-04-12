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
import com.ril.ajio.services.data.Product.PriceReveal;
import kotlin.jvm.internal.Intrinsics;

public final class PriceReveal$Creator
implements Parcelable.Creator {
    public final PriceReveal createFromParcel(Parcel object) {
        Float f5;
        Intrinsics.checkNotNullParameter(object, "parcel");
        int n3 = object.readInt();
        if (n3 == 0) {
            n3 = 0;
            float f6 = 0.0f;
            f5 = null;
        } else {
            float f7 = object.readFloat();
            f5 = Float.valueOf(f7);
        }
        object = object.readString();
        PriceReveal priceReveal = new PriceReveal(f5, (String)object);
        return priceReveal;
    }

    public final PriceReveal[] newArray(int n3) {
        return new PriceReveal[n3];
    }
}

