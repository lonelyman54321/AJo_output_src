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
import com.ril.ajio.services.data.Product.Category;

class Category$1
implements Parcelable.Creator {
    public Category createFromParcel(Parcel parcel) {
        Category category = new Category(parcel, 0);
        return category;
    }

    public Category[] newArray(int n3) {
        return new Category[n3];
    }
}

