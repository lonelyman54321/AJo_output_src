/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Cart;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Cart.GiftProducts$AssociatedProduct;
import kotlin.jvm.internal.Intrinsics;

public final class GiftProducts$AssociatedProduct$Creator
implements Parcelable.Creator {
    public final GiftProducts$AssociatedProduct createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        String string2 = object.readString();
        object = object.readString();
        GiftProducts$AssociatedProduct giftProducts$AssociatedProduct = new GiftProducts$AssociatedProduct(string2, (String)object);
        return giftProducts$AssociatedProduct;
    }

    public final GiftProducts$AssociatedProduct[] newArray(int n3) {
        return new GiftProducts$AssociatedProduct[n3];
    }
}

