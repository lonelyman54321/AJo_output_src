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
import com.ril.ajio.services.data.Product.ProductReviewPrincipal;
import kotlin.jvm.internal.Intrinsics;

public final class ProductReviewPrincipal$Creator
implements Parcelable.Creator {
    public final ProductReviewPrincipal createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        object.readInt();
        object = new ProductReviewPrincipal();
        return object;
    }

    public final ProductReviewPrincipal[] newArray(int n3) {
        return new ProductReviewPrincipal[n3];
    }
}

