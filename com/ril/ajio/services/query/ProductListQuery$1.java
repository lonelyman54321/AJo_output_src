/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.query;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.query.ProductListQuery;

class ProductListQuery$1
implements Parcelable.Creator {
    public ProductListQuery createFromParcel(Parcel parcel) {
        ProductListQuery productListQuery = new ProductListQuery(parcel, 0);
        return productListQuery;
    }

    public ProductListQuery[] newArray(int n3) {
        return new ProductListQuery[n3];
    }
}

