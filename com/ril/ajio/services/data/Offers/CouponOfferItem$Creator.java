/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Offers;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Offers.CouponOfferItem;
import kotlin.jvm.internal.Intrinsics;

public final class CouponOfferItem$Creator
implements Parcelable.Creator {
    public final CouponOfferItem createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        String string2 = object.readString();
        String string3 = object.readString();
        String string4 = object.readString();
        object = object.readString();
        CouponOfferItem couponOfferItem = new CouponOfferItem(string2, string3, string4, (String)object);
        return couponOfferItem;
    }

    public final CouponOfferItem[] newArray(int n3) {
        return new CouponOfferItem[n3];
    }
}

