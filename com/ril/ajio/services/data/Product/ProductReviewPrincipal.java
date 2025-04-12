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
import com.ril.ajio.services.data.Product.ProductReviewPrincipal$Creator;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class ProductReviewPrincipal
implements Serializable,
Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String name;
    private String uid;

    static {
        ProductReviewPrincipal$Creator productReviewPrincipal$Creator = new ProductReviewPrincipal$Creator();
        CREATOR = productReviewPrincipal$Creator;
    }

    public final int describeContents() {
        return 0;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUid() {
        return this.uid;
    }

    public final void setName(String string2) {
        this.name = string2;
    }

    public final void setUid(String string2) {
        this.uid = string2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeInt(1);
    }
}

