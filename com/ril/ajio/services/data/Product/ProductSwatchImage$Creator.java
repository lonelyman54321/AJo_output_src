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
import com.ril.ajio.services.data.Product.ProductSwatchImage;
import kotlin.jvm.internal.Intrinsics;

public final class ProductSwatchImage$Creator
implements Parcelable.Creator {
    public final ProductSwatchImage createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        object = object.readString();
        ProductSwatchImage productSwatchImage = new ProductSwatchImage((String)object);
        return productSwatchImage;
    }

    public final ProductSwatchImage[] newArray(int n3) {
        return new ProductSwatchImage[n3];
    }
}

