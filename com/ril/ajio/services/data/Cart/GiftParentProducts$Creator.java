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
import com.ril.ajio.services.data.Cart.GiftParentProducts;
import kotlin.jvm.internal.Intrinsics;

public final class GiftParentProducts$Creator
implements Parcelable.Creator {
    public final GiftParentProducts createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        String string2 = object.readString();
        object = object.readString();
        GiftParentProducts giftParentProducts = new GiftParentProducts(string2, (String)object);
        return giftParentProducts;
    }

    public final GiftParentProducts[] newArray(int n3) {
        return new GiftParentProducts[n3];
    }
}

